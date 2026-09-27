package com.fasterxml.jackson.databind.util;

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.String str0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_STR_ISO8601;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyy-MM-dd'T'HH:mm:ss.SSSZ" + "'", str0, "yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = numberFormat1.format((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int int0 = java.text.DateFormat.MILLISECOND_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int int0 = java.text.DateFormat.DAY_OF_WEEK_IN_MONTH_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        int int0 = java.text.DateFormat.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        int int0 = java.text.DateFormat.DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int int0 = java.text.DateFormat.AM_PM_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int int0 = java.text.DateFormat.WEEK_OF_YEAR_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int int0 = java.text.DateFormat.DAY_OF_WEEK_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = dateFormat0.format(date1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        int int0 = java.text.DateFormat.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) (short) 0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        int int0 = java.text.DateFormat.DAY_OF_YEAR_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator5 = stdDateFormat3.formatToCharacterIterator((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.util.Date date3 = null;
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = stdDateFormat2.format(date3, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        int int0 = java.text.DateFormat.FULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.String str0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_STR_ISO8601_Z;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'" + "'", str0, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(3, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.lang.Class<?> wildcardClass2 = numberFormat1.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int int0 = java.text.DateFormat.HOUR1_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat3.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        int int0 = java.text.DateFormat.SECOND_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        int int0 = java.text.DateFormat.HOUR_OF_DAY1_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.String str0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_STR_PLAIN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyy-MM-dd" + "'", str0, "yyyy-MM-dd");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = stdDateFormat3.format(date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) '#', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (byte) 0, (int) '#', locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = dateFormat0.parseObject("yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat3.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        int int0 = java.text.DateFormat.HOUR_OF_DAY0_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        int int0 = java.text.DateFormat.ERA_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = dateFormat0.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stdDateFormat0.parseObject("", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = dateFormat0.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat0.parseAsISO8601("", parsePosition2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        int int0 = java.text.DateFormat.MINUTE_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = null;
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator3 = dateFormat0.formatToCharacterIterator((java.lang.Object) dateFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, 15, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        int int0 = java.text.DateFormat.MEDIUM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        int int0 = java.text.DateFormat.TIMEZONE_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        int int0 = java.text.DateFormat.DATE_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat3.withLocale(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        int int0 = java.text.DateFormat.WEEK_OF_MONTH_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(13, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        java.util.Date date4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = stdDateFormat3.format(date4, stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance();
        java.lang.StringBuffer stringBuffer3 = null;
        java.text.FieldPosition fieldPosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = dateFormat0.format((java.lang.Object) dateFormat2, stringBuffer3, fieldPosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = dateFormat0.format(date1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        int int0 = java.text.DateFormat.MONTH_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parse("", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        java.util.Date date4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = stdDateFormat3.format(date4, stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(7, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2, (java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat4.setLenient(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = stdDateFormat2.format(date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat2);
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dateFormat0.format(date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat3.withLocale(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 0, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(10, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stdDateFormat2.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean2 = dateFormat0.equals((java.lang.Object) true);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat0.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.Date date1 = null;
        java.lang.StringBuffer stringBuffer2 = null;
        java.text.FieldPosition fieldPosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer4 = stdDateFormat0.format(date1, stringBuffer2, fieldPosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parse("yyyy-MM-dd", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        int int0 = java.text.DateFormat.YEAR_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.lang.StringBuffer stringBuffer2 = null;
        java.text.FieldPosition fieldPosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer4 = dateFormat0.format((java.lang.Object) 'a', stringBuffer2, fieldPosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat0.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat3.setLenient(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2, (java.lang.Boolean) false);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = stdDateFormat4.withLocale(locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat0.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat3.setLenient(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dateFormat0.format((java.lang.Object) numberFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat0.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        int int0 = java.text.DateFormat.HOUR0_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(17, (int) (byte) 1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2, (java.lang.Boolean) false);
        java.util.Date date5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = stdDateFormat4.format(date5, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withLocale(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat3.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) 'a', (int) (byte) -1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.util.TimeZone timeZone0 = null;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        dateFormat1.setLenient(false);
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dateFormat1.format(date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) '4', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat2.withLocale(locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = dateFormat0.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parse("yyyy-MM-dd", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parse("yyyy-MM-dd", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.TimeZone timeZone2 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = dateFormat1.formatToCharacterIterator((java.lang.Object) timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = dateFormat0.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat3.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parse("yyyy-MM-dd", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat0.parseObject("yyyy-MM-dd", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(4, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parse("", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.lang.String str0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_STR_RFC1123;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "EEE, dd MMM yyyy HH:mm:ss zzz" + "'", str0, "EEE, dd MMM yyyy HH:mm:ss zzz");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = dateFormat0.format(date1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.util.TimeZone timeZone2 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        java.util.Calendar calendar6 = dateFormat4.getCalendar();
        dateFormat3.setCalendar(calendar6);
        dateFormat0.setCalendar(calendar6);
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = dateFormat0.format((java.lang.Object) (short) 10, stringBuffer10, fieldPosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(calendar6);
// flaky "1) test0119(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parse("hi!", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance();
        java.lang.StringBuffer stringBuffer3 = null;
        java.text.FieldPosition fieldPosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = dateFormat1.format((java.lang.Object) dateFormat2, stringBuffer3, fieldPosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale3, (java.lang.Boolean) false);
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = stdDateFormat5.withLocale(locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = dateFormat2.format((java.lang.Object) 1.0d, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) '#', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = dateFormat0.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        java.util.Calendar calendar7 = dateFormat5.getCalendar();
        dateFormat1.setCalendar(calendar7);
        dateFormat0.setCalendar(calendar7);
        java.lang.Class<?> wildcardClass10 = dateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNotNull(calendar7);
// flaky "2) test0131(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        java.util.Calendar calendar7 = dateFormat5.getCalendar();
        dateFormat1.setCalendar(calendar7);
        dateFormat0.setCalendar(calendar7);
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateFormat0.format(date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNotNull(calendar7);
// flaky "3) test0132(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withLocale(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(10, 7, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = dateFormat2.format((java.lang.Object) 10.0f, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 0, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2, (java.lang.Boolean) false);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat4.parseAsISO8601("yyyy-MM-dd", parsePosition6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(9, 13, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateFormat2.format(date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parseAsRFC1123("", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2, (java.lang.Boolean) false);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat2);
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = dateFormat0.format((java.lang.Object) (-1.0f), stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat3.parse("EEE, dd MMM yyyy HH:mm:ss zzz");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(10, (int) (byte) 1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.lang.StringBuffer stringBuffer2 = null;
        java.text.FieldPosition fieldPosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer4 = dateFormat0.format((java.lang.Object) (short) 1, stringBuffer2, fieldPosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(17, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.util.Date date2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dateFormat0.format(date2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) ' ', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(4, (int) (byte) 0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(15, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (byte) 100, 3, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stdDateFormat0.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.Date date1 = null;
        java.lang.StringBuffer stringBuffer2 = null;
        java.text.FieldPosition fieldPosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer4 = stdDateFormat0.format(date1, stringBuffer2, fieldPosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parse("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) 1);
        java.util.Date date2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dateFormat1.format(date2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        java.util.Calendar calendar4 = dateFormat2.getCalendar();
        dateFormat1.setCalendar(calendar4);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance();
        java.util.Calendar calendar7 = dateFormat6.getCalendar();
        java.lang.StringBuffer stringBuffer8 = null;
        java.text.FieldPosition fieldPosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = dateFormat1.format((java.lang.Object) calendar7, stringBuffer8, fieldPosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "4) test0162(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(calendar7);
// flaky "1) test0162(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar7.toString(), "sun.util.BuddhistCalendar[time=-734063826818,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=53,MILLISECOND=182,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (short) 100, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(100, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator3 = dateFormat1.formatToCharacterIterator((java.lang.Object) dateFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 10, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) -1, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat2.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.lang.StringBuffer stringBuffer2 = null;
        java.text.FieldPosition fieldPosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer4 = stdDateFormat0.format((java.lang.Object) (byte) 1, stringBuffer2, fieldPosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat0.parseObject("\u0e21\u0e04. 2513", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.Date date2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dateFormat0.format(date2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "5) test0172(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734063826516,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=53,MILLISECOND=484,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parse("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (byte) -1, (int) ' ', locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.TimeZone timeZone3 = null;
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3);
        dateFormat4.setLenient(false);
        dateFormat4.setLenient(false);
        boolean boolean9 = dateFormat2.equals((java.lang.Object) false);
        dateFormat2.setLenient(true);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat3.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        java.util.Calendar calendar7 = dateFormat5.getCalendar();
        dateFormat1.setCalendar(calendar7);
        dateFormat0.setCalendar(calendar7);
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat11 = dateFormat10.getNumberFormat();
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone12);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        java.util.Calendar calendar16 = dateFormat14.getCalendar();
        dateFormat13.setCalendar(calendar16);
        dateFormat10.setCalendar(calendar16);
        dateFormat0.setCalendar(calendar16);
        dateFormat0.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = dateFormat0.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNotNull(calendar7);
// flaky "6) test0178(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(calendar16);
// flaky "2) test0178(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat3.withLocale(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        java.util.Date date4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = stdDateFormat3.format(date4, stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.util.TimeZone timeZone0 = null;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        dateFormat1.setLenient(false);
        dateFormat1.setLenient(false);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = dateFormat1.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2, (java.lang.Boolean) false);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parseAsRFC1123("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) 1, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        dateFormat0.setLenient(true);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parseAsRFC1123("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.util.TimeZone timeZone0 = null;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = numberFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parseAsRFC1123("yyyy-MM-dd", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = stdDateFormat0.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"hi!\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (byte) -1, 0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = dateFormat0.format((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat3);
        dateFormat0.setNumberFormat(numberFormat3);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = dateFormat0.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        boolean boolean3 = dateFormat1.equals((java.lang.Object) "yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat1.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2, (java.lang.Boolean) false);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parseAsRFC1123("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(100, 15, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        boolean boolean3 = dateFormat1.equals((java.lang.Object) "yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.util.TimeZone timeZone4 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4);
        java.lang.Class<?> wildcardClass6 = timeZone4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateFormat1.format((java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.TimeZone timeZone3 = null;
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3);
        dateFormat4.setLenient(false);
        dateFormat4.setLenient(false);
        boolean boolean9 = dateFormat2.equals((java.lang.Object) false);
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateFormat2.format(date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = stdDateFormat0.parse("\u0e21\u0e04. 2513");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"1 ?.?. 2513\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat3.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        java.util.Calendar calendar7 = dateFormat5.getCalendar();
        dateFormat1.setCalendar(calendar7);
        java.lang.StringBuffer stringBuffer9 = null;
        java.text.FieldPosition fieldPosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = dateFormat0.format((java.lang.Object) calendar7, stringBuffer9, fieldPosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNotNull(calendar7);
// flaky "7) test0206(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat2.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.lang.String[] strArray1 = com.fasterxml.jackson.databind.util.StdDateFormat.ALL_FORMATS;
        boolean boolean2 = dateFormat0.equals((java.lang.Object) strArray1);
        java.util.TimeZone timeZone3 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateFormat0.format((java.lang.Object) stdDateFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd" });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parseAsRFC1123("yyyy-MM-dd", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(2, 8, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parseAsRFC1123("yyyy-MM-dd", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.util.TimeZone timeZone0 = null;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        dateFormat1.setLenient(false);
        java.lang.Class<?> wildcardClass4 = dateFormat1.getClass();
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stdDateFormat3.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone10);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        java.util.Calendar calendar14 = dateFormat12.getCalendar();
        dateFormat11.setCalendar(calendar14);
        stdDateFormat0.setCalendar(calendar14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = stdDateFormat0.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(calendar14);
// flaky "8) test0215(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 10, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.TimeZone timeZone3 = null;
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3);
        dateFormat4.setLenient(false);
        dateFormat4.setLenient(false);
        boolean boolean9 = dateFormat2.equals((java.lang.Object) false);
        dateFormat2.setLenient(false);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateFormat2.format((java.lang.Object) dateFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stdDateFormat0.parseObject("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat3.parseAsISO8601("yyyy-MM-dd", parsePosition5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.util.Date date9 = null;
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = stdDateFormat0.format(date9, stringBuffer10, fieldPosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat2.parseObject("\u0e21\u0e04. 2513");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.util.Calendar calendar3 = dateFormat0.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dateFormat0.format((java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "9) test0223(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar3);
// flaky "3) test0223(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) 'a', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat3.setLenient(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = dateFormat0.format(date1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601;
        java.util.TimeZone timeZone10 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone10);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone10);
        stdDateFormat0.setTimeZone(timeZone10);
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = stdDateFormat0.withLocale(locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone10);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        java.util.Calendar calendar14 = dateFormat12.getCalendar();
        dateFormat11.setCalendar(calendar14);
        stdDateFormat0.setCalendar(calendar14);
        java.util.Date date17 = null;
        java.lang.StringBuffer stringBuffer18 = null;
        java.text.FieldPosition fieldPosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = stdDateFormat0.format(date17, stringBuffer18, fieldPosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(calendar14);
// flaky "10) test0229(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat3);
        dateFormat0.setNumberFormat(numberFormat3);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = dateFormat0.parseObject("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(2, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateFormat8.format(date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dateFormat8);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = stdDateFormat0.parse("yyyy-MM-dd", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat2.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(12, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = stdDateFormat0.parseAsISO8601("hi!", parsePosition8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        stdDateFormat0._clearFormats();
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = stdDateFormat0.parseAsISO8601("", parsePosition12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) '4', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = stdDateFormat0._timezone;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getTimeInstance();
        java.util.Calendar calendar12 = dateFormat11.getCalendar();
        stdDateFormat0._formatPlain = dateFormat11;
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = stdDateFormat0.parse("hi!", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(calendar12);
// flaky "11) test0240(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar12.toString(), "sun.util.BuddhistCalendar[time=-734063824634,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=55,MILLISECOND=366,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2, (java.lang.Boolean) true);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        java.util.Calendar calendar7 = dateFormat5.getCalendar();
        java.util.Calendar calendar8 = dateFormat5.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = stdDateFormat4.format((java.lang.Object) calendar8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNotNull(calendar7);
// flaky "12) test0241(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar8);
// flaky "4) test0241(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean10 = stdDateFormat3.isLenient();
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        boolean boolean13 = stdDateFormat3.isLenient();
        java.util.Locale locale14 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1, locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance(16, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat15);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat3);
        dateFormat0.setNumberFormat(numberFormat3);
        dateFormat0.setLenient(true);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        dateFormat4.setNumberFormat(numberFormat6);
        stdDateFormat2.setNumberFormat(numberFormat6);
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("hi!");
        java.lang.String str11 = stdDateFormat2.toString();
        java.util.TimeZone timeZone12 = stdDateFormat2._timezone;
        java.util.Locale locale13 = stdDateFormat2._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateTimeInstance(100, (int) (short) 0, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        java.util.Calendar calendar11 = dateFormat9.getCalendar();
        dateFormat5.setCalendar(calendar11);
        dateFormat1.setCalendar(calendar11);
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = dateFormat1.parseObject("hi!", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(calendar11);
// flaky "13) test0246(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = stdDateFormat0._timezone;
        java.text.NumberFormat numberFormat11 = stdDateFormat0.getNumberFormat();
        java.util.TimeZone timeZone12 = stdDateFormat0.getTimeZone();
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = stdDateFormat0.parseAsISO8601("yyyy-MM-dd", parsePosition14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNull(timeZone12);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        dateFormat3.setLenient(false);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        stdDateFormat0._clearFormats();
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = stdDateFormat0.parse("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601_z;
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = stdDateFormat0.parseAsRFC1123("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        java.util.Calendar calendar6 = dateFormat4.getCalendar();
        dateFormat0.setCalendar(calendar6);
        java.lang.Class<?> wildcardClass8 = calendar6.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(calendar6);
// flaky "14) test0251(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        dateFormat7.setNumberFormat(numberFormat9);
        stdDateFormat5.setNumberFormat(numberFormat9);
        boolean boolean13 = stdDateFormat5.looksLikeISO8601("hi!");
        java.lang.String str14 = stdDateFormat5.toString();
        java.util.TimeZone timeZone15 = stdDateFormat5._timezone;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        java.util.Calendar calendar17 = dateFormat16.getCalendar();
        stdDateFormat5._formatPlain = dateFormat16;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator19 = stdDateFormat4.formatToCharacterIterator((java.lang.Object) dateFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "15) test0252(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar17.toString(), "sun.util.BuddhistCalendar[time=-734063824084,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=55,MILLISECOND=916,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        dateFormat4.setNumberFormat(numberFormat6);
        stdDateFormat2.setNumberFormat(numberFormat6);
        boolean boolean9 = stdDateFormat2.isLenient();
        boolean boolean11 = stdDateFormat2.looksLikeISO8601("");
        boolean boolean12 = stdDateFormat2.isLenient();
        java.util.Locale locale13 = stdDateFormat2._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateTimeInstance(17, (int) (byte) 1, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.util.TimeZone timeZone0 = null;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateFormat1.format(date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "16) test0254(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        dateFormat4.setNumberFormat(numberFormat6);
        stdDateFormat2.setNumberFormat(numberFormat6);
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("hi!");
        java.lang.String str11 = stdDateFormat2.toString();
        java.util.TimeZone timeZone12 = stdDateFormat2._timezone;
        java.util.Locale locale13 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(13, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat14);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateFormat7.format(date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat7);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(9, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat3);
        java.text.NumberFormat numberFormat5 = dateFormat1.getNumberFormat();
        java.lang.Class<?> wildcardClass6 = numberFormat5.getClass();
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        dateFormat4.setNumberFormat(numberFormat6);
        stdDateFormat2.setNumberFormat(numberFormat6);
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("hi!");
        java.lang.String str11 = stdDateFormat2.toString();
        java.util.TimeZone timeZone12 = stdDateFormat2._timezone;
        java.util.Locale locale13 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance((int) (short) -1, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat14);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        dateFormat4.setNumberFormat(numberFormat6);
        stdDateFormat2.setNumberFormat(numberFormat6);
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("hi!");
        java.lang.String str11 = stdDateFormat2.toString();
        java.util.TimeZone timeZone12 = stdDateFormat2._timezone;
        java.util.Locale locale13 = stdDateFormat2._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateTimeInstance(100, 7, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) '#', 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        dateFormat4.setNumberFormat(numberFormat6);
        stdDateFormat2.setNumberFormat(numberFormat6);
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("hi!");
        java.lang.String str11 = stdDateFormat2.toString();
        java.util.TimeZone timeZone12 = stdDateFormat2._timezone;
        java.util.Locale locale13 = stdDateFormat2._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateTimeInstance(8, (int) (byte) 1, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.util.TimeZone timeZone2 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        java.util.Calendar calendar6 = dateFormat4.getCalendar();
        dateFormat3.setCalendar(calendar6);
        dateFormat0.setCalendar(calendar6);
        java.util.TimeZone timeZone9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone9);
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat12 = dateFormat11.getNumberFormat();
        java.util.Calendar calendar13 = dateFormat11.getCalendar();
        dateFormat10.setCalendar(calendar13);
        boolean boolean15 = dateFormat0.equals((java.lang.Object) calendar13);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean23 = stdDateFormat16.isLenient();
        boolean boolean25 = stdDateFormat16.looksLikeISO8601("");
        java.lang.String str26 = stdDateFormat16.toString();
        java.lang.StringBuffer stringBuffer27 = null;
        java.text.FieldPosition fieldPosition28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer29 = dateFormat0.format((java.lang.Object) str26, stringBuffer27, fieldPosition28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(calendar6);
// flaky "17) test0265(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertNotNull(calendar13);
// flaky "5) test0265(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str26, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601;
        java.lang.String[] strArray8 = com.fasterxml.jackson.databind.util.StdDateFormat.ALL_FORMATS;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = stdDateFormat0.format((java.lang.Object) strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd" });
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stdDateFormat0.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        dateFormat4.setNumberFormat(numberFormat6);
        stdDateFormat2.setNumberFormat(numberFormat6);
        boolean boolean9 = stdDateFormat2.isLenient();
        boolean boolean11 = stdDateFormat2.looksLikeISO8601("");
        boolean boolean12 = stdDateFormat2.isLenient();
        java.util.Locale locale13 = stdDateFormat2._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateTimeInstance(100, 17, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(1);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat1.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        dateFormat4.setNumberFormat(numberFormat6);
        stdDateFormat2.setNumberFormat(numberFormat6);
        boolean boolean9 = stdDateFormat2.isLenient();
        boolean boolean11 = stdDateFormat2.looksLikeISO8601("");
        boolean boolean12 = stdDateFormat2.isLenient();
        java.util.Locale locale13 = stdDateFormat2._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) -1, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat3.parse("\u0e21\u0e04. 2513");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.util.TimeZone timeZone10 = null;
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat0.setTimeZone(timeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = stdDateFormat0.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.lang.String str10 = stdDateFormat0.toString();
        boolean boolean12 = stdDateFormat0.looksLikeISO8601("hi!");
        java.util.Locale locale13 = stdDateFormat0._locale;
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = stdDateFormat0.parseAsISO8601("", parsePosition15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        stdDateFormat0._clearFormats();
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatPlain;
        java.util.Date date12 = null;
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = stdDateFormat0.format(date12, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateFormat11);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat1.setNumberFormat(numberFormat5);
        boolean boolean9 = stdDateFormat1.looksLikeISO8601("hi!");
        java.lang.String str10 = stdDateFormat1.toString();
        java.util.TimeZone timeZone11 = stdDateFormat1._timezone;
        java.util.Locale locale12 = stdDateFormat1._locale;
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale12);
        dateFormat13.setLenient(false);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat13);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.util.Locale locale11 = stdDateFormat0._locale;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat0._timezone = timeZone12;
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = stdDateFormat0.parseAsRFC1123("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat1.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Calendar calendar4 = dateFormat3.getCalendar();
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateFormat3.format(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "18) test0282(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601_z;
        java.util.Date date10 = null;
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = stdDateFormat0.format(date10, stringBuffer11, fieldPosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat0.parseObject("Wed, 31 Dec 1969 23:59:59 UTC", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.lang.String str10 = stdDateFormat0.toString();
        boolean boolean12 = stdDateFormat0.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone13 = stdDateFormat0.getTimeZone();
        java.util.Locale locale14 = stdDateFormat0._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stdDateFormat0.parseObject("\u0e21\u0e04. 2513");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(timeZone13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601;
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        java.util.Calendar calendar11 = dateFormat9.getCalendar();
        stdDateFormat0.setCalendar(calendar11);
        java.util.Date date13 = null;
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = stdDateFormat0.format(date13, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(calendar11);
// flaky "19) test0286(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = stdDateFormat0.parseAsRFC1123("Wed, 31 Dec 1969 23:59:59 UTC", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone10);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone10);
        java.util.TimeZone timeZone13 = null;
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone13);
        dateFormat14.setLenient(false);
        dateFormat14.setLenient(false);
        boolean boolean19 = dateFormat12.equals((java.lang.Object) false);
        dateFormat12.setLenient(false);
        stdDateFormat0._formatPlain = dateFormat12;
        java.text.ParsePosition parsePosition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date25 = stdDateFormat0.parseAsRFC1123("yyyy-MM-dd", parsePosition24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = stdDateFormat0._timezone;
        java.text.NumberFormat numberFormat11 = stdDateFormat0.getNumberFormat();
        java.lang.String str12 = stdDateFormat0.toString();
        java.util.TimeZone timeZone13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        stdDateFormat0._formatRFC1123 = dateFormat14;
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        java.util.Calendar calendar18 = dateFormat16.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = dateFormat14.format((java.lang.Object) dateFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertNotNull(calendar18);
// flaky "20) test0289(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        dateFormat4.setNumberFormat(numberFormat6);
        stdDateFormat2.setNumberFormat(numberFormat6);
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("hi!");
        java.lang.String str11 = stdDateFormat2.toString();
        java.util.TimeZone timeZone12 = stdDateFormat2._timezone;
        java.util.Locale locale13 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateInstance(0, locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance((int) (byte) 100, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat14);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        dateFormat4.setNumberFormat(numberFormat6);
        stdDateFormat2.setNumberFormat(numberFormat6);
        boolean boolean9 = stdDateFormat2.isLenient();
        boolean boolean11 = stdDateFormat2.looksLikeISO8601("");
        java.lang.String str12 = stdDateFormat2.toString();
        boolean boolean14 = stdDateFormat2.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone15 = stdDateFormat2.getTimeZone();
        java.util.Locale locale16 = stdDateFormat2._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateTimeInstance((int) (short) -1, (int) (short) 100, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        java.util.Calendar calendar7 = dateFormat5.getCalendar();
        dateFormat1.setCalendar(calendar7);
        dateFormat0.setCalendar(calendar7);
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat11 = dateFormat10.getNumberFormat();
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone12);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        java.util.Calendar calendar16 = dateFormat14.getCalendar();
        dateFormat13.setCalendar(calendar16);
        dateFormat10.setCalendar(calendar16);
        dateFormat0.setCalendar(calendar16);
        java.util.Calendar calendar20 = dateFormat0.getCalendar();
        java.util.Date date21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = dateFormat0.format(date21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNotNull(calendar7);
// flaky "21) test0293(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(calendar16);
// flaky "6) test0293(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar20);
// flaky "1) test0293(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601_z;
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = stdDateFormat0.parse("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        java.util.Calendar calendar4 = dateFormat2.getCalendar();
        dateFormat1.setCalendar(calendar4);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        dateFormat8.setNumberFormat(numberFormat10);
        stdDateFormat6.setNumberFormat(numberFormat10);
        boolean boolean14 = stdDateFormat6.looksLikeISO8601("hi!");
        java.lang.String str15 = stdDateFormat6.toString();
        java.util.TimeZone timeZone16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16);
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        java.util.Calendar calendar20 = dateFormat18.getCalendar();
        dateFormat17.setCalendar(calendar20);
        stdDateFormat6.setCalendar(calendar20);
        dateFormat1.setCalendar(calendar20);
        java.lang.Class<?> wildcardClass24 = dateFormat1.getClass();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "22) test0295(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(calendar20);
// flaky "7) test0295(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stdDateFormat3.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone10);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        java.util.Calendar calendar14 = dateFormat12.getCalendar();
        dateFormat11.setCalendar(calendar14);
        stdDateFormat0.setCalendar(calendar14);
        java.lang.Class<?> wildcardClass17 = calendar14.getClass();
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(calendar14);
// flaky "23) test0297(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat1.setNumberFormat(numberFormat5);
        boolean boolean9 = stdDateFormat1.looksLikeISO8601("hi!");
        java.lang.String str10 = stdDateFormat1.toString();
        java.util.TimeZone timeZone11 = stdDateFormat1._timezone;
        java.text.NumberFormat numberFormat12 = stdDateFormat1.getNumberFormat();
        java.lang.String str13 = stdDateFormat1.toString();
        java.util.TimeZone timeZone14 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
        stdDateFormat1._formatRFC1123 = dateFormat15;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        java.text.NumberFormat numberFormat22 = dateFormat18.getNumberFormat();
        stdDateFormat1.setNumberFormat(numberFormat22);
        java.util.Locale locale24 = stdDateFormat1._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance(8, locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = stdDateFormat0._timezone;
        java.util.Locale locale11 = stdDateFormat0._locale;
        java.lang.Class<?> wildcardClass12 = stdDateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat1.setNumberFormat(numberFormat5);
        boolean boolean9 = stdDateFormat1.looksLikeISO8601("hi!");
        java.lang.String str10 = stdDateFormat1.toString();
        java.util.TimeZone timeZone11 = stdDateFormat1._timezone;
        java.util.Locale locale12 = stdDateFormat1._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance((int) (byte) -1, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = stdDateFormat0.format(date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601;
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        dateFormat11.setNumberFormat(numberFormat13);
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        java.util.Calendar calendar17 = dateFormat15.getCalendar();
        dateFormat11.setCalendar(calendar17);
        dateFormat10.setCalendar(calendar17);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        java.util.TimeZone timeZone22 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone22);
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        java.util.Calendar calendar26 = dateFormat24.getCalendar();
        dateFormat23.setCalendar(calendar26);
        dateFormat20.setCalendar(calendar26);
        dateFormat10.setCalendar(calendar26);
        dateFormat10.setLenient(true);
        java.util.Calendar calendar32 = dateFormat10.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator33 = dateFormat9.formatToCharacterIterator((java.lang.Object) dateFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "24) test0302(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertNotNull(calendar26);
// flaky "8) test0302(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar26.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar32);
// flaky "2) test0302(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.util.Locale locale7 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.lang.Class<?> wildcardClass9 = dateFormat8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator10 = stdDateFormat0.formatToCharacterIterator((java.lang.Object) dateFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat2.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(11, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601_z;
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatISO8601_z;
        java.util.Date date13 = null;
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = stdDateFormat0.format(date13, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dateFormat12);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.TimeZone timeZone2 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat12 = dateFormat11.getNumberFormat();
        dateFormat10.setNumberFormat(numberFormat12);
        stdDateFormat8.setNumberFormat(numberFormat12);
        boolean boolean16 = stdDateFormat8.looksLikeISO8601("hi!");
        java.lang.String str17 = stdDateFormat8.toString();
        java.util.TimeZone timeZone18 = stdDateFormat8._timezone;
        java.util.Locale locale19 = stdDateFormat8._locale;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale19);
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2, locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateTimeInstance((int) (short) 10, (int) ' ', locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str17, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        dateFormat4.setNumberFormat(numberFormat6);
        stdDateFormat2.setNumberFormat(numberFormat6);
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("hi!");
        java.lang.String str11 = stdDateFormat2.toString();
        java.util.TimeZone timeZone12 = stdDateFormat2._timezone;
        java.text.NumberFormat numberFormat13 = stdDateFormat2.getNumberFormat();
        java.util.TimeZone timeZone14 = stdDateFormat2.getTimeZone();
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = dateFormat1.format((java.lang.Object) stdDateFormat2, stringBuffer15, fieldPosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNull(timeZone14);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.util.Locale locale11 = stdDateFormat0._locale;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat0._timezone = timeZone12;
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatISO8601;
        java.util.Date date15 = null;
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = stdDateFormat0.format(date15, stringBuffer16, fieldPosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNull(dateFormat14);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        stdDateFormat3.setNumberFormat(numberFormat5);
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        dateFormat8.setNumberFormat(numberFormat10);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        java.util.Calendar calendar14 = dateFormat12.getCalendar();
        dateFormat8.setCalendar(calendar14);
        dateFormat7.setCalendar(calendar14);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        java.util.TimeZone timeZone19 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone19);
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        java.util.Calendar calendar23 = dateFormat21.getCalendar();
        dateFormat20.setCalendar(calendar23);
        dateFormat17.setCalendar(calendar23);
        dateFormat7.setCalendar(calendar23);
        java.util.Calendar calendar27 = dateFormat7.getCalendar();
        stdDateFormat3.setCalendar(calendar27);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        boolean boolean32 = dateFormat30.equals((java.lang.Object) "yyyy-MM-dd");
        java.util.TimeZone timeZone33 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone33);
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat37 = dateFormat36.getNumberFormat();
        dateFormat35.setNumberFormat(numberFormat37);
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat40 = dateFormat39.getNumberFormat();
        java.util.Calendar calendar41 = dateFormat39.getCalendar();
        dateFormat35.setCalendar(calendar41);
        boolean boolean43 = dateFormat34.equals((java.lang.Object) calendar41);
        dateFormat30.setCalendar(calendar41);
        java.lang.StringBuffer stringBuffer45 = null;
        java.text.FieldPosition fieldPosition46 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer47 = stdDateFormat3.format((java.lang.Object) dateFormat30, stringBuffer45, fieldPosition46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(calendar14);
// flaky "25) test0310(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNotNull(calendar23);
// flaky "9) test0310(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar23.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar27);
// flaky "3) test0310(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(dateFormat35);
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(numberFormat37);
        org.junit.Assert.assertNotNull(dateFormat39);
        org.junit.Assert.assertNotNull(numberFormat40);
        org.junit.Assert.assertNotNull(calendar41);
// flaky "1) test0310(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar41.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.util.Locale locale11 = stdDateFormat0._locale;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat0._timezone = timeZone12;
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatISO8601;
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = stdDateFormat0.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNull(dateFormat14);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601_z;
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone12);
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = stdDateFormat0.format((java.lang.Object) numberFormat15, stringBuffer16, fieldPosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        dateFormat4.setNumberFormat(numberFormat6);
        stdDateFormat2.setNumberFormat(numberFormat6);
        boolean boolean9 = stdDateFormat2.isLenient();
        boolean boolean11 = stdDateFormat2.looksLikeISO8601("");
        boolean boolean12 = stdDateFormat2.isLenient();
        java.util.Locale locale13 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance((int) (short) 1, locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance(5, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat14);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601_z;
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = stdDateFormat0.parse("Wed, 31 Dec 1969 23:59:59 UTC", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = stdDateFormat0._timezone;
        java.text.NumberFormat numberFormat11 = stdDateFormat0.getNumberFormat();
        java.util.TimeZone timeZone12 = stdDateFormat0.getTimeZone();
        java.util.Locale locale13 = stdDateFormat0._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = stdDateFormat0.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        dateFormat4.setNumberFormat(numberFormat6);
        stdDateFormat2.setNumberFormat(numberFormat6);
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("hi!");
        java.lang.String str11 = stdDateFormat2.toString();
        java.util.TimeZone timeZone12 = stdDateFormat2._timezone;
        java.util.Locale locale13 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateInstance(0, locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance((int) (byte) 10, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat14);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601_z;
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone13);
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        java.util.Calendar calendar17 = dateFormat15.getCalendar();
        dateFormat14.setCalendar(calendar17);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean27 = stdDateFormat19.looksLikeISO8601("hi!");
        java.lang.String str28 = stdDateFormat19.toString();
        java.util.TimeZone timeZone29 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone29);
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        java.util.Calendar calendar33 = dateFormat31.getCalendar();
        dateFormat30.setCalendar(calendar33);
        stdDateFormat19.setCalendar(calendar33);
        dateFormat14.setCalendar(calendar33);
        stdDateFormat0.setCalendar(calendar33);
        java.text.ParsePosition parsePosition39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date40 = stdDateFormat0.parse("Wed, 31 Dec 1969 23:59:59 UTC", parsePosition39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "26) test0321(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(numberFormat23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str28, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertNotNull(calendar33);
// flaky "10) test0321(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar33.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) '4', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = stdDateFormat0.parseAsRFC1123("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        boolean boolean10 = stdDateFormat0.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stdDateFormat0.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = stdDateFormat0._timezone;
        java.text.NumberFormat numberFormat11 = stdDateFormat0.getNumberFormat();
        boolean boolean13 = stdDateFormat0.looksLikeISO8601("hi!");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        java.lang.Boolean boolean21 = stdDateFormat14._lenient;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator22 = stdDateFormat0.formatToCharacterIterator((java.lang.Object) stdDateFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNull(boolean21);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.util.Locale locale11 = stdDateFormat0._locale;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat0._timezone = timeZone12;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = stdDateFormat0.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = stdDateFormat0._timezone;
        java.text.NumberFormat numberFormat11 = stdDateFormat0.getNumberFormat();
        java.util.TimeZone timeZone12 = stdDateFormat0.getTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        dateFormat14.setNumberFormat(numberFormat16);
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        java.util.Calendar calendar20 = dateFormat18.getCalendar();
        dateFormat14.setCalendar(calendar20);
        dateFormat13.setCalendar(calendar20);
        stdDateFormat0.setCalendar(calendar20);
        java.lang.Class<?> wildcardClass24 = stdDateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(calendar20);
// flaky "27) test0327(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.util.Locale locale11 = stdDateFormat0._locale;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat0._timezone = timeZone12;
        java.lang.String str14 = stdDateFormat0.toString();
        java.util.Date date15 = null;
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = stdDateFormat0.format(date15, stringBuffer16, fieldPosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        java.util.Calendar calendar4 = dateFormat2.getCalendar();
        dateFormat1.setCalendar(calendar4);
        java.lang.Class<?> wildcardClass6 = calendar4.getClass();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "28) test0329(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601;
        java.util.TimeZone timeZone9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone9);
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone9);
        stdDateFormat0.setTimeZone(timeZone9);
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stdDateFormat0.parseObject("", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) -1, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat1.setNumberFormat(numberFormat5);
        boolean boolean8 = stdDateFormat1.isLenient();
        boolean boolean10 = stdDateFormat1.looksLikeISO8601("");
        boolean boolean11 = stdDateFormat1.isLenient();
        java.util.Locale locale12 = stdDateFormat1._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance(11, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(14, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        java.util.Calendar calendar11 = dateFormat9.getCalendar();
        dateFormat5.setCalendar(calendar11);
        dateFormat1.setCalendar(calendar11);
        java.util.TimeZone timeZone14 = null;
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone14);
        java.util.Calendar calendar16 = dateFormat15.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator17 = dateFormat1.formatToCharacterIterator((java.lang.Object) calendar16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(calendar11);
// flaky "29) test0335(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(calendar16);
// flaky "11) test0335(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.util.TimeZone timeZone11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone11);
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone11);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        java.util.Calendar calendar16 = dateFormat14.getCalendar();
        java.util.Calendar calendar17 = dateFormat14.getCalendar();
        dateFormat13.setCalendar(calendar17);
        stdDateFormat0._formatISO8601 = dateFormat13;
        java.text.ParsePosition parsePosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = stdDateFormat0.parse("Wed, 31 Dec 1969 23:59:59 UTC", parsePosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(calendar16);
// flaky "30) test0336(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar17);
// flaky "12) test0336(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.lang.String str10 = stdDateFormat0.toString();
        boolean boolean11 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance(0);
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = stdDateFormat0.format((java.lang.Object) 0, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateFormat13);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat1.setNumberFormat(numberFormat5);
        boolean boolean8 = stdDateFormat1.isLenient();
        boolean boolean10 = stdDateFormat1.looksLikeISO8601("");
        java.lang.String str11 = stdDateFormat1.toString();
        boolean boolean13 = stdDateFormat1.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone14 = stdDateFormat1.getTimeZone();
        java.util.Locale locale15 = stdDateFormat1._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(4, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(timeZone14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601;
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = stdDateFormat0.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dateFormat8);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean10 = stdDateFormat3.isLenient();
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        boolean boolean15 = stdDateFormat3.looksLikeISO8601("hi!");
        java.util.Locale locale16 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1, locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) '4', locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat17);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601;
        java.util.Date date8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        java.text.FieldPosition fieldPosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = stdDateFormat0.format(date8, stringBuffer9, fieldPosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat7);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.util.Locale locale11 = stdDateFormat0._locale;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat0._timezone = timeZone12;
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatISO8601;
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = stdDateFormat0.parseAsISO8601("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNull(dateFormat14);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.util.Date date2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dateFormat0.format(date2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        java.util.TimeZone timeZone4 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone4);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4);
        java.util.Locale locale7 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4, locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = numberFormat3.formatToCharacterIterator((java.lang.Object) stdDateFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601;
        stdDateFormat0._clearFormats();
        stdDateFormat0._clearFormats();
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = stdDateFormat0.format(date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dateFormat8);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat11 = dateFormat10.getNumberFormat();
        dateFormat9.setNumberFormat(numberFormat11);
        stdDateFormat7.setNumberFormat(numberFormat11);
        boolean boolean15 = stdDateFormat7.looksLikeISO8601("hi!");
        java.lang.String str16 = stdDateFormat7.toString();
        java.util.TimeZone timeZone17 = stdDateFormat7._timezone;
        java.util.Locale locale18 = stdDateFormat7._locale;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale18);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1, locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance(5, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str16, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat20);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = stdDateFormat0._timezone;
        java.text.NumberFormat numberFormat11 = stdDateFormat0.getNumberFormat();
        java.util.TimeZone timeZone12 = stdDateFormat0.getTimeZone();
        java.util.Locale locale13 = stdDateFormat0._locale;
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stdDateFormat0.parseObject("yyyy-MM-dd", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.util.Locale locale11 = stdDateFormat0._locale;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat0._timezone = timeZone12;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.lang.String str10 = stdDateFormat0.toString();
        boolean boolean11 = stdDateFormat0.isLenient();
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = stdDateFormat0.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.text.ParsePosition parsePosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stdDateFormat0.parseObject("Wed, 31 Dec 1969 23:59:59 UTC", parsePosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601;
        stdDateFormat0._lenient = true;
        java.lang.String str10 = stdDateFormat0.toString();
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = stdDateFormat0.parseAsRFC1123("\u0e21\u0e04. 2513", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.util.TimeZone timeZone0 = null;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        dateFormat1.setLenient(false);
        dateFormat1.setLenient(false);
        java.text.NumberFormat numberFormat6 = dateFormat1.getNumberFormat();
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        dateFormat7.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat12 = dateFormat11.getNumberFormat();
        java.util.Calendar calendar13 = dateFormat11.getCalendar();
        dateFormat7.setCalendar(calendar13);
        java.text.NumberFormat numberFormat15 = dateFormat7.getNumberFormat();
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = dateFormat1.format((java.lang.Object) numberFormat15, stringBuffer16, fieldPosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertNotNull(calendar13);
// flaky "31) test0353(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat15);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat2);
        java.lang.Class<?> wildcardClass4 = dateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = stdDateFormat0.parseAsRFC1123("0", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat1.setNumberFormat(numberFormat5);
        boolean boolean8 = stdDateFormat1.isLenient();
        boolean boolean10 = stdDateFormat1.looksLikeISO8601("");
        java.lang.String str11 = stdDateFormat1.toString();
        boolean boolean13 = stdDateFormat1.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone14 = stdDateFormat1.getTimeZone();
        java.util.Locale locale15 = stdDateFormat1._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance((int) (byte) -1, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(timeZone14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601;
        java.util.TimeZone timeZone10 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone10);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone10);
        stdDateFormat0.setTimeZone(timeZone10);
        java.util.TimeZone timeZone14 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale15 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone14, locale15, (java.lang.Boolean) true);
        java.lang.StringBuffer stringBuffer18 = null;
        java.text.FieldPosition fieldPosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = stdDateFormat0.format((java.lang.Object) timeZone14, stringBuffer18, fieldPosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        dateFormat4.setNumberFormat(numberFormat6);
        stdDateFormat2.setNumberFormat(numberFormat6);
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("hi!");
        java.lang.String str11 = stdDateFormat2.toString();
        java.util.TimeZone timeZone12 = stdDateFormat2._timezone;
        java.util.Locale locale13 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance(7, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat14);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        boolean boolean3 = dateFormat1.equals((java.lang.Object) "yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.NumberFormat numberFormat4 = dateFormat1.getNumberFormat();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        dateFormat7.setNumberFormat(numberFormat9);
        stdDateFormat5.setNumberFormat(numberFormat9);
        boolean boolean12 = stdDateFormat5.isLenient();
        boolean boolean14 = stdDateFormat5.looksLikeISO8601("");
        boolean boolean15 = stdDateFormat5.isLenient();
        java.util.Locale locale16 = stdDateFormat5._locale;
        java.util.TimeZone timeZone17 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat5._timezone = timeZone17;
        java.lang.String str19 = stdDateFormat5.toString();
        java.text.DateFormat dateFormat20 = stdDateFormat5._formatPlain;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator21 = dateFormat1.formatToCharacterIterator((java.lang.Object) dateFormat20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatToCharacterIterator must be passed non-null object");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)" + "'", str19, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat20);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(9, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = stdDateFormat0._timezone;
        java.text.NumberFormat numberFormat11 = stdDateFormat0.getNumberFormat();
        boolean boolean13 = stdDateFormat0.looksLikeISO8601("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stdDateFormat0.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean11 = stdDateFormat3.looksLikeISO8601("hi!");
        java.lang.String str12 = stdDateFormat3.toString();
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.text.NumberFormat numberFormat14 = stdDateFormat3.getNumberFormat();
        java.lang.String str15 = stdDateFormat3.toString();
        java.util.TimeZone timeZone16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone16);
        stdDateFormat3._formatRFC1123 = dateFormat17;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        dateFormat20.setNumberFormat(numberFormat22);
        java.text.NumberFormat numberFormat24 = dateFormat20.getNumberFormat();
        stdDateFormat3.setNumberFormat(numberFormat24);
        java.util.Locale locale26 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance(2, locale26);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) 'a', locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone13);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNotNull(numberFormat24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat27);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.util.Locale locale11 = stdDateFormat0._locale;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat0._timezone = timeZone12;
        stdDateFormat0._clearFormats();
        java.util.Date date15 = null;
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = stdDateFormat0.format(date15, stringBuffer16, fieldPosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.lang.Class<?> wildcardClass10 = stdDateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat1.setNumberFormat(numberFormat5);
        boolean boolean9 = stdDateFormat1.looksLikeISO8601("hi!");
        java.lang.String str10 = stdDateFormat1.toString();
        java.util.TimeZone timeZone11 = stdDateFormat1._timezone;
        java.text.NumberFormat numberFormat12 = stdDateFormat1.getNumberFormat();
        java.util.TimeZone timeZone13 = stdDateFormat1.getTimeZone();
        java.util.Locale locale14 = stdDateFormat1._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(10, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertNull(timeZone13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601;
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        java.util.Calendar calendar11 = dateFormat9.getCalendar();
        stdDateFormat0.setCalendar(calendar11);
        java.lang.Class<?> wildcardClass13 = calendar11.getClass();
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(calendar11);
// flaky "32) test0367(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat1.setNumberFormat(numberFormat5);
        boolean boolean8 = stdDateFormat1.isLenient();
        java.text.DateFormat dateFormat9 = stdDateFormat1._formatISO8601;
        stdDateFormat1._clearFormats();
        stdDateFormat1._clearFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator12 = dateFormat0.formatToCharacterIterator((java.lang.Object) stdDateFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(dateFormat9);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.util.TimeZone timeZone2 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2);
        java.util.TimeZone timeZone5 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat11 = dateFormat10.getNumberFormat();
        dateFormat9.setNumberFormat(numberFormat11);
        stdDateFormat7.setNumberFormat(numberFormat11);
        boolean boolean14 = stdDateFormat7.isLenient();
        boolean boolean16 = stdDateFormat7.looksLikeISO8601("");
        boolean boolean17 = stdDateFormat7.isLenient();
        java.util.Locale locale18 = stdDateFormat7._locale;
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5, locale18);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2, locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateTimeInstance((int) (byte) 10, 9, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat20);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        dateFormat0.setLenient(false);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601;
        stdDateFormat0._clearFormats();
        stdDateFormat0._clearFormats();
        java.lang.String str11 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatPlain;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar13 = dateFormat12.getCalendar();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat12);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        dateFormat12.setNumberFormat(numberFormat14);
        stdDateFormat10.setNumberFormat(numberFormat14);
        boolean boolean17 = stdDateFormat10.isLenient();
        boolean boolean19 = stdDateFormat10.looksLikeISO8601("");
        boolean boolean20 = stdDateFormat10.isLenient();
        java.util.Locale locale21 = stdDateFormat10._locale;
        java.util.TimeZone timeZone22 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat10._timezone = timeZone22;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = dateFormat9.equals((java.lang.Object) stdDateFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        dateFormat4.setNumberFormat(numberFormat6);
        stdDateFormat2.setNumberFormat(numberFormat6);
        boolean boolean9 = stdDateFormat2.isLenient();
        boolean boolean11 = stdDateFormat2.looksLikeISO8601("");
        boolean boolean12 = stdDateFormat2.isLenient();
        java.util.Locale locale13 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale13);
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.lang.Class<?> wildcardClass16 = dateFormat15.getClass();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(8, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601;
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("\u0e21\u0e04. 2513");
        stdDateFormat0._clearFormats();
        java.util.Calendar calendar11 = stdDateFormat0.getCalendar();
        java.util.Date date12 = null;
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = stdDateFormat0.format(date12, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(calendar11);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.util.TimeZone timeZone3 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3);
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        dateFormat11.setNumberFormat(numberFormat13);
        stdDateFormat9.setNumberFormat(numberFormat13);
        boolean boolean17 = stdDateFormat9.looksLikeISO8601("hi!");
        java.lang.String str18 = stdDateFormat9.toString();
        java.util.TimeZone timeZone19 = stdDateFormat9._timezone;
        java.util.Locale locale20 = stdDateFormat9._locale;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale20);
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3, locale20);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance((int) (byte) 1, locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateTimeInstance((int) (short) -1, 17, locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str18, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(dateFormat23);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) 'a', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601_z;
        java.text.DateFormat dateFormat10 = null;
        stdDateFormat0._formatPlain = dateFormat10;
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        java.util.Calendar calendar19 = dateFormat17.getCalendar();
        dateFormat13.setCalendar(calendar19);
        dateFormat12.setCalendar(calendar19);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        java.util.TimeZone timeZone24 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone24);
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        java.util.Calendar calendar28 = dateFormat26.getCalendar();
        dateFormat25.setCalendar(calendar28);
        dateFormat22.setCalendar(calendar28);
        dateFormat12.setCalendar(calendar28);
        dateFormat12.setLenient(true);
        java.util.Calendar calendar34 = dateFormat12.getCalendar();
        stdDateFormat0._formatRFC1123 = dateFormat12;
        java.text.ParsePosition parsePosition37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date38 = stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(calendar19);
// flaky "33) test0380(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(numberFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(numberFormat27);
        org.junit.Assert.assertNotNull(calendar28);
// flaky "13) test0380(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar34);
// flaky "4) test0380(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar34.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(15, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601;
        stdDateFormat0._clearFormats();
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = stdDateFormat0.format(date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dateFormat8);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601;
        stdDateFormat0._clearFormats();
        stdDateFormat0._clearFormats();
        java.lang.String str11 = stdDateFormat0.toString();
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateTimeInstance();
        dateFormat10.setLenient(false);
        dateFormat10.setLenient(true);
        java.util.Calendar calendar15 = dateFormat10.getCalendar();
        stdDateFormat0._formatRFC1123 = dateFormat10;
        java.lang.Boolean boolean17 = stdDateFormat0._lenient;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stdDateFormat0.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(calendar15);
// flaky "34) test0385(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar15.toString(), "sun.util.BuddhistCalendar[time=-734063819485,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=23,SECOND=0,MILLISECOND=515,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(boolean17);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.TimeZone timeZone4 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        dateFormat8.setNumberFormat(numberFormat10);
        stdDateFormat6.setNumberFormat(numberFormat10);
        boolean boolean13 = stdDateFormat6.isLenient();
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("");
        boolean boolean16 = stdDateFormat6.isLenient();
        java.util.Locale locale17 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4, locale17);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1, locale17);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance((int) (byte) 100, locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = stdDateFormat0._timezone;
        java.text.AttributedCharacterIterator attributedCharacterIterator12 = stdDateFormat0.formatToCharacterIterator((java.lang.Object) 0);
        java.lang.Object obj13 = null;
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = stdDateFormat0.format(obj13, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNotNull(attributedCharacterIterator12);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat1.setNumberFormat(numberFormat5);
        boolean boolean9 = stdDateFormat1.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat10 = stdDateFormat1._formatISO8601_z;
        boolean boolean12 = stdDateFormat1.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.util.Locale locale13 = stdDateFormat1._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance(12, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateFormat10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        stdDateFormat3.setNumberFormat(numberFormat5);
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        dateFormat8.setNumberFormat(numberFormat10);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        java.util.Calendar calendar14 = dateFormat12.getCalendar();
        dateFormat8.setCalendar(calendar14);
        dateFormat7.setCalendar(calendar14);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        java.util.TimeZone timeZone19 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone19);
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        java.util.Calendar calendar23 = dateFormat21.getCalendar();
        dateFormat20.setCalendar(calendar23);
        dateFormat17.setCalendar(calendar23);
        dateFormat7.setCalendar(calendar23);
        java.util.Calendar calendar27 = dateFormat7.getCalendar();
        stdDateFormat3.setCalendar(calendar27);
        boolean boolean30 = stdDateFormat3.looksLikeISO8601("hi!");
        java.util.Date date31 = null;
        java.lang.StringBuffer stringBuffer32 = null;
        java.text.FieldPosition fieldPosition33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer34 = stdDateFormat3.format(date31, stringBuffer32, fieldPosition33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(calendar14);
// flaky "35) test0389(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNotNull(calendar23);
// flaky "14) test0389(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar23.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar27);
// flaky "5) test0389(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean10 = stdDateFormat3.isLenient();
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        boolean boolean15 = stdDateFormat3.looksLikeISO8601("hi!");
        java.util.Locale locale16 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1, locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance(8, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat17);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.lang.String str3 = dateFormat0.format((java.lang.Object) 3);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = dateFormat0.parseObject("0", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
// flaky "36) test0391(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u0e21\u0e04. 2513" + "'", str3, "\u0e21\u0e04. 2513");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        boolean boolean3 = dateFormat1.equals((java.lang.Object) "yyyy-MM-dd");
        java.util.TimeZone timeZone4 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat8 = dateFormat7.getNumberFormat();
        dateFormat6.setNumberFormat(numberFormat8);
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat11 = dateFormat10.getNumberFormat();
        java.util.Calendar calendar12 = dateFormat10.getCalendar();
        dateFormat6.setCalendar(calendar12);
        boolean boolean14 = dateFormat5.equals((java.lang.Object) calendar12);
        dateFormat1.setCalendar(calendar12);
        java.util.Date date16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateFormat1.format(date16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(calendar12);
// flaky "37) test0392(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat2);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat5);
        java.text.NumberFormat numberFormat7 = dateFormat0.getNumberFormat();
        java.lang.Object obj9 = null; // flaky "38) test0393(com.fasterxml.jackson.databind.util.RegressionTest0)": numberFormat7.parseObject("\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(numberFormat7);
// flaky "15) test0393(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone10);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone10);
        java.util.TimeZone timeZone13 = null;
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone13);
        dateFormat14.setLenient(false);
        dateFormat14.setLenient(false);
        boolean boolean19 = dateFormat12.equals((java.lang.Object) false);
        dateFormat12.setLenient(false);
        stdDateFormat0._formatPlain = dateFormat12;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date24 = stdDateFormat0.parse("yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601;
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("\u0e21\u0e04. 2513");
        stdDateFormat0._clearFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = stdDateFormat0.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat2);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat5);
        java.util.TimeZone timeZone7 = null;
        java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone7);
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        boolean boolean10 = dateFormat0.equals((java.lang.Object) numberFormat9);
        java.lang.Class<?> wildcardClass11 = numberFormat9.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat2);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat5);
        java.text.NumberFormat numberFormat7 = dateFormat0.getNumberFormat();
        java.lang.Class<?> wildcardClass8 = dateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601_z;
        java.text.DateFormat dateFormat10 = stdDateFormat0._formatPlain;
        boolean boolean12 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.DateFormat dateFormat13 = stdDateFormat0._formatPlain;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = stdDateFormat0.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(dateFormat10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateFormat13);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(0, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.util.TimeZone timeZone2 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat12 = dateFormat11.getNumberFormat();
        dateFormat10.setNumberFormat(numberFormat12);
        stdDateFormat8.setNumberFormat(numberFormat12);
        boolean boolean16 = stdDateFormat8.looksLikeISO8601("hi!");
        java.lang.String str17 = stdDateFormat8.toString();
        java.util.TimeZone timeZone18 = stdDateFormat8._timezone;
        java.util.Locale locale19 = stdDateFormat8._locale;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale19);
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2, locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateTimeInstance(15, 4, locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str17, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(2, (int) (byte) 1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator5 = dateFormat2.formatToCharacterIterator((java.lang.Object) numberFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        stdDateFormat0._clearFormats();
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatPlain;
        java.util.TimeZone timeZone12 = stdDateFormat0.getTimeZone();
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = stdDateFormat0.parseAsISO8601("yyyy-MM-dd", parsePosition14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(timeZone12);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateTimeInstance();
        dateFormat10.setLenient(false);
        dateFormat10.setLenient(true);
        java.util.Calendar calendar15 = dateFormat10.getCalendar();
        stdDateFormat0._formatRFC1123 = dateFormat10;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        java.text.NumberFormat numberFormat22 = dateFormat18.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat22);
        java.lang.Boolean boolean24 = stdDateFormat0._lenient;
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        dateFormat26.setNumberFormat(numberFormat28);
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        java.util.Calendar calendar32 = dateFormat30.getCalendar();
        dateFormat26.setCalendar(calendar32);
        dateFormat25.setCalendar(calendar32);
        java.lang.StringBuffer stringBuffer35 = null;
        java.text.FieldPosition fieldPosition36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer37 = stdDateFormat0.format((java.lang.Object) dateFormat25, stringBuffer35, fieldPosition36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(calendar15);
// flaky "39) test0404(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar15.toString(), "sun.util.BuddhistCalendar[time=-734063818792,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=23,SECOND=1,MILLISECOND=208,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(numberFormat31);
        org.junit.Assert.assertNotNull(calendar32);
// flaky "16) test0404(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat1.parseObject("\u0e21\u0e04. 2513");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601;
        java.util.TimeZone timeZone10 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone10);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone10);
        stdDateFormat0.setTimeZone(timeZone10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = stdDateFormat0.parse("EEE, dd MMM yyyy HH:mm:ss zzz");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"EEE, dd MMM yyyy HH:mm:ss zzz\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat1.setNumberFormat(numberFormat5);
        boolean boolean9 = stdDateFormat1.looksLikeISO8601("hi!");
        java.lang.String str10 = stdDateFormat1.toString();
        java.util.TimeZone timeZone11 = stdDateFormat1._timezone;
        java.util.Locale locale12 = stdDateFormat1._locale;
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale12);
        java.util.TimeZone timeZone14 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone14);
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone14);
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
        java.util.TimeZone timeZone19 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone19);
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone19);
        java.util.TimeZone timeZone22 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone22);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        dateFormat26.setNumberFormat(numberFormat28);
        stdDateFormat24.setNumberFormat(numberFormat28);
        boolean boolean31 = stdDateFormat24.isLenient();
        boolean boolean33 = stdDateFormat24.looksLikeISO8601("");
        boolean boolean34 = stdDateFormat24.isLenient();
        java.util.Locale locale35 = stdDateFormat24._locale;
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone22, locale35);
        java.text.DateFormat dateFormat37 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone19, locale35);
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14, locale35);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator39 = dateFormat13.formatToCharacterIterator((java.lang.Object) timeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(dateFormat37);
        org.junit.Assert.assertNotNull(dateFormat38);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        dateFormat4.setNumberFormat(numberFormat6);
        stdDateFormat2.setNumberFormat(numberFormat6);
        boolean boolean9 = stdDateFormat2.isLenient();
        boolean boolean11 = stdDateFormat2.looksLikeISO8601("");
        boolean boolean12 = stdDateFormat2.isLenient();
        java.util.Locale locale13 = stdDateFormat2._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateTimeInstance(15, (int) '4', locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.util.Locale locale11 = stdDateFormat0._locale;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat0._timezone = timeZone12;
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatISO8601;
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatRFC1123;
        java.lang.Boolean boolean16 = stdDateFormat0._lenient;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = stdDateFormat0.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601;
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        java.util.Calendar calendar11 = dateFormat9.getCalendar();
        stdDateFormat0.setCalendar(calendar11);
        boolean boolean14 = stdDateFormat0.equals((java.lang.Object) 7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = stdDateFormat0.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(calendar11);
// flaky "40) test0411(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.lang.String str10 = stdDateFormat0.toString();
        boolean boolean12 = stdDateFormat0.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone13 = stdDateFormat0.getTimeZone();
        java.util.TimeZone timeZone14 = stdDateFormat0.getTimeZone();
        java.util.TimeZone timeZone15 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15);
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone15);
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone15);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15);
        java.util.TimeZone timeZone20 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone20);
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone20);
        java.util.TimeZone timeZone23 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone23);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        dateFormat27.setNumberFormat(numberFormat29);
        stdDateFormat25.setNumberFormat(numberFormat29);
        boolean boolean32 = stdDateFormat25.isLenient();
        boolean boolean34 = stdDateFormat25.looksLikeISO8601("");
        boolean boolean35 = stdDateFormat25.isLenient();
        java.util.Locale locale36 = stdDateFormat25._locale;
        java.text.DateFormat dateFormat37 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone23, locale36);
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone20, locale36);
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15, locale36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = stdDateFormat0.format((java.lang.Object) timeZone15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(timeZone13);
        org.junit.Assert.assertNull(timeZone14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(numberFormat29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat37);
        org.junit.Assert.assertNotNull(dateFormat38);
        org.junit.Assert.assertNotNull(dateFormat39);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = stdDateFormat0._timezone;
        java.text.NumberFormat numberFormat11 = stdDateFormat0.getNumberFormat();
        java.lang.String str12 = stdDateFormat0.toString();
        java.util.TimeZone timeZone13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        stdDateFormat0._formatRFC1123 = dateFormat14;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        java.text.NumberFormat numberFormat21 = dateFormat17.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat21);
        java.util.Locale locale23 = stdDateFormat0._locale;
        java.util.Date date24 = null;
        java.lang.StringBuffer stringBuffer25 = null;
        java.text.FieldPosition fieldPosition26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer27 = stdDateFormat0.format(date24, stringBuffer25, fieldPosition26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601;
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = stdDateFormat0.parseAsISO8601("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dateFormat8);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stdDateFormat0.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat1.setNumberFormat(numberFormat5);
        boolean boolean9 = stdDateFormat1.looksLikeISO8601("hi!");
        java.lang.String str10 = stdDateFormat1.toString();
        java.util.TimeZone timeZone11 = stdDateFormat1._timezone;
        java.util.Locale locale12 = stdDateFormat1._locale;
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale12);
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateFormat13.format((java.lang.Object) numberFormat15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) 1);
        dateFormat1.setLenient(true);
        java.text.NumberFormat numberFormat4 = dateFormat1.getNumberFormat();
        java.lang.Object obj5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = dateFormat1.format(obj5, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat4);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        stdDateFormat0._clearFormats();
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatPlain;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        stdDateFormat0._timezone = timeZone12;
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatPlain;
        java.lang.Boolean boolean16 = stdDateFormat0._lenient;
        java.text.ParsePosition parsePosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = stdDateFormat0.parseAsRFC1123("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateTimeInstance();
        dateFormat10.setLenient(false);
        dateFormat10.setLenient(true);
        java.util.Calendar calendar15 = dateFormat10.getCalendar();
        stdDateFormat0._formatRFC1123 = dateFormat10;
        java.lang.Boolean boolean17 = stdDateFormat0._lenient;
        java.util.Date date18 = null;
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = stdDateFormat0.format(date18, stringBuffer19, fieldPosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(calendar15);
// flaky "41) test0419(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar15.toString(), "sun.util.BuddhistCalendar[time=-734063818142,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=23,SECOND=1,MILLISECOND=858,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(boolean17);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        dateFormat4.setNumberFormat(numberFormat6);
        stdDateFormat2.setNumberFormat(numberFormat6);
        java.util.Locale locale9 = stdDateFormat2._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateTimeInstance(13, 11, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        java.util.Calendar calendar7 = dateFormat5.getCalendar();
        dateFormat1.setCalendar(calendar7);
        dateFormat0.setCalendar(calendar7);
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat12 = dateFormat11.getNumberFormat();
        dateFormat10.setNumberFormat(numberFormat12);
        java.lang.Class<?> wildcardClass14 = numberFormat12.getClass();
        boolean boolean15 = dateFormat0.equals((java.lang.Object) wildcardClass14);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNotNull(calendar7);
// flaky "42) test0421(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        stdDateFormat3.setNumberFormat(numberFormat5);
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        dateFormat8.setNumberFormat(numberFormat10);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        java.util.Calendar calendar14 = dateFormat12.getCalendar();
        dateFormat8.setCalendar(calendar14);
        dateFormat7.setCalendar(calendar14);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        java.util.TimeZone timeZone19 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone19);
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        java.util.Calendar calendar23 = dateFormat21.getCalendar();
        dateFormat20.setCalendar(calendar23);
        dateFormat17.setCalendar(calendar23);
        dateFormat7.setCalendar(calendar23);
        java.util.Calendar calendar27 = dateFormat7.getCalendar();
        stdDateFormat3.setCalendar(calendar27);
        boolean boolean30 = stdDateFormat3.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone31 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone31);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(calendar14);
// flaky "43) test0422(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNotNull(calendar23);
// flaky "17) test0422(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar23.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar27);
// flaky "6) test0422(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat32);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601_z;
        java.text.DateFormat dateFormat10 = null;
        stdDateFormat0._formatPlain = dateFormat10;
        java.util.Locale locale12 = stdDateFormat0._locale;
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = stdDateFormat0.format((java.lang.Object) false, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone10);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        java.util.Calendar calendar14 = dateFormat12.getCalendar();
        dateFormat11.setCalendar(calendar14);
        stdDateFormat0.setCalendar(calendar14);
        java.lang.Class<?> wildcardClass17 = stdDateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(calendar14);
// flaky "44) test0424(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = stdDateFormat0._timezone;
        java.text.NumberFormat numberFormat11 = stdDateFormat0.getNumberFormat();
        java.util.TimeZone timeZone12 = stdDateFormat0.getTimeZone();
        java.util.Locale locale13 = stdDateFormat0._locale;
        java.lang.Boolean boolean14 = stdDateFormat0._lenient;
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stdDateFormat0.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNull(boolean14);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = stdDateFormat0._timezone;
        java.text.NumberFormat numberFormat11 = stdDateFormat0.getNumberFormat();
        java.lang.String str12 = stdDateFormat0.toString();
        java.util.TimeZone timeZone13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        stdDateFormat0._formatRFC1123 = dateFormat14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = stdDateFormat0.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat14);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.lang.String str10 = stdDateFormat0.toString();
        boolean boolean12 = stdDateFormat0.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone13 = stdDateFormat0.getTimeZone();
        java.util.Locale locale14 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatPlain;
        java.text.ParsePosition parsePosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = stdDateFormat0.parseAsRFC1123("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(timeZone13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNull(dateFormat15);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (short) 1);
        java.text.AttributedCharacterIterator attributedCharacterIterator3 = dateFormat1.formatToCharacterIterator((java.lang.Object) 4);
        dateFormat1.setLenient(false);
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateFormat1.format(date6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(attributedCharacterIterator3);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = null;
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone10);
        java.util.Calendar calendar12 = dateFormat11.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator13 = stdDateFormat0.formatToCharacterIterator((java.lang.Object) calendar12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(calendar12);
// flaky "45) test0429(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.util.TimeZone timeZone2 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2);
        java.util.TimeZone timeZone7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone7);
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone7);
        java.util.TimeZone timeZone10 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone10);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        dateFormat14.setNumberFormat(numberFormat16);
        stdDateFormat12.setNumberFormat(numberFormat16);
        boolean boolean19 = stdDateFormat12.isLenient();
        boolean boolean21 = stdDateFormat12.looksLikeISO8601("");
        boolean boolean22 = stdDateFormat12.isLenient();
        java.util.Locale locale23 = stdDateFormat12._locale;
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone10, locale23);
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone7, locale23);
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2, locale23);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance((int) '#', (int) '#', locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(dateFormat26);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.lang.String str10 = stdDateFormat0.toString();
        boolean boolean12 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat13 = stdDateFormat0._formatPlain;
        boolean boolean14 = stdDateFormat0.isLenient();
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = stdDateFormat0.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.lang.Class<?> wildcardClass4 = timeZone0.getClass();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.lang.String str10 = stdDateFormat0.toString();
        boolean boolean12 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat13 = stdDateFormat0._formatPlain;
        boolean boolean14 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat17);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        java.util.Calendar calendar21 = dateFormat19.getCalendar();
        dateFormat15.setCalendar(calendar21);
        java.lang.StringBuffer stringBuffer23 = null;
        java.text.FieldPosition fieldPosition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = stdDateFormat0.format((java.lang.Object) calendar21, stringBuffer23, fieldPosition24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertNotNull(calendar21);
// flaky "46) test0434(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.lang.String str10 = stdDateFormat0.toString();
        boolean boolean12 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = stdDateFormat0.parseAsISO8601("Wed, 31 Dec 1969 23:59:59 UTC", parsePosition14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone10);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone10);
        java.util.TimeZone timeZone13 = null;
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone13);
        dateFormat14.setLenient(false);
        dateFormat14.setLenient(false);
        boolean boolean19 = dateFormat12.equals((java.lang.Object) false);
        dateFormat12.setLenient(false);
        stdDateFormat0._formatPlain = dateFormat12;
        java.text.ParsePosition parsePosition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date25 = stdDateFormat0.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        dateFormat8.setNumberFormat(numberFormat10);
        stdDateFormat6.setNumberFormat(numberFormat10);
        boolean boolean14 = stdDateFormat6.looksLikeISO8601("hi!");
        java.lang.String str15 = stdDateFormat6.toString();
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        java.util.Locale locale17 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale17);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale17);
        java.util.Date date20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = dateFormat19.format(date20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.util.Locale locale11 = stdDateFormat0._locale;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat0._timezone = timeZone12;
        java.lang.String str14 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatPlain;
        java.text.DateFormat dateFormat16 = stdDateFormat0._formatPlain;
        java.text.ParsePosition parsePosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stdDateFormat0.parseObject("\u0e21\u0e04. 2513", parsePosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601_z;
        java.text.DateFormat dateFormat10 = stdDateFormat0._formatPlain;
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone12 = stdDateFormat0._timezone;
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = stdDateFormat0.parse("hi!", parsePosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(dateFormat10);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(timeZone12);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat1.setNumberFormat(numberFormat5);
        boolean boolean8 = stdDateFormat1.isLenient();
        java.text.DateFormat dateFormat9 = stdDateFormat1._formatISO8601;
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat11 = dateFormat10.getNumberFormat();
        java.util.Calendar calendar12 = dateFormat10.getCalendar();
        stdDateFormat1.setCalendar(calendar12);
        java.util.Calendar calendar14 = stdDateFormat1.getCalendar();
        java.util.TimeZone timeZone15 = stdDateFormat1.getTimeZone();
        java.util.Locale locale16 = stdDateFormat1._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance(17, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(calendar12);
// flaky "47) test0440(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar14);
// flaky "18) test0440(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.TimeZone timeZone6 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone6);
        java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone6);
        java.util.TimeZone timeZone9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone9);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        stdDateFormat11.setNumberFormat(numberFormat15);
        boolean boolean18 = stdDateFormat11.isLenient();
        boolean boolean20 = stdDateFormat11.looksLikeISO8601("");
        boolean boolean21 = stdDateFormat11.isLenient();
        java.util.Locale locale22 = stdDateFormat11._locale;
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone9, locale22);
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone6, locale22);
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1, locale22);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance((int) 'a', locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(dateFormat25);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone10);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone10);
        java.util.TimeZone timeZone13 = null;
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone13);
        dateFormat14.setLenient(false);
        dateFormat14.setLenient(false);
        boolean boolean19 = dateFormat12.equals((java.lang.Object) false);
        dateFormat12.setLenient(false);
        stdDateFormat0._formatPlain = dateFormat12;
        java.util.Calendar calendar23 = stdDateFormat0.getCalendar();
        java.text.ParsePosition parsePosition25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = stdDateFormat0.parseAsISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", parsePosition25, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(calendar23);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = stdDateFormat0._timezone;
        java.text.NumberFormat numberFormat11 = stdDateFormat0.getNumberFormat();
        java.lang.String str12 = stdDateFormat0.toString();
        java.util.TimeZone timeZone13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        stdDateFormat0._formatRFC1123 = dateFormat14;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat14);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601;
        stdDateFormat0._lenient = true;
        java.lang.String str10 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatPlain;
        java.util.Date date12 = null;
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = stdDateFormat0.format(date12, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat11);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stdDateFormat2.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat0.parseObject("Wed, 31 Dec 1969 23:59:59 UTC");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat0.parse("yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean12 = dateFormat10.equals((java.lang.Object) true);
        stdDateFormat0._formatISO8601 = dateFormat10;
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatRFC1123;
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = stdDateFormat0.parseAsISO8601("", parsePosition16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateFormat14);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = stdDateFormat0._timezone;
        java.util.Locale locale11 = stdDateFormat0._locale;
        java.lang.String str12 = stdDateFormat0.toString();
        java.util.TimeZone timeZone13 = stdDateFormat0._timezone;
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = stdDateFormat0.parseAsISO8601("yyyy-MM-dd", parsePosition15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone13);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.util.Locale locale11 = stdDateFormat0._locale;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat0._timezone = timeZone12;
        java.lang.String str14 = stdDateFormat0.toString();
        boolean boolean16 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.DateFormat dateFormat17 = stdDateFormat0._formatISO8601;
        java.text.ParsePosition parsePosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date20 = stdDateFormat0.parse("", parsePosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(dateFormat17);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat1.setNumberFormat(numberFormat5);
        boolean boolean8 = stdDateFormat1.isLenient();
        boolean boolean10 = stdDateFormat1.looksLikeISO8601("");
        boolean boolean11 = stdDateFormat1.isLenient();
        java.lang.Boolean boolean12 = stdDateFormat1._lenient;
        java.lang.Boolean boolean13 = stdDateFormat1._lenient;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = stdDateFormat0.format((java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(boolean13);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat1.setNumberFormat(numberFormat5);
        boolean boolean9 = stdDateFormat1.looksLikeISO8601("hi!");
        java.lang.String str10 = stdDateFormat1.toString();
        java.util.TimeZone timeZone11 = stdDateFormat1._timezone;
        java.util.Locale locale12 = stdDateFormat1._locale;
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance(0, locale12);
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = dateFormat13.parseObject("", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat13);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        java.util.TimeZone timeZone4 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone4);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone4);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat11 = dateFormat10.getNumberFormat();
        dateFormat9.setNumberFormat(numberFormat11);
        stdDateFormat7.setNumberFormat(numberFormat11);
        boolean boolean15 = stdDateFormat7.looksLikeISO8601("hi!");
        java.lang.String str16 = stdDateFormat7.toString();
        java.util.TimeZone timeZone17 = stdDateFormat7._timezone;
        java.text.NumberFormat numberFormat18 = stdDateFormat7.getNumberFormat();
        java.lang.String str19 = stdDateFormat7.toString();
        java.util.TimeZone timeZone20 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone20);
        stdDateFormat7._formatRFC1123 = dateFormat21;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        dateFormat24.setNumberFormat(numberFormat26);
        java.text.NumberFormat numberFormat28 = dateFormat24.getNumberFormat();
        stdDateFormat7.setNumberFormat(numberFormat28);
        java.util.Locale locale30 = stdDateFormat7._locale;
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4, locale30);
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1, locale30);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance((int) ' ', locale30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str16, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str19, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.lang.String str10 = stdDateFormat0.toString();
        boolean boolean12 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat13 = stdDateFormat0._formatPlain;
        boolean boolean14 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        boolean boolean22 = stdDateFormat15.isLenient();
        java.text.DateFormat dateFormat23 = stdDateFormat15._formatISO8601;
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        java.util.Calendar calendar26 = dateFormat24.getCalendar();
        stdDateFormat15.setCalendar(calendar26);
        java.util.Calendar calendar28 = stdDateFormat15.getCalendar();
        java.lang.String str29 = stdDateFormat15.toString();
        boolean boolean31 = stdDateFormat15.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.lang.StringBuffer stringBuffer32 = null;
        java.text.FieldPosition fieldPosition33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer34 = stdDateFormat0.format((java.lang.Object) boolean31, stringBuffer32, fieldPosition33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertNotNull(calendar26);
// flaky "48) test0454(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar26.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar28);
// flaky "19) test0454(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str29, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        stdDateFormat0._clearFormats();
        stdDateFormat0._lenient = false;
        java.lang.String str13 = stdDateFormat0.toString();
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = stdDateFormat0.parse("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        stdDateFormat3.setNumberFormat(numberFormat5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = numberFormat5.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.lang.String[] strArray1 = com.fasterxml.jackson.databind.util.StdDateFormat.ALL_FORMATS;
        boolean boolean2 = dateFormat0.equals((java.lang.Object) strArray1);
        java.util.Calendar calendar3 = dateFormat0.getCalendar();
        java.util.Calendar calendar4 = null;
        dateFormat0.setCalendar(calendar4);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd" });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky "49) test0457(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateInstance((int) (short) 1);
        dateFormat5.setLenient(true);
        java.text.NumberFormat numberFormat8 = dateFormat5.getNumberFormat();
        stdDateFormat3.setNumberFormat(numberFormat8);
        java.text.DateFormat dateFormat10 = stdDateFormat3._formatPlain;
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertNull(dateFormat10);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.util.Locale locale11 = stdDateFormat0._locale;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat0._timezone = timeZone12;
        java.lang.String str14 = stdDateFormat0.toString();
        boolean boolean16 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.util.Date date17 = null;
        java.lang.StringBuffer stringBuffer18 = null;
        java.text.FieldPosition fieldPosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = stdDateFormat0.format(date17, stringBuffer18, fieldPosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.util.Locale locale11 = stdDateFormat0._locale;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat0._timezone = timeZone12;
        stdDateFormat0._clearFormats();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        java.util.Calendar calendar22 = dateFormat20.getCalendar();
        dateFormat16.setCalendar(calendar22);
        dateFormat15.setCalendar(calendar22);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        java.util.TimeZone timeZone27 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone27);
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        java.util.Calendar calendar31 = dateFormat29.getCalendar();
        dateFormat28.setCalendar(calendar31);
        dateFormat25.setCalendar(calendar31);
        dateFormat15.setCalendar(calendar31);
        java.util.Calendar calendar35 = dateFormat15.getCalendar();
        stdDateFormat0.setCalendar(calendar35);
        java.util.TimeZone timeZone37 = stdDateFormat0._timezone;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date39 = stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertNotNull(calendar22);
// flaky "50) test0460(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(numberFormat30);
        org.junit.Assert.assertNotNull(calendar31);
// flaky "20) test0460(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar31.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar35);
// flaky "7) test0460(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar35.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601_z;
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone13);
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        java.util.Calendar calendar17 = dateFormat15.getCalendar();
        dateFormat14.setCalendar(calendar17);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean27 = stdDateFormat19.looksLikeISO8601("hi!");
        java.lang.String str28 = stdDateFormat19.toString();
        java.util.TimeZone timeZone29 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone29);
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        java.util.Calendar calendar33 = dateFormat31.getCalendar();
        dateFormat30.setCalendar(calendar33);
        stdDateFormat19.setCalendar(calendar33);
        dateFormat14.setCalendar(calendar33);
        stdDateFormat0.setCalendar(calendar33);
        java.util.Locale locale38 = stdDateFormat0._locale;
        java.util.Date date39 = null;
        java.lang.StringBuffer stringBuffer40 = null;
        java.text.FieldPosition fieldPosition41 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer42 = stdDateFormat0.format(date39, stringBuffer40, fieldPosition41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "51) test0461(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(numberFormat23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str28, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertNotNull(calendar33);
// flaky "21) test0461(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar33.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = stdDateFormat0._timezone;
        java.util.Locale locale11 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatISO8601;
        java.text.DateFormat dateFormat13 = stdDateFormat0._formatPlain;
        java.lang.String str14 = stdDateFormat0.toString();
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = stdDateFormat0.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", parsePosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone10);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone10);
        java.util.TimeZone timeZone13 = null;
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone13);
        dateFormat14.setLenient(false);
        dateFormat14.setLenient(false);
        boolean boolean19 = dateFormat12.equals((java.lang.Object) false);
        dateFormat12.setLenient(false);
        stdDateFormat0._formatPlain = dateFormat12;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        dateFormat25.setNumberFormat(numberFormat27);
        stdDateFormat23.setNumberFormat(numberFormat27);
        java.lang.Boolean boolean30 = stdDateFormat23._lenient;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator31 = stdDateFormat0.formatToCharacterIterator((java.lang.Object) boolean30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(numberFormat27);
        org.junit.Assert.assertNull(boolean30);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.util.TimeZone timeZone2 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2);
        java.util.TimeZone timeZone5 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat11 = dateFormat10.getNumberFormat();
        dateFormat9.setNumberFormat(numberFormat11);
        stdDateFormat7.setNumberFormat(numberFormat11);
        boolean boolean14 = stdDateFormat7.isLenient();
        boolean boolean16 = stdDateFormat7.looksLikeISO8601("");
        boolean boolean17 = stdDateFormat7.isLenient();
        java.util.Locale locale18 = stdDateFormat7._locale;
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5, locale18);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2, locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateTimeInstance(11, (int) '4', locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat20);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.lang.Boolean boolean11 = stdDateFormat0._lenient;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stdDateFormat0.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.util.Locale locale11 = stdDateFormat0._locale;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat0._timezone = timeZone12;
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatISO8601;
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatRFC1123;
        boolean boolean16 = stdDateFormat0.isLenient();
        java.text.ParsePosition parsePosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = stdDateFormat0.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.util.TimeZone timeZone11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone11);
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone11);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        java.util.Calendar calendar16 = dateFormat14.getCalendar();
        java.util.Calendar calendar17 = dateFormat14.getCalendar();
        dateFormat13.setCalendar(calendar17);
        stdDateFormat0._formatISO8601 = dateFormat13;
        stdDateFormat0._clearFormats();
        boolean boolean21 = stdDateFormat0.isLenient();
        java.text.ParsePosition parsePosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date24 = stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(calendar16);
// flaky "52) test0467(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar17);
// flaky "22) test0467(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.lang.String str10 = stdDateFormat0.toString();
        boolean boolean12 = stdDateFormat0.looksLikeISO8601("hi!");
        java.util.Locale locale13 = stdDateFormat0._locale;
        java.lang.Boolean boolean14 = stdDateFormat0._lenient;
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = stdDateFormat0.parseAsRFC1123("0", parsePosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNull(boolean14);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = stdDateFormat0._timezone;
        java.util.Locale locale11 = stdDateFormat0._locale;
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stdDateFormat0.parseObject("", parsePosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale3, (java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat5.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        java.util.Calendar calendar7 = dateFormat5.getCalendar();
        dateFormat1.setCalendar(calendar7);
        dateFormat0.setCalendar(calendar7);
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat11 = dateFormat10.getNumberFormat();
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone12);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        java.util.Calendar calendar16 = dateFormat14.getCalendar();
        dateFormat13.setCalendar(calendar16);
        dateFormat10.setCalendar(calendar16);
        dateFormat0.setCalendar(calendar16);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        dateFormat20.setNumberFormat(numberFormat22);
        dateFormat0.setNumberFormat(numberFormat22);
        java.util.Date date25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = dateFormat0.format(date25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNotNull(calendar7);
// flaky "53) test0471(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(calendar16);
// flaky "23) test0471(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.lang.String str10 = stdDateFormat0.toString();
        boolean boolean11 = stdDateFormat0.isLenient();
        java.text.AttributedCharacterIterator attributedCharacterIterator13 = stdDateFormat0.formatToCharacterIterator((java.lang.Object) (byte) -1);
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(attributedCharacterIterator13);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.lang.String str10 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatPlain;
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = stdDateFormat0.parseAsRFC1123("", parsePosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat11);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(2, (int) (byte) 1);
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        java.util.TimeZone timeZone4 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone4);
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone4);
        java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        dateFormat12.setNumberFormat(numberFormat14);
        stdDateFormat10.setNumberFormat(numberFormat14);
        boolean boolean18 = stdDateFormat10.looksLikeISO8601("hi!");
        java.lang.String str19 = stdDateFormat10.toString();
        java.util.TimeZone timeZone20 = stdDateFormat10._timezone;
        java.util.Locale locale21 = stdDateFormat10._locale;
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale21);
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4, locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = numberFormat3.format((java.lang.Object) dateFormat23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str19, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(dateFormat23);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.lang.String str10 = stdDateFormat0.toString();
        boolean boolean12 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat13 = stdDateFormat0._formatPlain;
        boolean boolean14 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        boolean boolean22 = stdDateFormat15.isLenient();
        boolean boolean24 = stdDateFormat15.looksLikeISO8601("");
        stdDateFormat15._clearFormats();
        stdDateFormat15._lenient = false;
        java.text.DateFormat dateFormat28 = null;
        stdDateFormat15._formatISO8601_z = dateFormat28;
        java.lang.Boolean boolean30 = stdDateFormat15._lenient;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = stdDateFormat0.format((java.lang.Object) stdDateFormat15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat2.parseObject("-1");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601;
        java.util.TimeZone timeZone9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone9);
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone9);
        stdDateFormat0.setTimeZone(timeZone9);
        java.util.Date date13 = null;
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = stdDateFormat0.format(date13, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat1.setNumberFormat(numberFormat5);
        boolean boolean9 = stdDateFormat1.looksLikeISO8601("hi!");
        java.lang.String str10 = stdDateFormat1.toString();
        java.util.TimeZone timeZone11 = stdDateFormat1._timezone;
        java.text.NumberFormat numberFormat12 = stdDateFormat1.getNumberFormat();
        java.util.TimeZone timeZone13 = stdDateFormat1.getTimeZone();
        java.util.Locale locale14 = stdDateFormat1._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(14, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertNull(timeZone13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.lang.String str10 = stdDateFormat0.toString();
        boolean boolean12 = stdDateFormat0.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone13 = stdDateFormat0.getTimeZone();
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatPlain;
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatISO8601;
        java.text.ParsePosition parsePosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = dateFormat15.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(timeZone13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getTimeInstance();
        stdDateFormat0._formatPlain = dateFormat10;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        dateFormat14.setNumberFormat(numberFormat16);
        stdDateFormat12.setNumberFormat(numberFormat16);
        boolean boolean20 = stdDateFormat12.looksLikeISO8601("hi!");
        java.lang.String str21 = stdDateFormat12.toString();
        java.util.TimeZone timeZone22 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone22);
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone22);
        java.util.TimeZone timeZone25 = null;
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone25);
        dateFormat26.setLenient(false);
        dateFormat26.setLenient(false);
        boolean boolean31 = dateFormat24.equals((java.lang.Object) false);
        dateFormat24.setLenient(false);
        stdDateFormat12._formatPlain = dateFormat24;
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance(2);
        stdDateFormat12._formatISO8601 = dateFormat36;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = dateFormat10.format((java.lang.Object) dateFormat36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str21, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateFormat36);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601_z;
        java.text.DateFormat dateFormat10 = stdDateFormat0._formatPlain;
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone12 = stdDateFormat0._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat0._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatISO8601;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(2);
        java.util.Calendar calendar17 = dateFormat16.getCalendar();
        stdDateFormat0.setCalendar(calendar17);
        java.text.ParsePosition parsePosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = stdDateFormat0.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(dateFormat10);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "54) test0481(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar17.toString(), "sun.util.BuddhistCalendar[time=-734063816353,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=23,SECOND=3,MILLISECOND=647,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601_z;
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("\u0e21\u0e04. 2513");
        boolean boolean12 = stdDateFormat0.isLenient();
        java.text.ParsePosition parsePosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = stdDateFormat0.parseAsISO8601("", parsePosition14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean10 = stdDateFormat3.isLenient();
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        boolean boolean15 = stdDateFormat3.looksLikeISO8601("hi!");
        java.util.Locale locale16 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1, locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance((int) 'a', locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat17);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.text.DateFormat dateFormat10 = stdDateFormat0._formatRFC1123;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        dateFormat11.setNumberFormat(numberFormat13);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        dateFormat11.setNumberFormat(numberFormat16);
        java.text.NumberFormat numberFormat18 = dateFormat11.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat18);
        java.util.Date date20 = null;
        java.lang.StringBuffer stringBuffer21 = null;
        java.text.FieldPosition fieldPosition22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = stdDateFormat0.format(date20, stringBuffer21, fieldPosition22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(numberFormat18);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat1.setNumberFormat(numberFormat5);
        boolean boolean9 = stdDateFormat1.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat10 = stdDateFormat1._formatISO8601_z;
        boolean boolean12 = stdDateFormat1.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.text.DateFormat dateFormat13 = stdDateFormat1._formatISO8601_z;
        java.util.TimeZone timeZone14 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone14);
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        java.util.Calendar calendar18 = dateFormat16.getCalendar();
        dateFormat15.setCalendar(calendar18);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat24);
        stdDateFormat20.setNumberFormat(numberFormat24);
        boolean boolean28 = stdDateFormat20.looksLikeISO8601("hi!");
        java.lang.String str29 = stdDateFormat20.toString();
        java.util.TimeZone timeZone30 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone30);
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        java.util.Calendar calendar34 = dateFormat32.getCalendar();
        dateFormat31.setCalendar(calendar34);
        stdDateFormat20.setCalendar(calendar34);
        dateFormat15.setCalendar(calendar34);
        stdDateFormat1.setCalendar(calendar34);
        java.util.Locale locale39 = stdDateFormat1._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateInstance(17, locale39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateFormat10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertNotNull(calendar18);
// flaky "55) test0485(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(numberFormat24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str29, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(numberFormat33);
        org.junit.Assert.assertNotNull(calendar34);
// flaky "24) test0485(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar34.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat1.setNumberFormat(numberFormat5);
        boolean boolean9 = stdDateFormat1.looksLikeISO8601("hi!");
        java.lang.String str10 = stdDateFormat1.toString();
        java.util.TimeZone timeZone11 = stdDateFormat1._timezone;
        java.text.NumberFormat numberFormat12 = stdDateFormat1.getNumberFormat();
        java.util.TimeZone timeZone13 = stdDateFormat1.getTimeZone();
        java.util.Locale locale14 = stdDateFormat1._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(4, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertNull(timeZone13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.util.TimeZone timeZone2 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat8 = dateFormat7.getNumberFormat();
        dateFormat6.setNumberFormat(numberFormat8);
        stdDateFormat4.setNumberFormat(numberFormat8);
        boolean boolean11 = stdDateFormat4.isLenient();
        boolean boolean13 = stdDateFormat4.looksLikeISO8601("");
        boolean boolean14 = stdDateFormat4.isLenient();
        java.util.Locale locale15 = stdDateFormat4._locale;
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2, locale15);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance(0, locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance(6, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601;
        stdDateFormat0._clearFormats();
        stdDateFormat0._clearFormats();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dateFormat8);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.util.TimeZone timeZone0 = null;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat1.parseObject("\u0e21\u0e04. 2513");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = stdDateFormat0._timezone;
        java.text.NumberFormat numberFormat11 = stdDateFormat0.getNumberFormat();
        java.lang.String str12 = stdDateFormat0.toString();
        java.util.TimeZone timeZone13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
        stdDateFormat0._formatRFC1123 = dateFormat14;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        java.text.NumberFormat numberFormat21 = dateFormat17.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat21);
        java.util.Locale locale23 = stdDateFormat0._locale;
        java.text.ParsePosition parsePosition25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = stdDateFormat0.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", parsePosition25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.util.TimeZone timeZone0 = null;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Date date2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dateFormat1.format(date2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.TimeZone timeZone10 = stdDateFormat0._timezone;
        java.text.NumberFormat numberFormat11 = stdDateFormat0.getNumberFormat();
        java.util.TimeZone timeZone12 = stdDateFormat0.getTimeZone();
        java.util.Locale locale13 = stdDateFormat0._locale;
        java.util.TimeZone timeZone14 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone14);
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
        stdDateFormat0.setTimeZone(timeZone14);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.lang.String str10 = stdDateFormat0.toString();
        boolean boolean12 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat13 = stdDateFormat0._formatPlain;
        boolean boolean14 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatISO8601_z;
        // The following exception was thrown during execution in test generation
        try {
            dateFormat15.setLenient(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(dateFormat15);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale3, (java.lang.Boolean) false);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = stdDateFormat5.parseAsISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)", parsePosition7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601;
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        java.util.Calendar calendar11 = dateFormat9.getCalendar();
        stdDateFormat0.setCalendar(calendar11);
        java.util.Calendar calendar13 = stdDateFormat0.getCalendar();
        java.util.TimeZone timeZone14 = stdDateFormat0.getTimeZone();
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatRFC1123;
        java.text.ParsePosition parsePosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = stdDateFormat0.parseAsISO8601("", parsePosition17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(calendar11);
// flaky "56) test0496(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar13);
// flaky "25) test0496(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNull(timeZone14);
        org.junit.Assert.assertNull(dateFormat15);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.lang.String str10 = stdDateFormat0.toString();
        boolean boolean12 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat13 = stdDateFormat0._formatPlain;
        boolean boolean14 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.util.Calendar calendar16 = dateFormat15.getCalendar();
        java.lang.StringBuffer stringBuffer17 = null;
        java.text.FieldPosition fieldPosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = stdDateFormat0.format((java.lang.Object) dateFormat15, stringBuffer17, fieldPosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(calendar16);
// flaky "57) test0497(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=-734063831804,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=22,SECOND=48,MILLISECOND=196,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        dateFormat4.setNumberFormat(numberFormat6);
        stdDateFormat2.setNumberFormat(numberFormat6);
        boolean boolean10 = stdDateFormat2.looksLikeISO8601("hi!");
        java.lang.String str11 = stdDateFormat2.toString();
        java.util.TimeZone timeZone12 = stdDateFormat2._timezone;
        java.util.Locale locale13 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(16, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat14);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat1.setNumberFormat(numberFormat5);
        boolean boolean9 = stdDateFormat1.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat10 = stdDateFormat1._formatISO8601_z;
        boolean boolean12 = stdDateFormat1.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.text.DateFormat dateFormat13 = stdDateFormat1._formatRFC1123;
        java.text.DateFormat dateFormat14 = stdDateFormat1._formatISO8601_z;
        java.util.Locale locale15 = stdDateFormat1._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(16, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateFormat10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.util.Locale locale11 = stdDateFormat0._locale;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat0._timezone = timeZone12;
        java.lang.String str14 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatPlain;
        java.text.DateFormat dateFormat16 = stdDateFormat0._formatPlain;
        java.text.DateFormat dateFormat17 = stdDateFormat0._formatRFC1123;
        java.text.ParsePosition parsePosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date20 = stdDateFormat0.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", parsePosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(dateFormat17);
    }
}
