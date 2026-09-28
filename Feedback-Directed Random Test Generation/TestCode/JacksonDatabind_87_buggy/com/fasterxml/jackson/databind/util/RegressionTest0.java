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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.String str0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_STR_RFC1123;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "EEE, dd MMM yyyy HH:mm:ss zzz" + "'", str0, "EEE, dd MMM yyyy HH:mm:ss zzz");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = java.text.DateFormat.YEAR_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.lang.Class<?> wildcardClass1 = stdDateFormat0.getClass();
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int int0 = java.text.DateFormat.DAY_OF_WEEK_IN_MONTH_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int int0 = java.text.DateFormat.HOUR_OF_DAY1_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int int0 = java.text.DateFormat.DATE_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int int0 = java.text.DateFormat.MONTH_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        int int0 = java.text.DateFormat.DAY_OF_YEAR_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.String[] strArray0 = com.fasterxml.jackson.databind.util.StdDateFormat.ALL_FORMATS;
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[] { "yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd" });
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int int0 = java.text.DateFormat.MEDIUM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator4 = stdDateFormat0.formatToCharacterIterator((java.lang.Object) "EEE, dd MMM yyyy HH:mm:ss zzz");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.String str0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_STR_ISO8601_Z;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'" + "'", str0, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = null;
        stdDateFormat0._timezone = timeZone1;
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        int int0 = java.text.DateFormat.MINUTE_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        int int0 = java.text.DateFormat.HOUR_OF_DAY0_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        int int0 = java.text.DateFormat.ERA_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
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
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        java.util.Date date5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = stdDateFormat0.format(date5, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat0._formatISO8601 = dateFormat5;
        java.lang.Object obj7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.text.FieldPosition fieldPosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = dateFormat5.format(obj7, stringBuffer8, fieldPosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat0.parse("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (byte) 10, 5, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        int int0 = java.text.DateFormat.TIMEZONE_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean2 = stdDateFormat0.looksLikeISO8601("");
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withLocale(locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        int int0 = java.text.DateFormat.HOUR0_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.util.TimeZone timeZone0 = null;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.NumberFormat numberFormat2 = null;
        dateFormat1.setNumberFormat(numberFormat2);
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.lang.StringBuffer stringBuffer2 = null;
        java.text.FieldPosition fieldPosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer4 = dateFormat0.format((java.lang.Object) 10.0d, stringBuffer2, fieldPosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(0);
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        int int0 = java.text.DateFormat.DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean2 = stdDateFormat0.looksLikeISO8601("");
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat0.parseAsISO8601("", parsePosition4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        int int0 = java.text.DateFormat.WEEK_OF_MONTH_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
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
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat3 = stdDateFormat2.getNumberFormat();
        stdDateFormat2._lenient = false;
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = stdDateFormat0.format((java.lang.Object) stdDateFormat2, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(numberFormat3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parse("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(stdDateFormat2);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.String str0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_STR_PLAIN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyy-MM-dd" + "'", str0, "yyyy-MM-dd");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int int0 = java.text.DateFormat.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean2 = stdDateFormat0.looksLikeISO8601("");
        java.util.TimeZone timeZone3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat0.setTimeZone(timeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        int int0 = java.text.DateFormat.AM_PM_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat0.withLocale(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean2 = stdDateFormat0.looksLikeISO8601("");
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat0.parseAsRFC1123("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        int int0 = java.text.DateFormat.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(17, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        boolean boolean3 = stdDateFormat0.isLenient();
        stdDateFormat0._clearFormats();
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean5 = stdDateFormat3.looksLikeISO8601("");
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = stdDateFormat0.format((java.lang.Object) boolean5, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        int int0 = java.text.DateFormat.FULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        stdDateFormat0._formatISO8601_z = stdDateFormat1;
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat1.parseAsISO8601("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        int int0 = java.text.DateFormat.HOUR1_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.lang.String str2 = stdDateFormat0.format((java.lang.Object) 6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat0.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01T00:00:00.006+0000" + "'", str2, "1970-01-01T00:00:00.006+0000");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) '#', locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        java.lang.Class<?> wildcardClass5 = stdDateFormat0.getClass();
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        java.util.TimeZone timeZone5 = null;
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat0.setTimeZone(timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        int int0 = java.text.DateFormat.MILLISECOND_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        int int0 = java.text.DateFormat.SECOND_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) (byte) 100, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        boolean boolean5 = stdDateFormat0.equals((java.lang.Object) "1970-01-01T00:00:00.006+0000");
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = stdDateFormat0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stdDateFormat0.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = stdDateFormat0.clone();
        java.util.Calendar calendar4 = stdDateFormat3.getCalendar();
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat3.parse("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat3);
        org.junit.Assert.assertNull(calendar4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean6 = stdDateFormat0.equals((java.lang.Object) 4);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone8 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat7.withTimeZone(timeZone8);
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = stdDateFormat0.format((java.lang.Object) stdDateFormat9, stringBuffer10, fieldPosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stdDateFormat9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean5 = stdDateFormat4.isLenient();
        java.lang.Boolean boolean6 = stdDateFormat4._lenient;
        java.lang.Boolean boolean7 = stdDateFormat4._lenient;
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stdDateFormat4.parseObject("1970-01-01T00:00:00.006+0000", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stdDateFormat0.parseObject("yyyy-MM-dd", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(stdDateFormat2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = stdDateFormat0.clone();
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = stdDateFormat3.format(date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatRFC1123;
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stdDateFormat0.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean5 = stdDateFormat4.isLenient();
        java.text.DateFormat dateFormat6 = stdDateFormat4._formatPlain;
        java.lang.String str7 = stdDateFormat4.toString();
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = stdDateFormat4.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat0.parseAsISO8601("", parsePosition2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat2 = stdDateFormat1.getNumberFormat();
        java.text.DateFormat dateFormat3 = stdDateFormat1._formatISO8601_z;
        java.util.TimeZone timeZone4 = stdDateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat6 = stdDateFormat5.getNumberFormat();
        java.text.DateFormat dateFormat7 = stdDateFormat5._formatISO8601_z;
        stdDateFormat1._formatPlain = stdDateFormat5;
        java.text.DateFormat dateFormat9 = stdDateFormat1._formatRFC1123;
        java.util.TimeZone timeZone10 = null;
        stdDateFormat1._timezone = timeZone10;
        java.util.Locale locale12 = stdDateFormat1._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance((int) '#', locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat2);
        org.junit.Assert.assertNull(dateFormat3);
        org.junit.Assert.assertNull(timeZone4);
        org.junit.Assert.assertNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = stdDateFormat0.clone();
        java.text.DateFormat dateFormat4 = stdDateFormat3._formatISO8601_z;
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat3);
        org.junit.Assert.assertNull(dateFormat4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        stdDateFormat0._lenient = false;
        java.text.DateFormat dateFormat4 = stdDateFormat0._formatISO8601;
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        int int0 = java.text.DateFormat.WEEK_OF_YEAR_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        int int0 = java.text.DateFormat.DAY_OF_WEEK_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat0._formatISO8601 = dateFormat5;
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone9 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat8.withTimeZone(timeZone9);
        stdDateFormat0._formatISO8601_z = stdDateFormat8;
        stdDateFormat8.setLenient(true);
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNotNull(stdDateFormat8);
        org.junit.Assert.assertNotNull(stdDateFormat10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
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
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat3 = stdDateFormat2.getNumberFormat();
        java.text.DateFormat dateFormat4 = stdDateFormat2._formatISO8601_z;
        java.util.TimeZone timeZone5 = stdDateFormat2.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat7 = stdDateFormat6.getNumberFormat();
        java.text.DateFormat dateFormat8 = stdDateFormat6._formatISO8601_z;
        stdDateFormat2._formatPlain = stdDateFormat6;
        java.text.DateFormat dateFormat10 = stdDateFormat2._formatRFC1123;
        java.util.TimeZone timeZone11 = null;
        stdDateFormat2._timezone = timeZone11;
        java.util.Locale locale13 = stdDateFormat2._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateTimeInstance(12, (-1), locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat3);
        org.junit.Assert.assertNull(dateFormat4);
        org.junit.Assert.assertNull(timeZone5);
        org.junit.Assert.assertNull(numberFormat7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(dateFormat10);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat2 = stdDateFormat1.getNumberFormat();
        java.text.DateFormat dateFormat3 = stdDateFormat1._formatISO8601_z;
        java.util.TimeZone timeZone4 = stdDateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat6 = stdDateFormat5.getNumberFormat();
        java.text.DateFormat dateFormat7 = stdDateFormat5._formatISO8601_z;
        stdDateFormat1._formatPlain = stdDateFormat5;
        java.text.DateFormat dateFormat9 = stdDateFormat1._formatRFC1123;
        java.util.TimeZone timeZone10 = null;
        stdDateFormat1._timezone = timeZone10;
        java.util.Locale locale12 = stdDateFormat1._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance(9, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat2);
        org.junit.Assert.assertNull(dateFormat3);
        org.junit.Assert.assertNull(timeZone4);
        org.junit.Assert.assertNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.String str0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_STR_ISO8601;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyy-MM-dd'T'HH:mm:ss.SSSZ" + "'", str0, "yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean6 = stdDateFormat0.equals((java.lang.Object) 4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = stdDateFormat0.parse("yyyy-MM-dd", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat0.parse("1970-01-01T00:00:00.006+0000", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat5 = stdDateFormat4.getNumberFormat();
        java.text.DateFormat dateFormat6 = stdDateFormat4._formatISO8601_z;
        stdDateFormat0._formatPlain = stdDateFormat4;
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatRFC1123;
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = stdDateFormat0.parse("yyyy-MM-dd", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertNull(numberFormat5);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = stdDateFormat3.format((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        java.text.DateFormat dateFormat4 = stdDateFormat0._formatISO8601_z;
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stdDateFormat0.parseObject("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertNull(dateFormat4);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        stdDateFormat0._lenient = false;
        java.lang.Boolean boolean6 = stdDateFormat0._lenient;
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        java.lang.Object obj5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = stdDateFormat4.format(obj5, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone2 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = stdDateFormat1.withTimeZone(timeZone2);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone5 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = stdDateFormat4.withTimeZone(timeZone5);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat8 = stdDateFormat7.getNumberFormat();
        java.text.DateFormat dateFormat9 = stdDateFormat7._formatISO8601_z;
        java.util.TimeZone timeZone10 = stdDateFormat7.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat12 = stdDateFormat11.getNumberFormat();
        java.text.DateFormat dateFormat13 = stdDateFormat11._formatISO8601_z;
        stdDateFormat7._formatPlain = stdDateFormat11;
        java.text.DateFormat dateFormat15 = stdDateFormat7._formatRFC1123;
        java.util.TimeZone timeZone16 = null;
        stdDateFormat7._timezone = timeZone16;
        java.util.Locale locale18 = stdDateFormat7._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5, locale18, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (short) 100, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat3);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat6);
        org.junit.Assert.assertNull(numberFormat8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNull(numberFormat12);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone2 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = stdDateFormat1.withTimeZone(timeZone2);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone5 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = stdDateFormat4.withTimeZone(timeZone5);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat8 = stdDateFormat7.getNumberFormat();
        java.text.DateFormat dateFormat9 = stdDateFormat7._formatISO8601_z;
        java.util.TimeZone timeZone10 = stdDateFormat7.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat12 = stdDateFormat11.getNumberFormat();
        java.text.DateFormat dateFormat13 = stdDateFormat11._formatISO8601_z;
        stdDateFormat7._formatPlain = stdDateFormat11;
        java.text.DateFormat dateFormat15 = stdDateFormat7._formatRFC1123;
        java.util.TimeZone timeZone16 = null;
        stdDateFormat7._timezone = timeZone16;
        java.util.Locale locale18 = stdDateFormat7._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5, locale18, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale18);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone23 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = stdDateFormat22.withTimeZone(timeZone23);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat26 = stdDateFormat25.getNumberFormat();
        java.text.DateFormat dateFormat27 = stdDateFormat25._formatISO8601_z;
        java.util.TimeZone timeZone28 = stdDateFormat25.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat30 = stdDateFormat29.getNumberFormat();
        java.text.DateFormat dateFormat31 = stdDateFormat29._formatISO8601_z;
        stdDateFormat25._formatPlain = stdDateFormat29;
        java.text.DateFormat dateFormat33 = stdDateFormat25._formatRFC1123;
        java.util.TimeZone timeZone34 = null;
        stdDateFormat25._timezone = timeZone34;
        java.util.Locale locale36 = stdDateFormat25._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23, locale36, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale36);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat40 = java.text.DateFormat.getTimeInstance(5, locale36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat3);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat6);
        org.junit.Assert.assertNull(numberFormat8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNull(numberFormat12);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat24);
        org.junit.Assert.assertNull(numberFormat26);
        org.junit.Assert.assertNull(dateFormat27);
        org.junit.Assert.assertNull(timeZone28);
        org.junit.Assert.assertNull(numberFormat30);
        org.junit.Assert.assertNull(dateFormat31);
        org.junit.Assert.assertNull(dateFormat33);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean6 = stdDateFormat0.equals((java.lang.Object) 4);
        boolean boolean7 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean10 = stdDateFormat8.looksLikeISO8601("");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat12 = stdDateFormat11.getNumberFormat();
        java.text.DateFormat dateFormat13 = stdDateFormat11._formatISO8601_z;
        java.util.TimeZone timeZone14 = stdDateFormat11.getTimeZone();
        boolean boolean16 = stdDateFormat11.looksLikeISO8601("");
        stdDateFormat11._lenient = false;
        stdDateFormat8._formatISO8601 = stdDateFormat11;
        stdDateFormat0._formatRFC1123 = stdDateFormat11;
        java.lang.Class<?> wildcardClass21 = stdDateFormat11.getClass();
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(numberFormat12);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNull(timeZone14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat6 = stdDateFormat5.getNumberFormat();
        java.text.DateFormat dateFormat7 = stdDateFormat5._formatISO8601_z;
        java.util.TimeZone timeZone8 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat5.withTimeZone(timeZone8);
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat5._formatISO8601 = dateFormat10;
        java.util.Calendar calendar12 = dateFormat10.getCalendar();
        stdDateFormat0.setCalendar(calendar12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = stdDateFormat0.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(calendar12);
// flaky "1) test095(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=-734002472904,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=25,SECOND=27,MILLISECOND=96,ZONE_OFFSET=-28800000,DST_OFFSET=0]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat6 = stdDateFormat5.getNumberFormat();
        java.text.DateFormat dateFormat7 = stdDateFormat5._formatISO8601_z;
        java.util.TimeZone timeZone8 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat5.withTimeZone(timeZone8);
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat5._formatISO8601 = dateFormat10;
        java.util.Calendar calendar12 = dateFormat10.getCalendar();
        stdDateFormat0.setCalendar(calendar12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = stdDateFormat0.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"hi!\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(calendar12);
// flaky "2) test096(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=-734002472904,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=25,SECOND=27,MILLISECOND=96,ZONE_OFFSET=-28800000,DST_OFFSET=0]");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean2 = stdDateFormat0.looksLikeISO8601("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat0.parse("yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        stdDateFormat0._lenient = false;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat6 = stdDateFormat5.getNumberFormat();
        java.text.DateFormat dateFormat7 = stdDateFormat5._formatISO8601_z;
        java.util.TimeZone timeZone8 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat5.withTimeZone(timeZone8);
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat5._formatISO8601 = dateFormat10;
        java.util.Calendar calendar12 = dateFormat10.getCalendar();
        stdDateFormat0.setCalendar(calendar12);
        java.util.Date date14 = null;
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = stdDateFormat0.format(date14, stringBuffer15, fieldPosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(calendar12);
// flaky "3) test099(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        stdDateFormat0._formatISO8601 = dateFormat1;
        java.util.TimeZone timeZone4 = stdDateFormat0._timezone;
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNull(timeZone4);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stdDateFormat0.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone2 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = stdDateFormat1.withTimeZone(timeZone2);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat5 = stdDateFormat4.getNumberFormat();
        java.text.DateFormat dateFormat6 = stdDateFormat4._formatISO8601_z;
        java.util.TimeZone timeZone7 = stdDateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat9 = stdDateFormat8.getNumberFormat();
        java.text.DateFormat dateFormat10 = stdDateFormat8._formatISO8601_z;
        stdDateFormat4._formatPlain = stdDateFormat8;
        java.text.DateFormat dateFormat12 = stdDateFormat4._formatRFC1123;
        java.util.TimeZone timeZone13 = null;
        stdDateFormat4._timezone = timeZone13;
        java.util.Locale locale15 = stdDateFormat4._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale15, (java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance((-1), locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat3);
        org.junit.Assert.assertNull(numberFormat5);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(timeZone7);
        org.junit.Assert.assertNull(numberFormat9);
        org.junit.Assert.assertNull(dateFormat10);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.lang.String str2 = stdDateFormat0.format((java.lang.Object) 6);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat0._formatPlain = dateFormat3;
        boolean boolean5 = stdDateFormat0.isLenient();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01T00:00:00.006+0000" + "'", str2, "1970-01-01T00:00:00.006+0000");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean5 = stdDateFormat4.isLenient();
        java.lang.Boolean boolean6 = stdDateFormat4._lenient;
        java.util.Date date7 = null;
        java.lang.StringBuffer stringBuffer8 = null;
        java.text.FieldPosition fieldPosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = stdDateFormat4.format(date7, stringBuffer8, fieldPosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean5 = stdDateFormat4.isLenient();
        java.lang.Boolean boolean6 = stdDateFormat4._lenient;
        java.lang.Boolean boolean7 = stdDateFormat4._lenient;
        java.text.DateFormat dateFormat8 = stdDateFormat4._formatISO8601_z;
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(dateFormat8);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat6 = stdDateFormat5.getNumberFormat();
        java.text.DateFormat dateFormat7 = stdDateFormat5._formatISO8601_z;
        java.util.TimeZone timeZone8 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat5.withTimeZone(timeZone8);
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat5._formatISO8601 = dateFormat10;
        java.util.Calendar calendar12 = dateFormat10.getCalendar();
        stdDateFormat0.setCalendar(calendar12);
        boolean boolean14 = stdDateFormat0.isLenient();
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(calendar12);
// flaky "4) test108(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = stdDateFormat0.clone();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat0.parseAsRFC1123("1970-01-01T00:00:00.006+0000", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat3);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean2 = stdDateFormat0.looksLikeISO8601("");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat4 = stdDateFormat3.getNumberFormat();
        java.text.DateFormat dateFormat5 = stdDateFormat3._formatISO8601_z;
        java.util.TimeZone timeZone6 = stdDateFormat3.getTimeZone();
        boolean boolean8 = stdDateFormat3.looksLikeISO8601("");
        stdDateFormat3._lenient = false;
        stdDateFormat0._formatISO8601 = stdDateFormat3;
        java.text.DateFormat dateFormat12 = stdDateFormat3._formatISO8601_z;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat5);
        org.junit.Assert.assertNull(timeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat12);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        stdDateFormat0._formatISO8601 = dateFormat1;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone5 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = stdDateFormat4.withTimeZone(timeZone5);
        stdDateFormat0._formatISO8601_z = stdDateFormat4;
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatPlain;
        stdDateFormat0._lenient = true;
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNotNull(stdDateFormat6);
        org.junit.Assert.assertNull(dateFormat8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        boolean boolean5 = stdDateFormat0.looksLikeISO8601("");
        stdDateFormat0._lenient = false;
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = stdDateFormat0.parseAsRFC1123("1970-01-01T00:00:00.006+0000", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parseAsRFC1123("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        boolean boolean5 = stdDateFormat0.looksLikeISO8601("");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean8 = stdDateFormat6.looksLikeISO8601("");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat10 = stdDateFormat9.getNumberFormat();
        java.text.DateFormat dateFormat11 = stdDateFormat9._formatISO8601_z;
        java.util.TimeZone timeZone12 = stdDateFormat9.getTimeZone();
        boolean boolean14 = stdDateFormat9.looksLikeISO8601("");
        stdDateFormat9._lenient = false;
        stdDateFormat6._formatISO8601 = stdDateFormat9;
        stdDateFormat0._formatPlain = stdDateFormat6;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat20 = stdDateFormat19.getNumberFormat();
        java.text.DateFormat dateFormat21 = stdDateFormat19._formatRFC1123;
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        java.util.Calendar calendar24 = dateFormat22.getCalendar();
        stdDateFormat19._formatPlain = dateFormat22;
        stdDateFormat6._formatISO8601_z = dateFormat22;
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(numberFormat10);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(numberFormat20);
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(numberFormat23);
        org.junit.Assert.assertNotNull(calendar24);
// flaky "5) test117(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone2 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = stdDateFormat1.withTimeZone(timeZone2);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat5 = stdDateFormat4.getNumberFormat();
        java.text.DateFormat dateFormat6 = stdDateFormat4._formatISO8601_z;
        java.util.TimeZone timeZone7 = stdDateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat9 = stdDateFormat8.getNumberFormat();
        java.text.DateFormat dateFormat10 = stdDateFormat8._formatISO8601_z;
        stdDateFormat4._formatPlain = stdDateFormat8;
        java.text.DateFormat dateFormat12 = stdDateFormat4._formatRFC1123;
        java.util.TimeZone timeZone13 = null;
        stdDateFormat4._timezone = timeZone13;
        java.util.Locale locale15 = stdDateFormat4._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale15, (java.lang.Boolean) false);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) 'a', locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat3);
        org.junit.Assert.assertNull(numberFormat5);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(timeZone7);
        org.junit.Assert.assertNull(numberFormat9);
        org.junit.Assert.assertNull(dateFormat10);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        boolean boolean5 = stdDateFormat0.looksLikeISO8601("");
        stdDateFormat0._lenient = false;
        java.lang.Boolean boolean8 = stdDateFormat0._lenient;
        java.util.TimeZone timeZone9 = stdDateFormat0._timezone;
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(timeZone9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) 100, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        java.util.Calendar calendar3 = null;
        stdDateFormat2.setCalendar(calendar3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        stdDateFormat2._formatPlain = dateFormat5;
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = stdDateFormat2.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertNotNull(dateFormat5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat5 = stdDateFormat4.getNumberFormat();
        java.text.DateFormat dateFormat6 = stdDateFormat4._formatISO8601_z;
        java.util.TimeZone timeZone7 = stdDateFormat4.getTimeZone();
        java.util.Calendar calendar8 = stdDateFormat4.getCalendar();
        stdDateFormat0._formatRFC1123 = stdDateFormat4;
        java.util.Date date10 = null;
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = stdDateFormat4.format(date10, stringBuffer11, fieldPosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertNull(numberFormat5);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(timeZone7);
        org.junit.Assert.assertNull(calendar8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat2 = stdDateFormat1.getNumberFormat();
        java.text.DateFormat dateFormat3 = stdDateFormat1._formatISO8601_z;
        java.util.TimeZone timeZone4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat1.withTimeZone(timeZone4);
        boolean boolean7 = stdDateFormat1.equals((java.lang.Object) 4);
        boolean boolean8 = stdDateFormat1.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone10 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = stdDateFormat9.withTimeZone(timeZone10);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat12.withTimeZone(timeZone13);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat16 = stdDateFormat15.getNumberFormat();
        java.text.DateFormat dateFormat17 = stdDateFormat15._formatISO8601_z;
        java.util.TimeZone timeZone18 = stdDateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat20 = stdDateFormat19.getNumberFormat();
        java.text.DateFormat dateFormat21 = stdDateFormat19._formatISO8601_z;
        stdDateFormat15._formatPlain = stdDateFormat19;
        java.text.DateFormat dateFormat23 = stdDateFormat15._formatRFC1123;
        java.util.TimeZone timeZone24 = null;
        stdDateFormat15._timezone = timeZone24;
        java.util.Locale locale26 = stdDateFormat15._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone13, locale26, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10, locale26);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone31 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = stdDateFormat30.withTimeZone(timeZone31);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat34 = stdDateFormat33.getNumberFormat();
        java.text.DateFormat dateFormat35 = stdDateFormat33._formatISO8601_z;
        java.util.TimeZone timeZone36 = stdDateFormat33.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat38 = stdDateFormat37.getNumberFormat();
        java.text.DateFormat dateFormat39 = stdDateFormat37._formatISO8601_z;
        stdDateFormat33._formatPlain = stdDateFormat37;
        java.text.DateFormat dateFormat41 = stdDateFormat33._formatRFC1123;
        java.util.TimeZone timeZone42 = null;
        stdDateFormat33._timezone = timeZone42;
        java.util.Locale locale44 = stdDateFormat33._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone31, locale44, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat47 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10, locale44);
        stdDateFormat1._timezone = timeZone10;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat49 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone50 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat51 = stdDateFormat49.withTimeZone(timeZone50);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat52 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone53 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat54 = stdDateFormat52.withTimeZone(timeZone53);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat55 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat56 = stdDateFormat55.getNumberFormat();
        java.text.DateFormat dateFormat57 = stdDateFormat55._formatISO8601_z;
        java.util.TimeZone timeZone58 = stdDateFormat55.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat59 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat60 = stdDateFormat59.getNumberFormat();
        java.text.DateFormat dateFormat61 = stdDateFormat59._formatISO8601_z;
        stdDateFormat55._formatPlain = stdDateFormat59;
        java.text.DateFormat dateFormat63 = stdDateFormat55._formatRFC1123;
        java.util.TimeZone timeZone64 = null;
        stdDateFormat55._timezone = timeZone64;
        java.util.Locale locale66 = stdDateFormat55._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat68 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone53, locale66, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat69 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone50, locale66);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat70 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone71 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat72 = stdDateFormat70.withTimeZone(timeZone71);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat73 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat74 = stdDateFormat73.getNumberFormat();
        java.text.DateFormat dateFormat75 = stdDateFormat73._formatISO8601_z;
        java.util.TimeZone timeZone76 = stdDateFormat73.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat77 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat78 = stdDateFormat77.getNumberFormat();
        java.text.DateFormat dateFormat79 = stdDateFormat77._formatISO8601_z;
        stdDateFormat73._formatPlain = stdDateFormat77;
        java.text.DateFormat dateFormat81 = stdDateFormat73._formatRFC1123;
        java.util.TimeZone timeZone82 = null;
        stdDateFormat73._timezone = timeZone82;
        java.util.Locale locale84 = stdDateFormat73._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat86 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone71, locale84, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat87 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone50, locale84);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat89 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10, locale84, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat90 = java.text.DateFormat.getTimeInstance(6, locale84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat2);
        org.junit.Assert.assertNull(dateFormat3);
        org.junit.Assert.assertNotNull(stdDateFormat5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat11);
        org.junit.Assert.assertNotNull(stdDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNull(numberFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(timeZone18);
        org.junit.Assert.assertNull(numberFormat20);
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat32);
        org.junit.Assert.assertNull(numberFormat34);
        org.junit.Assert.assertNull(dateFormat35);
        org.junit.Assert.assertNull(timeZone36);
        org.junit.Assert.assertNull(numberFormat38);
        org.junit.Assert.assertNull(dateFormat39);
        org.junit.Assert.assertNull(dateFormat41);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat49);
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat51);
        org.junit.Assert.assertNotNull(stdDateFormat52);
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat54);
        org.junit.Assert.assertNull(numberFormat56);
        org.junit.Assert.assertNull(dateFormat57);
        org.junit.Assert.assertNull(timeZone58);
        org.junit.Assert.assertNull(numberFormat60);
        org.junit.Assert.assertNull(dateFormat61);
        org.junit.Assert.assertNull(dateFormat63);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat70);
        org.junit.Assert.assertNotNull(timeZone71);
        org.junit.Assert.assertEquals(timeZone71.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat72);
        org.junit.Assert.assertNull(numberFormat74);
        org.junit.Assert.assertNull(dateFormat75);
        org.junit.Assert.assertNull(timeZone76);
        org.junit.Assert.assertNull(numberFormat78);
        org.junit.Assert.assertNull(dateFormat79);
        org.junit.Assert.assertNull(dateFormat81);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "en_US");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = stdDateFormat2._formatISO8601;
        org.junit.Assert.assertNull(dateFormat3);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean5 = stdDateFormat4.isLenient();
        java.text.DateFormat dateFormat6 = stdDateFormat4._formatPlain;
        java.lang.String str7 = stdDateFormat4.toString();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        stdDateFormat8._formatISO8601_z = stdDateFormat9;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = stdDateFormat4.format((java.lang.Object) stdDateFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(stdDateFormat8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat3 = stdDateFormat2.getNumberFormat();
        java.text.DateFormat dateFormat4 = stdDateFormat2._formatISO8601_z;
        java.util.TimeZone timeZone5 = stdDateFormat2.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat7 = stdDateFormat6.getNumberFormat();
        java.text.DateFormat dateFormat8 = stdDateFormat6._formatISO8601_z;
        stdDateFormat2._formatPlain = stdDateFormat6;
        java.text.DateFormat dateFormat10 = stdDateFormat2._formatRFC1123;
        java.util.TimeZone timeZone11 = null;
        stdDateFormat2._timezone = timeZone11;
        java.util.Locale locale13 = stdDateFormat2._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateTimeInstance(9, 8, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat3);
        org.junit.Assert.assertNull(dateFormat4);
        org.junit.Assert.assertNull(timeZone5);
        org.junit.Assert.assertNull(numberFormat7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(dateFormat10);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.util.TimeZone timeZone0 = null;
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
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat0._formatISO8601 = dateFormat5;
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601_z;
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601_z;
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat2 = stdDateFormat1.getNumberFormat();
        java.text.DateFormat dateFormat3 = stdDateFormat1._formatISO8601_z;
        java.util.TimeZone timeZone4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat1.withTimeZone(timeZone4);
        boolean boolean6 = stdDateFormat5.isLenient();
        java.text.DateFormat dateFormat7 = stdDateFormat5._formatPlain;
        java.lang.String str8 = stdDateFormat5.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = dateFormat0.formatToCharacterIterator((java.lang.Object) stdDateFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNull(numberFormat2);
        org.junit.Assert.assertNull(dateFormat3);
        org.junit.Assert.assertNotNull(stdDateFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)" + "'", str8, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone2 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = stdDateFormat1.withTimeZone(timeZone2);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone5 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = stdDateFormat4.withTimeZone(timeZone5);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat8 = stdDateFormat7.getNumberFormat();
        java.text.DateFormat dateFormat9 = stdDateFormat7._formatISO8601_z;
        java.util.TimeZone timeZone10 = stdDateFormat7.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat12 = stdDateFormat11.getNumberFormat();
        java.text.DateFormat dateFormat13 = stdDateFormat11._formatISO8601_z;
        stdDateFormat7._formatPlain = stdDateFormat11;
        java.text.DateFormat dateFormat15 = stdDateFormat7._formatRFC1123;
        java.util.TimeZone timeZone16 = null;
        stdDateFormat7._timezone = timeZone16;
        java.util.Locale locale18 = stdDateFormat7._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5, locale18, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance(11, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat3);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat6);
        org.junit.Assert.assertNull(numberFormat8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNull(numberFormat12);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        java.lang.String str4 = stdDateFormat0.format((java.lang.Object) 10L);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat6 = stdDateFormat5.getNumberFormat();
        java.text.DateFormat dateFormat7 = stdDateFormat5._formatISO8601_z;
        java.util.TimeZone timeZone8 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat5.withTimeZone(timeZone8);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat11 = stdDateFormat10.getNumberFormat();
        java.text.DateFormat dateFormat12 = stdDateFormat10._formatISO8601_z;
        java.util.TimeZone timeZone13 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat10.withTimeZone(timeZone13);
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat10._formatISO8601 = dateFormat15;
        java.util.Calendar calendar17 = dateFormat15.getCalendar();
        stdDateFormat5.setCalendar(calendar17);
        stdDateFormat0.setCalendar(calendar17);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        stdDateFormat20._formatISO8601 = dateFormat21;
        stdDateFormat0._formatRFC1123 = dateFormat21;
        java.text.ParsePosition parsePosition26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = stdDateFormat0.parseAsRFC1123("1970-01-01T00:00:00.010+0000", parsePosition26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.010+0000" + "'", str4, "1970-01-01T00:00:00.010+0000");
        org.junit.Assert.assertNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNull(numberFormat11);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "6) test131(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        java.lang.String str4 = stdDateFormat0.format((java.lang.Object) 10L);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat6 = stdDateFormat5.getNumberFormat();
        java.text.DateFormat dateFormat7 = stdDateFormat5._formatISO8601_z;
        java.util.TimeZone timeZone8 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat5.withTimeZone(timeZone8);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat11 = stdDateFormat10.getNumberFormat();
        java.text.DateFormat dateFormat12 = stdDateFormat10._formatISO8601_z;
        java.util.TimeZone timeZone13 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat10.withTimeZone(timeZone13);
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat10._formatISO8601 = dateFormat15;
        java.util.Calendar calendar17 = dateFormat15.getCalendar();
        stdDateFormat5.setCalendar(calendar17);
        stdDateFormat0.setCalendar(calendar17);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = stdDateFormat0.clone();
        java.util.TimeZone timeZone21 = stdDateFormat0.getTimeZone();
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.010+0000" + "'", str4, "1970-01-01T00:00:00.010+0000");
        org.junit.Assert.assertNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNull(numberFormat11);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "7) test132(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(stdDateFormat20);
        org.junit.Assert.assertNull(timeZone21);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat6 = stdDateFormat5.getNumberFormat();
        java.text.DateFormat dateFormat7 = stdDateFormat5._formatISO8601_z;
        java.util.TimeZone timeZone8 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat5.withTimeZone(timeZone8);
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat5._formatISO8601 = dateFormat10;
        java.util.Calendar calendar12 = dateFormat10.getCalendar();
        stdDateFormat0.setCalendar(calendar12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone15 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat14.withTimeZone(timeZone15);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = stdDateFormat17.withTimeZone(timeZone18);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone21 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = stdDateFormat20.withTimeZone(timeZone21);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat24 = stdDateFormat23.getNumberFormat();
        java.text.DateFormat dateFormat25 = stdDateFormat23._formatISO8601_z;
        java.util.TimeZone timeZone26 = stdDateFormat23.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat28 = stdDateFormat27.getNumberFormat();
        java.text.DateFormat dateFormat29 = stdDateFormat27._formatISO8601_z;
        stdDateFormat23._formatPlain = stdDateFormat27;
        java.text.DateFormat dateFormat31 = stdDateFormat23._formatRFC1123;
        java.util.TimeZone timeZone32 = null;
        stdDateFormat23._timezone = timeZone32;
        java.util.Locale locale34 = stdDateFormat23._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21, locale34, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18, locale34);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = stdDateFormat16.withTimeZone(timeZone18);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = stdDateFormat0.withTimeZone(timeZone18);
        java.lang.Class<?> wildcardClass40 = stdDateFormat0.getClass();
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(calendar12);
// flaky "8) test133(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNotNull(stdDateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat19);
        org.junit.Assert.assertNotNull(stdDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat22);
        org.junit.Assert.assertNull(numberFormat24);
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertNull(timeZone26);
        org.junit.Assert.assertNull(numberFormat28);
        org.junit.Assert.assertNull(dateFormat29);
        org.junit.Assert.assertNull(dateFormat31);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat38);
        org.junit.Assert.assertNotNull(stdDateFormat39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone4 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat3.withTimeZone(timeZone4);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = stdDateFormat6.withTimeZone(timeZone7);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat10 = stdDateFormat9.getNumberFormat();
        java.text.DateFormat dateFormat11 = stdDateFormat9._formatISO8601_z;
        java.util.TimeZone timeZone12 = stdDateFormat9.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat14 = stdDateFormat13.getNumberFormat();
        java.text.DateFormat dateFormat15 = stdDateFormat13._formatISO8601_z;
        stdDateFormat9._formatPlain = stdDateFormat13;
        java.text.DateFormat dateFormat17 = stdDateFormat9._formatRFC1123;
        java.util.TimeZone timeZone18 = null;
        stdDateFormat9._timezone = timeZone18;
        java.util.Locale locale20 = stdDateFormat9._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone7, locale20, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4, locale20);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = stdDateFormat2.withTimeZone(timeZone4);
        java.text.ParsePosition parsePosition26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = stdDateFormat24.parseAsRFC1123("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)", parsePosition26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat5);
        org.junit.Assert.assertNotNull(stdDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat8);
        org.junit.Assert.assertNull(numberFormat10);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNull(numberFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat24);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = stdDateFormat0.clone();
        stdDateFormat3._clearFormats();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat6 = stdDateFormat5.getNumberFormat();
        java.text.DateFormat dateFormat7 = stdDateFormat5._formatISO8601_z;
        java.util.TimeZone timeZone8 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat5.withTimeZone(timeZone8);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat11 = stdDateFormat10.getNumberFormat();
        java.text.DateFormat dateFormat12 = stdDateFormat10._formatISO8601_z;
        java.util.TimeZone timeZone13 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat10.withTimeZone(timeZone13);
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat10._formatISO8601 = dateFormat15;
        java.util.Calendar calendar17 = dateFormat15.getCalendar();
        stdDateFormat5.setCalendar(calendar17);
        stdDateFormat3.setCalendar(calendar17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = stdDateFormat3.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat3);
        org.junit.Assert.assertNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNull(numberFormat11);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "9) test135(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.text.AttributedCharacterIterator attributedCharacterIterator3 = dateFormat1.formatToCharacterIterator((java.lang.Object) (short) 100);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(attributedCharacterIterator3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        boolean boolean3 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat4 = stdDateFormat0._formatPlain;
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(dateFormat4);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat5 = stdDateFormat4.getNumberFormat();
        java.text.DateFormat dateFormat6 = stdDateFormat4._formatISO8601_z;
        stdDateFormat0._formatPlain = stdDateFormat4;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone9 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat8.withTimeZone(timeZone9);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = stdDateFormat11.withTimeZone(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone15 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat14.withTimeZone(timeZone15);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat18 = stdDateFormat17.getNumberFormat();
        java.text.DateFormat dateFormat19 = stdDateFormat17._formatISO8601_z;
        java.util.TimeZone timeZone20 = stdDateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat22 = stdDateFormat21.getNumberFormat();
        java.text.DateFormat dateFormat23 = stdDateFormat21._formatISO8601_z;
        stdDateFormat17._formatPlain = stdDateFormat21;
        java.text.DateFormat dateFormat25 = stdDateFormat17._formatRFC1123;
        java.util.TimeZone timeZone26 = null;
        stdDateFormat17._timezone = timeZone26;
        java.util.Locale locale28 = stdDateFormat17._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15, locale28, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale28);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = stdDateFormat10.withTimeZone(timeZone12);
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean34 = stdDateFormat10.equals((java.lang.Object) dateFormat33);
        stdDateFormat0._formatISO8601_z = stdDateFormat10;
        stdDateFormat10._clearFormats();
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertNull(numberFormat5);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNotNull(stdDateFormat8);
        org.junit.Assert.assertNotNull(stdDateFormat10);
        org.junit.Assert.assertNotNull(stdDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat13);
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNull(numberFormat18);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNull(timeZone20);
        org.junit.Assert.assertNull(numberFormat22);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat32);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat4 = stdDateFormat3.getNumberFormat();
        java.text.DateFormat dateFormat5 = stdDateFormat3._formatISO8601_z;
        java.util.TimeZone timeZone6 = stdDateFormat3.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat8 = stdDateFormat7.getNumberFormat();
        java.text.DateFormat dateFormat9 = stdDateFormat7._formatISO8601_z;
        stdDateFormat3._formatPlain = stdDateFormat7;
        java.text.DateFormat dateFormat11 = stdDateFormat3._formatRFC1123;
        java.util.TimeZone timeZone12 = null;
        stdDateFormat3._timezone = timeZone12;
        java.util.Locale locale14 = stdDateFormat3._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale14, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone18 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = stdDateFormat17.withTimeZone(timeZone18);
        java.lang.String str21 = stdDateFormat17.format((java.lang.Object) 10L);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat23 = stdDateFormat22.getNumberFormat();
        java.text.DateFormat dateFormat24 = stdDateFormat22._formatISO8601_z;
        java.util.TimeZone timeZone25 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = stdDateFormat22.withTimeZone(timeZone25);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat28 = stdDateFormat27.getNumberFormat();
        java.text.DateFormat dateFormat29 = stdDateFormat27._formatISO8601_z;
        java.util.TimeZone timeZone30 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = stdDateFormat27.withTimeZone(timeZone30);
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat27._formatISO8601 = dateFormat32;
        java.util.Calendar calendar34 = dateFormat32.getCalendar();
        stdDateFormat22.setCalendar(calendar34);
        stdDateFormat17.setCalendar(calendar34);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat39 = dateFormat38.getNumberFormat();
        stdDateFormat37._formatISO8601 = dateFormat38;
        stdDateFormat17._formatRFC1123 = dateFormat38;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = stdDateFormat16.format((java.lang.Object) stdDateFormat17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat5);
        org.junit.Assert.assertNull(timeZone6);
        org.junit.Assert.assertNull(numberFormat8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat17);
        org.junit.Assert.assertNotNull(stdDateFormat19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01T00:00:00.010+0000" + "'", str21, "1970-01-01T00:00:00.010+0000");
        org.junit.Assert.assertNull(numberFormat23);
        org.junit.Assert.assertNull(dateFormat24);
        org.junit.Assert.assertNotNull(stdDateFormat26);
        org.junit.Assert.assertNull(numberFormat28);
        org.junit.Assert.assertNull(dateFormat29);
        org.junit.Assert.assertNotNull(stdDateFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(calendar34);
// flaky "10) test139(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar34.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat38);
        org.junit.Assert.assertNotNull(numberFormat39);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        stdDateFormat0._lenient = false;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat8 = stdDateFormat7.getNumberFormat();
        java.text.DateFormat dateFormat9 = stdDateFormat7._formatISO8601_z;
        java.util.TimeZone timeZone10 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = stdDateFormat7.withTimeZone(timeZone10);
        stdDateFormat0._formatPlain = stdDateFormat11;
        java.text.DateFormat dateFormat13 = null;
        stdDateFormat11._formatRFC1123 = dateFormat13;
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNull(numberFormat8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNotNull(stdDateFormat11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(11, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        java.lang.String str4 = stdDateFormat0.format((java.lang.Object) 10L);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat6 = stdDateFormat5.getNumberFormat();
        java.text.DateFormat dateFormat7 = stdDateFormat5._formatISO8601_z;
        java.util.TimeZone timeZone8 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat5.withTimeZone(timeZone8);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat11 = stdDateFormat10.getNumberFormat();
        java.text.DateFormat dateFormat12 = stdDateFormat10._formatISO8601_z;
        java.util.TimeZone timeZone13 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat10.withTimeZone(timeZone13);
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat10._formatISO8601 = dateFormat15;
        java.util.Calendar calendar17 = dateFormat15.getCalendar();
        stdDateFormat5.setCalendar(calendar17);
        stdDateFormat0.setCalendar(calendar17);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = stdDateFormat0.clone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat22 = stdDateFormat21.getNumberFormat();
        java.text.DateFormat dateFormat23 = stdDateFormat21._formatISO8601_z;
        java.util.TimeZone timeZone24 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = stdDateFormat21.withTimeZone(timeZone24);
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat21._formatISO8601 = dateFormat26;
        java.text.DateFormat dateFormat28 = stdDateFormat21._formatISO8601_z;
        stdDateFormat20._formatISO8601 = stdDateFormat21;
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.010+0000" + "'", str4, "1970-01-01T00:00:00.010+0000");
        org.junit.Assert.assertNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNull(numberFormat11);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "11) test142(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(stdDateFormat20);
        org.junit.Assert.assertNull(numberFormat22);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertNotNull(stdDateFormat25);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNull(dateFormat28);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean2 = stdDateFormat0.looksLikeISO8601("");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat4 = stdDateFormat3.getNumberFormat();
        java.text.DateFormat dateFormat5 = stdDateFormat3._formatISO8601_z;
        java.util.TimeZone timeZone6 = stdDateFormat3.getTimeZone();
        boolean boolean8 = stdDateFormat3.looksLikeISO8601("");
        stdDateFormat3._lenient = false;
        stdDateFormat0._formatISO8601 = stdDateFormat3;
        boolean boolean12 = stdDateFormat0.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = stdDateFormat0.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat5);
        org.junit.Assert.assertNull(timeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        stdDateFormat0._lenient = false;
        boolean boolean5 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        boolean boolean5 = stdDateFormat0.looksLikeISO8601("");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean8 = stdDateFormat6.looksLikeISO8601("");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat10 = stdDateFormat9.getNumberFormat();
        java.text.DateFormat dateFormat11 = stdDateFormat9._formatISO8601_z;
        java.util.TimeZone timeZone12 = stdDateFormat9.getTimeZone();
        boolean boolean14 = stdDateFormat9.looksLikeISO8601("");
        stdDateFormat9._lenient = false;
        stdDateFormat6._formatISO8601 = stdDateFormat9;
        stdDateFormat0._formatPlain = stdDateFormat6;
        java.util.Date date19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = stdDateFormat6.format(date19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(numberFormat10);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        java.text.DateFormat dateFormat3 = stdDateFormat0._formatISO8601;
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(stdDateFormat2);
// flaky "12) test146(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertNull(dateFormat3);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        java.lang.String str4 = stdDateFormat0.format((java.lang.Object) 10L);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat6 = stdDateFormat5.getNumberFormat();
        java.text.DateFormat dateFormat7 = stdDateFormat5._formatISO8601_z;
        java.util.TimeZone timeZone8 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat5.withTimeZone(timeZone8);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat11 = stdDateFormat10.getNumberFormat();
        java.text.DateFormat dateFormat12 = stdDateFormat10._formatISO8601_z;
        java.util.TimeZone timeZone13 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat10.withTimeZone(timeZone13);
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat10._formatISO8601 = dateFormat15;
        java.util.Calendar calendar17 = dateFormat15.getCalendar();
        stdDateFormat5.setCalendar(calendar17);
        stdDateFormat0.setCalendar(calendar17);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        stdDateFormat20._formatISO8601 = dateFormat21;
        stdDateFormat0._formatRFC1123 = dateFormat21;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone26 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = stdDateFormat25.withTimeZone(timeZone26);
        stdDateFormat0.setTimeZone(timeZone26);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone30 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = stdDateFormat29.withTimeZone(timeZone30);
        java.text.DateFormat dateFormat32 = stdDateFormat29._formatPlain;
        java.util.Locale locale33 = stdDateFormat29._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone26, locale33, (java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.010+0000" + "'", str4, "1970-01-01T00:00:00.010+0000");
        org.junit.Assert.assertNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNull(numberFormat11);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "13) test147(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNotNull(stdDateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat27);
        org.junit.Assert.assertNotNull(stdDateFormat31);
        org.junit.Assert.assertNull(dateFormat32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean6 = stdDateFormat0.equals((java.lang.Object) 4);
        boolean boolean7 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat8.withTimeZone(timeZone9);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = stdDateFormat11.withTimeZone(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat15 = stdDateFormat14.getNumberFormat();
        java.text.DateFormat dateFormat16 = stdDateFormat14._formatISO8601_z;
        java.util.TimeZone timeZone17 = stdDateFormat14.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat19 = stdDateFormat18.getNumberFormat();
        java.text.DateFormat dateFormat20 = stdDateFormat18._formatISO8601_z;
        stdDateFormat14._formatPlain = stdDateFormat18;
        java.text.DateFormat dateFormat22 = stdDateFormat14._formatRFC1123;
        java.util.TimeZone timeZone23 = null;
        stdDateFormat14._timezone = timeZone23;
        java.util.Locale locale25 = stdDateFormat14._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale25, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9, locale25);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone30 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = stdDateFormat29.withTimeZone(timeZone30);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat33 = stdDateFormat32.getNumberFormat();
        java.text.DateFormat dateFormat34 = stdDateFormat32._formatISO8601_z;
        java.util.TimeZone timeZone35 = stdDateFormat32.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat37 = stdDateFormat36.getNumberFormat();
        java.text.DateFormat dateFormat38 = stdDateFormat36._formatISO8601_z;
        stdDateFormat32._formatPlain = stdDateFormat36;
        java.text.DateFormat dateFormat40 = stdDateFormat32._formatRFC1123;
        java.util.TimeZone timeZone41 = null;
        stdDateFormat32._timezone = timeZone41;
        java.util.Locale locale43 = stdDateFormat32._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat45 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone30, locale43, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9, locale43);
        stdDateFormat0._timezone = timeZone9;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat48 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone49 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat50 = stdDateFormat48.withTimeZone(timeZone49);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat51 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone52 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat53 = stdDateFormat51.withTimeZone(timeZone52);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat54 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat55 = stdDateFormat54.getNumberFormat();
        java.text.DateFormat dateFormat56 = stdDateFormat54._formatISO8601_z;
        java.util.TimeZone timeZone57 = stdDateFormat54.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat58 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat59 = stdDateFormat58.getNumberFormat();
        java.text.DateFormat dateFormat60 = stdDateFormat58._formatISO8601_z;
        stdDateFormat54._formatPlain = stdDateFormat58;
        java.text.DateFormat dateFormat62 = stdDateFormat54._formatRFC1123;
        java.util.TimeZone timeZone63 = null;
        stdDateFormat54._timezone = timeZone63;
        java.util.Locale locale65 = stdDateFormat54._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat67 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone52, locale65, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat68 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone49, locale65);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat69 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone70 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat71 = stdDateFormat69.withTimeZone(timeZone70);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat72 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat73 = stdDateFormat72.getNumberFormat();
        java.text.DateFormat dateFormat74 = stdDateFormat72._formatISO8601_z;
        java.util.TimeZone timeZone75 = stdDateFormat72.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat76 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat77 = stdDateFormat76.getNumberFormat();
        java.text.DateFormat dateFormat78 = stdDateFormat76._formatISO8601_z;
        stdDateFormat72._formatPlain = stdDateFormat76;
        java.text.DateFormat dateFormat80 = stdDateFormat72._formatRFC1123;
        java.util.TimeZone timeZone81 = null;
        stdDateFormat72._timezone = timeZone81;
        java.util.Locale locale83 = stdDateFormat72._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat85 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone70, locale83, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat86 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone49, locale83);
        stdDateFormat0._timezone = timeZone49;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat88 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone89 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat90 = stdDateFormat88.withTimeZone(timeZone89);
        java.util.Locale locale91 = stdDateFormat88._locale;
        java.text.DateFormat dateFormat92 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone49, locale91);
        java.text.DateFormat dateFormat93 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone49);
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stdDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat10);
        org.junit.Assert.assertNotNull(stdDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat13);
        org.junit.Assert.assertNull(numberFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(timeZone17);
        org.junit.Assert.assertNull(numberFormat19);
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat31);
        org.junit.Assert.assertNull(numberFormat33);
        org.junit.Assert.assertNull(dateFormat34);
        org.junit.Assert.assertNull(timeZone35);
        org.junit.Assert.assertNull(numberFormat37);
        org.junit.Assert.assertNull(dateFormat38);
        org.junit.Assert.assertNull(dateFormat40);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat48);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat50);
        org.junit.Assert.assertNotNull(stdDateFormat51);
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat53);
        org.junit.Assert.assertNull(numberFormat55);
        org.junit.Assert.assertNull(dateFormat56);
        org.junit.Assert.assertNull(timeZone57);
        org.junit.Assert.assertNull(numberFormat59);
        org.junit.Assert.assertNull(dateFormat60);
        org.junit.Assert.assertNull(dateFormat62);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat69);
        org.junit.Assert.assertNotNull(timeZone70);
        org.junit.Assert.assertEquals(timeZone70.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat71);
        org.junit.Assert.assertNull(numberFormat73);
        org.junit.Assert.assertNull(dateFormat74);
        org.junit.Assert.assertNull(timeZone75);
        org.junit.Assert.assertNull(numberFormat77);
        org.junit.Assert.assertNull(dateFormat78);
        org.junit.Assert.assertNull(dateFormat80);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat88);
        org.junit.Assert.assertNotNull(timeZone89);
        org.junit.Assert.assertEquals(timeZone89.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat90);
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat92);
        org.junit.Assert.assertNotNull(dateFormat93);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean6 = stdDateFormat0.equals((java.lang.Object) 4);
        boolean boolean7 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat8.withTimeZone(timeZone9);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = stdDateFormat11.withTimeZone(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat15 = stdDateFormat14.getNumberFormat();
        java.text.DateFormat dateFormat16 = stdDateFormat14._formatISO8601_z;
        java.util.TimeZone timeZone17 = stdDateFormat14.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat19 = stdDateFormat18.getNumberFormat();
        java.text.DateFormat dateFormat20 = stdDateFormat18._formatISO8601_z;
        stdDateFormat14._formatPlain = stdDateFormat18;
        java.text.DateFormat dateFormat22 = stdDateFormat14._formatRFC1123;
        java.util.TimeZone timeZone23 = null;
        stdDateFormat14._timezone = timeZone23;
        java.util.Locale locale25 = stdDateFormat14._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale25, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9, locale25);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone30 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = stdDateFormat29.withTimeZone(timeZone30);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat33 = stdDateFormat32.getNumberFormat();
        java.text.DateFormat dateFormat34 = stdDateFormat32._formatISO8601_z;
        java.util.TimeZone timeZone35 = stdDateFormat32.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat37 = stdDateFormat36.getNumberFormat();
        java.text.DateFormat dateFormat38 = stdDateFormat36._formatISO8601_z;
        stdDateFormat32._formatPlain = stdDateFormat36;
        java.text.DateFormat dateFormat40 = stdDateFormat32._formatRFC1123;
        java.util.TimeZone timeZone41 = null;
        stdDateFormat32._timezone = timeZone41;
        java.util.Locale locale43 = stdDateFormat32._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat45 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone30, locale43, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9, locale43);
        stdDateFormat0._timezone = timeZone9;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat48 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone49 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat50 = stdDateFormat48.withTimeZone(timeZone49);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat51 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone52 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat53 = stdDateFormat51.withTimeZone(timeZone52);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat54 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat55 = stdDateFormat54.getNumberFormat();
        java.text.DateFormat dateFormat56 = stdDateFormat54._formatISO8601_z;
        java.util.TimeZone timeZone57 = stdDateFormat54.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat58 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat59 = stdDateFormat58.getNumberFormat();
        java.text.DateFormat dateFormat60 = stdDateFormat58._formatISO8601_z;
        stdDateFormat54._formatPlain = stdDateFormat58;
        java.text.DateFormat dateFormat62 = stdDateFormat54._formatRFC1123;
        java.util.TimeZone timeZone63 = null;
        stdDateFormat54._timezone = timeZone63;
        java.util.Locale locale65 = stdDateFormat54._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat67 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone52, locale65, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat68 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone49, locale65);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat69 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone70 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat71 = stdDateFormat69.withTimeZone(timeZone70);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat72 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat73 = stdDateFormat72.getNumberFormat();
        java.text.DateFormat dateFormat74 = stdDateFormat72._formatISO8601_z;
        java.util.TimeZone timeZone75 = stdDateFormat72.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat76 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat77 = stdDateFormat76.getNumberFormat();
        java.text.DateFormat dateFormat78 = stdDateFormat76._formatISO8601_z;
        stdDateFormat72._formatPlain = stdDateFormat76;
        java.text.DateFormat dateFormat80 = stdDateFormat72._formatRFC1123;
        java.util.TimeZone timeZone81 = null;
        stdDateFormat72._timezone = timeZone81;
        java.util.Locale locale83 = stdDateFormat72._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat85 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone70, locale83, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat86 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone49, locale83);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat88 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9, locale83, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj90 = stdDateFormat88.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stdDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat10);
        org.junit.Assert.assertNotNull(stdDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat13);
        org.junit.Assert.assertNull(numberFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(timeZone17);
        org.junit.Assert.assertNull(numberFormat19);
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat31);
        org.junit.Assert.assertNull(numberFormat33);
        org.junit.Assert.assertNull(dateFormat34);
        org.junit.Assert.assertNull(timeZone35);
        org.junit.Assert.assertNull(numberFormat37);
        org.junit.Assert.assertNull(dateFormat38);
        org.junit.Assert.assertNull(dateFormat40);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat48);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat50);
        org.junit.Assert.assertNotNull(stdDateFormat51);
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat53);
        org.junit.Assert.assertNull(numberFormat55);
        org.junit.Assert.assertNull(dateFormat56);
        org.junit.Assert.assertNull(timeZone57);
        org.junit.Assert.assertNull(numberFormat59);
        org.junit.Assert.assertNull(dateFormat60);
        org.junit.Assert.assertNull(dateFormat62);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat69);
        org.junit.Assert.assertNotNull(timeZone70);
        org.junit.Assert.assertEquals(timeZone70.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat71);
        org.junit.Assert.assertNull(numberFormat73);
        org.junit.Assert.assertNull(dateFormat74);
        org.junit.Assert.assertNull(timeZone75);
        org.junit.Assert.assertNull(numberFormat77);
        org.junit.Assert.assertNull(dateFormat78);
        org.junit.Assert.assertNull(dateFormat80);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "en_US");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        boolean boolean3 = stdDateFormat0.isLenient();
        stdDateFormat0.setLenient(false);
        java.lang.String str6 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatRFC1123;
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601;
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(dateFormat8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean5 = stdDateFormat4.isLenient();
        java.lang.Boolean boolean6 = stdDateFormat4._lenient;
        stdDateFormat4._clearFormats();
        java.text.NumberFormat numberFormat8 = stdDateFormat4.getNumberFormat();
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNull(numberFormat8);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat4 = stdDateFormat3.getNumberFormat();
        java.text.DateFormat dateFormat5 = stdDateFormat3._formatISO8601_z;
        java.util.TimeZone timeZone6 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = stdDateFormat3.withTimeZone(timeZone6);
        boolean boolean9 = stdDateFormat3.equals((java.lang.Object) 4);
        boolean boolean10 = stdDateFormat3.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = stdDateFormat11.withTimeZone(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone15 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat14.withTimeZone(timeZone15);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat18 = stdDateFormat17.getNumberFormat();
        java.text.DateFormat dateFormat19 = stdDateFormat17._formatISO8601_z;
        java.util.TimeZone timeZone20 = stdDateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat22 = stdDateFormat21.getNumberFormat();
        java.text.DateFormat dateFormat23 = stdDateFormat21._formatISO8601_z;
        stdDateFormat17._formatPlain = stdDateFormat21;
        java.text.DateFormat dateFormat25 = stdDateFormat17._formatRFC1123;
        java.util.TimeZone timeZone26 = null;
        stdDateFormat17._timezone = timeZone26;
        java.util.Locale locale28 = stdDateFormat17._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15, locale28, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale28);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone33 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat32.withTimeZone(timeZone33);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat36 = stdDateFormat35.getNumberFormat();
        java.text.DateFormat dateFormat37 = stdDateFormat35._formatISO8601_z;
        java.util.TimeZone timeZone38 = stdDateFormat35.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat40 = stdDateFormat39.getNumberFormat();
        java.text.DateFormat dateFormat41 = stdDateFormat39._formatISO8601_z;
        stdDateFormat35._formatPlain = stdDateFormat39;
        java.text.DateFormat dateFormat43 = stdDateFormat35._formatRFC1123;
        java.util.TimeZone timeZone44 = null;
        stdDateFormat35._timezone = timeZone44;
        java.util.Locale locale46 = stdDateFormat35._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat48 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone33, locale46, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat49 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale46);
        stdDateFormat3._timezone = timeZone12;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat51 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone52 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat53 = stdDateFormat51.withTimeZone(timeZone52);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat54 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone55 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat56 = stdDateFormat54.withTimeZone(timeZone55);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat57 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat58 = stdDateFormat57.getNumberFormat();
        java.text.DateFormat dateFormat59 = stdDateFormat57._formatISO8601_z;
        java.util.TimeZone timeZone60 = stdDateFormat57.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat61 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat62 = stdDateFormat61.getNumberFormat();
        java.text.DateFormat dateFormat63 = stdDateFormat61._formatISO8601_z;
        stdDateFormat57._formatPlain = stdDateFormat61;
        java.text.DateFormat dateFormat65 = stdDateFormat57._formatRFC1123;
        java.util.TimeZone timeZone66 = null;
        stdDateFormat57._timezone = timeZone66;
        java.util.Locale locale68 = stdDateFormat57._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat70 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone55, locale68, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat71 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone52, locale68);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat72 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone73 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat74 = stdDateFormat72.withTimeZone(timeZone73);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat75 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat76 = stdDateFormat75.getNumberFormat();
        java.text.DateFormat dateFormat77 = stdDateFormat75._formatISO8601_z;
        java.util.TimeZone timeZone78 = stdDateFormat75.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat79 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat80 = stdDateFormat79.getNumberFormat();
        java.text.DateFormat dateFormat81 = stdDateFormat79._formatISO8601_z;
        stdDateFormat75._formatPlain = stdDateFormat79;
        java.text.DateFormat dateFormat83 = stdDateFormat75._formatRFC1123;
        java.util.TimeZone timeZone84 = null;
        stdDateFormat75._timezone = timeZone84;
        java.util.Locale locale86 = stdDateFormat75._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat88 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone73, locale86, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat89 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone52, locale86);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat91 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale86, (java.lang.Boolean) true);
        java.text.DateFormat dateFormat92 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1, locale86);
        java.lang.Class<?> wildcardClass93 = dateFormat92.getClass();
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat5);
        org.junit.Assert.assertNotNull(stdDateFormat7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stdDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat13);
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNull(numberFormat18);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNull(timeZone20);
        org.junit.Assert.assertNull(numberFormat22);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat34);
        org.junit.Assert.assertNull(numberFormat36);
        org.junit.Assert.assertNull(dateFormat37);
        org.junit.Assert.assertNull(timeZone38);
        org.junit.Assert.assertNull(numberFormat40);
        org.junit.Assert.assertNull(dateFormat41);
        org.junit.Assert.assertNull(dateFormat43);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat51);
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat53);
        org.junit.Assert.assertNotNull(stdDateFormat54);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat56);
        org.junit.Assert.assertNull(numberFormat58);
        org.junit.Assert.assertNull(dateFormat59);
        org.junit.Assert.assertNull(timeZone60);
        org.junit.Assert.assertNull(numberFormat62);
        org.junit.Assert.assertNull(dateFormat63);
        org.junit.Assert.assertNull(dateFormat65);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat72);
        org.junit.Assert.assertNotNull(timeZone73);
        org.junit.Assert.assertEquals(timeZone73.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat74);
        org.junit.Assert.assertNull(numberFormat76);
        org.junit.Assert.assertNull(dateFormat77);
        org.junit.Assert.assertNull(timeZone78);
        org.junit.Assert.assertNull(numberFormat80);
        org.junit.Assert.assertNull(dateFormat81);
        org.junit.Assert.assertNull(dateFormat83);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat92);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean5 = stdDateFormat4.isLenient();
        java.text.DateFormat dateFormat6 = stdDateFormat4._formatPlain;
        java.text.DateFormat dateFormat7 = stdDateFormat4._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat9 = stdDateFormat8.getNumberFormat();
        java.text.DateFormat dateFormat10 = stdDateFormat8._formatISO8601_z;
        java.util.TimeZone timeZone11 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = stdDateFormat8.withTimeZone(timeZone11);
        boolean boolean13 = stdDateFormat12.isLenient();
        java.text.DateFormat dateFormat14 = stdDateFormat12._formatPlain;
        boolean boolean15 = stdDateFormat4.equals((java.lang.Object) stdDateFormat12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat17 = stdDateFormat16.getNumberFormat();
        java.text.DateFormat dateFormat18 = stdDateFormat16._formatISO8601_z;
        java.util.TimeZone timeZone19 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = stdDateFormat16.withTimeZone(timeZone19);
        boolean boolean21 = stdDateFormat20.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator22 = stdDateFormat12.formatToCharacterIterator((java.lang.Object) boolean21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(numberFormat9);
        org.junit.Assert.assertNull(dateFormat10);
        org.junit.Assert.assertNotNull(stdDateFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(numberFormat17);
        org.junit.Assert.assertNull(dateFormat18);
        org.junit.Assert.assertNotNull(stdDateFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat2 = stdDateFormat1.getNumberFormat();
        java.text.DateFormat dateFormat3 = stdDateFormat1._formatISO8601_z;
        java.util.TimeZone timeZone4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat1.withTimeZone(timeZone4);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat1._formatISO8601 = dateFormat6;
        java.util.Calendar calendar8 = dateFormat6.getCalendar();
        stdDateFormat0.setCalendar(calendar8);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat11 = stdDateFormat10.getNumberFormat();
        java.text.DateFormat dateFormat12 = stdDateFormat10._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = stdDateFormat10.clone();
        java.util.Calendar calendar14 = stdDateFormat13.getCalendar();
        stdDateFormat0._formatRFC1123 = stdDateFormat13;
        java.util.TimeZone timeZone16 = stdDateFormat13._timezone;
        java.util.Calendar calendar17 = stdDateFormat13.getCalendar();
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNull(numberFormat2);
        org.junit.Assert.assertNull(dateFormat3);
        org.junit.Assert.assertNotNull(stdDateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(calendar8);
// flaky "14) test154(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNull(numberFormat11);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(stdDateFormat13);
        org.junit.Assert.assertNull(calendar14);
        org.junit.Assert.assertNull(timeZone16);
        org.junit.Assert.assertNull(calendar17);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat4 = stdDateFormat3.getNumberFormat();
        java.text.DateFormat dateFormat5 = stdDateFormat3._formatISO8601_z;
        java.util.TimeZone timeZone6 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = stdDateFormat3.withTimeZone(timeZone6);
        boolean boolean9 = stdDateFormat3.equals((java.lang.Object) 4);
        boolean boolean10 = stdDateFormat3.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = stdDateFormat11.withTimeZone(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone15 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat14.withTimeZone(timeZone15);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat18 = stdDateFormat17.getNumberFormat();
        java.text.DateFormat dateFormat19 = stdDateFormat17._formatISO8601_z;
        java.util.TimeZone timeZone20 = stdDateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat22 = stdDateFormat21.getNumberFormat();
        java.text.DateFormat dateFormat23 = stdDateFormat21._formatISO8601_z;
        stdDateFormat17._formatPlain = stdDateFormat21;
        java.text.DateFormat dateFormat25 = stdDateFormat17._formatRFC1123;
        java.util.TimeZone timeZone26 = null;
        stdDateFormat17._timezone = timeZone26;
        java.util.Locale locale28 = stdDateFormat17._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15, locale28, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale28);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone33 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat32.withTimeZone(timeZone33);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat36 = stdDateFormat35.getNumberFormat();
        java.text.DateFormat dateFormat37 = stdDateFormat35._formatISO8601_z;
        java.util.TimeZone timeZone38 = stdDateFormat35.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat40 = stdDateFormat39.getNumberFormat();
        java.text.DateFormat dateFormat41 = stdDateFormat39._formatISO8601_z;
        stdDateFormat35._formatPlain = stdDateFormat39;
        java.text.DateFormat dateFormat43 = stdDateFormat35._formatRFC1123;
        java.util.TimeZone timeZone44 = null;
        stdDateFormat35._timezone = timeZone44;
        java.util.Locale locale46 = stdDateFormat35._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat48 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone33, locale46, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat49 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale46);
        stdDateFormat3._timezone = timeZone12;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat51 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone52 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat53 = stdDateFormat51.withTimeZone(timeZone52);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat54 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone55 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat56 = stdDateFormat54.withTimeZone(timeZone55);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat57 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat58 = stdDateFormat57.getNumberFormat();
        java.text.DateFormat dateFormat59 = stdDateFormat57._formatISO8601_z;
        java.util.TimeZone timeZone60 = stdDateFormat57.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat61 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat62 = stdDateFormat61.getNumberFormat();
        java.text.DateFormat dateFormat63 = stdDateFormat61._formatISO8601_z;
        stdDateFormat57._formatPlain = stdDateFormat61;
        java.text.DateFormat dateFormat65 = stdDateFormat57._formatRFC1123;
        java.util.TimeZone timeZone66 = null;
        stdDateFormat57._timezone = timeZone66;
        java.util.Locale locale68 = stdDateFormat57._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat70 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone55, locale68, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat71 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone52, locale68);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat72 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone73 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat74 = stdDateFormat72.withTimeZone(timeZone73);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat75 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat76 = stdDateFormat75.getNumberFormat();
        java.text.DateFormat dateFormat77 = stdDateFormat75._formatISO8601_z;
        java.util.TimeZone timeZone78 = stdDateFormat75.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat79 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat80 = stdDateFormat79.getNumberFormat();
        java.text.DateFormat dateFormat81 = stdDateFormat79._formatISO8601_z;
        stdDateFormat75._formatPlain = stdDateFormat79;
        java.text.DateFormat dateFormat83 = stdDateFormat75._formatRFC1123;
        java.util.TimeZone timeZone84 = null;
        stdDateFormat75._timezone = timeZone84;
        java.util.Locale locale86 = stdDateFormat75._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat88 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone73, locale86, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat89 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone52, locale86);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat91 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale86, (java.lang.Boolean) true);
        java.text.DateFormat dateFormat92 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1, locale86);
        java.text.DateFormat dateFormat93 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat5);
        org.junit.Assert.assertNotNull(stdDateFormat7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stdDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat13);
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNull(numberFormat18);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNull(timeZone20);
        org.junit.Assert.assertNull(numberFormat22);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat34);
        org.junit.Assert.assertNull(numberFormat36);
        org.junit.Assert.assertNull(dateFormat37);
        org.junit.Assert.assertNull(timeZone38);
        org.junit.Assert.assertNull(numberFormat40);
        org.junit.Assert.assertNull(dateFormat41);
        org.junit.Assert.assertNull(dateFormat43);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat51);
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat53);
        org.junit.Assert.assertNotNull(stdDateFormat54);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat56);
        org.junit.Assert.assertNull(numberFormat58);
        org.junit.Assert.assertNull(dateFormat59);
        org.junit.Assert.assertNull(timeZone60);
        org.junit.Assert.assertNull(numberFormat62);
        org.junit.Assert.assertNull(dateFormat63);
        org.junit.Assert.assertNull(dateFormat65);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat72);
        org.junit.Assert.assertNotNull(timeZone73);
        org.junit.Assert.assertEquals(timeZone73.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat74);
        org.junit.Assert.assertNull(numberFormat76);
        org.junit.Assert.assertNull(dateFormat77);
        org.junit.Assert.assertNull(timeZone78);
        org.junit.Assert.assertNull(numberFormat80);
        org.junit.Assert.assertNull(dateFormat81);
        org.junit.Assert.assertNull(dateFormat83);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat92);
        org.junit.Assert.assertNotNull(dateFormat93);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat6 = stdDateFormat5.getNumberFormat();
        java.text.DateFormat dateFormat7 = stdDateFormat5._formatISO8601_z;
        java.util.TimeZone timeZone8 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat5.withTimeZone(timeZone8);
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat5._formatISO8601 = dateFormat10;
        java.util.Calendar calendar12 = dateFormat10.getCalendar();
        stdDateFormat0.setCalendar(calendar12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone15 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat14.withTimeZone(timeZone15);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = stdDateFormat17.withTimeZone(timeZone18);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone21 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = stdDateFormat20.withTimeZone(timeZone21);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat24 = stdDateFormat23.getNumberFormat();
        java.text.DateFormat dateFormat25 = stdDateFormat23._formatISO8601_z;
        java.util.TimeZone timeZone26 = stdDateFormat23.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat28 = stdDateFormat27.getNumberFormat();
        java.text.DateFormat dateFormat29 = stdDateFormat27._formatISO8601_z;
        stdDateFormat23._formatPlain = stdDateFormat27;
        java.text.DateFormat dateFormat31 = stdDateFormat23._formatRFC1123;
        java.util.TimeZone timeZone32 = null;
        stdDateFormat23._timezone = timeZone32;
        java.util.Locale locale34 = stdDateFormat23._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21, locale34, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18, locale34);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = stdDateFormat16.withTimeZone(timeZone18);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = stdDateFormat0.withTimeZone(timeZone18);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone41 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat42 = stdDateFormat40.withTimeZone(timeZone41);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat43 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat44 = stdDateFormat43.getNumberFormat();
        java.text.DateFormat dateFormat45 = stdDateFormat43._formatISO8601_z;
        java.util.TimeZone timeZone46 = stdDateFormat43.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat47 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat48 = stdDateFormat47.getNumberFormat();
        java.text.DateFormat dateFormat49 = stdDateFormat47._formatISO8601_z;
        stdDateFormat43._formatPlain = stdDateFormat47;
        java.text.DateFormat dateFormat51 = stdDateFormat43._formatRFC1123;
        java.util.TimeZone timeZone52 = null;
        stdDateFormat43._timezone = timeZone52;
        java.util.Locale locale54 = stdDateFormat43._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat56 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone41, locale54, (java.lang.Boolean) false);
        boolean boolean57 = stdDateFormat39.equals((java.lang.Object) stdDateFormat56);
        java.util.Date date58 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str59 = stdDateFormat56.format(date58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(calendar12);
// flaky "15) test156(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNotNull(stdDateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat19);
        org.junit.Assert.assertNotNull(stdDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat22);
        org.junit.Assert.assertNull(numberFormat24);
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertNull(timeZone26);
        org.junit.Assert.assertNull(numberFormat28);
        org.junit.Assert.assertNull(dateFormat29);
        org.junit.Assert.assertNull(dateFormat31);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat38);
        org.junit.Assert.assertNotNull(stdDateFormat39);
        org.junit.Assert.assertNotNull(stdDateFormat40);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat42);
        org.junit.Assert.assertNull(numberFormat44);
        org.junit.Assert.assertNull(dateFormat45);
        org.junit.Assert.assertNull(timeZone46);
        org.junit.Assert.assertNull(numberFormat48);
        org.junit.Assert.assertNull(dateFormat49);
        org.junit.Assert.assertNull(dateFormat51);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone4 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat3.withTimeZone(timeZone4);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = stdDateFormat6.withTimeZone(timeZone7);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat10 = stdDateFormat9.getNumberFormat();
        java.text.DateFormat dateFormat11 = stdDateFormat9._formatISO8601_z;
        java.util.TimeZone timeZone12 = stdDateFormat9.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat14 = stdDateFormat13.getNumberFormat();
        java.text.DateFormat dateFormat15 = stdDateFormat13._formatISO8601_z;
        stdDateFormat9._formatPlain = stdDateFormat13;
        java.text.DateFormat dateFormat17 = stdDateFormat9._formatRFC1123;
        java.util.TimeZone timeZone18 = null;
        stdDateFormat9._timezone = timeZone18;
        java.util.Locale locale20 = stdDateFormat9._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone7, locale20, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4, locale20);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = stdDateFormat2.withTimeZone(timeZone4);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.lang.String str27 = stdDateFormat25.format((java.lang.Object) 6);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat25._formatPlain = dateFormat28;
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        dateFormat30.setNumberFormat(numberFormat32);
        dateFormat28.setNumberFormat(numberFormat32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = stdDateFormat2.format((java.lang.Object) numberFormat32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat5);
        org.junit.Assert.assertNotNull(stdDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat8);
        org.junit.Assert.assertNull(numberFormat10);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNull(numberFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01T00:00:00.006+0000" + "'", str27, "1970-01-01T00:00:00.006+0000");
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(numberFormat32);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat0._formatISO8601 = dateFormat5;
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateFormat5.format(date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = stdDateFormat0.clone();
        java.text.DateFormat dateFormat4 = stdDateFormat0._formatISO8601;
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat3);
        org.junit.Assert.assertNull(dateFormat4);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat0._formatISO8601 = dateFormat5;
        java.util.Calendar calendar7 = dateFormat5.getCalendar();
        java.lang.Class<?> wildcardClass8 = calendar7.getClass();
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(calendar7);
// flaky "16) test160(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat5 = stdDateFormat4.getNumberFormat();
        java.text.DateFormat dateFormat6 = stdDateFormat4._formatISO8601_z;
        java.util.TimeZone timeZone7 = stdDateFormat4.getTimeZone();
        java.util.Calendar calendar8 = stdDateFormat4.getCalendar();
        stdDateFormat0._formatRFC1123 = stdDateFormat4;
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat12 = dateFormat11.getNumberFormat();
        dateFormat10.setNumberFormat(numberFormat12);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator14 = stdDateFormat4.formatToCharacterIterator((java.lang.Object) numberFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertNull(numberFormat5);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(timeZone7);
        org.junit.Assert.assertNull(calendar8);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(numberFormat12);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.lang.String str2 = stdDateFormat0.format((java.lang.Object) 6);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat0._formatPlain = dateFormat3;
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat0.parse("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01T00:00:00.006+0000" + "'", str2, "1970-01-01T00:00:00.006+0000");
        org.junit.Assert.assertNotNull(dateFormat3);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        stdDateFormat0._formatISO8601_z = stdDateFormat1;
        boolean boolean3 = stdDateFormat1.isLenient();
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat0._formatISO8601 = dateFormat5;
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601_z;
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = stdDateFormat0.parseAsRFC1123("", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNull(dateFormat7);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        java.text.DateFormat dateFormat3 = stdDateFormat2._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone5 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = stdDateFormat4.withTimeZone(timeZone5);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat8 = stdDateFormat7.getNumberFormat();
        java.text.DateFormat dateFormat9 = stdDateFormat7._formatISO8601_z;
        java.util.TimeZone timeZone10 = stdDateFormat7.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat12 = stdDateFormat11.getNumberFormat();
        java.text.DateFormat dateFormat13 = stdDateFormat11._formatISO8601_z;
        stdDateFormat7._formatPlain = stdDateFormat11;
        java.text.DateFormat dateFormat15 = stdDateFormat7._formatRFC1123;
        java.util.TimeZone timeZone16 = null;
        stdDateFormat7._timezone = timeZone16;
        java.util.Locale locale18 = stdDateFormat7._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5, locale18, (java.lang.Boolean) false);
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone23 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = stdDateFormat22.withTimeZone(timeZone23);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone26 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = stdDateFormat25.withTimeZone(timeZone26);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat29 = stdDateFormat28.getNumberFormat();
        java.text.DateFormat dateFormat30 = stdDateFormat28._formatISO8601_z;
        java.util.TimeZone timeZone31 = stdDateFormat28.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat33 = stdDateFormat32.getNumberFormat();
        java.text.DateFormat dateFormat34 = stdDateFormat32._formatISO8601_z;
        stdDateFormat28._formatPlain = stdDateFormat32;
        java.text.DateFormat dateFormat36 = stdDateFormat28._formatRFC1123;
        java.util.TimeZone timeZone37 = null;
        stdDateFormat28._timezone = timeZone37;
        java.util.Locale locale39 = stdDateFormat28._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat41 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone26, locale39, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat42 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23, locale39);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat43 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone44 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat45 = stdDateFormat43.withTimeZone(timeZone44);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat47 = stdDateFormat46.getNumberFormat();
        java.text.DateFormat dateFormat48 = stdDateFormat46._formatISO8601_z;
        java.util.TimeZone timeZone49 = stdDateFormat46.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat50 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat51 = stdDateFormat50.getNumberFormat();
        java.text.DateFormat dateFormat52 = stdDateFormat50._formatISO8601_z;
        stdDateFormat46._formatPlain = stdDateFormat50;
        java.text.DateFormat dateFormat54 = stdDateFormat46._formatRFC1123;
        java.util.TimeZone timeZone55 = null;
        stdDateFormat46._timezone = timeZone55;
        java.util.Locale locale57 = stdDateFormat46._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat59 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone44, locale57, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat60 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23, locale57);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat61 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5, locale57);
        stdDateFormat2._timezone = timeZone5;
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertNull(dateFormat3);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat6);
        org.junit.Assert.assertNull(numberFormat8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNull(numberFormat12);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(stdDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat24);
        org.junit.Assert.assertNotNull(stdDateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat27);
        org.junit.Assert.assertNull(numberFormat29);
        org.junit.Assert.assertNull(dateFormat30);
        org.junit.Assert.assertNull(timeZone31);
        org.junit.Assert.assertNull(numberFormat33);
        org.junit.Assert.assertNull(dateFormat34);
        org.junit.Assert.assertNull(dateFormat36);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat43);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat45);
        org.junit.Assert.assertNull(numberFormat47);
        org.junit.Assert.assertNull(dateFormat48);
        org.junit.Assert.assertNull(timeZone49);
        org.junit.Assert.assertNull(numberFormat51);
        org.junit.Assert.assertNull(dateFormat52);
        org.junit.Assert.assertNull(dateFormat54);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean5 = stdDateFormat4.isLenient();
        java.text.DateFormat dateFormat6 = stdDateFormat4._formatPlain;
        java.lang.String str7 = stdDateFormat4.toString();
        java.text.DateFormat dateFormat8 = stdDateFormat4._formatISO8601;
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = stdDateFormat4.parseAsISO8601("yyyy-MM-dd", parsePosition10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat8);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = stdDateFormat0.clone();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.lang.Object obj6 = dateFormat4.parseObject("1970-01-01T00:00:00.006+0000");
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = stdDateFormat0.format(obj6, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "Wed Dec 31 16:00:00 PST 1969");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "Wed Dec 31 16:00:00 PST 1969");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "Wed Dec 31 16:00:00 PST 1969");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat5 = stdDateFormat4.getNumberFormat();
        java.text.DateFormat dateFormat6 = stdDateFormat4._formatISO8601_z;
        stdDateFormat0._formatPlain = stdDateFormat4;
        boolean boolean9 = stdDateFormat4.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat11 = stdDateFormat10.getNumberFormat();
        java.text.DateFormat dateFormat12 = stdDateFormat10._formatISO8601_z;
        java.util.TimeZone timeZone13 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat10.withTimeZone(timeZone13);
        boolean boolean16 = stdDateFormat10.equals((java.lang.Object) 4);
        boolean boolean17 = stdDateFormat10.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone19 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = stdDateFormat18.withTimeZone(timeZone19);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone22 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = stdDateFormat21.withTimeZone(timeZone22);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat25 = stdDateFormat24.getNumberFormat();
        java.text.DateFormat dateFormat26 = stdDateFormat24._formatISO8601_z;
        java.util.TimeZone timeZone27 = stdDateFormat24.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat29 = stdDateFormat28.getNumberFormat();
        java.text.DateFormat dateFormat30 = stdDateFormat28._formatISO8601_z;
        stdDateFormat24._formatPlain = stdDateFormat28;
        java.text.DateFormat dateFormat32 = stdDateFormat24._formatRFC1123;
        java.util.TimeZone timeZone33 = null;
        stdDateFormat24._timezone = timeZone33;
        java.util.Locale locale35 = stdDateFormat24._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22, locale35, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19, locale35);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone40 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat41 = stdDateFormat39.withTimeZone(timeZone40);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat42 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat43 = stdDateFormat42.getNumberFormat();
        java.text.DateFormat dateFormat44 = stdDateFormat42._formatISO8601_z;
        java.util.TimeZone timeZone45 = stdDateFormat42.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat47 = stdDateFormat46.getNumberFormat();
        java.text.DateFormat dateFormat48 = stdDateFormat46._formatISO8601_z;
        stdDateFormat42._formatPlain = stdDateFormat46;
        java.text.DateFormat dateFormat50 = stdDateFormat42._formatRFC1123;
        java.util.TimeZone timeZone51 = null;
        stdDateFormat42._timezone = timeZone51;
        java.util.Locale locale53 = stdDateFormat42._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat55 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone40, locale53, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat56 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19, locale53);
        stdDateFormat10._timezone = timeZone19;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat58 = stdDateFormat4.withTimeZone(timeZone19);
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertNull(numberFormat5);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(numberFormat11);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat20);
        org.junit.Assert.assertNotNull(stdDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat23);
        org.junit.Assert.assertNull(numberFormat25);
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertNull(timeZone27);
        org.junit.Assert.assertNull(numberFormat29);
        org.junit.Assert.assertNull(dateFormat30);
        org.junit.Assert.assertNull(dateFormat32);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat39);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat41);
        org.junit.Assert.assertNull(numberFormat43);
        org.junit.Assert.assertNull(dateFormat44);
        org.junit.Assert.assertNull(timeZone45);
        org.junit.Assert.assertNull(numberFormat47);
        org.junit.Assert.assertNull(dateFormat48);
        org.junit.Assert.assertNull(dateFormat50);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat58);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean5 = stdDateFormat4.isLenient();
        boolean boolean6 = stdDateFormat4.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone8 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat7.withTimeZone(timeZone8);
        java.lang.String str11 = stdDateFormat7.format((java.lang.Object) 10L);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat13 = stdDateFormat12.getNumberFormat();
        java.text.DateFormat dateFormat14 = stdDateFormat12._formatISO8601_z;
        java.util.TimeZone timeZone15 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat12.withTimeZone(timeZone15);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat18 = stdDateFormat17.getNumberFormat();
        java.text.DateFormat dateFormat19 = stdDateFormat17._formatISO8601_z;
        java.util.TimeZone timeZone20 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = stdDateFormat17.withTimeZone(timeZone20);
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat17._formatISO8601 = dateFormat22;
        java.util.Calendar calendar24 = dateFormat22.getCalendar();
        stdDateFormat12.setCalendar(calendar24);
        stdDateFormat7.setCalendar(calendar24);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = stdDateFormat7.clone();
        stdDateFormat4._formatISO8601_z = stdDateFormat27;
        java.text.DateFormat dateFormat29 = stdDateFormat4._formatPlain;
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(stdDateFormat7);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01T00:00:00.010+0000" + "'", str11, "1970-01-01T00:00:00.010+0000");
        org.junit.Assert.assertNull(numberFormat13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNull(numberFormat18);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNotNull(stdDateFormat21);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(calendar24);
        org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(stdDateFormat27);
        org.junit.Assert.assertNull(dateFormat29);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        java.text.DateFormat dateFormat3 = stdDateFormat0._formatPlain;
        java.util.Locale locale4 = stdDateFormat0._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat6 = stdDateFormat5.getNumberFormat();
        java.text.DateFormat dateFormat7 = stdDateFormat5._formatISO8601_z;
        java.lang.String str8 = stdDateFormat5.toString();
        java.text.DateFormat dateFormat9 = stdDateFormat5._formatISO8601;
        stdDateFormat0._formatISO8601 = dateFormat9;
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertNull(dateFormat3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str8, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat9);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        java.util.Calendar calendar3 = null;
        stdDateFormat2.setCalendar(calendar3);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone6 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = stdDateFormat5.withTimeZone(timeZone6);
        boolean boolean8 = stdDateFormat5.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = stdDateFormat2.formatToCharacterIterator((java.lang.Object) stdDateFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean5 = stdDateFormat4.isLenient();
        java.text.DateFormat dateFormat6 = stdDateFormat4._formatPlain;
        boolean boolean7 = stdDateFormat4.isLenient();
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat6 = stdDateFormat5.getNumberFormat();
        java.text.DateFormat dateFormat7 = stdDateFormat5._formatISO8601_z;
        java.util.TimeZone timeZone8 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat5.withTimeZone(timeZone8);
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat5._formatISO8601 = dateFormat10;
        java.util.Calendar calendar12 = dateFormat10.getCalendar();
        stdDateFormat0.setCalendar(calendar12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone15 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat14.withTimeZone(timeZone15);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = stdDateFormat17.withTimeZone(timeZone18);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone21 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = stdDateFormat20.withTimeZone(timeZone21);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat24 = stdDateFormat23.getNumberFormat();
        java.text.DateFormat dateFormat25 = stdDateFormat23._formatISO8601_z;
        java.util.TimeZone timeZone26 = stdDateFormat23.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat28 = stdDateFormat27.getNumberFormat();
        java.text.DateFormat dateFormat29 = stdDateFormat27._formatISO8601_z;
        stdDateFormat23._formatPlain = stdDateFormat27;
        java.text.DateFormat dateFormat31 = stdDateFormat23._formatRFC1123;
        java.util.TimeZone timeZone32 = null;
        stdDateFormat23._timezone = timeZone32;
        java.util.Locale locale34 = stdDateFormat23._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21, locale34, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18, locale34);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = stdDateFormat16.withTimeZone(timeZone18);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = stdDateFormat0.withTimeZone(timeZone18);
        java.util.Locale locale40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone18, locale40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(calendar12);
        org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNotNull(stdDateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat19);
        org.junit.Assert.assertNotNull(stdDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat22);
        org.junit.Assert.assertNull(numberFormat24);
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertNull(timeZone26);
        org.junit.Assert.assertNull(numberFormat28);
        org.junit.Assert.assertNull(dateFormat29);
        org.junit.Assert.assertNull(dateFormat31);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat38);
        org.junit.Assert.assertNotNull(stdDateFormat39);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean5 = stdDateFormat4.isLenient();
        boolean boolean6 = stdDateFormat4.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone8 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat7.withTimeZone(timeZone8);
        java.lang.String str11 = stdDateFormat7.format((java.lang.Object) 10L);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat13 = stdDateFormat12.getNumberFormat();
        java.text.DateFormat dateFormat14 = stdDateFormat12._formatISO8601_z;
        java.util.TimeZone timeZone15 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat12.withTimeZone(timeZone15);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat18 = stdDateFormat17.getNumberFormat();
        java.text.DateFormat dateFormat19 = stdDateFormat17._formatISO8601_z;
        java.util.TimeZone timeZone20 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = stdDateFormat17.withTimeZone(timeZone20);
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat17._formatISO8601 = dateFormat22;
        java.util.Calendar calendar24 = dateFormat22.getCalendar();
        stdDateFormat12.setCalendar(calendar24);
        stdDateFormat7.setCalendar(calendar24);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = stdDateFormat7.clone();
        stdDateFormat4._formatISO8601_z = stdDateFormat27;
        java.lang.String str29 = stdDateFormat4.toString();
        java.util.TimeZone timeZone30 = null;
        stdDateFormat4._timezone = timeZone30;
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(stdDateFormat7);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01T00:00:00.010+0000" + "'", str11, "1970-01-01T00:00:00.010+0000");
        org.junit.Assert.assertNull(numberFormat13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNull(numberFormat18);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNotNull(stdDateFormat21);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(calendar24);
        org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(stdDateFormat27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)" + "'", str29, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean6 = stdDateFormat0.equals((java.lang.Object) 4);
        boolean boolean7 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat8.withTimeZone(timeZone9);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = stdDateFormat11.withTimeZone(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat15 = stdDateFormat14.getNumberFormat();
        java.text.DateFormat dateFormat16 = stdDateFormat14._formatISO8601_z;
        java.util.TimeZone timeZone17 = stdDateFormat14.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat19 = stdDateFormat18.getNumberFormat();
        java.text.DateFormat dateFormat20 = stdDateFormat18._formatISO8601_z;
        stdDateFormat14._formatPlain = stdDateFormat18;
        java.text.DateFormat dateFormat22 = stdDateFormat14._formatRFC1123;
        java.util.TimeZone timeZone23 = null;
        stdDateFormat14._timezone = timeZone23;
        java.util.Locale locale25 = stdDateFormat14._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale25, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9, locale25);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone30 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = stdDateFormat29.withTimeZone(timeZone30);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat33 = stdDateFormat32.getNumberFormat();
        java.text.DateFormat dateFormat34 = stdDateFormat32._formatISO8601_z;
        java.util.TimeZone timeZone35 = stdDateFormat32.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat37 = stdDateFormat36.getNumberFormat();
        java.text.DateFormat dateFormat38 = stdDateFormat36._formatISO8601_z;
        stdDateFormat32._formatPlain = stdDateFormat36;
        java.text.DateFormat dateFormat40 = stdDateFormat32._formatRFC1123;
        java.util.TimeZone timeZone41 = null;
        stdDateFormat32._timezone = timeZone41;
        java.util.Locale locale43 = stdDateFormat32._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat45 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone30, locale43, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9, locale43);
        stdDateFormat0._timezone = timeZone9;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat48 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone49 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat50 = stdDateFormat48.withTimeZone(timeZone49);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat51 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone52 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat53 = stdDateFormat51.withTimeZone(timeZone52);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat54 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat55 = stdDateFormat54.getNumberFormat();
        java.text.DateFormat dateFormat56 = stdDateFormat54._formatISO8601_z;
        java.util.TimeZone timeZone57 = stdDateFormat54.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat58 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat59 = stdDateFormat58.getNumberFormat();
        java.text.DateFormat dateFormat60 = stdDateFormat58._formatISO8601_z;
        stdDateFormat54._formatPlain = stdDateFormat58;
        java.text.DateFormat dateFormat62 = stdDateFormat54._formatRFC1123;
        java.util.TimeZone timeZone63 = null;
        stdDateFormat54._timezone = timeZone63;
        java.util.Locale locale65 = stdDateFormat54._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat67 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone52, locale65, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat68 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone49, locale65);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat69 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone70 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat71 = stdDateFormat69.withTimeZone(timeZone70);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat72 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat73 = stdDateFormat72.getNumberFormat();
        java.text.DateFormat dateFormat74 = stdDateFormat72._formatISO8601_z;
        java.util.TimeZone timeZone75 = stdDateFormat72.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat76 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat77 = stdDateFormat76.getNumberFormat();
        java.text.DateFormat dateFormat78 = stdDateFormat76._formatISO8601_z;
        stdDateFormat72._formatPlain = stdDateFormat76;
        java.text.DateFormat dateFormat80 = stdDateFormat72._formatRFC1123;
        java.util.TimeZone timeZone81 = null;
        stdDateFormat72._timezone = timeZone81;
        java.util.Locale locale83 = stdDateFormat72._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat85 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone70, locale83, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat86 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone49, locale83);
        stdDateFormat0._timezone = timeZone49;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat88 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone89 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat90 = stdDateFormat88.withTimeZone(timeZone89);
        java.util.Locale locale91 = stdDateFormat88._locale;
        java.text.DateFormat dateFormat92 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone49, locale91);
        java.text.DateFormat dateFormat93 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone49);
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stdDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat10);
        org.junit.Assert.assertNotNull(stdDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat13);
        org.junit.Assert.assertNull(numberFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(timeZone17);
        org.junit.Assert.assertNull(numberFormat19);
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat31);
        org.junit.Assert.assertNull(numberFormat33);
        org.junit.Assert.assertNull(dateFormat34);
        org.junit.Assert.assertNull(timeZone35);
        org.junit.Assert.assertNull(numberFormat37);
        org.junit.Assert.assertNull(dateFormat38);
        org.junit.Assert.assertNull(dateFormat40);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat48);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat50);
        org.junit.Assert.assertNotNull(stdDateFormat51);
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat53);
        org.junit.Assert.assertNull(numberFormat55);
        org.junit.Assert.assertNull(dateFormat56);
        org.junit.Assert.assertNull(timeZone57);
        org.junit.Assert.assertNull(numberFormat59);
        org.junit.Assert.assertNull(dateFormat60);
        org.junit.Assert.assertNull(dateFormat62);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat69);
        org.junit.Assert.assertNotNull(timeZone70);
        org.junit.Assert.assertEquals(timeZone70.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat71);
        org.junit.Assert.assertNull(numberFormat73);
        org.junit.Assert.assertNull(dateFormat74);
        org.junit.Assert.assertNull(timeZone75);
        org.junit.Assert.assertNull(numberFormat77);
        org.junit.Assert.assertNull(dateFormat78);
        org.junit.Assert.assertNull(dateFormat80);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat88);
        org.junit.Assert.assertNotNull(timeZone89);
        org.junit.Assert.assertEquals(timeZone89.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat90);
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat92);
        org.junit.Assert.assertNotNull(dateFormat93);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat0.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean5 = stdDateFormat4.isLenient();
        java.text.DateFormat dateFormat6 = stdDateFormat4._formatPlain;
        java.lang.String str7 = stdDateFormat4.toString();
        java.text.DateFormat dateFormat8 = stdDateFormat4._formatRFC1123;
        java.text.DateFormat dateFormat9 = stdDateFormat4._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat4.clone();
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNotNull(stdDateFormat10);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean5 = stdDateFormat4.isLenient();
        java.lang.Boolean boolean6 = stdDateFormat4._lenient;
        stdDateFormat4._clearFormats();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean10 = stdDateFormat8.looksLikeISO8601("");
        stdDateFormat4._formatISO8601 = stdDateFormat8;
        java.text.DateFormat dateFormat12 = null;
        stdDateFormat8._formatISO8601 = dateFormat12;
        stdDateFormat8.setLenient(false);
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat4 = stdDateFormat3.getNumberFormat();
        java.text.DateFormat dateFormat5 = stdDateFormat3._formatISO8601_z;
        java.util.TimeZone timeZone6 = stdDateFormat3.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat8 = stdDateFormat7.getNumberFormat();
        java.text.DateFormat dateFormat9 = stdDateFormat7._formatISO8601_z;
        stdDateFormat3._formatPlain = stdDateFormat7;
        java.text.DateFormat dateFormat11 = stdDateFormat3._formatRFC1123;
        java.util.TimeZone timeZone12 = null;
        stdDateFormat3._timezone = timeZone12;
        java.util.Locale locale14 = stdDateFormat3._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale14, (java.lang.Boolean) false);
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone19 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = stdDateFormat18.withTimeZone(timeZone19);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone22 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = stdDateFormat21.withTimeZone(timeZone22);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat25 = stdDateFormat24.getNumberFormat();
        java.text.DateFormat dateFormat26 = stdDateFormat24._formatISO8601_z;
        java.util.TimeZone timeZone27 = stdDateFormat24.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat29 = stdDateFormat28.getNumberFormat();
        java.text.DateFormat dateFormat30 = stdDateFormat28._formatISO8601_z;
        stdDateFormat24._formatPlain = stdDateFormat28;
        java.text.DateFormat dateFormat32 = stdDateFormat24._formatRFC1123;
        java.util.TimeZone timeZone33 = null;
        stdDateFormat24._timezone = timeZone33;
        java.util.Locale locale35 = stdDateFormat24._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22, locale35, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19, locale35);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone40 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat41 = stdDateFormat39.withTimeZone(timeZone40);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat42 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat43 = stdDateFormat42.getNumberFormat();
        java.text.DateFormat dateFormat44 = stdDateFormat42._formatISO8601_z;
        java.util.TimeZone timeZone45 = stdDateFormat42.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat47 = stdDateFormat46.getNumberFormat();
        java.text.DateFormat dateFormat48 = stdDateFormat46._formatISO8601_z;
        stdDateFormat42._formatPlain = stdDateFormat46;
        java.text.DateFormat dateFormat50 = stdDateFormat42._formatRFC1123;
        java.util.TimeZone timeZone51 = null;
        stdDateFormat42._timezone = timeZone51;
        java.util.Locale locale53 = stdDateFormat42._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat55 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone40, locale53, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat56 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19, locale53);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat57 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale53);
        java.util.TimeZone timeZone58 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat59 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone60 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat61 = stdDateFormat59.withTimeZone(timeZone60);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat62 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat63 = stdDateFormat62.getNumberFormat();
        java.text.DateFormat dateFormat64 = stdDateFormat62._formatISO8601_z;
        java.util.TimeZone timeZone65 = stdDateFormat62.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat66 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat67 = stdDateFormat66.getNumberFormat();
        java.text.DateFormat dateFormat68 = stdDateFormat66._formatISO8601_z;
        stdDateFormat62._formatPlain = stdDateFormat66;
        java.text.DateFormat dateFormat70 = stdDateFormat62._formatRFC1123;
        java.util.TimeZone timeZone71 = null;
        stdDateFormat62._timezone = timeZone71;
        java.util.Locale locale73 = stdDateFormat62._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat75 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone60, locale73, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat76 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone58, locale73);
        java.text.DateFormat dateFormat77 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1, locale73);
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat5);
        org.junit.Assert.assertNull(timeZone6);
        org.junit.Assert.assertNull(numberFormat8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat20);
        org.junit.Assert.assertNotNull(stdDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat23);
        org.junit.Assert.assertNull(numberFormat25);
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertNull(timeZone27);
        org.junit.Assert.assertNull(numberFormat29);
        org.junit.Assert.assertNull(dateFormat30);
        org.junit.Assert.assertNull(dateFormat32);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat39);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat41);
        org.junit.Assert.assertNull(numberFormat43);
        org.junit.Assert.assertNull(dateFormat44);
        org.junit.Assert.assertNull(timeZone45);
        org.junit.Assert.assertNull(numberFormat47);
        org.junit.Assert.assertNull(dateFormat48);
        org.junit.Assert.assertNull(dateFormat50);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone58);
        org.junit.Assert.assertEquals(timeZone58.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat59);
        org.junit.Assert.assertNotNull(timeZone60);
        org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat61);
        org.junit.Assert.assertNull(numberFormat63);
        org.junit.Assert.assertNull(dateFormat64);
        org.junit.Assert.assertNull(timeZone65);
        org.junit.Assert.assertNull(numberFormat67);
        org.junit.Assert.assertNull(dateFormat68);
        org.junit.Assert.assertNull(dateFormat70);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat77);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat2 = stdDateFormat1.getNumberFormat();
        java.text.DateFormat dateFormat3 = stdDateFormat1._formatISO8601_z;
        java.util.TimeZone timeZone4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat1.withTimeZone(timeZone4);
        boolean boolean7 = stdDateFormat1.equals((java.lang.Object) 4);
        boolean boolean8 = stdDateFormat1.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone10 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = stdDateFormat9.withTimeZone(timeZone10);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat12.withTimeZone(timeZone13);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat16 = stdDateFormat15.getNumberFormat();
        java.text.DateFormat dateFormat17 = stdDateFormat15._formatISO8601_z;
        java.util.TimeZone timeZone18 = stdDateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat20 = stdDateFormat19.getNumberFormat();
        java.text.DateFormat dateFormat21 = stdDateFormat19._formatISO8601_z;
        stdDateFormat15._formatPlain = stdDateFormat19;
        java.text.DateFormat dateFormat23 = stdDateFormat15._formatRFC1123;
        java.util.TimeZone timeZone24 = null;
        stdDateFormat15._timezone = timeZone24;
        java.util.Locale locale26 = stdDateFormat15._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone13, locale26, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10, locale26);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone31 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = stdDateFormat30.withTimeZone(timeZone31);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat34 = stdDateFormat33.getNumberFormat();
        java.text.DateFormat dateFormat35 = stdDateFormat33._formatISO8601_z;
        java.util.TimeZone timeZone36 = stdDateFormat33.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat38 = stdDateFormat37.getNumberFormat();
        java.text.DateFormat dateFormat39 = stdDateFormat37._formatISO8601_z;
        stdDateFormat33._formatPlain = stdDateFormat37;
        java.text.DateFormat dateFormat41 = stdDateFormat33._formatRFC1123;
        java.util.TimeZone timeZone42 = null;
        stdDateFormat33._timezone = timeZone42;
        java.util.Locale locale44 = stdDateFormat33._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone31, locale44, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat47 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10, locale44);
        stdDateFormat1._timezone = timeZone10;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat49 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone50 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat51 = stdDateFormat49.withTimeZone(timeZone50);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat52 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone53 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat54 = stdDateFormat52.withTimeZone(timeZone53);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat55 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat56 = stdDateFormat55.getNumberFormat();
        java.text.DateFormat dateFormat57 = stdDateFormat55._formatISO8601_z;
        java.util.TimeZone timeZone58 = stdDateFormat55.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat59 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat60 = stdDateFormat59.getNumberFormat();
        java.text.DateFormat dateFormat61 = stdDateFormat59._formatISO8601_z;
        stdDateFormat55._formatPlain = stdDateFormat59;
        java.text.DateFormat dateFormat63 = stdDateFormat55._formatRFC1123;
        java.util.TimeZone timeZone64 = null;
        stdDateFormat55._timezone = timeZone64;
        java.util.Locale locale66 = stdDateFormat55._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat68 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone53, locale66, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat69 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone50, locale66);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat70 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone71 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat72 = stdDateFormat70.withTimeZone(timeZone71);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat73 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat74 = stdDateFormat73.getNumberFormat();
        java.text.DateFormat dateFormat75 = stdDateFormat73._formatISO8601_z;
        java.util.TimeZone timeZone76 = stdDateFormat73.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat77 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat78 = stdDateFormat77.getNumberFormat();
        java.text.DateFormat dateFormat79 = stdDateFormat77._formatISO8601_z;
        stdDateFormat73._formatPlain = stdDateFormat77;
        java.text.DateFormat dateFormat81 = stdDateFormat73._formatRFC1123;
        java.util.TimeZone timeZone82 = null;
        stdDateFormat73._timezone = timeZone82;
        java.util.Locale locale84 = stdDateFormat73._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat86 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone71, locale84, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat87 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone50, locale84);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat89 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10, locale84, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat91 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale84, (java.lang.Boolean) true);
        java.util.TimeZone timeZone92 = stdDateFormat91.getTimeZone();
        java.text.DateFormat dateFormat93 = stdDateFormat91._formatISO8601_z;
        org.junit.Assert.assertNull(numberFormat2);
        org.junit.Assert.assertNull(dateFormat3);
        org.junit.Assert.assertNotNull(stdDateFormat5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat11);
        org.junit.Assert.assertNotNull(stdDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNull(numberFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(timeZone18);
        org.junit.Assert.assertNull(numberFormat20);
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat32);
        org.junit.Assert.assertNull(numberFormat34);
        org.junit.Assert.assertNull(dateFormat35);
        org.junit.Assert.assertNull(timeZone36);
        org.junit.Assert.assertNull(numberFormat38);
        org.junit.Assert.assertNull(dateFormat39);
        org.junit.Assert.assertNull(dateFormat41);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat49);
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat51);
        org.junit.Assert.assertNotNull(stdDateFormat52);
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat54);
        org.junit.Assert.assertNull(numberFormat56);
        org.junit.Assert.assertNull(dateFormat57);
        org.junit.Assert.assertNull(timeZone58);
        org.junit.Assert.assertNull(numberFormat60);
        org.junit.Assert.assertNull(dateFormat61);
        org.junit.Assert.assertNull(dateFormat63);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat70);
        org.junit.Assert.assertNotNull(timeZone71);
        org.junit.Assert.assertEquals(timeZone71.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat72);
        org.junit.Assert.assertNull(numberFormat74);
        org.junit.Assert.assertNull(dateFormat75);
        org.junit.Assert.assertNull(timeZone76);
        org.junit.Assert.assertNull(numberFormat78);
        org.junit.Assert.assertNull(dateFormat79);
        org.junit.Assert.assertNull(dateFormat81);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "en_US");
        org.junit.Assert.assertNull(timeZone92);
        org.junit.Assert.assertNull(dateFormat93);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat5 = stdDateFormat4.getNumberFormat();
        java.text.DateFormat dateFormat6 = stdDateFormat4._formatISO8601_z;
        stdDateFormat0._formatPlain = stdDateFormat4;
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatRFC1123;
        boolean boolean10 = stdDateFormat0.looksLikeISO8601("hi!");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = stdDateFormat11.withTimeZone(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone15 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat14.withTimeZone(timeZone15);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat18 = stdDateFormat17.getNumberFormat();
        java.text.DateFormat dateFormat19 = stdDateFormat17._formatISO8601_z;
        java.util.TimeZone timeZone20 = stdDateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat22 = stdDateFormat21.getNumberFormat();
        java.text.DateFormat dateFormat23 = stdDateFormat21._formatISO8601_z;
        stdDateFormat17._formatPlain = stdDateFormat21;
        java.text.DateFormat dateFormat25 = stdDateFormat17._formatRFC1123;
        java.util.TimeZone timeZone26 = null;
        stdDateFormat17._timezone = timeZone26;
        java.util.Locale locale28 = stdDateFormat17._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15, locale28, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale28);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone33 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat32.withTimeZone(timeZone33);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat36 = stdDateFormat35.getNumberFormat();
        java.text.DateFormat dateFormat37 = stdDateFormat35._formatISO8601_z;
        java.util.TimeZone timeZone38 = stdDateFormat35.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat40 = stdDateFormat39.getNumberFormat();
        java.text.DateFormat dateFormat41 = stdDateFormat39._formatISO8601_z;
        stdDateFormat35._formatPlain = stdDateFormat39;
        java.text.DateFormat dateFormat43 = stdDateFormat35._formatRFC1123;
        java.util.TimeZone timeZone44 = null;
        stdDateFormat35._timezone = timeZone44;
        java.util.Locale locale46 = stdDateFormat35._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat48 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone33, locale46, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat49 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale46);
        stdDateFormat0.setTimeZone(timeZone12);
        java.text.NumberFormat numberFormat51 = stdDateFormat0.getNumberFormat();
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertNull(numberFormat5);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stdDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat13);
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNull(numberFormat18);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNull(timeZone20);
        org.junit.Assert.assertNull(numberFormat22);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat34);
        org.junit.Assert.assertNull(numberFormat36);
        org.junit.Assert.assertNull(dateFormat37);
        org.junit.Assert.assertNull(timeZone38);
        org.junit.Assert.assertNull(numberFormat40);
        org.junit.Assert.assertNull(dateFormat41);
        org.junit.Assert.assertNull(dateFormat43);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertNull(numberFormat51);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean6 = stdDateFormat4.looksLikeISO8601("");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat8 = stdDateFormat7.getNumberFormat();
        java.text.DateFormat dateFormat9 = stdDateFormat7._formatISO8601_z;
        java.util.TimeZone timeZone10 = stdDateFormat7.getTimeZone();
        boolean boolean12 = stdDateFormat7.looksLikeISO8601("");
        stdDateFormat7._lenient = false;
        stdDateFormat4._formatISO8601 = stdDateFormat7;
        java.text.DateFormat dateFormat16 = stdDateFormat7._formatPlain;
        java.util.Locale locale17 = stdDateFormat7._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = stdDateFormat3.format((java.lang.Object) stdDateFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(numberFormat8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.lang.String str2 = stdDateFormat0.format((java.lang.Object) 6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat0.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01T00:00:00.006+0000" + "'", str2, "1970-01-01T00:00:00.006+0000");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat0._formatISO8601 = dateFormat5;
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance(1);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat11 = dateFormat10.getNumberFormat();
        dateFormat9.setNumberFormat(numberFormat11);
        dateFormat8.setNumberFormat(numberFormat11);
        dateFormat5.setNumberFormat(numberFormat11);
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        java.lang.String str4 = stdDateFormat0.format((java.lang.Object) 10L);
        java.util.TimeZone timeZone5 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = stdDateFormat0.withTimeZone(timeZone5);
        java.lang.Object obj7 = null;
        boolean boolean8 = stdDateFormat6.equals(obj7);
        java.text.DateFormat dateFormat9 = stdDateFormat6._formatPlain;
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.010+0000" + "'", str4, "1970-01-01T00:00:00.010+0000");
        org.junit.Assert.assertNotNull(stdDateFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat5 = stdDateFormat4.getNumberFormat();
        java.text.DateFormat dateFormat6 = stdDateFormat4._formatISO8601_z;
        stdDateFormat0._formatPlain = stdDateFormat4;
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatRFC1123;
        java.util.TimeZone timeZone9 = null;
        stdDateFormat0._timezone = timeZone9;
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat13 = stdDateFormat12.getNumberFormat();
        java.text.DateFormat dateFormat14 = stdDateFormat12._formatISO8601_z;
        java.util.TimeZone timeZone15 = stdDateFormat12.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat17 = stdDateFormat16.getNumberFormat();
        java.text.DateFormat dateFormat18 = stdDateFormat16._formatISO8601_z;
        stdDateFormat12._formatPlain = stdDateFormat16;
        boolean boolean20 = stdDateFormat0.equals((java.lang.Object) stdDateFormat12);
        java.text.DateFormat dateFormat21 = stdDateFormat0._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean24 = stdDateFormat22.looksLikeISO8601("");
        boolean boolean25 = stdDateFormat0.equals((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = stdDateFormat0.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertNull(numberFormat5);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(numberFormat13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertNull(numberFormat17);
        org.junit.Assert.assertNull(dateFormat18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        boolean boolean5 = stdDateFormat0.looksLikeISO8601("");
        stdDateFormat0._lenient = false;
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        dateFormat8.setNumberFormat(numberFormat10);
        stdDateFormat0.setNumberFormat(numberFormat10);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone14 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = stdDateFormat13.withTimeZone(timeZone14);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat17 = stdDateFormat16.getNumberFormat();
        java.text.DateFormat dateFormat18 = stdDateFormat16._formatISO8601_z;
        java.util.TimeZone timeZone19 = stdDateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat21 = stdDateFormat20.getNumberFormat();
        java.text.DateFormat dateFormat22 = stdDateFormat20._formatISO8601_z;
        stdDateFormat16._formatPlain = stdDateFormat20;
        java.text.DateFormat dateFormat24 = stdDateFormat16._formatRFC1123;
        java.util.TimeZone timeZone25 = null;
        stdDateFormat16._timezone = timeZone25;
        java.util.Locale locale27 = stdDateFormat16._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone14, locale27, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = stdDateFormat0.withLocale(locale27);
        java.lang.Boolean boolean31 = stdDateFormat30._lenient;
        stdDateFormat30._clearFormats();
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(stdDateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat15);
        org.junit.Assert.assertNull(numberFormat17);
        org.junit.Assert.assertNull(dateFormat18);
        org.junit.Assert.assertNull(timeZone19);
        org.junit.Assert.assertNull(numberFormat21);
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertNull(dateFormat24);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        java.text.DateFormat dateFormat4 = stdDateFormat0._formatISO8601_z;
        stdDateFormat0.setLenient(true);
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertNull(dateFormat4);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean2 = stdDateFormat0.looksLikeISO8601("");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat4 = stdDateFormat3.getNumberFormat();
        java.text.DateFormat dateFormat5 = stdDateFormat3._formatISO8601_z;
        java.util.TimeZone timeZone6 = stdDateFormat3.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat8 = stdDateFormat7.getNumberFormat();
        java.text.DateFormat dateFormat9 = stdDateFormat7._formatISO8601_z;
        stdDateFormat3._formatPlain = stdDateFormat7;
        java.text.DateFormat dateFormat11 = stdDateFormat3._formatRFC1123;
        java.util.TimeZone timeZone12 = null;
        stdDateFormat3._timezone = timeZone12;
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat16 = stdDateFormat15.getNumberFormat();
        java.text.DateFormat dateFormat17 = stdDateFormat15._formatISO8601_z;
        java.util.TimeZone timeZone18 = stdDateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat20 = stdDateFormat19.getNumberFormat();
        java.text.DateFormat dateFormat21 = stdDateFormat19._formatISO8601_z;
        stdDateFormat15._formatPlain = stdDateFormat19;
        boolean boolean23 = stdDateFormat3.equals((java.lang.Object) stdDateFormat15);
        stdDateFormat0._formatISO8601_z = stdDateFormat3;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat5);
        org.junit.Assert.assertNull(timeZone6);
        org.junit.Assert.assertNull(numberFormat8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(numberFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(timeZone18);
        org.junit.Assert.assertNull(numberFormat20);
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat0._formatISO8601 = dateFormat5;
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone9 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat8.withTimeZone(timeZone9);
        stdDateFormat0._formatISO8601_z = stdDateFormat8;
        java.util.Calendar calendar12 = stdDateFormat8.getCalendar();
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNotNull(stdDateFormat8);
        org.junit.Assert.assertNotNull(stdDateFormat10);
        org.junit.Assert.assertNotNull(calendar12);
        org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone4 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat3.withTimeZone(timeZone4);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat7 = stdDateFormat6.getNumberFormat();
        java.text.DateFormat dateFormat8 = stdDateFormat6._formatISO8601_z;
        java.util.TimeZone timeZone9 = stdDateFormat6.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat11 = stdDateFormat10.getNumberFormat();
        java.text.DateFormat dateFormat12 = stdDateFormat10._formatISO8601_z;
        stdDateFormat6._formatPlain = stdDateFormat10;
        java.text.DateFormat dateFormat14 = stdDateFormat6._formatRFC1123;
        java.util.TimeZone timeZone15 = null;
        stdDateFormat6._timezone = timeZone15;
        java.util.Locale locale17 = stdDateFormat6._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4, locale17, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale17);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone22 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = stdDateFormat21.withTimeZone(timeZone22);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat25 = stdDateFormat24.getNumberFormat();
        java.text.DateFormat dateFormat26 = stdDateFormat24._formatISO8601_z;
        java.util.TimeZone timeZone27 = stdDateFormat24.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat29 = stdDateFormat28.getNumberFormat();
        java.text.DateFormat dateFormat30 = stdDateFormat28._formatISO8601_z;
        stdDateFormat24._formatPlain = stdDateFormat28;
        java.text.DateFormat dateFormat32 = stdDateFormat24._formatRFC1123;
        java.util.TimeZone timeZone33 = null;
        stdDateFormat24._timezone = timeZone33;
        java.util.Locale locale35 = stdDateFormat24._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22, locale35, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale35);
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat5);
        org.junit.Assert.assertNull(numberFormat7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(timeZone9);
        org.junit.Assert.assertNull(numberFormat11);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat23);
        org.junit.Assert.assertNull(numberFormat25);
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertNull(timeZone27);
        org.junit.Assert.assertNull(numberFormat29);
        org.junit.Assert.assertNull(dateFormat30);
        org.junit.Assert.assertNull(dateFormat32);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat39);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat5 = stdDateFormat4.getNumberFormat();
        java.text.DateFormat dateFormat6 = stdDateFormat4._formatISO8601_z;
        stdDateFormat0._formatPlain = stdDateFormat4;
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatRFC1123;
        java.util.TimeZone timeZone9 = stdDateFormat0._timezone;
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertNull(numberFormat5);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(timeZone9);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean1 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone3 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat2.withTimeZone(timeZone3);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat6 = stdDateFormat5.getNumberFormat();
        java.text.DateFormat dateFormat7 = stdDateFormat5._formatISO8601_z;
        java.util.TimeZone timeZone8 = stdDateFormat5.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat10 = stdDateFormat9.getNumberFormat();
        java.text.DateFormat dateFormat11 = stdDateFormat9._formatISO8601_z;
        stdDateFormat5._formatPlain = stdDateFormat9;
        java.text.DateFormat dateFormat13 = stdDateFormat5._formatRFC1123;
        java.util.TimeZone timeZone14 = null;
        stdDateFormat5._timezone = timeZone14;
        java.util.Locale locale16 = stdDateFormat5._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale16, (java.lang.Boolean) false);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean21 = stdDateFormat20.isLenient();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(timeZone8);
        org.junit.Assert.assertNull(numberFormat10);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(stdDateFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        boolean boolean5 = stdDateFormat0.looksLikeISO8601("");
        stdDateFormat0._lenient = false;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = stdDateFormat0.format(date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat5 = stdDateFormat4.getNumberFormat();
        java.text.DateFormat dateFormat6 = stdDateFormat4._formatISO8601_z;
        stdDateFormat0._formatPlain = stdDateFormat4;
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatRFC1123;
        java.util.TimeZone timeZone9 = null;
        stdDateFormat0._timezone = timeZone9;
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat13 = stdDateFormat12.getNumberFormat();
        java.text.DateFormat dateFormat14 = stdDateFormat12._formatISO8601_z;
        java.util.TimeZone timeZone15 = stdDateFormat12.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat17 = stdDateFormat16.getNumberFormat();
        java.text.DateFormat dateFormat18 = stdDateFormat16._formatISO8601_z;
        stdDateFormat12._formatPlain = stdDateFormat16;
        boolean boolean20 = stdDateFormat0.equals((java.lang.Object) stdDateFormat12);
        java.text.DateFormat dateFormat21 = stdDateFormat0._formatRFC1123;
        java.text.DateFormat dateFormat22 = stdDateFormat0._formatISO8601_z;
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertNull(numberFormat5);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(numberFormat13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertNull(numberFormat17);
        org.junit.Assert.assertNull(dateFormat18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertNull(dateFormat22);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        boolean boolean5 = stdDateFormat0.looksLikeISO8601("");
        stdDateFormat0._lenient = false;
        java.lang.Boolean boolean8 = stdDateFormat0._lenient;
        java.util.TimeZone timeZone9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = stdDateFormat10.withTimeZone(timeZone11);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat14 = stdDateFormat13.getNumberFormat();
        java.text.DateFormat dateFormat15 = stdDateFormat13._formatISO8601_z;
        java.util.TimeZone timeZone16 = stdDateFormat13.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat18 = stdDateFormat17.getNumberFormat();
        java.text.DateFormat dateFormat19 = stdDateFormat17._formatISO8601_z;
        stdDateFormat13._formatPlain = stdDateFormat17;
        java.text.DateFormat dateFormat21 = stdDateFormat13._formatRFC1123;
        java.util.TimeZone timeZone22 = null;
        stdDateFormat13._timezone = timeZone22;
        java.util.Locale locale24 = stdDateFormat13._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone11, locale24, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9, locale24);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone9);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = stdDateFormat0.withTimeZone(timeZone9);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance(1);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        dateFormat32.setNumberFormat(numberFormat34);
        dateFormat31.setNumberFormat(numberFormat34);
        stdDateFormat0.setNumberFormat(numberFormat34);
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat12);
        org.junit.Assert.assertNull(numberFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(timeZone16);
        org.junit.Assert.assertNull(numberFormat18);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(stdDateFormat29);
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(numberFormat34);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        stdDateFormat0._lenient = false;
        java.lang.String str7 = stdDateFormat0.format((java.lang.Object) (short) 10);
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T00:00:00.010+0000" + "'", str7, "1970-01-01T00:00:00.010+0000");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        boolean boolean5 = stdDateFormat0.looksLikeISO8601("");
        stdDateFormat0._lenient = false;
        java.lang.Boolean boolean8 = stdDateFormat0._lenient;
        java.util.TimeZone timeZone9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = stdDateFormat10.withTimeZone(timeZone11);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat14 = stdDateFormat13.getNumberFormat();
        java.text.DateFormat dateFormat15 = stdDateFormat13._formatISO8601_z;
        java.util.TimeZone timeZone16 = stdDateFormat13.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat18 = stdDateFormat17.getNumberFormat();
        java.text.DateFormat dateFormat19 = stdDateFormat17._formatISO8601_z;
        stdDateFormat13._formatPlain = stdDateFormat17;
        java.text.DateFormat dateFormat21 = stdDateFormat13._formatRFC1123;
        java.util.TimeZone timeZone22 = null;
        stdDateFormat13._timezone = timeZone22;
        java.util.Locale locale24 = stdDateFormat13._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone11, locale24, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9, locale24);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone9);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = stdDateFormat0.withTimeZone(timeZone9);
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone9);
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat12);
        org.junit.Assert.assertNull(numberFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(timeZone16);
        org.junit.Assert.assertNull(numberFormat18);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(stdDateFormat29);
        org.junit.Assert.assertNotNull(dateFormat30);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        boolean boolean2 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stdDateFormat0.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = stdDateFormat0.clone();
        java.text.DateFormat dateFormat4 = stdDateFormat0._formatISO8601_z;
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat3);
        org.junit.Assert.assertNull(dateFormat4);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        boolean boolean5 = stdDateFormat0.looksLikeISO8601("");
        stdDateFormat0._lenient = false;
        java.lang.Boolean boolean8 = stdDateFormat0._lenient;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone10 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = stdDateFormat9.withTimeZone(timeZone10);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat12.withTimeZone(timeZone13);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat16 = stdDateFormat15.getNumberFormat();
        java.text.DateFormat dateFormat17 = stdDateFormat15._formatISO8601_z;
        java.util.TimeZone timeZone18 = stdDateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat20 = stdDateFormat19.getNumberFormat();
        java.text.DateFormat dateFormat21 = stdDateFormat19._formatISO8601_z;
        stdDateFormat15._formatPlain = stdDateFormat19;
        java.text.DateFormat dateFormat23 = stdDateFormat15._formatRFC1123;
        java.util.TimeZone timeZone24 = null;
        stdDateFormat15._timezone = timeZone24;
        java.util.Locale locale26 = stdDateFormat15._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone13, locale26, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10, locale26);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = stdDateFormat0.withTimeZone(timeZone10);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat32 = stdDateFormat31.getNumberFormat();
        java.text.DateFormat dateFormat33 = stdDateFormat31._formatISO8601_z;
        java.util.TimeZone timeZone34 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat31.withTimeZone(timeZone34);
        boolean boolean37 = stdDateFormat31.equals((java.lang.Object) 4);
        boolean boolean38 = stdDateFormat31.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone40 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat41 = stdDateFormat39.withTimeZone(timeZone40);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat42 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone43 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat44 = stdDateFormat42.withTimeZone(timeZone43);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat45 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone46 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat47 = stdDateFormat45.withTimeZone(timeZone46);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat48 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat49 = stdDateFormat48.getNumberFormat();
        java.text.DateFormat dateFormat50 = stdDateFormat48._formatISO8601_z;
        java.util.TimeZone timeZone51 = stdDateFormat48.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat52 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat53 = stdDateFormat52.getNumberFormat();
        java.text.DateFormat dateFormat54 = stdDateFormat52._formatISO8601_z;
        stdDateFormat48._formatPlain = stdDateFormat52;
        java.text.DateFormat dateFormat56 = stdDateFormat48._formatRFC1123;
        java.util.TimeZone timeZone57 = null;
        stdDateFormat48._timezone = timeZone57;
        java.util.Locale locale59 = stdDateFormat48._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat61 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone46, locale59, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat62 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone43, locale59);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat63 = stdDateFormat41.withTimeZone(timeZone43);
        boolean boolean64 = stdDateFormat31.equals((java.lang.Object) timeZone43);
        stdDateFormat30._timezone = timeZone43;
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat11);
        org.junit.Assert.assertNotNull(stdDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNull(numberFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(timeZone18);
        org.junit.Assert.assertNull(numberFormat20);
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat30);
        org.junit.Assert.assertNull(numberFormat32);
        org.junit.Assert.assertNull(dateFormat33);
        org.junit.Assert.assertNotNull(stdDateFormat35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(stdDateFormat39);
        org.junit.Assert.assertNotNull(stdDateFormat41);
        org.junit.Assert.assertNotNull(stdDateFormat42);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat44);
        org.junit.Assert.assertNotNull(stdDateFormat45);
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat47);
        org.junit.Assert.assertNull(numberFormat49);
        org.junit.Assert.assertNull(dateFormat50);
        org.junit.Assert.assertNull(timeZone51);
        org.junit.Assert.assertNull(numberFormat53);
        org.junit.Assert.assertNull(dateFormat54);
        org.junit.Assert.assertNull(dateFormat56);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean5 = stdDateFormat4.isLenient();
        java.text.DateFormat dateFormat6 = stdDateFormat4._formatPlain;
        java.lang.String str7 = stdDateFormat4.toString();
        java.text.DateFormat dateFormat8 = stdDateFormat4._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean11 = stdDateFormat9.looksLikeISO8601("");
        stdDateFormat9._lenient = true;
        boolean boolean14 = stdDateFormat4.equals((java.lang.Object) stdDateFormat9);
        java.lang.Boolean boolean15 = stdDateFormat9._lenient;
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)" + "'", str7, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        boolean boolean5 = stdDateFormat0.looksLikeISO8601("");
        stdDateFormat0._lenient = false;
        java.lang.String str8 = stdDateFormat0.toString();
        stdDateFormat0.setLenient(true);
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str8, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean6 = stdDateFormat0.equals((java.lang.Object) 4);
        boolean boolean7 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone9 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat8.withTimeZone(timeZone9);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = stdDateFormat11.withTimeZone(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone15 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat14.withTimeZone(timeZone15);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat18 = stdDateFormat17.getNumberFormat();
        java.text.DateFormat dateFormat19 = stdDateFormat17._formatISO8601_z;
        java.util.TimeZone timeZone20 = stdDateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat22 = stdDateFormat21.getNumberFormat();
        java.text.DateFormat dateFormat23 = stdDateFormat21._formatISO8601_z;
        stdDateFormat17._formatPlain = stdDateFormat21;
        java.text.DateFormat dateFormat25 = stdDateFormat17._formatRFC1123;
        java.util.TimeZone timeZone26 = null;
        stdDateFormat17._timezone = timeZone26;
        java.util.Locale locale28 = stdDateFormat17._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15, locale28, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale28);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = stdDateFormat10.withTimeZone(timeZone12);
        boolean boolean33 = stdDateFormat0.equals((java.lang.Object) timeZone12);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stdDateFormat8);
        org.junit.Assert.assertNotNull(stdDateFormat10);
        org.junit.Assert.assertNotNull(stdDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat13);
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNull(numberFormat18);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNull(timeZone20);
        org.junit.Assert.assertNull(numberFormat22);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateFormat34);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(1);
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        dateFormat1.setNumberFormat(numberFormat4);
        java.text.NumberFormat numberFormat7 = dateFormat1.getNumberFormat();
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(numberFormat7);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean5 = stdDateFormat4.isLenient();
        java.lang.Boolean boolean6 = stdDateFormat4._lenient;
        stdDateFormat4._clearFormats();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean10 = stdDateFormat8.looksLikeISO8601("");
        stdDateFormat4._formatISO8601 = stdDateFormat8;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat13 = stdDateFormat12.getNumberFormat();
        java.text.DateFormat dateFormat14 = stdDateFormat12._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = stdDateFormat12.clone();
        stdDateFormat15._clearFormats();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat18 = stdDateFormat17.getNumberFormat();
        java.text.DateFormat dateFormat19 = stdDateFormat17._formatISO8601_z;
        java.util.TimeZone timeZone20 = stdDateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat22 = stdDateFormat21.getNumberFormat();
        java.text.DateFormat dateFormat23 = stdDateFormat21._formatISO8601_z;
        stdDateFormat17._formatPlain = stdDateFormat21;
        java.text.DateFormat dateFormat25 = stdDateFormat17._formatRFC1123;
        java.util.TimeZone timeZone26 = null;
        stdDateFormat17._timezone = timeZone26;
        java.text.DateFormat dateFormat28 = stdDateFormat17._formatISO8601;
        java.util.TimeZone timeZone29 = stdDateFormat17.getTimeZone();
        stdDateFormat15._formatISO8601_z = stdDateFormat17;
        java.util.TimeZone timeZone31 = null;
        java.util.Locale locale32 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone31, locale32, (java.lang.Boolean) true);
        stdDateFormat15._formatPlain = stdDateFormat34;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = stdDateFormat8.format((java.lang.Object) stdDateFormat34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(numberFormat13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNotNull(stdDateFormat15);
        org.junit.Assert.assertNull(numberFormat18);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNull(timeZone20);
        org.junit.Assert.assertNull(numberFormat22);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertNull(dateFormat28);
        org.junit.Assert.assertNull(timeZone29);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat2 = stdDateFormat1.getNumberFormat();
        java.text.DateFormat dateFormat3 = stdDateFormat1._formatISO8601_z;
        java.util.TimeZone timeZone4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat1.withTimeZone(timeZone4);
        boolean boolean7 = stdDateFormat1.equals((java.lang.Object) 4);
        boolean boolean8 = stdDateFormat1.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone10 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = stdDateFormat9.withTimeZone(timeZone10);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat12.withTimeZone(timeZone13);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat16 = stdDateFormat15.getNumberFormat();
        java.text.DateFormat dateFormat17 = stdDateFormat15._formatISO8601_z;
        java.util.TimeZone timeZone18 = stdDateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat20 = stdDateFormat19.getNumberFormat();
        java.text.DateFormat dateFormat21 = stdDateFormat19._formatISO8601_z;
        stdDateFormat15._formatPlain = stdDateFormat19;
        java.text.DateFormat dateFormat23 = stdDateFormat15._formatRFC1123;
        java.util.TimeZone timeZone24 = null;
        stdDateFormat15._timezone = timeZone24;
        java.util.Locale locale26 = stdDateFormat15._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone13, locale26, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10, locale26);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone31 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = stdDateFormat30.withTimeZone(timeZone31);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat34 = stdDateFormat33.getNumberFormat();
        java.text.DateFormat dateFormat35 = stdDateFormat33._formatISO8601_z;
        java.util.TimeZone timeZone36 = stdDateFormat33.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat38 = stdDateFormat37.getNumberFormat();
        java.text.DateFormat dateFormat39 = stdDateFormat37._formatISO8601_z;
        stdDateFormat33._formatPlain = stdDateFormat37;
        java.text.DateFormat dateFormat41 = stdDateFormat33._formatRFC1123;
        java.util.TimeZone timeZone42 = null;
        stdDateFormat33._timezone = timeZone42;
        java.util.Locale locale44 = stdDateFormat33._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone31, locale44, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat47 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10, locale44);
        stdDateFormat1._timezone = timeZone10;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat49 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone50 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat51 = stdDateFormat49.withTimeZone(timeZone50);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat52 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone53 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat54 = stdDateFormat52.withTimeZone(timeZone53);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat55 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat56 = stdDateFormat55.getNumberFormat();
        java.text.DateFormat dateFormat57 = stdDateFormat55._formatISO8601_z;
        java.util.TimeZone timeZone58 = stdDateFormat55.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat59 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat60 = stdDateFormat59.getNumberFormat();
        java.text.DateFormat dateFormat61 = stdDateFormat59._formatISO8601_z;
        stdDateFormat55._formatPlain = stdDateFormat59;
        java.text.DateFormat dateFormat63 = stdDateFormat55._formatRFC1123;
        java.util.TimeZone timeZone64 = null;
        stdDateFormat55._timezone = timeZone64;
        java.util.Locale locale66 = stdDateFormat55._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat68 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone53, locale66, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat69 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone50, locale66);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat70 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone71 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat72 = stdDateFormat70.withTimeZone(timeZone71);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat73 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat74 = stdDateFormat73.getNumberFormat();
        java.text.DateFormat dateFormat75 = stdDateFormat73._formatISO8601_z;
        java.util.TimeZone timeZone76 = stdDateFormat73.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat77 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat78 = stdDateFormat77.getNumberFormat();
        java.text.DateFormat dateFormat79 = stdDateFormat77._formatISO8601_z;
        stdDateFormat73._formatPlain = stdDateFormat77;
        java.text.DateFormat dateFormat81 = stdDateFormat73._formatRFC1123;
        java.util.TimeZone timeZone82 = null;
        stdDateFormat73._timezone = timeZone82;
        java.util.Locale locale84 = stdDateFormat73._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat86 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone71, locale84, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat87 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone50, locale84);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat89 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10, locale84, (java.lang.Boolean) true);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat90 = java.text.DateFormat.getTimeInstance((int) (short) 100, locale84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat2);
        org.junit.Assert.assertNull(dateFormat3);
        org.junit.Assert.assertNotNull(stdDateFormat5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat11);
        org.junit.Assert.assertNotNull(stdDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNull(numberFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(timeZone18);
        org.junit.Assert.assertNull(numberFormat20);
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat32);
        org.junit.Assert.assertNull(numberFormat34);
        org.junit.Assert.assertNull(dateFormat35);
        org.junit.Assert.assertNull(timeZone36);
        org.junit.Assert.assertNull(numberFormat38);
        org.junit.Assert.assertNull(dateFormat39);
        org.junit.Assert.assertNull(dateFormat41);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat49);
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat51);
        org.junit.Assert.assertNotNull(stdDateFormat52);
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat54);
        org.junit.Assert.assertNull(numberFormat56);
        org.junit.Assert.assertNull(dateFormat57);
        org.junit.Assert.assertNull(timeZone58);
        org.junit.Assert.assertNull(numberFormat60);
        org.junit.Assert.assertNull(dateFormat61);
        org.junit.Assert.assertNull(dateFormat63);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat70);
        org.junit.Assert.assertNotNull(timeZone71);
        org.junit.Assert.assertEquals(timeZone71.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat72);
        org.junit.Assert.assertNull(numberFormat74);
        org.junit.Assert.assertNull(dateFormat75);
        org.junit.Assert.assertNull(timeZone76);
        org.junit.Assert.assertNull(numberFormat78);
        org.junit.Assert.assertNull(dateFormat79);
        org.junit.Assert.assertNull(dateFormat81);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "en_US");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = stdDateFormat0.clone();
        stdDateFormat3._clearFormats();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat6 = stdDateFormat5.getNumberFormat();
        java.text.DateFormat dateFormat7 = stdDateFormat5._formatISO8601_z;
        java.util.TimeZone timeZone8 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat5.withTimeZone(timeZone8);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat11 = stdDateFormat10.getNumberFormat();
        java.text.DateFormat dateFormat12 = stdDateFormat10._formatISO8601_z;
        java.util.TimeZone timeZone13 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat10.withTimeZone(timeZone13);
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat10._formatISO8601 = dateFormat15;
        java.util.Calendar calendar17 = dateFormat15.getCalendar();
        stdDateFormat5.setCalendar(calendar17);
        stdDateFormat3.setCalendar(calendar17);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat21 = stdDateFormat20.getNumberFormat();
        java.text.DateFormat dateFormat22 = stdDateFormat20._formatISO8601_z;
        java.util.TimeZone timeZone23 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = stdDateFormat20.withTimeZone(timeZone23);
        boolean boolean25 = stdDateFormat24.isLenient();
        java.text.DateFormat dateFormat26 = stdDateFormat24._formatPlain;
        java.lang.String str27 = stdDateFormat24.toString();
        java.text.DateFormat dateFormat28 = stdDateFormat24._formatPlain;
        java.lang.StringBuffer stringBuffer29 = null;
        java.text.FieldPosition fieldPosition30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer31 = stdDateFormat3.format((java.lang.Object) dateFormat28, stringBuffer29, fieldPosition30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat3);
        org.junit.Assert.assertNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNull(numberFormat11);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(calendar17);
        org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNull(numberFormat21);
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertNotNull(stdDateFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)" + "'", str27, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat28);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone4 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat3.withTimeZone(timeZone4);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = stdDateFormat6.withTimeZone(timeZone7);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat10 = stdDateFormat9.getNumberFormat();
        java.text.DateFormat dateFormat11 = stdDateFormat9._formatISO8601_z;
        java.util.TimeZone timeZone12 = stdDateFormat9.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat14 = stdDateFormat13.getNumberFormat();
        java.text.DateFormat dateFormat15 = stdDateFormat13._formatISO8601_z;
        stdDateFormat9._formatPlain = stdDateFormat13;
        java.text.DateFormat dateFormat17 = stdDateFormat9._formatRFC1123;
        java.util.TimeZone timeZone18 = null;
        stdDateFormat9._timezone = timeZone18;
        java.util.Locale locale20 = stdDateFormat9._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone7, locale20, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4, locale20);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = stdDateFormat2.withTimeZone(timeZone4);
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4);
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat5);
        org.junit.Assert.assertNotNull(stdDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat8);
        org.junit.Assert.assertNull(numberFormat10);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNull(numberFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat24);
        org.junit.Assert.assertNotNull(dateFormat25);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        java.text.DateFormat dateFormat3 = stdDateFormat0._formatPlain;
        boolean boolean4 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat5 = stdDateFormat0._formatISO8601;
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertNull(dateFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dateFormat5);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        java.lang.String str4 = stdDateFormat0.format((java.lang.Object) 10L);
        java.util.TimeZone timeZone5 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = stdDateFormat0.withTimeZone(timeZone5);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat8 = stdDateFormat7.getNumberFormat();
        stdDateFormat7._lenient = false;
        stdDateFormat0._formatISO8601_z = stdDateFormat7;
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatISO8601_z;
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.010+0000" + "'", str4, "1970-01-01T00:00:00.010+0000");
        org.junit.Assert.assertNotNull(stdDateFormat6);
        org.junit.Assert.assertNull(numberFormat8);
        org.junit.Assert.assertNotNull(dateFormat12);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatRFC1123;
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        java.util.Calendar calendar5 = dateFormat3.getCalendar();
        stdDateFormat0._formatPlain = dateFormat3;
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = stdDateFormat0.parseAsISO8601("yyyy-MM-dd", parsePosition8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        stdDateFormat0._formatISO8601 = dateFormat1;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone5 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = stdDateFormat4.withTimeZone(timeZone5);
        stdDateFormat0._formatISO8601_z = stdDateFormat4;
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat10 = stdDateFormat9.getNumberFormat();
        java.text.DateFormat dateFormat11 = stdDateFormat9._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = stdDateFormat9.clone();
        java.util.Date date14 = stdDateFormat9.parse("1970-01-01T00:00:00.010+0000");
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = stdDateFormat0.format(date14, stringBuffer15, fieldPosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNotNull(stdDateFormat6);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(numberFormat10);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNotNull(stdDateFormat12);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Dec 31 16:00:00 PST 1969");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        java.lang.String str4 = stdDateFormat0.format((java.lang.Object) 10L);
        java.text.DateFormat dateFormat5 = stdDateFormat0._formatISO8601_z;
        java.text.DateFormat dateFormat6 = stdDateFormat0._formatRFC1123;
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatRFC1123;
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.010+0000" + "'", str4, "1970-01-01T00:00:00.010+0000");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat7);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 100, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat6 = stdDateFormat5.getNumberFormat();
        java.text.DateFormat dateFormat7 = stdDateFormat5._formatISO8601_z;
        java.util.TimeZone timeZone8 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat5.withTimeZone(timeZone8);
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat5._formatISO8601 = dateFormat10;
        java.util.Calendar calendar12 = dateFormat10.getCalendar();
        stdDateFormat0.setCalendar(calendar12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone15 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat14.withTimeZone(timeZone15);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = stdDateFormat17.withTimeZone(timeZone18);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone21 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = stdDateFormat20.withTimeZone(timeZone21);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat24 = stdDateFormat23.getNumberFormat();
        java.text.DateFormat dateFormat25 = stdDateFormat23._formatISO8601_z;
        java.util.TimeZone timeZone26 = stdDateFormat23.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat28 = stdDateFormat27.getNumberFormat();
        java.text.DateFormat dateFormat29 = stdDateFormat27._formatISO8601_z;
        stdDateFormat23._formatPlain = stdDateFormat27;
        java.text.DateFormat dateFormat31 = stdDateFormat23._formatRFC1123;
        java.util.TimeZone timeZone32 = null;
        stdDateFormat23._timezone = timeZone32;
        java.util.Locale locale34 = stdDateFormat23._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21, locale34, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18, locale34);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = stdDateFormat16.withTimeZone(timeZone18);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = stdDateFormat0.withTimeZone(timeZone18);
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone18);
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(calendar12);
        org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNotNull(stdDateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat19);
        org.junit.Assert.assertNotNull(stdDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat22);
        org.junit.Assert.assertNull(numberFormat24);
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertNull(timeZone26);
        org.junit.Assert.assertNull(numberFormat28);
        org.junit.Assert.assertNull(dateFormat29);
        org.junit.Assert.assertNull(dateFormat31);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat38);
        org.junit.Assert.assertNotNull(stdDateFormat39);
        org.junit.Assert.assertNotNull(dateFormat40);
        org.junit.Assert.assertNotNull(dateFormat41);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat4 = stdDateFormat3.getNumberFormat();
        java.text.DateFormat dateFormat5 = stdDateFormat3._formatISO8601_z;
        java.util.TimeZone timeZone6 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = stdDateFormat3.withTimeZone(timeZone6);
        boolean boolean9 = stdDateFormat3.equals((java.lang.Object) 4);
        boolean boolean10 = stdDateFormat3.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = stdDateFormat11.withTimeZone(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone15 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat14.withTimeZone(timeZone15);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat18 = stdDateFormat17.getNumberFormat();
        java.text.DateFormat dateFormat19 = stdDateFormat17._formatISO8601_z;
        java.util.TimeZone timeZone20 = stdDateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat22 = stdDateFormat21.getNumberFormat();
        java.text.DateFormat dateFormat23 = stdDateFormat21._formatISO8601_z;
        stdDateFormat17._formatPlain = stdDateFormat21;
        java.text.DateFormat dateFormat25 = stdDateFormat17._formatRFC1123;
        java.util.TimeZone timeZone26 = null;
        stdDateFormat17._timezone = timeZone26;
        java.util.Locale locale28 = stdDateFormat17._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15, locale28, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale28);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone33 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat32.withTimeZone(timeZone33);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat36 = stdDateFormat35.getNumberFormat();
        java.text.DateFormat dateFormat37 = stdDateFormat35._formatISO8601_z;
        java.util.TimeZone timeZone38 = stdDateFormat35.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat40 = stdDateFormat39.getNumberFormat();
        java.text.DateFormat dateFormat41 = stdDateFormat39._formatISO8601_z;
        stdDateFormat35._formatPlain = stdDateFormat39;
        java.text.DateFormat dateFormat43 = stdDateFormat35._formatRFC1123;
        java.util.TimeZone timeZone44 = null;
        stdDateFormat35._timezone = timeZone44;
        java.util.Locale locale46 = stdDateFormat35._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat48 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone33, locale46, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat49 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale46);
        stdDateFormat3._timezone = timeZone12;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat51 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone52 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat53 = stdDateFormat51.withTimeZone(timeZone52);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat54 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone55 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat56 = stdDateFormat54.withTimeZone(timeZone55);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat57 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat58 = stdDateFormat57.getNumberFormat();
        java.text.DateFormat dateFormat59 = stdDateFormat57._formatISO8601_z;
        java.util.TimeZone timeZone60 = stdDateFormat57.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat61 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat62 = stdDateFormat61.getNumberFormat();
        java.text.DateFormat dateFormat63 = stdDateFormat61._formatISO8601_z;
        stdDateFormat57._formatPlain = stdDateFormat61;
        java.text.DateFormat dateFormat65 = stdDateFormat57._formatRFC1123;
        java.util.TimeZone timeZone66 = null;
        stdDateFormat57._timezone = timeZone66;
        java.util.Locale locale68 = stdDateFormat57._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat70 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone55, locale68, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat71 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone52, locale68);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat72 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone73 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat74 = stdDateFormat72.withTimeZone(timeZone73);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat75 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat76 = stdDateFormat75.getNumberFormat();
        java.text.DateFormat dateFormat77 = stdDateFormat75._formatISO8601_z;
        java.util.TimeZone timeZone78 = stdDateFormat75.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat79 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat80 = stdDateFormat79.getNumberFormat();
        java.text.DateFormat dateFormat81 = stdDateFormat79._formatISO8601_z;
        stdDateFormat75._formatPlain = stdDateFormat79;
        java.text.DateFormat dateFormat83 = stdDateFormat75._formatRFC1123;
        java.util.TimeZone timeZone84 = null;
        stdDateFormat75._timezone = timeZone84;
        java.util.Locale locale86 = stdDateFormat75._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat88 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone73, locale86, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat89 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone52, locale86);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat91 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale86, (java.lang.Boolean) true);
        java.text.DateFormat dateFormat92 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1, locale86);
        java.text.DateFormat dateFormat93 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat5);
        org.junit.Assert.assertNotNull(stdDateFormat7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stdDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat13);
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNull(numberFormat18);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNull(timeZone20);
        org.junit.Assert.assertNull(numberFormat22);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat34);
        org.junit.Assert.assertNull(numberFormat36);
        org.junit.Assert.assertNull(dateFormat37);
        org.junit.Assert.assertNull(timeZone38);
        org.junit.Assert.assertNull(numberFormat40);
        org.junit.Assert.assertNull(dateFormat41);
        org.junit.Assert.assertNull(dateFormat43);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat51);
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat53);
        org.junit.Assert.assertNotNull(stdDateFormat54);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat56);
        org.junit.Assert.assertNull(numberFormat58);
        org.junit.Assert.assertNull(dateFormat59);
        org.junit.Assert.assertNull(timeZone60);
        org.junit.Assert.assertNull(numberFormat62);
        org.junit.Assert.assertNull(dateFormat63);
        org.junit.Assert.assertNull(dateFormat65);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat72);
        org.junit.Assert.assertNotNull(timeZone73);
        org.junit.Assert.assertEquals(timeZone73.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat74);
        org.junit.Assert.assertNull(numberFormat76);
        org.junit.Assert.assertNull(dateFormat77);
        org.junit.Assert.assertNull(timeZone78);
        org.junit.Assert.assertNull(numberFormat80);
        org.junit.Assert.assertNull(dateFormat81);
        org.junit.Assert.assertNull(dateFormat83);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat92);
        org.junit.Assert.assertNotNull(dateFormat93);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        java.util.Calendar calendar3 = null;
        stdDateFormat2.setCalendar(calendar3);
        java.text.DateFormat dateFormat5 = stdDateFormat2._formatISO8601_z;
        java.text.DateFormat dateFormat6 = stdDateFormat2._formatISO8601_z;
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = stdDateFormat2.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertNull(dateFormat5);
        org.junit.Assert.assertNull(dateFormat6);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 0, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean6 = stdDateFormat0.equals((java.lang.Object) 4);
        boolean boolean7 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean10 = stdDateFormat8.looksLikeISO8601("");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat12 = stdDateFormat11.getNumberFormat();
        java.text.DateFormat dateFormat13 = stdDateFormat11._formatISO8601_z;
        java.util.TimeZone timeZone14 = stdDateFormat11.getTimeZone();
        boolean boolean16 = stdDateFormat11.looksLikeISO8601("");
        stdDateFormat11._lenient = false;
        stdDateFormat8._formatISO8601 = stdDateFormat11;
        stdDateFormat0._formatRFC1123 = stdDateFormat11;
        java.text.DateFormat dateFormat21 = stdDateFormat0._formatPlain;
        java.util.Locale locale22 = stdDateFormat0._locale;
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(numberFormat12);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNull(timeZone14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat5 = stdDateFormat4.getNumberFormat();
        java.text.DateFormat dateFormat6 = stdDateFormat4._formatISO8601_z;
        stdDateFormat0._formatPlain = stdDateFormat4;
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatRFC1123;
        java.util.TimeZone timeZone9 = null;
        stdDateFormat0._timezone = timeZone9;
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatPlain;
        java.lang.Class<?> wildcardClass12 = dateFormat11.getClass();
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertNull(numberFormat5);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat2 = stdDateFormat1.getNumberFormat();
        java.text.DateFormat dateFormat3 = stdDateFormat1._formatISO8601_z;
        java.util.TimeZone timeZone4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat1.withTimeZone(timeZone4);
        boolean boolean7 = stdDateFormat1.equals((java.lang.Object) 4);
        boolean boolean8 = stdDateFormat1.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone10 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = stdDateFormat9.withTimeZone(timeZone10);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat12.withTimeZone(timeZone13);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat16 = stdDateFormat15.getNumberFormat();
        java.text.DateFormat dateFormat17 = stdDateFormat15._formatISO8601_z;
        java.util.TimeZone timeZone18 = stdDateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat20 = stdDateFormat19.getNumberFormat();
        java.text.DateFormat dateFormat21 = stdDateFormat19._formatISO8601_z;
        stdDateFormat15._formatPlain = stdDateFormat19;
        java.text.DateFormat dateFormat23 = stdDateFormat15._formatRFC1123;
        java.util.TimeZone timeZone24 = null;
        stdDateFormat15._timezone = timeZone24;
        java.util.Locale locale26 = stdDateFormat15._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone13, locale26, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10, locale26);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone31 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = stdDateFormat30.withTimeZone(timeZone31);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat34 = stdDateFormat33.getNumberFormat();
        java.text.DateFormat dateFormat35 = stdDateFormat33._formatISO8601_z;
        java.util.TimeZone timeZone36 = stdDateFormat33.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat38 = stdDateFormat37.getNumberFormat();
        java.text.DateFormat dateFormat39 = stdDateFormat37._formatISO8601_z;
        stdDateFormat33._formatPlain = stdDateFormat37;
        java.text.DateFormat dateFormat41 = stdDateFormat33._formatRFC1123;
        java.util.TimeZone timeZone42 = null;
        stdDateFormat33._timezone = timeZone42;
        java.util.Locale locale44 = stdDateFormat33._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone31, locale44, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat47 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10, locale44);
        stdDateFormat1._timezone = timeZone10;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat49 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone50 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat51 = stdDateFormat49.withTimeZone(timeZone50);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat52 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone53 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat54 = stdDateFormat52.withTimeZone(timeZone53);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat55 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat56 = stdDateFormat55.getNumberFormat();
        java.text.DateFormat dateFormat57 = stdDateFormat55._formatISO8601_z;
        java.util.TimeZone timeZone58 = stdDateFormat55.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat59 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat60 = stdDateFormat59.getNumberFormat();
        java.text.DateFormat dateFormat61 = stdDateFormat59._formatISO8601_z;
        stdDateFormat55._formatPlain = stdDateFormat59;
        java.text.DateFormat dateFormat63 = stdDateFormat55._formatRFC1123;
        java.util.TimeZone timeZone64 = null;
        stdDateFormat55._timezone = timeZone64;
        java.util.Locale locale66 = stdDateFormat55._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat68 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone53, locale66, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat69 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone50, locale66);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat70 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone71 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat72 = stdDateFormat70.withTimeZone(timeZone71);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat73 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat74 = stdDateFormat73.getNumberFormat();
        java.text.DateFormat dateFormat75 = stdDateFormat73._formatISO8601_z;
        java.util.TimeZone timeZone76 = stdDateFormat73.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat77 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat78 = stdDateFormat77.getNumberFormat();
        java.text.DateFormat dateFormat79 = stdDateFormat77._formatISO8601_z;
        stdDateFormat73._formatPlain = stdDateFormat77;
        java.text.DateFormat dateFormat81 = stdDateFormat73._formatRFC1123;
        java.util.TimeZone timeZone82 = null;
        stdDateFormat73._timezone = timeZone82;
        java.util.Locale locale84 = stdDateFormat73._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat86 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone71, locale84, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat87 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone50, locale84);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat89 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10, locale84, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat91 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale84, (java.lang.Boolean) true);
        java.util.TimeZone timeZone92 = stdDateFormat91.getTimeZone();
        stdDateFormat91._lenient = false;
        org.junit.Assert.assertNull(numberFormat2);
        org.junit.Assert.assertNull(dateFormat3);
        org.junit.Assert.assertNotNull(stdDateFormat5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat11);
        org.junit.Assert.assertNotNull(stdDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNull(numberFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(timeZone18);
        org.junit.Assert.assertNull(numberFormat20);
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat32);
        org.junit.Assert.assertNull(numberFormat34);
        org.junit.Assert.assertNull(dateFormat35);
        org.junit.Assert.assertNull(timeZone36);
        org.junit.Assert.assertNull(numberFormat38);
        org.junit.Assert.assertNull(dateFormat39);
        org.junit.Assert.assertNull(dateFormat41);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat49);
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat51);
        org.junit.Assert.assertNotNull(stdDateFormat52);
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat54);
        org.junit.Assert.assertNull(numberFormat56);
        org.junit.Assert.assertNull(dateFormat57);
        org.junit.Assert.assertNull(timeZone58);
        org.junit.Assert.assertNull(numberFormat60);
        org.junit.Assert.assertNull(dateFormat61);
        org.junit.Assert.assertNull(dateFormat63);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat70);
        org.junit.Assert.assertNotNull(timeZone71);
        org.junit.Assert.assertEquals(timeZone71.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat72);
        org.junit.Assert.assertNull(numberFormat74);
        org.junit.Assert.assertNull(dateFormat75);
        org.junit.Assert.assertNull(timeZone76);
        org.junit.Assert.assertNull(numberFormat78);
        org.junit.Assert.assertNull(dateFormat79);
        org.junit.Assert.assertNull(dateFormat81);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "en_US");
        org.junit.Assert.assertNull(timeZone92);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean6 = stdDateFormat0.equals((java.lang.Object) 4);
        boolean boolean7 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat8.withTimeZone(timeZone9);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = stdDateFormat11.withTimeZone(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat15 = stdDateFormat14.getNumberFormat();
        java.text.DateFormat dateFormat16 = stdDateFormat14._formatISO8601_z;
        java.util.TimeZone timeZone17 = stdDateFormat14.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat19 = stdDateFormat18.getNumberFormat();
        java.text.DateFormat dateFormat20 = stdDateFormat18._formatISO8601_z;
        stdDateFormat14._formatPlain = stdDateFormat18;
        java.text.DateFormat dateFormat22 = stdDateFormat14._formatRFC1123;
        java.util.TimeZone timeZone23 = null;
        stdDateFormat14._timezone = timeZone23;
        java.util.Locale locale25 = stdDateFormat14._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale25, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9, locale25);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone30 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = stdDateFormat29.withTimeZone(timeZone30);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat33 = stdDateFormat32.getNumberFormat();
        java.text.DateFormat dateFormat34 = stdDateFormat32._formatISO8601_z;
        java.util.TimeZone timeZone35 = stdDateFormat32.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat37 = stdDateFormat36.getNumberFormat();
        java.text.DateFormat dateFormat38 = stdDateFormat36._formatISO8601_z;
        stdDateFormat32._formatPlain = stdDateFormat36;
        java.text.DateFormat dateFormat40 = stdDateFormat32._formatRFC1123;
        java.util.TimeZone timeZone41 = null;
        stdDateFormat32._timezone = timeZone41;
        java.util.Locale locale43 = stdDateFormat32._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat45 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone30, locale43, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9, locale43);
        stdDateFormat0._timezone = timeZone9;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat48 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean50 = stdDateFormat48.looksLikeISO8601("");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat51 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat52 = stdDateFormat51.getNumberFormat();
        java.text.DateFormat dateFormat53 = stdDateFormat51._formatISO8601_z;
        java.util.TimeZone timeZone54 = stdDateFormat51.getTimeZone();
        boolean boolean56 = stdDateFormat51.looksLikeISO8601("");
        stdDateFormat51._lenient = false;
        stdDateFormat48._formatISO8601 = stdDateFormat51;
        java.text.DateFormat dateFormat60 = stdDateFormat51._formatPlain;
        java.util.Locale locale61 = stdDateFormat51._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat62 = stdDateFormat0.withLocale(locale61);
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stdDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat10);
        org.junit.Assert.assertNotNull(stdDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat13);
        org.junit.Assert.assertNull(numberFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(timeZone17);
        org.junit.Assert.assertNull(numberFormat19);
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat31);
        org.junit.Assert.assertNull(numberFormat33);
        org.junit.Assert.assertNull(dateFormat34);
        org.junit.Assert.assertNull(timeZone35);
        org.junit.Assert.assertNull(numberFormat37);
        org.junit.Assert.assertNull(dateFormat38);
        org.junit.Assert.assertNull(dateFormat40);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(numberFormat52);
        org.junit.Assert.assertNull(dateFormat53);
        org.junit.Assert.assertNull(timeZone54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(dateFormat60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat62);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        java.lang.String str4 = stdDateFormat0.format((java.lang.Object) 10L);
        java.util.TimeZone timeZone5 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = stdDateFormat0.withTimeZone(timeZone5);
        java.lang.Object obj7 = null;
        boolean boolean8 = stdDateFormat6.equals(obj7);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat11 = stdDateFormat10.getNumberFormat();
        java.text.DateFormat dateFormat12 = stdDateFormat10._formatISO8601_z;
        java.util.TimeZone timeZone13 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat10.withTimeZone(timeZone13);
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat10._formatISO8601 = dateFormat15;
        java.util.Calendar calendar17 = dateFormat15.getCalendar();
        stdDateFormat9.setCalendar(calendar17);
        stdDateFormat6.setCalendar(calendar17);
        java.util.TimeZone timeZone20 = stdDateFormat6._timezone;
        java.text.ParsePosition parsePosition22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date23 = stdDateFormat6.parseAsRFC1123("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.010+0000" + "'", str4, "1970-01-01T00:00:00.010+0000");
        org.junit.Assert.assertNotNull(stdDateFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNull(numberFormat11);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(calendar17);
        org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        boolean boolean3 = stdDateFormat0.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat0.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.lang.String str2 = stdDateFormat0.format((java.lang.Object) 6);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat0._formatPlain = dateFormat3;
        java.text.DateFormat dateFormat5 = stdDateFormat0._formatISO8601;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01T00:00:00.006+0000" + "'", str2, "1970-01-01T00:00:00.006+0000");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat5);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        java.lang.String str5 = stdDateFormat4.toString();
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)" + "'", str5, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        boolean boolean5 = stdDateFormat0.looksLikeISO8601("");
        stdDateFormat0._lenient = false;
        java.lang.Boolean boolean8 = stdDateFormat0._lenient;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone10 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = stdDateFormat9.withTimeZone(timeZone10);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat12.withTimeZone(timeZone13);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat16 = stdDateFormat15.getNumberFormat();
        java.text.DateFormat dateFormat17 = stdDateFormat15._formatISO8601_z;
        java.util.TimeZone timeZone18 = stdDateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat20 = stdDateFormat19.getNumberFormat();
        java.text.DateFormat dateFormat21 = stdDateFormat19._formatISO8601_z;
        stdDateFormat15._formatPlain = stdDateFormat19;
        java.text.DateFormat dateFormat23 = stdDateFormat15._formatRFC1123;
        java.util.TimeZone timeZone24 = null;
        stdDateFormat15._timezone = timeZone24;
        java.util.Locale locale26 = stdDateFormat15._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone13, locale26, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10, locale26);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = stdDateFormat0.withTimeZone(timeZone10);
        stdDateFormat0._lenient = true;
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat11);
        org.junit.Assert.assertNotNull(stdDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNull(numberFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(timeZone18);
        org.junit.Assert.assertNull(numberFormat20);
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat30);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        stdDateFormat0._lenient = false;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat8 = stdDateFormat7.getNumberFormat();
        java.text.DateFormat dateFormat9 = stdDateFormat7._formatISO8601_z;
        java.util.TimeZone timeZone10 = stdDateFormat7.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat12 = stdDateFormat11.getNumberFormat();
        java.text.DateFormat dateFormat13 = stdDateFormat11._formatISO8601_z;
        stdDateFormat7._formatPlain = stdDateFormat11;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone16 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = stdDateFormat15.withTimeZone(timeZone16);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone19 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = stdDateFormat18.withTimeZone(timeZone19);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone22 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = stdDateFormat21.withTimeZone(timeZone22);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat25 = stdDateFormat24.getNumberFormat();
        java.text.DateFormat dateFormat26 = stdDateFormat24._formatISO8601_z;
        java.util.TimeZone timeZone27 = stdDateFormat24.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat29 = stdDateFormat28.getNumberFormat();
        java.text.DateFormat dateFormat30 = stdDateFormat28._formatISO8601_z;
        stdDateFormat24._formatPlain = stdDateFormat28;
        java.text.DateFormat dateFormat32 = stdDateFormat24._formatRFC1123;
        java.util.TimeZone timeZone33 = null;
        stdDateFormat24._timezone = timeZone33;
        java.util.Locale locale35 = stdDateFormat24._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22, locale35, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19, locale35);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = stdDateFormat17.withTimeZone(timeZone19);
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean41 = stdDateFormat17.equals((java.lang.Object) dateFormat40);
        stdDateFormat7._formatISO8601_z = stdDateFormat17;
        java.text.DateFormat dateFormat43 = stdDateFormat7._formatISO8601_z;
        stdDateFormat0._formatRFC1123 = stdDateFormat7;
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNull(numberFormat8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNull(numberFormat12);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNotNull(stdDateFormat15);
        org.junit.Assert.assertNotNull(stdDateFormat17);
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat20);
        org.junit.Assert.assertNotNull(stdDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat23);
        org.junit.Assert.assertNull(numberFormat25);
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertNull(timeZone27);
        org.junit.Assert.assertNull(numberFormat29);
        org.junit.Assert.assertNull(dateFormat30);
        org.junit.Assert.assertNull(dateFormat32);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat39);
        org.junit.Assert.assertNotNull(dateFormat40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateFormat43);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean5 = stdDateFormat4.isLenient();
        java.text.DateFormat dateFormat6 = stdDateFormat4._formatPlain;
        java.text.DateFormat dateFormat7 = stdDateFormat4._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat9 = stdDateFormat8.getNumberFormat();
        java.text.DateFormat dateFormat10 = stdDateFormat8._formatISO8601_z;
        java.util.TimeZone timeZone11 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = stdDateFormat8.withTimeZone(timeZone11);
        boolean boolean13 = stdDateFormat12.isLenient();
        java.text.DateFormat dateFormat14 = stdDateFormat12._formatPlain;
        boolean boolean15 = stdDateFormat4.equals((java.lang.Object) stdDateFormat12);
        java.text.NumberFormat numberFormat16 = stdDateFormat4.getNumberFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance(1);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        dateFormat18.setNumberFormat(numberFormat21);
        stdDateFormat4.setNumberFormat(numberFormat21);
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNull(numberFormat9);
        org.junit.Assert.assertNull(dateFormat10);
        org.junit.Assert.assertNotNull(stdDateFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(numberFormat16);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(numberFormat21);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        java.lang.String str4 = stdDateFormat0.format((java.lang.Object) 10L);
        java.util.TimeZone timeZone5 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = stdDateFormat0.withTimeZone(timeZone5);
        java.lang.Object obj7 = null;
        boolean boolean8 = stdDateFormat6.equals(obj7);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat11 = stdDateFormat10.getNumberFormat();
        java.text.DateFormat dateFormat12 = stdDateFormat10._formatISO8601_z;
        java.util.TimeZone timeZone13 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat10.withTimeZone(timeZone13);
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat10._formatISO8601 = dateFormat15;
        java.util.Calendar calendar17 = dateFormat15.getCalendar();
        stdDateFormat9.setCalendar(calendar17);
        stdDateFormat6.setCalendar(calendar17);
        java.text.DateFormat dateFormat20 = stdDateFormat6._formatISO8601;
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.010+0000" + "'", str4, "1970-01-01T00:00:00.010+0000");
        org.junit.Assert.assertNotNull(stdDateFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNull(numberFormat11);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(calendar17);
        org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat20);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean2 = stdDateFormat0.looksLikeISO8601("");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat4 = stdDateFormat3.getNumberFormat();
        java.text.DateFormat dateFormat5 = stdDateFormat3._formatISO8601_z;
        java.util.TimeZone timeZone6 = stdDateFormat3.getTimeZone();
        boolean boolean8 = stdDateFormat3.looksLikeISO8601("");
        stdDateFormat3._lenient = false;
        stdDateFormat0._formatISO8601 = stdDateFormat3;
        boolean boolean12 = stdDateFormat0.isLenient();
        java.util.TimeZone timeZone13 = stdDateFormat0._timezone;
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatISO8601_z;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat5);
        org.junit.Assert.assertNull(timeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(timeZone13);
        org.junit.Assert.assertNull(dateFormat14);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        stdDateFormat0._formatISO8601 = dateFormat1;
        stdDateFormat0.setLenient(false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat7 = stdDateFormat6.getNumberFormat();
        java.text.DateFormat dateFormat8 = stdDateFormat6._formatISO8601_z;
        java.util.TimeZone timeZone9 = stdDateFormat6.getTimeZone();
        boolean boolean11 = stdDateFormat6.looksLikeISO8601("");
        stdDateFormat6._lenient = false;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        dateFormat14.setNumberFormat(numberFormat16);
        stdDateFormat6.setNumberFormat(numberFormat16);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone20 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = stdDateFormat19.withTimeZone(timeZone20);
        java.lang.String str23 = stdDateFormat19.format((java.lang.Object) 10L);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat25 = stdDateFormat24.getNumberFormat();
        java.text.DateFormat dateFormat26 = stdDateFormat24._formatISO8601_z;
        java.util.TimeZone timeZone27 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = stdDateFormat24.withTimeZone(timeZone27);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat30 = stdDateFormat29.getNumberFormat();
        java.text.DateFormat dateFormat31 = stdDateFormat29._formatISO8601_z;
        java.util.TimeZone timeZone32 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = stdDateFormat29.withTimeZone(timeZone32);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat29._formatISO8601 = dateFormat34;
        java.util.Calendar calendar36 = dateFormat34.getCalendar();
        stdDateFormat24.setCalendar(calendar36);
        stdDateFormat19.setCalendar(calendar36);
        stdDateFormat6.setCalendar(calendar36);
        stdDateFormat0._formatISO8601_z = stdDateFormat6;
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNull(numberFormat7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(timeZone9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(stdDateFormat19);
        org.junit.Assert.assertNotNull(stdDateFormat21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1970-01-01T00:00:00.010+0000" + "'", str23, "1970-01-01T00:00:00.010+0000");
        org.junit.Assert.assertNull(numberFormat25);
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertNotNull(stdDateFormat28);
        org.junit.Assert.assertNull(numberFormat30);
        org.junit.Assert.assertNull(dateFormat31);
        org.junit.Assert.assertNotNull(stdDateFormat33);
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(calendar36);
        org.junit.Assert.assertEquals(calendar36.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean6 = stdDateFormat4.looksLikeISO8601("");
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        boolean boolean3 = stdDateFormat0.isLenient();
        stdDateFormat0.setLenient(false);
        java.lang.String str6 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat8 = dateFormat7.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat8);
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str6, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        boolean boolean5 = stdDateFormat0.looksLikeISO8601("");
        stdDateFormat0._lenient = false;
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        dateFormat8.setNumberFormat(numberFormat10);
        stdDateFormat0.setNumberFormat(numberFormat10);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone14 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = stdDateFormat13.withTimeZone(timeZone14);
        java.text.DateFormat dateFormat16 = stdDateFormat15._formatISO8601_z;
        java.lang.StringBuffer stringBuffer17 = null;
        java.text.FieldPosition fieldPosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = stdDateFormat0.format((java.lang.Object) stdDateFormat15, stringBuffer17, fieldPosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(stdDateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        java.lang.String str4 = stdDateFormat0.format((java.lang.Object) 10L);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat6 = stdDateFormat5.getNumberFormat();
        java.text.DateFormat dateFormat7 = stdDateFormat5._formatISO8601_z;
        java.util.TimeZone timeZone8 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat5.withTimeZone(timeZone8);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat11 = stdDateFormat10.getNumberFormat();
        java.text.DateFormat dateFormat12 = stdDateFormat10._formatISO8601_z;
        java.util.TimeZone timeZone13 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat10.withTimeZone(timeZone13);
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat10._formatISO8601 = dateFormat15;
        java.util.Calendar calendar17 = dateFormat15.getCalendar();
        stdDateFormat5.setCalendar(calendar17);
        stdDateFormat0.setCalendar(calendar17);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        stdDateFormat20._formatISO8601 = dateFormat21;
        stdDateFormat0._formatRFC1123 = dateFormat21;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone26 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = stdDateFormat25.withTimeZone(timeZone26);
        stdDateFormat0.setTimeZone(timeZone26);
        java.text.DateFormat dateFormat29 = stdDateFormat0._formatRFC1123;
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.010+0000" + "'", str4, "1970-01-01T00:00:00.010+0000");
        org.junit.Assert.assertNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNull(numberFormat11);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(calendar17);
        org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNotNull(stdDateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat27);
        org.junit.Assert.assertNotNull(dateFormat29);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat5 = stdDateFormat4.getNumberFormat();
        java.text.DateFormat dateFormat6 = stdDateFormat4._formatISO8601_z;
        stdDateFormat0._formatPlain = stdDateFormat4;
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatRFC1123;
        java.util.TimeZone timeZone9 = null;
        java.util.Locale locale10 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9, locale10);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        stdDateFormat11.setNumberFormat(numberFormat13);
        // The following exception was thrown during execution in test generation
        try {
            dateFormat8.setNumberFormat(numberFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertNull(numberFormat5);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        stdDateFormat0._formatISO8601_z = stdDateFormat1;
        stdDateFormat0._lenient = false;
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone4 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat3.withTimeZone(timeZone4);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = stdDateFormat6.withTimeZone(timeZone7);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat10 = stdDateFormat9.getNumberFormat();
        java.text.DateFormat dateFormat11 = stdDateFormat9._formatISO8601_z;
        java.util.TimeZone timeZone12 = stdDateFormat9.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat14 = stdDateFormat13.getNumberFormat();
        java.text.DateFormat dateFormat15 = stdDateFormat13._formatISO8601_z;
        stdDateFormat9._formatPlain = stdDateFormat13;
        java.text.DateFormat dateFormat17 = stdDateFormat9._formatRFC1123;
        java.util.TimeZone timeZone18 = null;
        stdDateFormat9._timezone = timeZone18;
        java.util.Locale locale20 = stdDateFormat9._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone7, locale20, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4, locale20);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = stdDateFormat2.withTimeZone(timeZone4);
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean26 = stdDateFormat2.equals((java.lang.Object) dateFormat25);
        java.text.DateFormat dateFormat27 = stdDateFormat2._formatISO8601_z;
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat5);
        org.junit.Assert.assertNotNull(stdDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat8);
        org.junit.Assert.assertNull(numberFormat10);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNull(numberFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat24);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateFormat27);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean6 = stdDateFormat0.equals((java.lang.Object) 4);
        boolean boolean7 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean10 = stdDateFormat8.looksLikeISO8601("");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat12 = stdDateFormat11.getNumberFormat();
        java.text.DateFormat dateFormat13 = stdDateFormat11._formatISO8601_z;
        java.util.TimeZone timeZone14 = stdDateFormat11.getTimeZone();
        boolean boolean16 = stdDateFormat11.looksLikeISO8601("");
        stdDateFormat11._lenient = false;
        stdDateFormat8._formatISO8601 = stdDateFormat11;
        stdDateFormat0._formatRFC1123 = stdDateFormat11;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone22 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = stdDateFormat21.withTimeZone(timeZone22);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone25 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = stdDateFormat24.withTimeZone(timeZone25);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat28 = stdDateFormat27.getNumberFormat();
        java.text.DateFormat dateFormat29 = stdDateFormat27._formatISO8601_z;
        java.util.TimeZone timeZone30 = stdDateFormat27.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat32 = stdDateFormat31.getNumberFormat();
        java.text.DateFormat dateFormat33 = stdDateFormat31._formatISO8601_z;
        stdDateFormat27._formatPlain = stdDateFormat31;
        java.text.DateFormat dateFormat35 = stdDateFormat27._formatRFC1123;
        java.util.TimeZone timeZone36 = null;
        stdDateFormat27._timezone = timeZone36;
        java.util.Locale locale38 = stdDateFormat27._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat40 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone25, locale38, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat41 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22, locale38);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat42 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone43 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat44 = stdDateFormat42.withTimeZone(timeZone43);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat45 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat46 = stdDateFormat45.getNumberFormat();
        java.text.DateFormat dateFormat47 = stdDateFormat45._formatISO8601_z;
        java.util.TimeZone timeZone48 = stdDateFormat45.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat49 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat50 = stdDateFormat49.getNumberFormat();
        java.text.DateFormat dateFormat51 = stdDateFormat49._formatISO8601_z;
        stdDateFormat45._formatPlain = stdDateFormat49;
        java.text.DateFormat dateFormat53 = stdDateFormat45._formatRFC1123;
        java.util.TimeZone timeZone54 = null;
        stdDateFormat45._timezone = timeZone54;
        java.util.Locale locale56 = stdDateFormat45._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat58 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone43, locale56, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat59 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22, locale56);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat60 = stdDateFormat11.withLocale(locale56);
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(numberFormat12);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNull(timeZone14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stdDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat23);
        org.junit.Assert.assertNotNull(stdDateFormat24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat26);
        org.junit.Assert.assertNull(numberFormat28);
        org.junit.Assert.assertNull(dateFormat29);
        org.junit.Assert.assertNull(timeZone30);
        org.junit.Assert.assertNull(numberFormat32);
        org.junit.Assert.assertNull(dateFormat33);
        org.junit.Assert.assertNull(dateFormat35);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat42);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat44);
        org.junit.Assert.assertNull(numberFormat46);
        org.junit.Assert.assertNull(dateFormat47);
        org.junit.Assert.assertNull(timeZone48);
        org.junit.Assert.assertNull(numberFormat50);
        org.junit.Assert.assertNull(dateFormat51);
        org.junit.Assert.assertNull(dateFormat53);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat60);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat5 = stdDateFormat4.getNumberFormat();
        java.text.DateFormat dateFormat6 = stdDateFormat4._formatISO8601_z;
        stdDateFormat0._formatPlain = stdDateFormat4;
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatRFC1123;
        java.util.TimeZone timeZone9 = null;
        stdDateFormat0._timezone = timeZone9;
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatISO8601;
        java.util.TimeZone timeZone12 = stdDateFormat0.getTimeZone();
        stdDateFormat0._clearFormats();
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNull(timeZone3);
        org.junit.Assert.assertNull(numberFormat5);
        org.junit.Assert.assertNull(dateFormat6);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(timeZone12);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat6 = stdDateFormat5.getNumberFormat();
        java.text.DateFormat dateFormat7 = stdDateFormat5._formatISO8601_z;
        java.util.TimeZone timeZone8 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat5.withTimeZone(timeZone8);
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        stdDateFormat5._formatISO8601 = dateFormat10;
        java.util.Calendar calendar12 = dateFormat10.getCalendar();
        stdDateFormat0.setCalendar(calendar12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone15 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat14.withTimeZone(timeZone15);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = stdDateFormat17.withTimeZone(timeZone18);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone21 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = stdDateFormat20.withTimeZone(timeZone21);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat24 = stdDateFormat23.getNumberFormat();
        java.text.DateFormat dateFormat25 = stdDateFormat23._formatISO8601_z;
        java.util.TimeZone timeZone26 = stdDateFormat23.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat28 = stdDateFormat27.getNumberFormat();
        java.text.DateFormat dateFormat29 = stdDateFormat27._formatISO8601_z;
        stdDateFormat23._formatPlain = stdDateFormat27;
        java.text.DateFormat dateFormat31 = stdDateFormat23._formatRFC1123;
        java.util.TimeZone timeZone32 = null;
        stdDateFormat23._timezone = timeZone32;
        java.util.Locale locale34 = stdDateFormat23._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21, locale34, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18, locale34);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = stdDateFormat16.withTimeZone(timeZone18);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = stdDateFormat0.withTimeZone(timeZone18);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone41 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat42 = stdDateFormat40.withTimeZone(timeZone41);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat43 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat44 = stdDateFormat43.getNumberFormat();
        java.text.DateFormat dateFormat45 = stdDateFormat43._formatISO8601_z;
        java.util.TimeZone timeZone46 = stdDateFormat43.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat47 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat48 = stdDateFormat47.getNumberFormat();
        java.text.DateFormat dateFormat49 = stdDateFormat47._formatISO8601_z;
        stdDateFormat43._formatPlain = stdDateFormat47;
        java.text.DateFormat dateFormat51 = stdDateFormat43._formatRFC1123;
        java.util.TimeZone timeZone52 = null;
        stdDateFormat43._timezone = timeZone52;
        java.util.Locale locale54 = stdDateFormat43._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat56 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone41, locale54, (java.lang.Boolean) false);
        boolean boolean57 = stdDateFormat39.equals((java.lang.Object) stdDateFormat56);
        java.text.ParsePosition parsePosition59 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date61 = stdDateFormat39.parseAsISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", parsePosition59, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(calendar12);
        org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNotNull(stdDateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat19);
        org.junit.Assert.assertNotNull(stdDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat22);
        org.junit.Assert.assertNull(numberFormat24);
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertNull(timeZone26);
        org.junit.Assert.assertNull(numberFormat28);
        org.junit.Assert.assertNull(dateFormat29);
        org.junit.Assert.assertNull(dateFormat31);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat38);
        org.junit.Assert.assertNotNull(stdDateFormat39);
        org.junit.Assert.assertNotNull(stdDateFormat40);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat42);
        org.junit.Assert.assertNull(numberFormat44);
        org.junit.Assert.assertNull(dateFormat45);
        org.junit.Assert.assertNull(timeZone46);
        org.junit.Assert.assertNull(numberFormat48);
        org.junit.Assert.assertNull(dateFormat49);
        org.junit.Assert.assertNull(dateFormat51);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat0.withTimeZone(timeZone1);
        java.lang.String str4 = stdDateFormat0.format((java.lang.Object) 10L);
        java.text.DateFormat dateFormat5 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone6 = stdDateFormat0._timezone;
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(stdDateFormat2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.010+0000" + "'", str4, "1970-01-01T00:00:00.010+0000");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = stdDateFormat0.withTimeZone(timeZone3);
        boolean boolean6 = stdDateFormat0.equals((java.lang.Object) 4);
        boolean boolean7 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat8.withTimeZone(timeZone9);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = stdDateFormat11.withTimeZone(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat15 = stdDateFormat14.getNumberFormat();
        java.text.DateFormat dateFormat16 = stdDateFormat14._formatISO8601_z;
        java.util.TimeZone timeZone17 = stdDateFormat14.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat19 = stdDateFormat18.getNumberFormat();
        java.text.DateFormat dateFormat20 = stdDateFormat18._formatISO8601_z;
        stdDateFormat14._formatPlain = stdDateFormat18;
        java.text.DateFormat dateFormat22 = stdDateFormat14._formatRFC1123;
        java.util.TimeZone timeZone23 = null;
        stdDateFormat14._timezone = timeZone23;
        java.util.Locale locale25 = stdDateFormat14._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale25, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9, locale25);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone30 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = stdDateFormat29.withTimeZone(timeZone30);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat33 = stdDateFormat32.getNumberFormat();
        java.text.DateFormat dateFormat34 = stdDateFormat32._formatISO8601_z;
        java.util.TimeZone timeZone35 = stdDateFormat32.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat37 = stdDateFormat36.getNumberFormat();
        java.text.DateFormat dateFormat38 = stdDateFormat36._formatISO8601_z;
        stdDateFormat32._formatPlain = stdDateFormat36;
        java.text.DateFormat dateFormat40 = stdDateFormat32._formatRFC1123;
        java.util.TimeZone timeZone41 = null;
        stdDateFormat32._timezone = timeZone41;
        java.util.Locale locale43 = stdDateFormat32._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat45 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone30, locale43, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9, locale43);
        stdDateFormat0._timezone = timeZone9;
        java.text.DateFormat dateFormat48 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone9);
        java.text.DateFormat dateFormat49 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone9);
        java.text.DateFormat dateFormat50 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone9);
        org.junit.Assert.assertNull(numberFormat1);
        org.junit.Assert.assertNull(dateFormat2);
        org.junit.Assert.assertNotNull(stdDateFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stdDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat10);
        org.junit.Assert.assertNotNull(stdDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat13);
        org.junit.Assert.assertNull(numberFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(timeZone17);
        org.junit.Assert.assertNull(numberFormat19);
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat31);
        org.junit.Assert.assertNull(numberFormat33);
        org.junit.Assert.assertNull(dateFormat34);
        org.junit.Assert.assertNull(timeZone35);
        org.junit.Assert.assertNull(numberFormat37);
        org.junit.Assert.assertNull(dateFormat38);
        org.junit.Assert.assertNull(dateFormat40);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat48);
        org.junit.Assert.assertNotNull(dateFormat49);
        org.junit.Assert.assertNotNull(dateFormat50);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat2 = stdDateFormat1.getNumberFormat();
        java.text.DateFormat dateFormat3 = stdDateFormat1._formatISO8601_z;
        java.util.TimeZone timeZone4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat1.withTimeZone(timeZone4);
        boolean boolean7 = stdDateFormat1.equals((java.lang.Object) 4);
        boolean boolean8 = stdDateFormat1.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone10 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = stdDateFormat9.withTimeZone(timeZone10);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat12.withTimeZone(timeZone13);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat16 = stdDateFormat15.getNumberFormat();
        java.text.DateFormat dateFormat17 = stdDateFormat15._formatISO8601_z;
        java.util.TimeZone timeZone18 = stdDateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat20 = stdDateFormat19.getNumberFormat();
        java.text.DateFormat dateFormat21 = stdDateFormat19._formatISO8601_z;
        stdDateFormat15._formatPlain = stdDateFormat19;
        java.text.DateFormat dateFormat23 = stdDateFormat15._formatRFC1123;
        java.util.TimeZone timeZone24 = null;
        stdDateFormat15._timezone = timeZone24;
        java.util.Locale locale26 = stdDateFormat15._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone13, locale26, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10, locale26);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone31 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = stdDateFormat30.withTimeZone(timeZone31);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat34 = stdDateFormat33.getNumberFormat();
        java.text.DateFormat dateFormat35 = stdDateFormat33._formatISO8601_z;
        java.util.TimeZone timeZone36 = stdDateFormat33.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat38 = stdDateFormat37.getNumberFormat();
        java.text.DateFormat dateFormat39 = stdDateFormat37._formatISO8601_z;
        stdDateFormat33._formatPlain = stdDateFormat37;
        java.text.DateFormat dateFormat41 = stdDateFormat33._formatRFC1123;
        java.util.TimeZone timeZone42 = null;
        stdDateFormat33._timezone = timeZone42;
        java.util.Locale locale44 = stdDateFormat33._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone31, locale44, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat47 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10, locale44);
        stdDateFormat1._timezone = timeZone10;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat49 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone50 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat51 = stdDateFormat49.withTimeZone(timeZone50);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat52 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone53 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat54 = stdDateFormat52.withTimeZone(timeZone53);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat55 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat56 = stdDateFormat55.getNumberFormat();
        java.text.DateFormat dateFormat57 = stdDateFormat55._formatISO8601_z;
        java.util.TimeZone timeZone58 = stdDateFormat55.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat59 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat60 = stdDateFormat59.getNumberFormat();
        java.text.DateFormat dateFormat61 = stdDateFormat59._formatISO8601_z;
        stdDateFormat55._formatPlain = stdDateFormat59;
        java.text.DateFormat dateFormat63 = stdDateFormat55._formatRFC1123;
        java.util.TimeZone timeZone64 = null;
        stdDateFormat55._timezone = timeZone64;
        java.util.Locale locale66 = stdDateFormat55._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat68 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone53, locale66, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat69 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone50, locale66);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat70 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone71 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat72 = stdDateFormat70.withTimeZone(timeZone71);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat73 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat74 = stdDateFormat73.getNumberFormat();
        java.text.DateFormat dateFormat75 = stdDateFormat73._formatISO8601_z;
        java.util.TimeZone timeZone76 = stdDateFormat73.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat77 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat78 = stdDateFormat77.getNumberFormat();
        java.text.DateFormat dateFormat79 = stdDateFormat77._formatISO8601_z;
        stdDateFormat73._formatPlain = stdDateFormat77;
        java.text.DateFormat dateFormat81 = stdDateFormat73._formatRFC1123;
        java.util.TimeZone timeZone82 = null;
        stdDateFormat73._timezone = timeZone82;
        java.util.Locale locale84 = stdDateFormat73._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat86 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone71, locale84, (java.lang.Boolean) false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat87 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone50, locale84);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat89 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10, locale84, (java.lang.Boolean) true);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat91 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale84, (java.lang.Boolean) true);
        java.util.TimeZone timeZone92 = stdDateFormat91.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat93 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat94 = stdDateFormat93.getNumberFormat();
        java.text.DateFormat dateFormat95 = stdDateFormat93._formatISO8601_z;
        java.util.Locale locale96 = stdDateFormat93._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat97 = stdDateFormat91.withLocale(locale96);
        org.junit.Assert.assertNull(numberFormat2);
        org.junit.Assert.assertNull(dateFormat3);
        org.junit.Assert.assertNotNull(stdDateFormat5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stdDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat11);
        org.junit.Assert.assertNotNull(stdDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat14);
        org.junit.Assert.assertNull(numberFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(timeZone18);
        org.junit.Assert.assertNull(numberFormat20);
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat32);
        org.junit.Assert.assertNull(numberFormat34);
        org.junit.Assert.assertNull(dateFormat35);
        org.junit.Assert.assertNull(timeZone36);
        org.junit.Assert.assertNull(numberFormat38);
        org.junit.Assert.assertNull(dateFormat39);
        org.junit.Assert.assertNull(dateFormat41);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat49);
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat51);
        org.junit.Assert.assertNotNull(stdDateFormat52);
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat54);
        org.junit.Assert.assertNull(numberFormat56);
        org.junit.Assert.assertNull(dateFormat57);
        org.junit.Assert.assertNull(timeZone58);
        org.junit.Assert.assertNull(numberFormat60);
        org.junit.Assert.assertNull(dateFormat61);
        org.junit.Assert.assertNull(dateFormat63);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat70);
        org.junit.Assert.assertNotNull(timeZone71);
        org.junit.Assert.assertEquals(timeZone71.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(stdDateFormat72);
        org.junit.Assert.assertNull(numberFormat74);
        org.junit.Assert.assertNull(dateFormat75);
        org.junit.Assert.assertNull(timeZone76);
        org.junit.Assert.assertNull(numberFormat78);
        org.junit.Assert.assertNull(dateFormat79);
        org.junit.Assert.assertNull(dateFormat81);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "en_US");
        org.junit.Assert.assertNull(timeZone92);
        org.junit.Assert.assertNull(numberFormat94);
        org.junit.Assert.assertNull(dateFormat95);
        org.junit.Assert.assertNotNull(locale96);
        org.junit.Assert.assertEquals(locale96.toString(), "en_US");
        org.junit.Assert.assertNotNull(stdDateFormat97);
    }
}
