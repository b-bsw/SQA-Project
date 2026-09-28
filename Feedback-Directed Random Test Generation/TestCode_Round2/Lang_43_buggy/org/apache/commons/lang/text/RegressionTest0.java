package org.apache.commons.lang.text;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.text.Format[] formatArray6 = new java.text.Format[] { extendedMessageFormat5 };
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map7);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map16);
        java.text.Format[] formatArray18 = new java.text.Format[] { extendedMessageFormat5, extendedMessageFormat8, extendedMessageFormat11, extendedMessageFormat14, extendedMessageFormat17 };
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray18);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = extendedMessageFormat2.format((java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class [Ljava.lang.Object; (java.lang.Float and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        boolean boolean4 = extendedMessageFormat2.equals((java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map7);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map16);
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map19);
        java.text.Format[] formatArray21 = new java.text.Format[] { extendedMessageFormat5, extendedMessageFormat8, extendedMessageFormat11, extendedMessageFormat14, extendedMessageFormat17, extendedMessageFormat20 };
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray21);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat2.parseObject("hi!", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.Object obj3 = extendedMessageFormat2.clone();
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat2.parse("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator5 = extendedMessageFormat2.formatToCharacterIterator(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatToCharacterIterator must be passed non-null object");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (byte) 0, (java.text.Format) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0 };
        java.lang.String str9 = java.text.MessageFormat.format("", objArray8);
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = extendedMessageFormat2.format(objArray8, stringBuffer10, fieldPosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.lang.String str11 = extendedMessageFormat10.toPattern();
        extendedMessageFormat10.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex(100, (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map5);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object obj5 = extendedMessageFormat2.clone();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.lang.String str13 = extendedMessageFormat11.toPattern();
        extendedMessageFormat11.applyPattern("hi!");
        java.lang.String str16 = extendedMessageFormat11.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormatByArgumentIndex(10, (java.text.Format) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map8);
        java.lang.String str10 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.String str12 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray11);
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = extendedMessageFormat5.format((java.lang.Object[]) formatArray11, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = extendedMessageFormat1.parseObject("hi!", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass5 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map6);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = extendedMessageFormat2.format((java.lang.Object) "hi!", stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map7);
        java.lang.String str9 = extendedMessageFormat8.toPattern();
        extendedMessageFormat8.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat8.getLocale();
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat8, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0 };
        java.lang.String str9 = java.text.MessageFormat.format("", objArray8);
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = extendedMessageFormat2.format(objArray8, stringBuffer10, fieldPosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map8);
        java.lang.String str10 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormats(formatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map7);
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        extendedMessageFormat10.applyPattern("hi!");
        extendedMessageFormat10.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat(0, (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        boolean boolean9 = extendedMessageFormat7.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("", parsePosition8);
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
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat2.parseObject("", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map8);
        java.lang.String str10 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.String str12 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray11);
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
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex((int) (short) 100, (java.text.Format) extendedMessageFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.lang.Object[] objArray3 = null;
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = extendedMessageFormat2.format(objArray3, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormats();
        java.lang.String str12 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray11);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = extendedMessageFormat7.format((java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class [Ljava.lang.Object; (java.lang.Double and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map6);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.lang.String str10 = extendedMessageFormat7.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) ' ', (java.text.Format) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat5.parse("", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = java.text.MessageFormat.format("hi!", objArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.Class<?> wildcardClass6 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex(1, (java.text.Format) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 0 };
        java.lang.String str4 = java.text.MessageFormat.format("", objArray3);
        java.lang.Object[] objArray7 = new java.lang.Object[] { 0 };
        java.lang.String str8 = java.text.MessageFormat.format("", objArray7);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.lang.String str14 = extendedMessageFormat12.toPattern();
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        java.text.Format[] formatArray17 = extendedMessageFormat16.getFormats();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "", str8, extendedMessageFormat16 };
        java.lang.String str19 = java.text.MessageFormat.format("hi!", objArray18);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        java.lang.String str4 = java.text.MessageFormat.format("hi!", objArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator5 = extendedMessageFormat1.formatToCharacterIterator((java.lang.Object) str4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.lang.String str8 = extendedMessageFormat6.toPattern();
        java.util.Locale locale9 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.Object obj10 = extendedMessageFormat5.clone();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        extendedMessageFormat8.applyPattern("hi!");
        java.lang.String str11 = extendedMessageFormat8.toPattern();
        java.lang.Object[] objArray13 = extendedMessageFormat8.parse("hi!");
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = extendedMessageFormat2.format(objArray13, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[] {});
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
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
        java.text.ParsePosition parsePosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray18 = extendedMessageFormat2.parse("hi!", parsePosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
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
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        extendedMessageFormat17.applyPattern("hi!");
        java.lang.String str20 = extendedMessageFormat17.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = extendedMessageFormat5.format((java.lang.Object) str20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
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
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map18);
        java.util.Locale locale20 = extendedMessageFormat19.getLocale();
        java.lang.String str21 = extendedMessageFormat19.toPattern();
        java.util.Locale locale22 = extendedMessageFormat19.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale22);
        java.text.Format[] formatArray24 = extendedMessageFormat23.getFormats();
        java.lang.StringBuffer stringBuffer25 = null;
        java.text.FieldPosition fieldPosition26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer27 = extendedMessageFormat2.format((java.lang.Object[]) formatArray24, stringBuffer25, fieldPosition26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.lang.String str13 = extendedMessageFormat11.toPattern();
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        java.text.Format[] formatArray16 = extendedMessageFormat15.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormats(formatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.lang.Object obj8 = extendedMessageFormat2.clone();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object obj5 = new java.lang.Object();
        boolean boolean6 = extendedMessageFormat2.equals(obj5);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat7.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.Object obj7 = extendedMessageFormat5.clone();
        java.lang.StringBuffer stringBuffer8 = null;
        java.text.FieldPosition fieldPosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat5, stringBuffer8, fieldPosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 1, 0, false };
        java.lang.String str13 = java.text.MessageFormat.format("hi!", objArray12);
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = extendedMessageFormat5.format(objArray12, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1, 0, false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1, 0, false]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.lang.String str9 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = extendedMessageFormat2.format((java.lang.Object) str9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("hi!");
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map12);
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.lang.String str15 = extendedMessageFormat13.toPattern();
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator18 = extendedMessageFormat5.formatToCharacterIterator((java.lang.Object) extendedMessageFormat17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat5.parse("", parsePosition12);
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
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = extendedMessageFormat5.format((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class [Ljava.lang.Object; (java.lang.Byte and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        extendedMessageFormat7.applyPattern("hi!");
        java.lang.String str10 = extendedMessageFormat7.toPattern();
        java.lang.Object[] objArray12 = extendedMessageFormat7.parse("hi!");
        java.text.Format[] formatArray13 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.text.Format[] formatArray14 = extendedMessageFormat7.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
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
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17);
        extendedMessageFormat18.applyPattern("hi!");
        java.lang.String str21 = extendedMessageFormat18.toPattern();
        java.lang.Object[] objArray23 = extendedMessageFormat18.parse("hi!");
        java.text.Format[] formatArray24 = extendedMessageFormat18.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormatsByArgumentIndex(formatArray24);
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
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        extendedMessageFormat12.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormatByArgumentIndex((int) (short) 0, (java.text.Format) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.Object obj7 = extendedMessageFormat5.clone();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        extendedMessageFormat5.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormat((-1), (java.text.Format) extendedMessageFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map7);
        java.lang.String str9 = extendedMessageFormat8.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat8.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map6);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.lang.String str10 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray9);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = extendedMessageFormat2.format((java.lang.Object[]) formatArray9, stringBuffer11, fieldPosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.Object obj7 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = extendedMessageFormat5.format(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Object cannot be cast to class [Ljava.lang.Object; (java.lang.Object and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.lang.String str11 = extendedMessageFormat10.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat10.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormats(formatArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.Class<?> wildcardClass4 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("");
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        boolean boolean17 = extendedMessageFormat2.equals((java.lang.Object) locale15);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat5.parseObject("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.Class<?> wildcardClass9 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray3 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.lang.Object obj8 = extendedMessageFormat5.clone();
        java.lang.Class<?> wildcardClass9 = extendedMessageFormat5.getClass();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.Object obj6 = extendedMessageFormat2.clone();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat5.parseObject("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.lang.Class<?> wildcardClass4 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat5.toPattern();
        java.text.Format format14 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormatByArgumentIndex((int) '#', format14);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object obj7 = extendedMessageFormat2.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat7.parse("hi!", parsePosition10);
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
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = extendedMessageFormat5.parseObject("", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = extendedMessageFormat2.parseObject("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.Object obj7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.text.FieldPosition fieldPosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = extendedMessageFormat5.format(obj7, stringBuffer8, fieldPosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.lang.Class<?> wildcardClass9 = extendedMessageFormat7.getClass();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormats();
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = extendedMessageFormat7.parseObject("hi!", parsePosition11);
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
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat5.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        java.lang.Object obj5 = null;
        boolean boolean6 = extendedMessageFormat2.equals(obj5);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.String str9 = extendedMessageFormat5.toPattern();
        extendedMessageFormat5.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = extendedMessageFormat5.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat2.parse("hi!", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat2.parse("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.lang.String str13 = extendedMessageFormat11.toPattern();
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        java.text.Format[] formatArray16 = extendedMessageFormat15.getFormats();
        java.text.Format[] formatArray17 = extendedMessageFormat15.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormats(formatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.lang.Object obj11 = extendedMessageFormat7.clone();
        java.lang.Class<?> wildcardClass12 = extendedMessageFormat7.getClass();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = extendedMessageFormat5.parseObject("");
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
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.lang.String str13 = extendedMessageFormat11.toPattern();
        extendedMessageFormat11.applyPattern("hi!");
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map18);
        java.lang.String str20 = extendedMessageFormat19.toPattern();
        java.text.Format[] formatArray21 = extendedMessageFormat19.getFormatsByArgumentIndex();
        java.util.Locale locale22 = extendedMessageFormat19.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale22);
        extendedMessageFormat11.setLocale(locale22);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale22);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale22);
        extendedMessageFormat26.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex(0, (java.text.Format) extendedMessageFormat26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format format5 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (byte) 1, format5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map6);
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.lang.String str9 = extendedMessageFormat7.toPattern();
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatByArgumentIndex((int) (byte) 1, (java.text.Format) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat2.parseObject("");
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
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat1.parseObject("hi!", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map7);
        java.lang.String str9 = extendedMessageFormat8.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.lang.String str11 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray10);
        java.lang.String str12 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray10);
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = extendedMessageFormat2.format((java.lang.Object[]) formatArray10, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = extendedMessageFormat2.format((java.lang.Object) (-1L), stringBuffer11, fieldPosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class [Ljava.lang.Object; (java.lang.Long and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
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
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass12 = formatArray11.getClass();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object obj9 = extendedMessageFormat5.clone();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = extendedMessageFormat7.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormats();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = extendedMessageFormat1.parseObject("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map6);
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.lang.Object[] objArray10 = extendedMessageFormat7.parse("hi!");
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = extendedMessageFormat2.format(objArray10, stringBuffer11, fieldPosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map7);
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        java.lang.String str10 = extendedMessageFormat8.toPattern();
        java.util.Locale locale11 = extendedMessageFormat8.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        extendedMessageFormat12.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) 'a', (java.text.Format) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.lang.String str12 = extendedMessageFormat10.toPattern();
        java.lang.Object[] objArray14 = extendedMessageFormat10.parse("hi!");
        extendedMessageFormat10.applyPattern("");
        boolean boolean17 = extendedMessageFormat7.equals((java.lang.Object) extendedMessageFormat10);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.lang.String str11 = extendedMessageFormat9.toPattern();
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormats();
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = extendedMessageFormat2.format((java.lang.Object[]) formatArray13, stringBuffer14, fieldPosition15);
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
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = extendedMessageFormat2.parseObject("hi!", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray12 = extendedMessageFormat9.parse("hi!", parsePosition11);
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
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat2.parseObject("", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray3 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.util.Locale locale11 = extendedMessageFormat7.getLocale();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map14);
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        java.lang.String str17 = extendedMessageFormat15.toPattern();
        java.util.Locale locale18 = extendedMessageFormat15.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18);
        java.text.Format[] formatArray20 = extendedMessageFormat19.getFormats();
        java.text.Format[] formatArray21 = extendedMessageFormat19.getFormats();
        java.lang.StringBuffer stringBuffer22 = null;
        java.text.FieldPosition fieldPosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer24 = extendedMessageFormat7.format((java.lang.Object[]) formatArray21, stringBuffer22, fieldPosition23);
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.util.Locale locale11 = extendedMessageFormat7.getLocale();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.text.Format[] formatArray16 = extendedMessageFormat14.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormatsByArgumentIndex(formatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("", parsePosition7);
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
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("");
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.lang.String str13 = extendedMessageFormat11.toPattern();
        extendedMessageFormat11.applyPattern("hi!");
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map18);
        java.lang.String str20 = extendedMessageFormat19.toPattern();
        java.text.Format[] formatArray21 = extendedMessageFormat19.getFormatsByArgumentIndex();
        java.util.Locale locale22 = extendedMessageFormat19.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale22);
        extendedMessageFormat11.setLocale(locale22);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale22);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale22);
        boolean boolean27 = extendedMessageFormat2.equals((java.lang.Object) extendedMessageFormat26);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map14);
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        extendedMessageFormat17.applyPattern("hi!");
        java.lang.String str20 = extendedMessageFormat17.toPattern();
        java.lang.Object[] objArray22 = extendedMessageFormat17.parse("hi!");
        java.text.Format[] formatArray23 = extendedMessageFormat17.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat9.setFormat((int) (short) 0, (java.text.Format) extendedMessageFormat17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = extendedMessageFormat9.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.lang.String str12 = extendedMessageFormat10.toPattern();
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13);
        java.text.Format[] formatArray16 = extendedMessageFormat15.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (byte) 10, (java.text.Format) extendedMessageFormat15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat5.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = extendedMessageFormat19.parseObject("");
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
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
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
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map18);
        java.text.Format[] formatArray20 = extendedMessageFormat19.getFormats();
        java.text.Format[] formatArray21 = extendedMessageFormat19.getFormatsByArgumentIndex();
        java.util.Locale locale22 = extendedMessageFormat19.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((-1), (java.text.Format) extendedMessageFormat19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = extendedMessageFormat18.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
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
        java.util.Map map26 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map26);
        java.lang.String str28 = extendedMessageFormat27.toPattern();
        java.text.Format[] formatArray29 = extendedMessageFormat27.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat22.setFormatByArgumentIndex((int) '4', (java.text.Format) extendedMessageFormat27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray12 = extendedMessageFormat2.parse("", parsePosition11);
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
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.Object obj9 = null;
        java.lang.String str10 = extendedMessageFormat2.format(obj9);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map12);
        java.lang.String str14 = extendedMessageFormat13.toPattern();
        java.lang.Object obj15 = extendedMessageFormat13.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator16 = extendedMessageFormat2.formatToCharacterIterator(obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat16.applyPattern("hi!");
        java.lang.String str19 = extendedMessageFormat16.toPattern();
        java.lang.Object[] objArray21 = extendedMessageFormat16.parse("hi!");
        java.text.Format[] formatArray22 = extendedMessageFormat16.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormats(formatArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("hi!", parsePosition8);
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
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map12);
        java.lang.String str14 = extendedMessageFormat13.toPattern();
        java.text.Format[] formatArray15 = extendedMessageFormat13.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormatsByArgumentIndex(formatArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = extendedMessageFormat2.format((java.lang.Object) (-1.0f), stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class [Ljava.lang.Object; (java.lang.Float and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.lang.String str14 = extendedMessageFormat12.toPattern();
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        java.lang.Object[] objArray18 = extendedMessageFormat16.parse("hi!");
        java.util.Locale locale19 = extendedMessageFormat16.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormatByArgumentIndex(100, (java.text.Format) extendedMessageFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat4.getFormats();
        java.lang.StringBuffer stringBuffer9 = null;
        java.text.FieldPosition fieldPosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = extendedMessageFormat1.format((java.lang.Object[]) formatArray8, stringBuffer9, fieldPosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.lang.String str11 = extendedMessageFormat9.toPattern();
        java.util.Locale locale12 = extendedMessageFormat9.getLocale();
        java.util.Locale locale13 = extendedMessageFormat9.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator14 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
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
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
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
        java.util.Map map24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map24);
        java.util.Locale locale26 = extendedMessageFormat25.getLocale();
        java.lang.String str27 = extendedMessageFormat25.toPattern();
        java.util.Locale locale28 = extendedMessageFormat25.getLocale();
        java.text.Format[] formatArray29 = extendedMessageFormat25.getFormats();
        java.lang.StringBuffer stringBuffer30 = null;
        java.text.FieldPosition fieldPosition31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer32 = extendedMessageFormat22.format((java.lang.Object[]) formatArray29, stringBuffer30, fieldPosition31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.lang.Class<?> wildcardClass9 = locale8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = extendedMessageFormat2.format((java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class [Ljava.lang.Object; (java.lang.Class and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass5 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
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
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map19);
        java.text.Format[] formatArray21 = extendedMessageFormat20.getFormats();
        java.lang.StringBuffer stringBuffer22 = null;
        java.text.FieldPosition fieldPosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer24 = extendedMessageFormat17.format((java.lang.Object[]) formatArray21, stringBuffer22, fieldPosition23);
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
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.lang.String str12 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14, map16);
        boolean boolean18 = extendedMessageFormat2.equals((java.lang.Object) "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.util.Locale locale11 = extendedMessageFormat7.getLocale();
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator13 = extendedMessageFormat7.formatToCharacterIterator(obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatToCharacterIterator must be passed non-null object");
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("");
        java.lang.Class<?> wildcardClass7 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11);
        extendedMessageFormat12.applyPattern("hi!");
        java.lang.String str15 = extendedMessageFormat12.toPattern();
        java.lang.Object[] objArray17 = extendedMessageFormat12.parse("hi!");
        java.text.Format[] formatArray18 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.text.Format[] formatArray19 = extendedMessageFormat12.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
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
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.lang.String str16 = extendedMessageFormat14.toPattern();
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17);
        java.lang.Object[] objArray20 = extendedMessageFormat18.parse("hi!");
        java.util.Locale locale21 = extendedMessageFormat18.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat(1, (java.text.Format) extendedMessageFormat18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.lang.String str12 = extendedMessageFormat10.toPattern();
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13);
        java.text.Format[] formatArray15 = extendedMessageFormat14.getFormats();
        java.lang.String str16 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray15);
        java.lang.Class<?> wildcardClass17 = formatArray15.getClass();
        java.lang.StringBuffer stringBuffer18 = null;
        java.text.FieldPosition fieldPosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = extendedMessageFormat2.format((java.lang.Object) formatArray15, stringBuffer18, fieldPosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = java.text.MessageFormat.format("", objArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map5);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormatsByArgumentIndex(formatArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.lang.String str12 = extendedMessageFormat10.toPattern();
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13);
        java.lang.Object[] objArray16 = extendedMessageFormat14.parse("hi!");
        boolean boolean17 = extendedMessageFormat2.equals((java.lang.Object) extendedMessageFormat14);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("");
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray14 = extendedMessageFormat5.parse("", parsePosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.lang.String str12 = extendedMessageFormat10.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat10.getFormatsByArgumentIndex();
        boolean boolean14 = extendedMessageFormat7.equals((java.lang.Object) formatArray13);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.Class<?> wildcardClass6 = locale5.getClass();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormats();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map12);
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.lang.String str15 = extendedMessageFormat13.toPattern();
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        java.lang.Object[] objArray19 = extendedMessageFormat17.parse("hi!");
        java.lang.String str20 = java.text.MessageFormat.format("hi!", objArray19);
        java.lang.StringBuffer stringBuffer21 = null;
        java.text.FieldPosition fieldPosition22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = extendedMessageFormat2.format(objArray19, stringBuffer21, fieldPosition22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray20 = extendedMessageFormat18.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
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
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat5.parseObject("", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
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
        java.lang.Class<?> wildcardClass20 = locale15.getClass();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.lang.Object[] objArray10 = extendedMessageFormat8.parse("hi!");
        java.util.Locale locale11 = extendedMessageFormat8.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11);
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray15 = extendedMessageFormat12.parse("", parsePosition14);
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
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.lang.Object obj4 = extendedMessageFormat1.clone();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
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
        java.lang.Class<?> wildcardClass16 = locale13.getClass();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.lang.String str11 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat9.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = extendedMessageFormat2.format((java.lang.Object[]) formatArray12, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.text.Format format8 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) ' ', format8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray24 = extendedMessageFormat22.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
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
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray12 = new java.lang.Object[] { 0 };
        java.lang.String str13 = java.text.MessageFormat.format("", objArray12);
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = extendedMessageFormat9.format(objArray12, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.lang.String str12 = extendedMessageFormat10.toPattern();
        java.util.Locale locale13 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13);
        java.lang.Object[] objArray16 = extendedMessageFormat14.parse("hi!");
        java.lang.StringBuffer stringBuffer17 = null;
        java.text.FieldPosition fieldPosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = extendedMessageFormat2.format(objArray16, stringBuffer17, fieldPosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat2.parseObject("hi!", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = extendedMessageFormat1.parseObject("hi!", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat5.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        extendedMessageFormat7.applyPattern("hi!");
        java.lang.String str10 = extendedMessageFormat7.toPattern();
        java.lang.Object[] objArray12 = extendedMessageFormat7.parse("hi!");
        java.text.Format[] formatArray13 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.text.Format[] formatArray14 = extendedMessageFormat7.getFormats();
        java.lang.Object[] objArray16 = extendedMessageFormat7.parse("hi!");
        java.lang.String str17 = java.text.MessageFormat.format("hi!", objArray16);
        java.lang.String str18 = java.text.MessageFormat.format("", objArray16);
        java.lang.Class<?> wildcardClass19 = objArray16.getClass();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map12);
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map15);
        java.text.Format[] formatArray17 = extendedMessageFormat16.getFormats();
        java.text.Format[] formatArray18 = extendedMessageFormat16.getFormatsByArgumentIndex();
        java.util.Locale locale19 = extendedMessageFormat16.getLocale();
        java.text.Format[] formatArray20 = extendedMessageFormat16.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat13.setFormatsByArgumentIndex(formatArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat2.parseObject("", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.lang.Object obj2 = extendedMessageFormat1.clone();
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.lang.String str11 = extendedMessageFormat9.toPattern();
        java.lang.Object[] objArray13 = extendedMessageFormat9.parse("hi!");
        java.lang.Object[] objArray15 = extendedMessageFormat9.parse("hi!");
        java.lang.String str16 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray17 = extendedMessageFormat9.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat5.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
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
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15);
        java.lang.Object obj21 = extendedMessageFormat20.clone();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat2.parse("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormats();
        java.lang.Object[] objArray11 = extendedMessageFormat7.parse("hi!");
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map15);
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17);
        extendedMessageFormat18.applyPattern("hi!");
        java.lang.String str21 = extendedMessageFormat18.toPattern();
        java.lang.Object[] objArray23 = extendedMessageFormat18.parse("hi!");
        java.text.Format[] formatArray24 = extendedMessageFormat18.getFormatsByArgumentIndex();
        java.text.Format[] formatArray25 = extendedMessageFormat18.getFormats();
        java.lang.Object[] objArray27 = extendedMessageFormat18.parse("hi!");
        java.lang.String str28 = java.text.MessageFormat.format("hi!", objArray27);
        boolean boolean29 = extendedMessageFormat7.equals((java.lang.Object) str28);
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
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertArrayEquals(objArray27, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormats();
        java.text.Format[] formatArray10 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.util.Locale locale11 = extendedMessageFormat8.getLocale();
        boolean boolean12 = extendedMessageFormat2.equals((java.lang.Object) locale11);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
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
        java.lang.Class<?> wildcardClass16 = extendedMessageFormat5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.lang.String str14 = extendedMessageFormat12.toPattern();
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        java.text.Format[] formatArray17 = extendedMessageFormat16.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormatsByArgumentIndex(formatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray24 = extendedMessageFormat19.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.Object[] objArray7 = extendedMessageFormat4.parse("hi!");
        java.lang.String str8 = java.text.MessageFormat.format("hi!", objArray7);
        java.lang.String str9 = java.text.MessageFormat.format("", objArray7);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass7 = formatArray6.getClass();
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormats();
        java.lang.Class<?> wildcardClass3 = extendedMessageFormat1.getClass();
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale12);
        extendedMessageFormat13.applyPattern("hi!");
        java.lang.String str16 = extendedMessageFormat13.toPattern();
        java.lang.Object[] objArray18 = extendedMessageFormat13.parse("hi!");
        java.text.Format[] formatArray19 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.text.Format[] formatArray20 = extendedMessageFormat13.getFormats();
        java.lang.Object[] objArray22 = extendedMessageFormat13.parse("hi!");
        java.lang.StringBuffer stringBuffer23 = null;
        java.text.FieldPosition fieldPosition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = extendedMessageFormat7.format(objArray22, stringBuffer23, fieldPosition24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        java.lang.String str9 = extendedMessageFormat7.toPattern();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.lang.String str15 = extendedMessageFormat14.toPattern();
        java.text.Format[] formatArray16 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.lang.String str17 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray16);
        java.lang.String str18 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray16);
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = extendedMessageFormat7.format((java.lang.Object[]) formatArray16, stringBuffer19, fieldPosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.lang.String str15 = extendedMessageFormat14.toPattern();
        extendedMessageFormat14.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = extendedMessageFormat5.format((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
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
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.Class<?> wildcardClass6 = locale5.getClass();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
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
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map23);
        java.util.Locale locale25 = extendedMessageFormat24.getLocale();
        java.text.Format[] formatArray26 = extendedMessageFormat24.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer27 = null;
        java.text.FieldPosition fieldPosition28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer29 = extendedMessageFormat19.format((java.lang.Object) extendedMessageFormat24, stringBuffer27, fieldPosition28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (short) -1, (java.text.Format) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat16.applyPattern("hi!");
        java.lang.String str19 = extendedMessageFormat16.toPattern();
        java.lang.Object[] objArray21 = extendedMessageFormat16.parse("hi!");
        java.text.Format[] formatArray22 = extendedMessageFormat16.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormats();
        java.lang.Object[] objArray11 = extendedMessageFormat7.parse("hi!");
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map15);
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17);
        extendedMessageFormat18.applyPattern("hi!");
        java.lang.String str21 = extendedMessageFormat18.toPattern();
        java.lang.String str22 = extendedMessageFormat18.toPattern();
        extendedMessageFormat18.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormatByArgumentIndex((int) (short) 0, (java.text.Format) extendedMessageFormat18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        java.lang.String str9 = extendedMessageFormat7.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map12);
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormats();
        java.text.Format[] formatArray15 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        java.text.Format[] formatArray17 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer18 = null;
        java.text.FieldPosition fieldPosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = extendedMessageFormat7.format((java.lang.Object) extendedMessageFormat13, stringBuffer18, fieldPosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.util.Locale locale13 = extendedMessageFormat11.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormatByArgumentIndex(100, (java.text.Format) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.util.Locale locale14 = extendedMessageFormat12.getLocale();
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14, map15);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) '#', (java.text.Format) extendedMessageFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormatsByArgumentIndex();
        extendedMessageFormat2.applyPattern("hi!");
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
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.Object obj9 = null;
        java.lang.String str10 = extendedMessageFormat2.format(obj9);
        java.lang.Class<?> wildcardClass11 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        extendedMessageFormat9.applyPattern("");
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map16);
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18);
        extendedMessageFormat19.applyPattern("hi!");
        java.lang.String str22 = extendedMessageFormat19.toPattern();
        java.lang.Object[] objArray24 = extendedMessageFormat19.parse("hi!");
        java.text.Format[] formatArray25 = extendedMessageFormat19.getFormatsByArgumentIndex();
        java.lang.String str26 = extendedMessageFormat19.toPattern();
        java.util.Locale locale27 = extendedMessageFormat19.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat9.setFormatByArgumentIndex((int) (byte) -1, (java.text.Format) extendedMessageFormat19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.String str9 = extendedMessageFormat5.toPattern();
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat5.getLocale();
        java.lang.Object obj13 = extendedMessageFormat5.clone();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format format6 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat(10, format6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (byte) 1, (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.lang.String str13 = extendedMessageFormat11.toPattern();
        extendedMessageFormat11.applyPattern("hi!");
        java.lang.Object[] objArray17 = extendedMessageFormat11.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormatByArgumentIndex(1, (java.text.Format) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.lang.Object[] objArray10 = extendedMessageFormat8.parse("hi!");
        java.lang.String str11 = java.text.MessageFormat.format("", objArray10);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        extendedMessageFormat5.applyPattern("hi!");
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map16);
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        java.lang.String str19 = extendedMessageFormat17.toPattern();
        java.util.Locale locale20 = extendedMessageFormat17.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale20);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale20);
        java.text.Format[] formatArray23 = extendedMessageFormat22.getFormats();
        java.text.Format[] formatArray24 = extendedMessageFormat22.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormats(formatArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = extendedMessageFormat2.parseObject("");
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
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.String str9 = extendedMessageFormat5.toPattern();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        extendedMessageFormat12.applyPattern("hi!");
        java.lang.Object[] objArray16 = extendedMessageFormat12.parse("hi!");
        java.text.Format[] formatArray17 = extendedMessageFormat12.getFormats();
        java.lang.StringBuffer stringBuffer18 = null;
        java.text.FieldPosition fieldPosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = extendedMessageFormat5.format((java.lang.Object) extendedMessageFormat12, stringBuffer18, fieldPosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        extendedMessageFormat7.applyPattern("hi!");
        java.lang.String str10 = extendedMessageFormat7.toPattern();
        java.lang.Object[] objArray12 = extendedMessageFormat7.parse("hi!");
        extendedMessageFormat7.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = extendedMessageFormat1.format((java.lang.Object) extendedMessageFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
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
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.lang.String str13 = extendedMessageFormat11.toPattern();
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        java.text.Format[] formatArray16 = extendedMessageFormat15.getFormats();
        java.text.Format[] formatArray17 = extendedMessageFormat15.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray8 = extendedMessageFormat5.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map8);
        java.lang.Object[] objArray11 = extendedMessageFormat9.parse("hi!");
        boolean boolean12 = extendedMessageFormat2.equals((java.lang.Object) extendedMessageFormat9);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        extendedMessageFormat5.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray14 = extendedMessageFormat5.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map11);
        java.lang.Object obj13 = extendedMessageFormat12.clone();
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        extendedMessageFormat6.applyPattern("hi!");
        java.lang.String str9 = extendedMessageFormat6.toPattern();
        java.lang.Object[] objArray11 = extendedMessageFormat6.parse("hi!");
        java.text.Format[] formatArray12 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.text.Format[] formatArray13 = extendedMessageFormat6.getFormats();
        extendedMessageFormat6.applyPattern("hi!");
        java.text.Format[] formatArray16 = extendedMessageFormat6.getFormatsByArgumentIndex();
        java.lang.String str17 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray16);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
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
            java.lang.Object obj10 = extendedMessageFormat2.parseObject("hi!", parsePosition9);
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
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormats();
        java.text.Format[] formatArray10 = extendedMessageFormat8.getFormats();
        java.lang.String str11 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray10);
        java.lang.Class<?> wildcardClass12 = formatArray10.getClass();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.Object obj6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = extendedMessageFormat2.format(obj6, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.lang.String str12 = extendedMessageFormat11.toPattern();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14, map16);
        java.text.Format[] formatArray18 = extendedMessageFormat17.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
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
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15);
        java.lang.Object[] objArray22 = new java.lang.Object[] {};
        java.lang.String str23 = java.text.MessageFormat.format("hi!", objArray22);
        java.lang.StringBuffer stringBuffer24 = null;
        java.text.FieldPosition fieldPosition25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer26 = extendedMessageFormat20.format(objArray22, stringBuffer24, fieldPosition25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
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
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map12);
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = extendedMessageFormat13.parseObject("", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.lang.Object[] objArray9 = extendedMessageFormat3.parse("hi!");
        java.lang.String str10 = java.text.MessageFormat.format("", objArray9);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
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
        java.lang.Class<?> wildcardClass16 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10);
        extendedMessageFormat11.applyPattern("hi!");
        java.lang.String str14 = extendedMessageFormat11.toPattern();
        java.lang.Object[] objArray16 = extendedMessageFormat11.parse("hi!");
        java.text.Format[] formatArray17 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.text.Format[] formatArray18 = extendedMessageFormat11.getFormats();
        extendedMessageFormat11.applyPattern("hi!");
        java.text.Format[] formatArray21 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer22 = null;
        java.text.FieldPosition fieldPosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer24 = extendedMessageFormat2.format((java.lang.Object[]) formatArray21, stringBuffer22, fieldPosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5);
        extendedMessageFormat7.applyPattern("hi!");
        java.lang.Object obj10 = extendedMessageFormat7.clone();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
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
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map21);
        java.util.Locale locale23 = extendedMessageFormat22.getLocale();
        java.lang.String str24 = extendedMessageFormat22.toPattern();
        java.lang.Object[] objArray26 = extendedMessageFormat22.parse("hi!");
        java.lang.String str27 = java.text.MessageFormat.format("hi!", objArray26);
        boolean boolean28 = extendedMessageFormat7.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        extendedMessageFormat9.applyPattern("");
        java.lang.Object obj13 = extendedMessageFormat9.clone();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.lang.Object[] objArray12 = extendedMessageFormat9.parse("hi!");
        boolean boolean13 = extendedMessageFormat2.equals((java.lang.Object) objArray12);
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.lang.Object[] objArray10 = extendedMessageFormat7.parse("hi!");
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.lang.String str16 = extendedMessageFormat14.toPattern();
        java.lang.Object[] objArray18 = extendedMessageFormat14.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormatByArgumentIndex((int) (short) 0, (java.text.Format) extendedMessageFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray12 = extendedMessageFormat5.parse("", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.lang.Object obj9 = extendedMessageFormat5.clone();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6);
        java.text.Format[] formatArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormats(formatArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map7);
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        extendedMessageFormat10.applyPattern("hi!");
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        java.lang.Object[] objArray15 = extendedMessageFormat10.parse("hi!");
        java.text.Format[] formatArray16 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.text.Format[] formatArray17 = extendedMessageFormat10.getFormats();
        java.text.Format[] formatArray18 = extendedMessageFormat10.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat5.toPattern();
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = extendedMessageFormat5.parseObject("hi!", parsePosition14);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.text.Format[] formatArray8 = extendedMessageFormat5.getFormats();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat5.parse("hi!", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.lang.Object[] objArray8 = extendedMessageFormat4.parse("hi!");
        java.lang.String str9 = java.text.MessageFormat.format("hi!", objArray8);
        java.lang.String str10 = java.text.MessageFormat.format("hi!", objArray8);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.lang.String str11 = extendedMessageFormat9.toPattern();
        extendedMessageFormat9.applyPattern("hi!");
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map16);
        java.lang.String str18 = extendedMessageFormat17.toPattern();
        java.text.Format[] formatArray19 = extendedMessageFormat17.getFormatsByArgumentIndex();
        java.util.Locale locale20 = extendedMessageFormat17.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale20);
        extendedMessageFormat9.setLocale(locale20);
        java.util.Map map23 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale20, map23);
        boolean boolean25 = extendedMessageFormat2.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = extendedMessageFormat9.parseObject("hi!", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
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
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map20);
        java.util.Locale locale22 = extendedMessageFormat21.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale22);
        extendedMessageFormat23.applyPattern("hi!");
        java.lang.String str26 = extendedMessageFormat23.toPattern();
        java.lang.Object[] objArray28 = extendedMessageFormat23.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormat((int) '#', (java.text.Format) extendedMessageFormat23);
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
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertArrayEquals(objArray28, new java.lang.Object[] {});
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.Object[] objArray14 = extendedMessageFormat5.parse("hi!");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        java.text.Format[] formatArray10 = new java.text.Format[] {};
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
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.lang.String str13 = extendedMessageFormat11.toPattern();
        java.lang.Object[] objArray15 = extendedMessageFormat11.parse("hi!");
        extendedMessageFormat11.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormat((int) 'a', (java.text.Format) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.lang.Object[] objArray10 = extendedMessageFormat8.parse("hi!");
        java.util.Locale locale11 = extendedMessageFormat8.getLocale();
        java.util.Locale locale12 = extendedMessageFormat8.getLocale();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12, map13);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
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
        java.text.ParsePosition parsePosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = extendedMessageFormat5.parseObject("hi!", parsePosition18);
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
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
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
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        extendedMessageFormat2.applyPattern("");
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.lang.String str13 = extendedMessageFormat11.toPattern();
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        java.text.Format[] formatArray16 = extendedMessageFormat15.getFormats();
        java.text.Format[] formatArray17 = extendedMessageFormat15.getFormats();
        java.lang.Object[] objArray19 = extendedMessageFormat15.parse("hi!");
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = extendedMessageFormat2.format(objArray19, stringBuffer20, fieldPosition21);
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
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11);
        extendedMessageFormat12.applyPattern("hi!");
        java.lang.String str15 = extendedMessageFormat12.toPattern();
        java.lang.Object[] objArray17 = extendedMessageFormat12.parse("hi!");
        boolean boolean18 = extendedMessageFormat2.equals((java.lang.Object) extendedMessageFormat12);
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map11);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map16);
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        java.lang.Object[] objArray20 = extendedMessageFormat17.parse("hi!");
        java.lang.String str21 = java.text.MessageFormat.format("hi!", objArray20);
        java.lang.String str22 = java.text.MessageFormat.format("hi!", objArray20);
        java.lang.StringBuffer stringBuffer23 = null;
        java.text.FieldPosition fieldPosition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = extendedMessageFormat12.format(objArray20, stringBuffer23, fieldPosition24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("hi!");
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
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.String str9 = extendedMessageFormat5.toPattern();
        java.lang.String str10 = extendedMessageFormat5.toPattern();
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat5.parse("", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
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
        java.text.ParsePosition parsePosition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = extendedMessageFormat7.parseObject("", parsePosition24);
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        extendedMessageFormat11.applyPattern("hi!");
        java.lang.Object[] objArray15 = extendedMessageFormat11.parse("hi!");
        java.text.Format[] formatArray16 = extendedMessageFormat11.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormatByArgumentIndex((int) (short) -1, (java.text.Format) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.Object obj9 = null;
        java.lang.String str10 = extendedMessageFormat2.format(obj9);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.util.Locale locale16 = extendedMessageFormat14.getLocale();
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16, map17);
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = extendedMessageFormat2.format((java.lang.Object) locale16, stringBuffer19, fieldPosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.Locale cannot be cast to class [Ljava.lang.Object; (java.util.Locale and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
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
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        java.lang.Class<?> wildcardClass5 = extendedMessageFormat2.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormats();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map11);
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator14 = extendedMessageFormat7.formatToCharacterIterator((java.lang.Object) extendedMessageFormat12);
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
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
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
            java.lang.Object[] objArray15 = extendedMessageFormat5.parse("hi!", parsePosition14);
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
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map8);
        java.lang.String str10 = extendedMessageFormat9.toPattern();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((-1), (java.text.Format) extendedMessageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        java.lang.Object obj14 = extendedMessageFormat12.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = extendedMessageFormat9.format((java.lang.Object) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale11 = extendedMessageFormat2.getLocale();
        java.lang.Object obj12 = extendedMessageFormat2.clone();
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
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
        java.lang.Object obj23 = extendedMessageFormat19.clone();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
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
        java.text.ParsePosition parsePosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray22 = extendedMessageFormat19.parse("", parsePosition21);
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
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map12);
        java.util.Locale locale16 = null;
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16, map17);
        java.text.Format[] formatArray19 = extendedMessageFormat18.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat13.setFormatByArgumentIndex((int) '4', (java.text.Format) extendedMessageFormat18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.lang.String str8 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray7);
        java.lang.String str9 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray7);
        java.lang.String str10 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray7);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.lang.String str5 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map9);
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat10.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat7.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        extendedMessageFormat9.applyPattern("");
        java.text.Format[] formatArray13 = extendedMessageFormat9.getFormats();
        java.lang.Object obj14 = extendedMessageFormat9.clone();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat7.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat5.toPattern();
        java.util.Locale locale13 = extendedMessageFormat5.getLocale();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map16);
        extendedMessageFormat17.applyPattern("hi!");
        java.lang.Object[] objArray21 = extendedMessageFormat17.parse("hi!");
        java.text.Format[] formatArray22 = extendedMessageFormat17.getFormats();
        java.lang.String str23 = extendedMessageFormat17.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormatByArgumentIndex((int) '#', (java.text.Format) extendedMessageFormat17);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = extendedMessageFormat5.parseObject("", parsePosition13);
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
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        extendedMessageFormat7.applyPattern("");
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        extendedMessageFormat16.applyPattern("hi!");
        java.lang.String str19 = extendedMessageFormat16.toPattern();
        java.lang.Object[] objArray21 = extendedMessageFormat16.parse("hi!");
        java.lang.StringBuffer stringBuffer22 = null;
        java.text.FieldPosition fieldPosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer24 = extendedMessageFormat7.format(objArray21, stringBuffer22, fieldPosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[] {});
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.lang.String str12 = extendedMessageFormat10.toPattern();
        java.lang.Object[] objArray14 = extendedMessageFormat10.parse("hi!");
        java.lang.Object[] objArray16 = extendedMessageFormat10.parse("hi!");
        java.lang.String str17 = extendedMessageFormat10.toPattern();
        java.text.Format[] formatArray18 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.text.Format[] formatArray19 = extendedMessageFormat10.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormat((int) (short) 10, (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray7 = extendedMessageFormat2.parse("hi!");
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = extendedMessageFormat2.parseObject("hi!", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13);
        extendedMessageFormat14.applyPattern("hi!");
        java.lang.String str17 = extendedMessageFormat14.toPattern();
        java.lang.Object[] objArray19 = extendedMessageFormat14.parse("hi!");
        java.text.Format[] formatArray20 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.text.Format[] formatArray21 = extendedMessageFormat14.getFormats();
        extendedMessageFormat14.applyPattern("hi!");
        java.lang.Object[] objArray25 = extendedMessageFormat14.parse("hi!");
        java.lang.StringBuffer stringBuffer26 = null;
        java.text.FieldPosition fieldPosition27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer28 = extendedMessageFormat2.format(objArray25, stringBuffer26, fieldPosition27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[] {});
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map7);
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        java.lang.String str10 = extendedMessageFormat8.toPattern();
        java.lang.Object[] objArray12 = extendedMessageFormat8.parse("hi!");
        java.lang.String str13 = java.text.MessageFormat.format("hi!", objArray12);
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = extendedMessageFormat2.format(objArray12, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormats();
        java.lang.Object[] objArray11 = extendedMessageFormat7.parse("hi!");
        boolean boolean13 = extendedMessageFormat7.equals((java.lang.Object) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.lang.String str11 = extendedMessageFormat9.toPattern();
        extendedMessageFormat9.applyPattern("hi!");
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map16);
        java.lang.String str18 = extendedMessageFormat17.toPattern();
        java.text.Format[] formatArray19 = extendedMessageFormat17.getFormatsByArgumentIndex();
        java.util.Locale locale20 = extendedMessageFormat17.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale20);
        extendedMessageFormat9.setLocale(locale20);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale20);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale20);
        java.util.Locale locale25 = extendedMessageFormat24.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (byte) 1, (java.text.Format) extendedMessageFormat24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray17 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map12);
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.util.Locale locale15 = extendedMessageFormat13.getLocale();
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        java.text.Format[] formatArray17 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer18 = null;
        java.text.FieldPosition fieldPosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = extendedMessageFormat5.format((java.lang.Object[]) formatArray17, stringBuffer18, fieldPosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.lang.String str12 = extendedMessageFormat10.toPattern();
        extendedMessageFormat10.applyPattern("hi!");
        java.lang.Object[] objArray16 = extendedMessageFormat10.parse("hi!");
        java.text.Format[] formatArray17 = extendedMessageFormat10.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormatsByArgumentIndex(formatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.text.Format format10 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormat((int) (byte) 1, format10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object obj7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.text.FieldPosition fieldPosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = extendedMessageFormat2.format(obj7, stringBuffer8, fieldPosition9);
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
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = extendedMessageFormat9.parseObject("", parsePosition12);
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
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray4 = extendedMessageFormat1.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("");
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map10);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormats();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        java.text.Format[] formatArray15 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.util.Locale locale16 = extendedMessageFormat11.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.Object[] objArray5 = extendedMessageFormat2.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
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
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = extendedMessageFormat7.parseObject("hi!", parsePosition15);
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray4 = extendedMessageFormat1.parse("", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.Object obj6 = extendedMessageFormat5.clone();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Class<?> wildcardClass10 = formatArray9.getClass();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray16 = extendedMessageFormat5.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
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
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("");
        java.lang.Object obj12 = extendedMessageFormat5.clone();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        extendedMessageFormat3.applyPattern("hi!");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6);
        java.util.Locale locale9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.text.Format[] formatArray12 = extendedMessageFormat10.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormatsByArgumentIndex(formatArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object obj8 = extendedMessageFormat2.clone();
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
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.Object obj9 = null;
        java.lang.String str10 = extendedMessageFormat2.format(obj9);
        extendedMessageFormat2.applyPattern("hi!");
        extendedMessageFormat2.applyPattern("hi!");
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = extendedMessageFormat2.parseObject("hi!", parsePosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormats();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.Object obj9 = null;
        java.lang.String str10 = extendedMessageFormat2.format(obj9);
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray13 = extendedMessageFormat2.parse("hi!", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        extendedMessageFormat3.applyPattern("hi!");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        extendedMessageFormat7.applyPattern("hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.lang.String str5 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray4);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map12);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.lang.Object[] objArray12 = extendedMessageFormat10.parse("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator13 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale8 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8);
        java.lang.Object obj10 = extendedMessageFormat9.clone();
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.lang.String str16 = extendedMessageFormat14.toPattern();
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17);
        java.text.Format[] formatArray19 = extendedMessageFormat18.getFormats();
        java.lang.String str20 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray19);
        java.lang.Class<?> wildcardClass21 = formatArray19.getClass();
        java.lang.StringBuffer stringBuffer22 = null;
        java.text.FieldPosition fieldPosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer24 = extendedMessageFormat7.format((java.lang.Object) formatArray19, stringBuffer22, fieldPosition23);
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
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
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
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
        java.util.Map map24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map24);
        java.lang.String str26 = extendedMessageFormat25.toPattern();
        java.text.Format[] formatArray27 = extendedMessageFormat25.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator28 = extendedMessageFormat22.formatToCharacterIterator((java.lang.Object) extendedMessageFormat25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormats();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map6);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.lang.String str10 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray9);
        java.lang.String str11 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray9);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat1.setFormats(formatArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        java.lang.String str14 = extendedMessageFormat12.toPattern();
        java.lang.Object[] objArray16 = extendedMessageFormat12.parse("hi!");
        extendedMessageFormat12.applyPattern("");
        java.text.Format[] formatArray19 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.util.Locale locale20 = extendedMessageFormat12.getLocale();
        boolean boolean21 = extendedMessageFormat9.equals((java.lang.Object) locale20);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.Object obj9 = null;
        java.lang.String str10 = extendedMessageFormat2.format(obj9);
        extendedMessageFormat2.applyPattern("hi!");
        extendedMessageFormat2.applyPattern("hi!");
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray17 = extendedMessageFormat2.parse("hi!", parsePosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
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
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale15);
        java.text.ParsePosition parsePosition22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = extendedMessageFormat20.parseObject("", parsePosition22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
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
        java.lang.String str20 = extendedMessageFormat16.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat12.setFormat(100, (java.text.Format) extendedMessageFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
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
        extendedMessageFormat5.applyPattern("");
        java.util.Map map21 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map21);
        java.util.Locale locale23 = extendedMessageFormat22.getLocale();
        java.lang.String str24 = extendedMessageFormat22.toPattern();
        java.lang.Object[] objArray26 = extendedMessageFormat22.parse("hi!");
        java.lang.Object[] objArray28 = extendedMessageFormat22.parse("hi!");
        java.lang.String str29 = extendedMessageFormat22.toPattern();
        java.text.Format[] formatArray30 = extendedMessageFormat22.getFormatsByArgumentIndex();
        extendedMessageFormat22.applyPattern("");
        java.text.Format[] formatArray33 = extendedMessageFormat22.getFormats();
        java.lang.String str34 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray33);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormats(formatArray33);
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
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertArrayEquals(objArray28, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        java.lang.String str9 = extendedMessageFormat7.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.util.Locale locale11 = extendedMessageFormat7.getLocale();
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map15);
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        java.lang.String str18 = extendedMessageFormat16.toPattern();
        java.util.Locale locale19 = extendedMessageFormat16.getLocale();
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19, map20);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormatByArgumentIndex((int) '#', (java.text.Format) extendedMessageFormat21);
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
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11);
        extendedMessageFormat12.applyPattern("hi!");
        java.lang.String str15 = extendedMessageFormat12.toPattern();
        java.lang.Object[] objArray17 = extendedMessageFormat12.parse("hi!");
        java.text.Format[] formatArray18 = extendedMessageFormat12.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormatByArgumentIndex(1, (java.text.Format) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat7.getFormats();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.lang.String str16 = extendedMessageFormat14.toPattern();
        java.lang.Object[] objArray18 = extendedMessageFormat14.parse("hi!");
        extendedMessageFormat14.applyPattern("");
        java.text.Format[] formatArray21 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.util.Locale locale22 = extendedMessageFormat14.getLocale();
        java.lang.StringBuffer stringBuffer23 = null;
        java.text.FieldPosition fieldPosition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = extendedMessageFormat7.format((java.lang.Object) extendedMessageFormat14, stringBuffer23, fieldPosition24);
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
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray9 = extendedMessageFormat2.parse("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatsByArgumentIndex(formatArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
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
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator17 = extendedMessageFormat7.formatToCharacterIterator((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class [Ljava.lang.Object; (java.lang.String and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
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
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map7);
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat8.parse("", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1, map2);
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map6);
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.lang.String str9 = extendedMessageFormat7.toPattern();
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10);
        java.lang.String str12 = extendedMessageFormat11.toPattern();
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = extendedMessageFormat3.format((java.lang.Object) extendedMessageFormat11, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13);
        extendedMessageFormat14.applyPattern("hi!");
        java.lang.String str17 = extendedMessageFormat14.toPattern();
        java.lang.Object[] objArray19 = extendedMessageFormat14.parse("hi!");
        java.text.Format[] formatArray20 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.text.Format[] formatArray21 = extendedMessageFormat14.getFormats();
        extendedMessageFormat14.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormatByArgumentIndex((int) 'a', (java.text.Format) extendedMessageFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.lang.Object[] objArray10 = extendedMessageFormat7.parse("hi!");
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map12);
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormats();
        java.text.Format[] formatArray15 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        java.text.Format[] formatArray17 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.util.Locale locale18 = extendedMessageFormat13.getLocale();
        java.text.Format[] formatArray19 = extendedMessageFormat13.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormatsByArgumentIndex(formatArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.lang.String str13 = extendedMessageFormat11.toPattern();
        extendedMessageFormat11.applyPattern("hi!");
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map18);
        java.lang.String str20 = extendedMessageFormat19.toPattern();
        java.text.Format[] formatArray21 = extendedMessageFormat19.getFormatsByArgumentIndex();
        java.util.Locale locale22 = extendedMessageFormat19.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale22);
        extendedMessageFormat11.setLocale(locale22);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale22);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale22);
        extendedMessageFormat26.applyPattern("");
        java.lang.String str29 = extendedMessageFormat26.toPattern();
        java.text.Format[] formatArray30 = extendedMessageFormat26.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(formatArray30);
        org.junit.Assert.assertArrayEquals(formatArray30, new java.text.Format[] {});
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("");
        extendedMessageFormat5.applyPattern("hi!");
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map15);
        java.util.Locale locale17 = extendedMessageFormat16.getLocale();
        java.lang.String str18 = extendedMessageFormat16.toPattern();
        java.lang.String str19 = extendedMessageFormat16.toPattern();
        java.text.Format[] formatArray20 = extendedMessageFormat16.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer21 = null;
        java.text.FieldPosition fieldPosition22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = extendedMessageFormat5.format((java.lang.Object[]) formatArray20, stringBuffer21, fieldPosition22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
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
            java.lang.Object obj15 = extendedMessageFormat9.parseObject("", parsePosition14);
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
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat3.parse("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.lang.Object obj6 = extendedMessageFormat2.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        extendedMessageFormat3.applyPattern("hi!");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6);
        java.lang.Class<?> wildcardClass8 = locale6.getClass();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.util.Locale locale2 = extendedMessageFormat1.getLocale();
        java.lang.String str3 = extendedMessageFormat1.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat1.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray6 = extendedMessageFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.lang.String str14 = extendedMessageFormat11.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator15 = extendedMessageFormat7.formatToCharacterIterator((java.lang.Object) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("");
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = extendedMessageFormat2.parseObject("", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("");
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = extendedMessageFormat5.parseObject("hi!", parsePosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat7.getFormats();
        extendedMessageFormat7.applyPattern("");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = extendedMessageFormat2.parseObject("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format format5 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex(1, format5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat2.parse("", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.lang.String str8 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray7);
        java.lang.String str9 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray7);
        java.lang.String str10 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray7);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        java.lang.Class<?> wildcardClass10 = locale9.getClass();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
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
        java.text.ParsePosition parsePosition26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray27 = extendedMessageFormat7.parse("", parsePosition26);
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
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray7 = extendedMessageFormat2.parse("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat5.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray14 = extendedMessageFormat5.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
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
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
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
        java.lang.String str16 = extendedMessageFormat5.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = extendedMessageFormat5.parseObject("");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = extendedMessageFormat19.parseObject("hi!");
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
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.lang.String str13 = extendedMessageFormat11.toPattern();
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        java.text.Format[] formatArray17 = extendedMessageFormat16.getFormats();
        extendedMessageFormat16.applyPattern("");
        java.text.Format[] formatArray20 = extendedMessageFormat16.getFormats();
        java.lang.StringBuffer stringBuffer21 = null;
        java.text.FieldPosition fieldPosition22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = extendedMessageFormat5.format((java.lang.Object[]) formatArray20, stringBuffer21, fieldPosition22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        java.util.Locale locale8 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray12 = extendedMessageFormat2.parse("", parsePosition11);
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
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.String str9 = extendedMessageFormat5.toPattern();
        java.lang.Class<?> wildcardClass10 = extendedMessageFormat5.getClass();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormats();
        java.lang.String str8 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray7);
        java.lang.Class<?> wildcardClass9 = formatArray7.getClass();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("");
        extendedMessageFormat2.applyPattern("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.lang.String str13 = extendedMessageFormat11.toPattern();
        extendedMessageFormat11.applyPattern("hi!");
        java.lang.Object[] objArray17 = extendedMessageFormat11.parse("hi!");
        java.lang.Object obj18 = null;
        java.lang.String str19 = extendedMessageFormat11.format(obj18);
        extendedMessageFormat11.applyPattern("hi!");
        extendedMessageFormat11.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator24 = extendedMessageFormat5.formatToCharacterIterator((java.lang.Object) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map12);
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.lang.String str15 = extendedMessageFormat13.toPattern();
        extendedMessageFormat13.applyPattern("hi!");
        java.lang.String str18 = extendedMessageFormat13.toPattern();
        java.text.Format[] formatArray19 = extendedMessageFormat13.getFormats();
        java.lang.String str20 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray19);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        java.util.Locale locale2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map7);
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map10);
        extendedMessageFormat3.setLocale(locale9);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = extendedMessageFormat14.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
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
        java.lang.Object[] objArray18 = extendedMessageFormat14.parse("hi!");
        java.lang.Object[] objArray20 = extendedMessageFormat14.parse("hi!");
        java.lang.String str21 = extendedMessageFormat14.toPattern();
        java.text.Format[] formatArray22 = extendedMessageFormat14.getFormatsByArgumentIndex();
        extendedMessageFormat14.applyPattern("");
        java.text.Format[] formatArray25 = extendedMessageFormat14.getFormats();
        java.lang.String str26 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray25);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormats(formatArray25);
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
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(formatArray22);
        org.junit.Assert.assertArrayEquals(formatArray22, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        extendedMessageFormat8.applyPattern("hi!");
        java.lang.String str11 = extendedMessageFormat8.toPattern();
        java.lang.Object[] objArray13 = extendedMessageFormat8.parse("hi!");
        java.text.Format[] formatArray14 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.text.Format[] formatArray15 = extendedMessageFormat8.getFormats();
        java.lang.Object[] objArray17 = extendedMessageFormat8.parse("hi!");
        java.lang.String str18 = java.text.MessageFormat.format("hi!", objArray17);
        java.lang.String str19 = java.text.MessageFormat.format("", objArray17);
        java.lang.String str20 = java.text.MessageFormat.format("hi!", objArray17);
        java.lang.Class<?> wildcardClass21 = objArray17.getClass();
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertArrayEquals(objArray13, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map12);
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map16);
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18);
        extendedMessageFormat19.applyPattern("hi!");
        java.lang.String str22 = extendedMessageFormat19.toPattern();
        java.lang.Object[] objArray24 = extendedMessageFormat19.parse("hi!");
        java.text.Format[] formatArray25 = extendedMessageFormat19.getFormatsByArgumentIndex();
        java.lang.String str26 = extendedMessageFormat19.toPattern();
        java.lang.StringBuffer stringBuffer27 = null;
        java.text.FieldPosition fieldPosition28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer29 = extendedMessageFormat13.format((java.lang.Object) extendedMessageFormat19, stringBuffer27, fieldPosition28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
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
        extendedMessageFormat5.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = extendedMessageFormat5.parseObject("");
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
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
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
        java.text.Format[] formatArray20 = extendedMessageFormat19.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = extendedMessageFormat19.parseObject("hi!", parsePosition22);
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
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
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
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray14 = extendedMessageFormat2.parse("hi!", parsePosition13);
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
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        java.lang.Object obj9 = extendedMessageFormat7.clone();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        extendedMessageFormat5.applyPattern("");
        java.lang.Object obj13 = null;
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = extendedMessageFormat5.format(obj13, stringBuffer14, fieldPosition15);
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
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat7.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = extendedMessageFormat7.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
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
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray5 = extendedMessageFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray3);
        org.junit.Assert.assertArrayEquals(formatArray3, new java.text.Format[] {});
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map10);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8, map12);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map17);
        java.util.Locale locale19 = extendedMessageFormat18.getLocale();
        java.lang.String str20 = extendedMessageFormat18.toPattern();
        java.util.Locale locale21 = extendedMessageFormat18.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale21);
        java.text.Format[] formatArray23 = extendedMessageFormat22.getFormats();
        java.text.Format[] formatArray24 = extendedMessageFormat22.getFormats();
        java.lang.String str25 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray24);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat13.setFormatsByArgumentIndex(formatArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map7);
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        java.lang.String str10 = extendedMessageFormat8.toPattern();
        java.lang.Object[] objArray12 = extendedMessageFormat8.parse("hi!");
        java.lang.Object[] objArray14 = extendedMessageFormat8.parse("hi!");
        java.lang.String str15 = extendedMessageFormat8.toPattern();
        java.text.Format[] formatArray16 = extendedMessageFormat8.getFormatsByArgumentIndex();
        extendedMessageFormat8.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator19 = extendedMessageFormat2.formatToCharacterIterator((java.lang.Object) extendedMessageFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
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
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale15);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.String str8 = extendedMessageFormat7.toPattern();
        java.lang.String str9 = extendedMessageFormat7.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = extendedMessageFormat7.parseObject("hi!", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.lang.Object[] objArray11 = null;
        java.lang.StringBuffer stringBuffer12 = null;
        java.text.FieldPosition fieldPosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = extendedMessageFormat9.format(objArray11, stringBuffer12, fieldPosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map10);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        extendedMessageFormat12.applyPattern("hi!");
        java.util.Map map19 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map19);
        java.util.Locale locale21 = extendedMessageFormat20.getLocale();
        java.lang.String str22 = extendedMessageFormat20.toPattern();
        java.util.Locale locale23 = extendedMessageFormat20.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale23);
        java.lang.Object[] objArray26 = extendedMessageFormat24.parse("hi!");
        java.util.Locale locale27 = extendedMessageFormat24.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat28 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale27);
        java.util.Locale locale29 = extendedMessageFormat28.getLocale();
        java.util.Map map30 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat31 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale29, map30);
        java.util.Locale locale32 = extendedMessageFormat31.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator33 = extendedMessageFormat12.formatToCharacterIterator((java.lang.Object) extendedMessageFormat31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.util.Locale locale6 = null;
        extendedMessageFormat2.setLocale(locale6);
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat2.parse("", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
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
        java.lang.String str14 = extendedMessageFormat13.toPattern();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10);
        extendedMessageFormat2.setLocale(locale10);
        java.lang.String str13 = extendedMessageFormat2.toPattern();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.lang.Object[] objArray10 = extendedMessageFormat8.parse("hi!");
        java.util.Locale locale11 = extendedMessageFormat8.getLocale();
        java.util.Locale locale12 = extendedMessageFormat8.getLocale();
        java.lang.Object[] objArray14 = extendedMessageFormat8.parse("hi!");
        java.lang.String str15 = java.text.MessageFormat.format("hi!", objArray14);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        extendedMessageFormat2.applyPattern("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        extendedMessageFormat2.applyPattern("hi!");
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.lang.Object[] objArray8 = extendedMessageFormat4.parse("hi!");
        java.lang.Object[] objArray10 = extendedMessageFormat4.parse("hi!");
        java.lang.String str11 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray12 = extendedMessageFormat4.getFormatsByArgumentIndex();
        extendedMessageFormat4.applyPattern("");
        java.text.Format[] formatArray15 = extendedMessageFormat4.getFormats();
        java.lang.String str16 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray15);
        java.lang.String str17 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray15);
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
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray12 = extendedMessageFormat10.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.text.Format[] formatArray13 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.lang.String str14 = extendedMessageFormat11.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormatByArgumentIndex((int) (short) -1, (java.text.Format) extendedMessageFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray23 = extendedMessageFormat21.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.util.Locale locale11 = null;
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11, map12);
        java.text.Format[] formatArray14 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.lang.String str15 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray14);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormatsByArgumentIndex(formatArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.lang.String str4 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat3.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map12);
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.lang.String str15 = extendedMessageFormat13.toPattern();
        java.text.Format[] formatArray16 = extendedMessageFormat13.getFormatsByArgumentIndex();
        java.lang.String str17 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray16);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat9.setFormatsByArgumentIndex(formatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5, map7);
        java.lang.Object obj9 = extendedMessageFormat8.clone();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
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
        java.text.Format[] formatArray25 = extendedMessageFormat10.getFormats();
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
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.Object obj7 = extendedMessageFormat2.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
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
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = extendedMessageFormat7.parseObject("", parsePosition14);
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = extendedMessageFormat3.parseObject("", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10);
        extendedMessageFormat11.applyPattern("hi!");
        java.lang.String str14 = extendedMessageFormat11.toPattern();
        java.lang.Object[] objArray16 = extendedMessageFormat11.parse("hi!");
        java.text.Format[] formatArray17 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.text.Format[] formatArray18 = extendedMessageFormat11.getFormats();
        java.lang.Object[] objArray20 = extendedMessageFormat11.parse("hi!");
        java.lang.String str21 = java.text.MessageFormat.format("hi!", objArray20);
        java.lang.String str22 = java.text.MessageFormat.format("", objArray20);
        java.lang.String str23 = java.text.MessageFormat.format("hi!", objArray20);
        java.lang.String str24 = java.text.MessageFormat.format("", objArray20);
        java.lang.String str25 = java.text.MessageFormat.format("hi!", objArray20);
        java.lang.String str26 = java.text.MessageFormat.format("hi!", objArray20);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray18);
        org.junit.Assert.assertArrayEquals(formatArray18, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
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
        java.lang.String str14 = extendedMessageFormat12.toPattern();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat5.getFormats();
        java.util.Locale locale13 = extendedMessageFormat5.getLocale();
        java.lang.Object obj14 = extendedMessageFormat5.clone();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map5);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormats();
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = extendedMessageFormat6.parseObject("hi!", parsePosition9);
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
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.String str7 = extendedMessageFormat2.toPattern();
        extendedMessageFormat2.applyPattern("");
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = extendedMessageFormat2.parseObject("hi!", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale9 = null;
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map10);
        java.text.Format[] formatArray12 = extendedMessageFormat11.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = extendedMessageFormat2.format((java.lang.Object) formatArray12, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
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
        java.text.Format[] formatArray25 = extendedMessageFormat2.getFormatsByArgumentIndex();
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
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
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
        java.util.Locale locale15 = extendedMessageFormat5.getLocale();
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray11 = extendedMessageFormat2.getFormats();
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
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.util.Locale locale11 = extendedMessageFormat7.getLocale();
        java.lang.Class<?> wildcardClass12 = locale11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale5);
        extendedMessageFormat7.applyPattern("hi!");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.Object obj5 = extendedMessageFormat3.clone();
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.lang.String str6 = extendedMessageFormat2.toPattern();
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
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
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
        java.lang.Object obj24 = null;
        boolean boolean25 = extendedMessageFormat19.equals(obj24);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map5);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = extendedMessageFormat6.format((java.lang.Object) extendedMessageFormat12, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map6);
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map9);
        extendedMessageFormat2.setLocale(locale8);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.lang.String str15 = extendedMessageFormat14.toPattern();
        java.text.Format[] formatArray16 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.util.Map map18 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map18);
        java.util.Locale locale20 = extendedMessageFormat19.getLocale();
        java.lang.String str21 = extendedMessageFormat19.toPattern();
        java.util.Locale locale22 = extendedMessageFormat19.getLocale();
        java.text.Format[] formatArray23 = extendedMessageFormat19.getFormats();
        java.text.AttributedCharacterIterator attributedCharacterIterator24 = extendedMessageFormat14.formatToCharacterIterator((java.lang.Object) formatArray23);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray23);
        org.junit.Assert.assertArrayEquals(formatArray23, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator24);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.util.Locale locale7 = extendedMessageFormat5.getLocale();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        extendedMessageFormat2.setLocale(locale8);
        java.util.Locale locale10 = extendedMessageFormat2.getLocale();
        java.lang.Object obj11 = extendedMessageFormat2.clone();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray21 = extendedMessageFormat19.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
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
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray22 = extendedMessageFormat7.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map14);
        java.lang.String str16 = extendedMessageFormat15.toPattern();
        java.text.Format[] formatArray17 = extendedMessageFormat15.getFormatsByArgumentIndex();
        java.lang.String str18 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray17);
        java.lang.String str19 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray17);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat9.setFormatsByArgumentIndex(formatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = extendedMessageFormat17.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map3);
        java.text.Format[] formatArray5 = extendedMessageFormat4.getFormats();
        java.text.Format[] formatArray6 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        extendedMessageFormat3.applyPattern("hi!");
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object obj8 = extendedMessageFormat7.clone();
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10);
        extendedMessageFormat2.setLocale(locale10);
        java.lang.Object obj13 = extendedMessageFormat2.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!");
        java.lang.String str2 = extendedMessageFormat1.toPattern();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.Object[] objArray4 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("");
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat2.parseObject("hi!", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale4, map5);
        java.text.Format[] formatArray7 = extendedMessageFormat6.getFormats();
        java.util.Locale locale8 = extendedMessageFormat6.getLocale();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
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
        java.util.Locale locale24 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat25 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale24);
        java.util.Locale locale26 = extendedMessageFormat25.getLocale();
        java.text.Format[] formatArray27 = extendedMessageFormat25.getFormats();
        extendedMessageFormat25.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat21.setFormatByArgumentIndex((int) (byte) 1, (java.text.Format) extendedMessageFormat25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNull(locale26);
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.lang.String str13 = extendedMessageFormat12.toPattern();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.util.Locale locale15 = extendedMessageFormat12.getLocale();
        java.text.Format[] formatArray16 = extendedMessageFormat12.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex((int) (byte) 1, (java.text.Format) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.lang.String str5 = extendedMessageFormat4.toPattern();
        java.text.Format[] formatArray6 = extendedMessageFormat4.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map9);
        java.text.Format[] formatArray11 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map14);
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        java.lang.String str17 = extendedMessageFormat15.toPattern();
        java.util.Locale locale18 = extendedMessageFormat15.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale18);
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = extendedMessageFormat10.format((java.lang.Object) extendedMessageFormat19, stringBuffer20, fieldPosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        extendedMessageFormat7.applyPattern("hi!");
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map16);
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18);
        extendedMessageFormat19.applyPattern("hi!");
        java.lang.String str22 = extendedMessageFormat19.toPattern();
        java.lang.Object[] objArray24 = extendedMessageFormat19.parse("hi!");
        java.text.Format[] formatArray25 = extendedMessageFormat19.getFormatsByArgumentIndex();
        java.lang.String str26 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray25);
        boolean boolean27 = extendedMessageFormat7.equals((java.lang.Object) formatArray25);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        java.text.Format[] formatArray10 = extendedMessageFormat9.getFormats();
        java.text.Format[] formatArray11 = extendedMessageFormat9.getFormats();
        java.lang.String str12 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray11);
        java.lang.String str13 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray11);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.lang.String str8 = java.text.MessageFormat.format("", (java.lang.Object[]) formatArray7);
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map4);
        java.text.Format[] formatArray6 = extendedMessageFormat5.getFormats();
        java.text.Format[] formatArray7 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale8, map9);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.text.Format[] formatArray12 = extendedMessageFormat5.getFormats();
        java.util.Locale locale13 = extendedMessageFormat5.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = extendedMessageFormat5.parseObject("");
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
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray5 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
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
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16, map20);
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16, map22);
        extendedMessageFormat23.applyPattern("");
        java.util.Map map28 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat29 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map28);
        java.util.Locale locale30 = extendedMessageFormat29.getLocale();
        java.lang.String str31 = extendedMessageFormat29.toPattern();
        extendedMessageFormat29.applyPattern("hi!");
        java.lang.Object[] objArray35 = extendedMessageFormat29.parse("hi!");
        java.lang.Object obj36 = null;
        java.lang.String str37 = extendedMessageFormat29.format(obj36);
        extendedMessageFormat29.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat23.setFormatByArgumentIndex((int) (byte) 1, (java.text.Format) extendedMessageFormat29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertArrayEquals(objArray35, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat7.parseObject("", parsePosition10);
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
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray10 = extendedMessageFormat7.parse("", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.text.Format[] formatArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormatsByArgumentIndex(formatArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        extendedMessageFormat3.applyPattern("hi!");
        java.lang.Object[] objArray9 = extendedMessageFormat3.parse("hi!");
        java.util.Locale locale10 = extendedMessageFormat3.getLocale();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10, map11);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map17);
        java.util.Locale locale19 = extendedMessageFormat18.getLocale();
        java.lang.String str20 = extendedMessageFormat18.toPattern();
        java.util.Locale locale21 = extendedMessageFormat18.getLocale();
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale21, map22);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale21);
        java.util.Map map25 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat26 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale21, map25);
        java.lang.String str27 = extendedMessageFormat12.format((java.lang.Object) map25);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = extendedMessageFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormats();
        java.text.Format[] formatArray5 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map7);
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = extendedMessageFormat8.parseObject("hi!", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray5);
        org.junit.Assert.assertArrayEquals(formatArray5, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map9);
        java.util.Map map14 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map14);
        java.util.Locale locale16 = extendedMessageFormat15.getLocale();
        java.lang.String str17 = extendedMessageFormat15.toPattern();
        java.util.Locale locale18 = extendedMessageFormat15.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18);
        java.lang.Object[] objArray21 = extendedMessageFormat19.parse("hi!");
        java.util.Locale locale22 = extendedMessageFormat19.getLocale();
        java.util.Locale locale23 = extendedMessageFormat19.getLocale();
        java.text.Format[] formatArray24 = extendedMessageFormat19.getFormats();
        java.util.Locale locale25 = extendedMessageFormat19.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat10.setFormat((int) (byte) 0, (java.text.Format) extendedMessageFormat19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "th_TH");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.lang.String str12 = extendedMessageFormat10.toPattern();
        extendedMessageFormat10.applyPattern("hi!");
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map17);
        java.lang.String str19 = extendedMessageFormat18.toPattern();
        java.text.Format[] formatArray20 = extendedMessageFormat18.getFormatsByArgumentIndex();
        java.util.Locale locale21 = extendedMessageFormat18.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale21);
        extendedMessageFormat10.setLocale(locale21);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat24 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = extendedMessageFormat2.format((java.lang.Object) "hi!");
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "th_TH");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale6 = null;
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6, map7);
        java.text.Format[] formatArray9 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = extendedMessageFormat2.format((java.lang.Object[]) formatArray9, stringBuffer10, fieldPosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
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
        java.lang.Object obj17 = null;
        boolean boolean18 = extendedMessageFormat16.equals(obj17);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.util.Locale locale6 = extendedMessageFormat4.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6, map7);
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale9, map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
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
        java.text.Format format24 = null;
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormatByArgumentIndex((int) (short) 100, format24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale4 = extendedMessageFormat2.getLocale();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Map map9 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map9);
        java.util.Locale locale11 = extendedMessageFormat10.getLocale();
        java.text.Format[] formatArray12 = extendedMessageFormat10.getFormatsByArgumentIndex();
        java.lang.String str13 = extendedMessageFormat10.toPattern();
        java.lang.Object[] objArray15 = extendedMessageFormat10.parse("hi!");
        java.lang.String str16 = extendedMessageFormat10.toPattern();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex(1, (java.text.Format) extendedMessageFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray12);
        org.junit.Assert.assertArrayEquals(formatArray12, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.Object[] objArray10 = extendedMessageFormat5.parse("hi!");
        java.text.Format[] formatArray11 = extendedMessageFormat5.getFormatsByArgumentIndex();
        java.lang.String str12 = extendedMessageFormat5.toPattern();
        java.util.Locale locale13 = extendedMessageFormat5.getLocale();
        java.text.Format[] formatArray14 = extendedMessageFormat5.getFormats();
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray17 = extendedMessageFormat5.parse("", parsePosition16);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale6);
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.lang.String str13 = extendedMessageFormat11.toPattern();
        java.util.Locale locale14 = extendedMessageFormat11.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat15 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale14);
        java.text.Format[] formatArray16 = extendedMessageFormat15.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat7.setFormatsByArgumentIndex(formatArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray16);
        org.junit.Assert.assertArrayEquals(formatArray16, new java.text.Format[] {});
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7, map11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray14 = extendedMessageFormat12.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        extendedMessageFormat2.applyPattern("hi!");
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.text.Format[] formatArray7 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Map map12 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat13 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map12);
        java.util.Locale locale14 = extendedMessageFormat13.getLocale();
        java.lang.String str15 = extendedMessageFormat13.toPattern();
        java.util.Locale locale16 = extendedMessageFormat13.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale16);
        java.text.Format[] formatArray19 = extendedMessageFormat18.getFormats();
        java.lang.String str20 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray19);
        boolean boolean21 = extendedMessageFormat2.equals((java.lang.Object) str20);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray7);
        org.junit.Assert.assertArrayEquals(formatArray7, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray19);
        org.junit.Assert.assertArrayEquals(formatArray19, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map8);
        java.util.Locale locale10 = extendedMessageFormat9.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale10);
        extendedMessageFormat2.setLocale(locale10);
        java.lang.Object obj13 = null;
        boolean boolean14 = extendedMessageFormat2.equals(obj13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
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
        java.util.Locale locale24 = extendedMessageFormat22.getLocale();
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
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        java.util.Locale locale1 = null;
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale1, map2);
        java.text.Format[] formatArray4 = extendedMessageFormat3.getFormatsByArgumentIndex();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.text.Format[] formatArray11 = extendedMessageFormat7.getFormatsByArgumentIndex();
        java.util.Locale locale12 = extendedMessageFormat7.getLocale();
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = extendedMessageFormat3.format((java.lang.Object) extendedMessageFormat7, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray11);
        org.junit.Assert.assertArrayEquals(formatArray11, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.lang.String str3 = extendedMessageFormat2.toPattern();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map7);
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        java.lang.String str10 = extendedMessageFormat8.toPattern();
        java.util.Locale locale11 = extendedMessageFormat8.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale11);
        java.util.Map map17 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map17);
        java.util.Locale locale19 = extendedMessageFormat18.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat20 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale19);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat22 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale19);
        extendedMessageFormat12.setLocale(locale19);
        extendedMessageFormat12.applyPattern("hi!");
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormatByArgumentIndex(1, (java.text.Format) extendedMessageFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        java.lang.String str9 = extendedMessageFormat2.toPattern();
        java.text.Format[] formatArray10 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale11 = extendedMessageFormat2.getLocale();
        java.util.Map map15 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat16 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map15);
        java.text.Format[] formatArray17 = extendedMessageFormat16.getFormats();
        java.lang.String str18 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray17);
        java.lang.String str19 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray17);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat2.setFormats(formatArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("hi!");
        extendedMessageFormat5.applyPattern("");
        extendedMessageFormat5.applyPattern("hi!");
        java.text.Format[] formatArray14 = extendedMessageFormat5.getFormatsByArgumentIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray16 = extendedMessageFormat5.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.util.Locale locale5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map10);
        java.util.Locale locale12 = extendedMessageFormat11.getLocale();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale12, map13);
        extendedMessageFormat6.setLocale(locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormats();
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray11 = extendedMessageFormat2.parse("", parsePosition10);
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
        org.junit.Assert.assertNotNull(formatArray6);
        org.junit.Assert.assertArrayEquals(formatArray6, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map1);
        java.text.Format[] formatArray3 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale5 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray6 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Locale locale7 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray8 = extendedMessageFormat2.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormats();
        java.util.Locale locale14 = extendedMessageFormat12.getLocale();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map16);
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        java.util.Locale locale19 = extendedMessageFormat17.getLocale();
        java.util.Locale locale20 = extendedMessageFormat17.getLocale();
        extendedMessageFormat12.setLocale(locale20);
        extendedMessageFormat2.setLocale(locale20);
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
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "th_TH");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        java.util.Locale locale2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Map map7 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map7);
        java.util.Locale locale9 = extendedMessageFormat8.getLocale();
        java.util.Map map10 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map10);
        extendedMessageFormat3.setLocale(locale9);
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale9, map13);
        java.lang.Class<?> wildcardClass15 = extendedMessageFormat14.getClass();
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
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
        java.lang.String str23 = extendedMessageFormat7.toPattern();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
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
        java.lang.Class<?> wildcardClass22 = locale15.getClass();
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.util.Map map13 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map13);
        java.util.Locale locale15 = extendedMessageFormat14.getLocale();
        java.lang.String str16 = extendedMessageFormat14.toPattern();
        java.util.Locale locale17 = extendedMessageFormat14.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat18 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale17);
        java.text.Format[] formatArray20 = extendedMessageFormat19.getFormats();
        java.lang.String str21 = java.text.MessageFormat.format("hi!", (java.lang.Object[]) formatArray20);
        // The following exception was thrown during execution in test generation
        try {
            extendedMessageFormat5.setFormats(formatArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
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
        java.util.Map map20 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat21 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16, map20);
        java.util.Map map22 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat23 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale16, map22);
        java.util.Locale locale24 = extendedMessageFormat23.getLocale();
        java.util.Map map26 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat27 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map26);
        java.text.Format[] formatArray28 = extendedMessageFormat27.getFormats();
        java.text.Format[] formatArray29 = extendedMessageFormat27.getFormatsByArgumentIndex();
        java.util.Locale locale30 = extendedMessageFormat27.getLocale();
        java.text.Format[] formatArray31 = extendedMessageFormat27.getFormatsByArgumentIndex();
        java.util.Locale locale32 = extendedMessageFormat27.getLocale();
        java.text.Format[] formatArray33 = extendedMessageFormat27.getFormats();
        java.text.Format[] formatArray34 = extendedMessageFormat27.getFormatsByArgumentIndex();
        java.text.AttributedCharacterIterator attributedCharacterIterator35 = extendedMessageFormat23.formatToCharacterIterator((java.lang.Object) formatArray34);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(formatArray15);
        org.junit.Assert.assertArrayEquals(formatArray15, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray28);
        org.junit.Assert.assertArrayEquals(formatArray28, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray29);
        org.junit.Assert.assertArrayEquals(formatArray29, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray31);
        org.junit.Assert.assertArrayEquals(formatArray31, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray33);
        org.junit.Assert.assertArrayEquals(formatArray33, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray34);
        org.junit.Assert.assertArrayEquals(formatArray34, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(attributedCharacterIterator35);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        extendedMessageFormat5.applyPattern("hi!");
        java.lang.String str8 = extendedMessageFormat5.toPattern();
        java.lang.String str9 = extendedMessageFormat5.toPattern();
        extendedMessageFormat5.applyPattern("");
        java.util.Locale locale12 = extendedMessageFormat5.getLocale();
        java.util.Locale locale13 = extendedMessageFormat5.getLocale();
        java.util.Map map16 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat17 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map16);
        java.util.Locale locale18 = extendedMessageFormat17.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat19 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale18);
        extendedMessageFormat19.applyPattern("hi!");
        java.lang.String str22 = extendedMessageFormat19.toPattern();
        java.lang.Object[] objArray24 = extendedMessageFormat19.parse("hi!");
        java.text.Format[] formatArray25 = extendedMessageFormat19.getFormatsByArgumentIndex();
        java.text.Format[] formatArray26 = extendedMessageFormat19.getFormats();
        java.text.Format[] formatArray27 = extendedMessageFormat19.getFormatsByArgumentIndex();
        boolean boolean28 = extendedMessageFormat5.equals((java.lang.Object) extendedMessageFormat19);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray25);
        org.junit.Assert.assertArrayEquals(formatArray25, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray26);
        org.junit.Assert.assertArrayEquals(formatArray26, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray27);
        org.junit.Assert.assertArrayEquals(formatArray27, new java.text.Format[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
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
        java.text.ParsePosition parsePosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray19 = extendedMessageFormat5.parse("", parsePosition18);
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
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat1 = new org.apache.commons.lang.text.ExtendedMessageFormat("");
        java.text.Format[] formatArray2 = extendedMessageFormat1.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(formatArray2);
        org.junit.Assert.assertArrayEquals(formatArray2, new java.text.Format[] {});
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray20 = extendedMessageFormat17.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: MessageFormat parse error!");
        } catch (java.text.ParseException e) {
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
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale4);
        java.lang.String str6 = extendedMessageFormat5.toPattern();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        java.text.Format[] formatArray9 = extendedMessageFormat5.getFormats();
        java.lang.Object[] objArray11 = extendedMessageFormat5.parse("hi!");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        java.util.Map map3 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat4 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map3);
        java.util.Locale locale5 = extendedMessageFormat4.getLocale();
        java.lang.String str6 = extendedMessageFormat4.toPattern();
        java.util.Locale locale7 = extendedMessageFormat4.getLocale();
        java.util.Map map8 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7, map8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("", locale7);
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = extendedMessageFormat10.parseObject("hi!", parsePosition12);
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
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.text.Format[] formatArray4 = extendedMessageFormat2.getFormatsByArgumentIndex();
        java.lang.String str5 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray7 = extendedMessageFormat2.parse("hi!");
        java.lang.String str8 = extendedMessageFormat2.toPattern();
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map11);
        java.util.Locale locale13 = extendedMessageFormat12.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat14 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale13);
        extendedMessageFormat14.applyPattern("hi!");
        java.lang.String str17 = extendedMessageFormat14.toPattern();
        java.lang.Object[] objArray19 = extendedMessageFormat14.parse("hi!");
        java.text.Format[] formatArray20 = extendedMessageFormat14.getFormatsByArgumentIndex();
        java.text.Format[] formatArray21 = extendedMessageFormat14.getFormats();
        extendedMessageFormat14.applyPattern("hi!");
        java.text.Format[] formatArray24 = extendedMessageFormat14.getFormatsByArgumentIndex();
        extendedMessageFormat14.applyPattern("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = extendedMessageFormat2.format((java.lang.Object) extendedMessageFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.lang.text.ExtendedMessageFormat cannot be cast to class [Ljava.lang.Object; (org.apache.commons.lang.text.ExtendedMessageFormat is in unnamed module of loader 'app'; [Ljava.lang.Object; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray4);
        org.junit.Assert.assertArrayEquals(formatArray4, new java.text.Format[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(formatArray20);
        org.junit.Assert.assertArrayEquals(formatArray20, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray21);
        org.junit.Assert.assertArrayEquals(formatArray21, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray24);
        org.junit.Assert.assertArrayEquals(formatArray24, new java.text.Format[] {});
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.util.Locale locale5 = extendedMessageFormat3.getLocale();
        java.util.Map map6 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale5, map6);
        java.util.Locale locale8 = extendedMessageFormat7.getLocale();
        java.util.Locale locale9 = extendedMessageFormat7.getLocale();
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
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "th_TH");
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.text.Format[] formatArray8 = extendedMessageFormat7.getFormats();
        java.text.Format[] formatArray9 = extendedMessageFormat7.getFormats();
        java.text.Format[] formatArray10 = extendedMessageFormat7.getFormatsByArgumentIndex();
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray8);
        org.junit.Assert.assertArrayEquals(formatArray8, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray9);
        org.junit.Assert.assertArrayEquals(formatArray9, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray10);
        org.junit.Assert.assertArrayEquals(formatArray10, new java.text.Format[] {});
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        java.util.Map map4 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat5 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map4);
        java.util.Locale locale6 = extendedMessageFormat5.getLocale();
        java.lang.String str7 = extendedMessageFormat5.toPattern();
        java.util.Locale locale8 = extendedMessageFormat5.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat9 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat10 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat11 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale8);
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = extendedMessageFormat11.format((java.lang.Object) (short) 1, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class [Ljava.lang.Object; (java.lang.Short and [Ljava.lang.Object; are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "th_TH");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        java.util.Map map1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map1);
        java.util.Locale locale3 = extendedMessageFormat2.getLocale();
        java.lang.String str4 = extendedMessageFormat2.toPattern();
        java.lang.Object[] objArray6 = extendedMessageFormat2.parse("hi!");
        java.lang.Object[] objArray8 = extendedMessageFormat2.parse("hi!");
        extendedMessageFormat2.applyPattern("hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "th_TH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        java.util.Locale locale10 = extendedMessageFormat7.getLocale();
        java.util.Locale locale11 = extendedMessageFormat7.getLocale();
        extendedMessageFormat7.applyPattern("hi!");
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
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        java.util.Map map2 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat3 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map2);
        java.util.Locale locale4 = extendedMessageFormat3.getLocale();
        java.lang.String str5 = extendedMessageFormat3.toPattern();
        java.util.Locale locale6 = extendedMessageFormat3.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat7 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale6);
        java.lang.Object[] objArray9 = extendedMessageFormat7.parse("hi!");
        java.util.Map map11 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat12 = new org.apache.commons.lang.text.ExtendedMessageFormat("", map11);
        java.text.Format[] formatArray13 = extendedMessageFormat12.getFormats();
        java.text.Format[] formatArray14 = extendedMessageFormat12.getFormatsByArgumentIndex();
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = extendedMessageFormat7.format((java.lang.Object[]) formatArray14, stringBuffer15, fieldPosition16);
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
        org.junit.Assert.assertNotNull(formatArray13);
        org.junit.Assert.assertArrayEquals(formatArray13, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(formatArray14);
        org.junit.Assert.assertArrayEquals(formatArray14, new java.text.Format[] {});
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        java.util.Locale locale1 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat2 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale1);
        java.util.Map map5 = null;
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat6 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", map5);
        java.util.Locale locale7 = extendedMessageFormat6.getLocale();
        org.apache.commons.lang.text.ExtendedMessageFormat extendedMessageFormat8 = new org.apache.commons.lang.text.ExtendedMessageFormat("hi!", locale7);
        extendedMessageFormat8.applyPattern("hi!");
        extendedMessageFormat8.applyPattern("hi!");
        extendedMessageFormat8.applyPattern("");
        extendedMessageFormat8.applyPattern("hi!");
        java.text.Format[] formatArray17 = extendedMessageFormat8.getFormatsByArgumentIndex();
        java.lang.Object[] objArray19 = extendedMessageFormat8.parse("hi!");
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = extendedMessageFormat2.format(objArray19, stringBuffer20, fieldPosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "th_TH");
        org.junit.Assert.assertNotNull(formatArray17);
        org.junit.Assert.assertArrayEquals(formatArray17, new java.text.Format[] {});
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
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
        java.text.ParsePosition parsePosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = extendedMessageFormat19.parseObject("hi!", parsePosition23);
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
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
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
        java.lang.Object obj17 = extendedMessageFormat16.clone();
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
        org.junit.Assert.assertNotNull(obj17);
    }
}

