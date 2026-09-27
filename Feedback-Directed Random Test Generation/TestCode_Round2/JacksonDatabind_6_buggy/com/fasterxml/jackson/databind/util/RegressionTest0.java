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
        int int0 = java.text.DateFormat.DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsISO8601("", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String str0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_STR_PLAIN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyy-MM-dd" + "'", str0, "yyyy-MM-dd");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
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
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(100, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.String str0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_STR_RFC1123;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "EEE, dd MMM yyyy HH:mm:ss zzz" + "'", str0, "EEE, dd MMM yyyy HH:mm:ss zzz");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
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
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.util.TimeZone timeZone0 = null;
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
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int int0 = java.text.DateFormat.ERA_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int int0 = java.text.DateFormat.SECOND_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        int int0 = java.text.DateFormat.DATE_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        int int0 = java.text.DateFormat.AM_PM_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.lang.StringBuffer stringBuffer2 = null;
        java.text.FieldPosition fieldPosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer4 = stdDateFormat0.format((java.lang.Object) (byte) 0, stringBuffer2, fieldPosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stdDateFormat0.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parseAsISO8601("yyyy-MM-dd", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.String str0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_STR_ISO8601_Z;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'" + "'", str0, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int int0 = java.text.DateFormat.DAY_OF_WEEK_IN_MONTH_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) -1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
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
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        int int0 = java.text.DateFormat.FULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int int0 = java.text.DateFormat.TIMEZONE_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsRFC1123("hi!", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.lang.StringBuffer stringBuffer2 = null;
        java.text.FieldPosition fieldPosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer4 = stdDateFormat0.format((java.lang.Object) 100.0f, stringBuffer2, fieldPosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        int int0 = java.text.DateFormat.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stdDateFormat0.parseObject("\u0e21\u0e04. 2513", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.StringBuffer stringBuffer2 = null;
        java.text.FieldPosition fieldPosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer4 = dateFormat0.format((java.lang.Object) 1L, stringBuffer2, fieldPosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(3, (int) '4', locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        int int0 = java.text.DateFormat.WEEK_OF_MONTH_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat0.setTimeZone(timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        int int0 = java.text.DateFormat.HOUR1_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
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
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
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
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.util.Calendar calendar1 = null;
        dateFormat0.setCalendar(calendar1);
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateFormat0.format(date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        int int0 = java.text.DateFormat.HOUR0_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat1.setTimeZone(timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.util.TimeZone timeZone3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat2.setTimeZone(timeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
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
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        int int0 = java.text.DateFormat.HOUR_OF_DAY1_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        int int0 = java.text.DateFormat.DAY_OF_YEAR_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) -1, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        int int0 = java.text.DateFormat.MILLISECOND_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        int int0 = java.text.DateFormat.MINUTE_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
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
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parse("hi!", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        int int0 = java.text.DateFormat.WEEK_OF_YEAR_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(0, (int) 'a', locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parseAsISO8601("", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stdDateFormat0.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.util.Calendar calendar1 = null;
        dateFormat0.setCalendar(calendar1);
        java.lang.Class<?> wildcardClass3 = dateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        int int0 = java.text.DateFormat.HOUR_OF_DAY0_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        int int0 = java.text.DateFormat.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(2, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(100, 16, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale2);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.util.Calendar calendar1 = null;
        dateFormat0.setCalendar(calendar1);
        java.util.Calendar calendar3 = dateFormat0.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dateFormat0.format((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNull(calendar3);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) (byte) 10, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stdDateFormat0.parseObject("\u0e21\u0e04. 2513", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsISO8601("yyyy-MM-dd", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        int int0 = java.text.DateFormat.MEDIUM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = stdDateFormat0.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        boolean boolean2 = dateFormat0.equals((java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat0.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parseAsRFC1123("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        int int0 = java.text.DateFormat.YEAR_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parseAsRFC1123("yyyy-MM-dd", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.util.Calendar calendar1 = null;
        dateFormat0.setCalendar(calendar1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateFormat0.format((java.lang.Object) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
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
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.util.TimeZone timeZone0 = null;
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
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(3, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
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
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
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
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.util.Calendar calendar1 = null;
        dateFormat0.setCalendar(calendar1);
        java.util.Calendar calendar3 = dateFormat0.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            dateFormat0.setLenient(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNull(calendar3);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.lang.String[] strArray0 = com.fasterxml.jackson.databind.util.StdDateFormat.ALL_FORMATS;
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[] { "yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd" });
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parseAsRFC1123("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        int int0 = java.text.DateFormat.DAY_OF_WEEK_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parse("\u0e21\u0e04. 2513", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dateFormat0.format((java.lang.Object) "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.lang.String str0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_STR_ISO8601;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyy-MM-dd'T'HH:mm:ss.SSSZ" + "'", str0, "yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = stdDateFormat2.format((java.lang.Object) "EEE, dd MMM yyyy HH:mm:ss zzz", stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
// flaky "1) test0090(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0e21\u0e04. 2513" + "'", str2, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat2.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.util.Calendar calendar1 = null;
        dateFormat0.setCalendar(calendar1);
        java.util.Calendar calendar3 = dateFormat0.getCalendar();
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = dateFormat0.format((java.lang.Object) 100, stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNull(calendar3);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parse("\u0e21\u0e04. 2513", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat0.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        int int0 = java.text.DateFormat.MONTH_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat0.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "2) test0098(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064496635,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=43,MILLISECOND=365,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat0.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.util.TimeZone timeZone0 = null;
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
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (short) -1, 11, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = dateFormat0.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat0.parseObject("hi!", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale2);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat3.withLocale(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) (byte) 0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateFormat1.format(date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.lang.Class<?> wildcardClass5 = dateFormat4.getClass();
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = dateFormat0.format((java.lang.Object) dateFormat4, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
// flaky "3) test0107(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0e21\u0e04. 2513" + "'", str2, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parse("\u0e21\u0e04. 2513", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.TimeZone timeZone3 = stdDateFormat2.getTimeZone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(9, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(0, 4, locale2);
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parseAsRFC1123("\u0e21\u0e04. 2513", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat0.parseObject("yyyy-MM-dd", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = dateFormat0.format((java.lang.Object) 0.0f, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(attributedCharacterIterator2);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(11, (int) (byte) 0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.util.Calendar calendar1 = null;
        dateFormat0.setCalendar(calendar1);
        // The following exception was thrown during execution in test generation
        try {
            dateFormat0.setLenient(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale2);
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = stdDateFormat3.format(date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat0.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
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
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
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
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(12, 12, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsRFC1123("\u0e21\u0e04. 2513", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.util.TimeZone timeZone0 = null;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 0.0d);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = dateFormat1.parseObject("yyyy-MM-dd", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Thu, 01 Jan 1970 00:00:00 GMT" + "'", str3, "Thu, 01 Jan 1970 00:00:00 GMT");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateFormat2.format(date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat1.parseObject("hi!", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.lang.Class<?> wildcardClass3 = timeZone1.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(7, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat3.parse("EEE, dd MMM yyyy HH:mm:ss zzz");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 14");
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
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
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
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat2.parse("EEE, dd MMM yyyy HH:mm:ss zzz");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"EEE, dd MMM yyyy HH:mm:ss zzz\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale2);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
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
            java.util.Date date6 = stdDateFormat3.parse("", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Date date2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dateFormat0.format(date2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) (short) -1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = stdDateFormat3.format(date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(12, 100, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parse("Thu, 01 Jan 1970 00:00:00 GMT", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(15, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.util.TimeZone timeZone0 = null;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat1.parseObject("yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Thu, 01 Jan 1970 00:00:00 GMT" + "'", str3, "Thu, 01 Jan 1970 00:00:00 GMT");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        boolean boolean4 = dateFormat0.equals((java.lang.Object) (short) -1);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.lang.Class<?> wildcardClass6 = dateFormat5.getClass();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = dateFormat0.format((java.lang.Object) dateFormat5, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = stdDateFormat1.withLocale(locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(attributedCharacterIterator2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        boolean boolean2 = dateFormat0.equals((java.lang.Object) 1.0f);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.lang.String str5 = dateFormat3.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone6 = dateFormat3.getTimeZone();
        boolean boolean7 = dateFormat3.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = dateFormat0.formatToCharacterIterator((java.lang.Object) dateFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateFormat3);
// flaky "4) test0157(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u0e21\u0e04. 2513" + "'", str5, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsRFC1123("hi!", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsISO8601("Thu, 01 Jan 1970 00:00:00 GMT", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parse("", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat3.parse("Thu, 01 Jan 1970 00:00:00 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsISO8601("yyyy-MM-dd", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parseAsISO8601("hi!", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = stdDateFormat0.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"hi!\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (short) 0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsRFC1123("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parseAsRFC1123("\u0e21\u0e04. 2513", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parseAsISO8601("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar4 = dateFormat3.getCalendar();
        dateFormat1.setCalendar(calendar4);
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateFormat1.format(date6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "5) test0171(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734064495355,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=44,MILLISECOND=645,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parseAsRFC1123("Thu, 01 Jan 1970 00:00:00 GMT", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.util.TimeZone timeZone0 = null;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Thu, 01 Jan 1970 00:00:00 GMT" + "'", str3, "Thu, 01 Jan 1970 00:00:00 GMT");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat3.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat1.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "6) test0178(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064495224,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=44,MILLISECOND=776,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(12, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        boolean boolean2 = dateFormat0.isLenient();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat4 = null;
        dateFormat3.setNumberFormat(numberFormat4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateFormat0.format((java.lang.Object) dateFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateFormat3);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.lang.StringBuffer stringBuffer3 = null;
        java.text.FieldPosition fieldPosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = stdDateFormat0.format((java.lang.Object) timeZone1, stringBuffer3, fieldPosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = dateFormat1.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat3);
        dateFormat0.setNumberFormat(numberFormat3);
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = dateFormat0.format((java.lang.Object) (short) 10, stringBuffer7, fieldPosition8);
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
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = stdDateFormat4.withLocale(locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsRFC1123("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat3);
        dateFormat0.setNumberFormat(numberFormat3);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator8 = dateFormat6.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone9 = dateFormat6.getTimeZone();
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone9);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = dateFormat0.format((java.lang.Object) timeZone9, stringBuffer11, fieldPosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(attributedCharacterIterator8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat10);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parse("", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.util.Calendar calendar2 = null;
        dateFormat1.setCalendar(calendar2);
        java.util.Calendar calendar4 = dateFormat1.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = dateFormat0.equals((java.lang.Object) dateFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNull(calendar4);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.lang.StringBuffer stringBuffer2 = null;
        java.text.FieldPosition fieldPosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer4 = stdDateFormat0.format((java.lang.Object) (short) 100, stringBuffer2, fieldPosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.lang.StringBuffer stringBuffer3 = null;
        java.text.FieldPosition fieldPosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = stdDateFormat1.format((java.lang.Object) 100.0f, stringBuffer3, fieldPosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.util.TimeZone timeZone0 = null;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        dateFormat1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = dateFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat4.setLenient(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(6, 4, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.util.TimeZone timeZone0 = null;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 0.0d);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        dateFormat1.setNumberFormat(numberFormat7);
        java.lang.Class<?> wildcardClass11 = numberFormat7.getClass();
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Thu, 01 Jan 1970 00:00:00 GMT" + "'", str3, "Thu, 01 Jan 1970 00:00:00 GMT");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        dateFormat0.setLenient(true);
        java.lang.Class<?> wildcardClass5 = dateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat0.parseObject("hi!", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "7) test0202(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064495137,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=44,MILLISECOND=863,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.lang.Class<?> wildcardClass3 = dateFormat2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator4 = dateFormat1.formatToCharacterIterator((java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar3 = dateFormat2.getCalendar();
        dateFormat0.setCalendar(calendar3);
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateFormat0.format(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(calendar3);
// flaky "8) test0206(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar3.toString(), "sun.util.BuddhistCalendar[time=-734064494614,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=45,MILLISECOND=386,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar10 = dateFormat9.getCalendar();
        dateFormat4.setCalendar(calendar10);
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar14 = dateFormat13.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateFormat4.format((java.lang.Object) calendar14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(attributedCharacterIterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(calendar10);
// flaky "9) test0208(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar10.toString(), "sun.util.BuddhistCalendar[time=-734064494597,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=45,MILLISECOND=403,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(calendar14);
// flaky "1) test0208(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar14.toString(), "sun.util.BuddhistCalendar[time=-734064494597,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=45,MILLISECOND=403,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parseAsRFC1123("Thu, 01 Jan 1970 00:00:00 GMT", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.util.Date date2 = null;
        java.lang.StringBuffer stringBuffer3 = null;
        java.text.FieldPosition fieldPosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = stdDateFormat1.format(date2, stringBuffer3, fieldPosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(3);
        java.util.TimeZone timeZone2 = null;
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        boolean boolean4 = dateFormat1.equals((java.lang.Object) timeZone2);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar7 = dateFormat6.getCalendar();
        java.util.TimeZone timeZone8 = dateFormat6.getTimeZone();
        java.util.Locale locale9 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone8, locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateFormat1.format((java.lang.Object) stdDateFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(calendar7);
// flaky "10) test0211(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar7.toString(), "sun.util.BuddhistCalendar[time=-734064494539,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=45,MILLISECOND=461,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat5.parseAsISO8601("hi!", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "11) test0213(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064494497,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=45,MILLISECOND=503,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "12) test0214(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064494487,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=45,MILLISECOND=513,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator5 = numberFormat3.formatToCharacterIterator((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar2);
// flaky "13) test0215(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064494477,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=45,MILLISECOND=523,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat3);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = stdDateFormat2.format((java.lang.Object) 11, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        boolean boolean2 = dateFormat0.isLenient();
        java.util.Date date3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateFormat0.format(date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parseAsRFC1123("Thu, 01 Jan 1970 00:00:00 GMT", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat2.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parse("\u0e21\u0e04. 2513", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parseAsISO8601("yyyy-MM-dd", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stdDateFormat3.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(1, (int) '#', locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat1.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "14) test0224(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064494363,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=45,MILLISECOND=637,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (byte) 100, (int) (short) 100, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) '4', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat2);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone5 = dateFormat4.getTimeZone();
        java.util.TimeZone timeZone6 = dateFormat4.getTimeZone();
        java.util.Locale locale7 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6, locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = dateFormat0.formatToCharacterIterator((java.lang.Object) locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatToCharacterIterator must be passed non-null object");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        boolean boolean2 = dateFormat0.isLenient();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat0.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        boolean boolean2 = dateFormat0.equals((java.lang.Object) 1.0f);
        boolean boolean3 = dateFormat0.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance();
        java.lang.String str6 = dateFormat4.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone7 = dateFormat4.getTimeZone();
        java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateFormat0.format((java.lang.Object) timeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateFormat4);
// flaky "15) test0229(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u0e21\u0e04. 2513" + "'", str6, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parseAsRFC1123("Thu, 01 Jan 1970 00:00:00 GMT", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parseAsISO8601("\u0e21\u0e04. 2513", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(17, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat5.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
// flaky "16) test0234(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0e21\u0e04. 2513" + "'", str2, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(1, 12, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.lang.StringBuffer stringBuffer3 = null;
        java.text.FieldPosition fieldPosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = dateFormat0.format((java.lang.Object) calendar2, stringBuffer3, fieldPosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "17) test0236(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=-734064499079,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=40,MILLISECOND=921,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(5, (int) (short) 100, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsISO8601("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(attributedCharacterIterator2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance();
        boolean boolean3 = dateFormat2.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateFormat1.format((java.lang.Object) dateFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat5.parse("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
// flaky "18) test0241(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0e21\u0e04. 2513" + "'", str2, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stdDateFormat0.parseObject("Thu, 01 Jan 1970 00:00:00 GMT", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat2.parse("\u0e21\u0e04. 2513");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.util.Calendar calendar1 = null;
        dateFormat0.setCalendar(calendar1);
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance();
        java.lang.String str6 = dateFormat4.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone7 = dateFormat4.getTimeZone();
        java.util.Calendar calendar8 = dateFormat4.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = dateFormat0.formatToCharacterIterator((java.lang.Object) dateFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
// flaky "19) test0244(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u0e21\u0e04. 2513" + "'", str6, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar8);
        org.junit.Assert.assertEquals(calendar8.toString(), "sun.util.BuddhistCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(13, (int) (short) 10, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat4.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateFormat0.format(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
// flaky "20) test0247(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0e21\u0e04. 2513" + "'", str2, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat5.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "21) test0248(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064494008,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=45,MILLISECOND=992,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = stdDateFormat3.format((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsRFC1123("yyyy-MM-dd", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = stdDateFormat5.isLenient();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "22) test0251(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064493980,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=46,MILLISECOND=20,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator3 = stdDateFormat1.formatToCharacterIterator((java.lang.Object) "EEE, dd MMM yyyy HH:mm:ss zzz");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar3 = dateFormat2.getCalendar();
        dateFormat0.setCalendar(calendar3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = dateFormat0.format((java.lang.Object) dateFormat5, stringBuffer6, fieldPosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(calendar3);
// flaky "23) test0253(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar3.toString(), "sun.util.BuddhistCalendar[time=-734064493950,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=46,MILLISECOND=50,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat5);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat0.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
// flaky "24) test0255(com.fasterxml.jackson.databind.util.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
// flaky "2) test0255(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0e21\u0e04. 2513" + "'", str2, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(14, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(6, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) 1, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator6 = dateFormat4.formatToCharacterIterator((java.lang.Object) 2);
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = dateFormat0.format((java.lang.Object) attributedCharacterIterator6, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(attributedCharacterIterator6);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(11, 0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parseAsISO8601("Thu, 01 Jan 1970 00:00:00 GMT", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parseAsISO8601("\u0e21\u0e04. 2513", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
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
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "25) test0269(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064493703,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=46,MILLISECOND=297,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        boolean boolean4 = dateFormat0.equals((java.lang.Object) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = dateFormat0.parseObject("\u0e21\u0e04. 2513");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat0.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.util.Calendar calendar1 = null;
        dateFormat0.setCalendar(calendar1);
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        boolean boolean5 = dateFormat0.equals((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass6 = dateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        dateFormat4.setLenient(true);
        java.util.TimeZone timeZone11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone11);
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar15 = dateFormat14.getCalendar();
        dateFormat12.setCalendar(calendar15);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar19 = dateFormat18.getCalendar();
        dateFormat12.setCalendar(calendar19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = dateFormat4.format((java.lang.Object) dateFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(attributedCharacterIterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(calendar15);
// flaky "26) test0273(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar15.toString(), "sun.util.BuddhistCalendar[time=-734064493653,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=46,MILLISECOND=347,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(calendar19);
// flaky "3) test0273(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar19.toString(), "sun.util.BuddhistCalendar[time=-734064493653,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=46,MILLISECOND=347,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar4 = dateFormat3.getCalendar();
        dateFormat1.setCalendar(calendar4);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = dateFormat0.formatToCharacterIterator((java.lang.Object) calendar4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "27) test0274(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734064493642,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=46,MILLISECOND=358,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parse("hi!", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
// flaky "28) test0277(com.fasterxml.jackson.databind.util.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "4) test0277(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064493596,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=46,MILLISECOND=404,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = stdDateFormat4.withLocale(locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "29) test0278(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064493587,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=46,MILLISECOND=413,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.util.TimeZone timeZone0 = null;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 0.0d);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        dateFormat1.setNumberFormat(numberFormat7);
        java.text.NumberFormat numberFormat11 = dateFormat1.getNumberFormat();
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = dateFormat1.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Thu, 01 Jan 1970 00:00:00 GMT" + "'", str3, "Thu, 01 Jan 1970 00:00:00 GMT");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(numberFormat11);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (byte) 100, 5, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        boolean boolean1 = dateFormat0.isLenient();
        java.util.Date date2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dateFormat0.format(date2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.util.Calendar calendar2 = null;
        dateFormat1.setCalendar(calendar2);
        java.text.NumberFormat numberFormat4 = dateFormat1.getNumberFormat();
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = dateFormat0.format((java.lang.Object) numberFormat4, stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat4);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 100, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2);
// flaky "30) test0285(com.fasterxml.jackson.databind.util.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar5 = dateFormat4.getCalendar();
        dateFormat0.setCalendar(calendar5);
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateFormat0.format(date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(attributedCharacterIterator2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "31) test0287(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "sun.util.BuddhistCalendar[time=-734064493428,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=46,MILLISECOND=572,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateFormat0.format(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(attributedCharacterIterator2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=2,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=2,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parseAsISO8601("Thu, 01 Jan 1970 00:00:00 GMT", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Calendar calendar3 = dateFormat1.getCalendar();
        java.text.NumberFormat numberFormat4 = dateFormat1.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.util.Calendar calendar7 = dateFormat6.getCalendar();
        dateFormat0.setCalendar(calendar7);
        java.text.NumberFormat numberFormat9 = dateFormat0.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = dateFormat0.parseObject("yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar3);
// flaky "32) test0295(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar3.toString(), "sun.util.BuddhistCalendar[time=-734064493315,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=46,MILLISECOND=685,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(calendar7);
// flaky "5) test0295(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-734064499079,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=40,MILLISECOND=921,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat9);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.util.TimeZone timeZone0 = null;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar6 = dateFormat5.getCalendar();
        dateFormat3.setCalendar(calendar6);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar10 = dateFormat9.getCalendar();
        java.util.TimeZone timeZone11 = dateFormat9.getTimeZone();
        boolean boolean12 = dateFormat3.equals((java.lang.Object) timeZone11);
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = dateFormat1.format((java.lang.Object) timeZone11, stringBuffer13, fieldPosition14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(calendar6);
// flaky "33) test0296(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar6.toString(), "sun.util.BuddhistCalendar[time=-734064493306,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=46,MILLISECOND=694,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(calendar10);
// flaky "6) test0296(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar10.toString(), "sun.util.BuddhistCalendar[time=-734064493306,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=46,MILLISECOND=694,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stdDateFormat1.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = stdDateFormat4.withLocale(locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(3);
        java.util.TimeZone timeZone2 = null;
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        boolean boolean4 = dateFormat1.equals((java.lang.Object) timeZone2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = dateFormat1.parseObject("Thu, 01 Jan 1970 00:00:00 GMT");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (byte) 1, 13, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat4);
        java.util.Calendar calendar6 = dateFormat1.getCalendar();
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateFormat1.format(date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(calendar6);
// flaky "34) test0302(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar6.toString(), "sun.util.BuddhistCalendar[time=-734064493195,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=46,MILLISECOND=805,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(9, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar3 = dateFormat2.getCalendar();
        dateFormat0.setCalendar(calendar3);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar7 = dateFormat6.getCalendar();
        java.util.TimeZone timeZone8 = dateFormat6.getTimeZone();
        boolean boolean9 = dateFormat0.equals((java.lang.Object) timeZone8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = dateFormat0.parseObject("Thu, 01 Jan 1970 00:00:00 GMT");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(calendar3);
// flaky "35) test0306(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar3.toString(), "sun.util.BuddhistCalendar[time=-734064493124,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=46,MILLISECOND=876,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(calendar7);
// flaky "7) test0306(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar7.toString(), "sun.util.BuddhistCalendar[time=-734064493124,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=46,MILLISECOND=876,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat5.parse("yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "36) test0307(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064493078,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=46,MILLISECOND=922,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator5 = dateFormat0.formatToCharacterIterator(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatToCharacterIterator must be passed non-null object");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
// flaky "37) test0308(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0e21\u0e04. 2513" + "'", str2, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat5.parse("\u0e21\u0e04. 2513", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "38) test0309(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064493060,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=46,MILLISECOND=940,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
// flaky "39) test0310(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0e21\u0e04. 2513" + "'", str2, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(1, 7, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parseAsRFC1123("yyyy-MM-dd", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parse("\u0e21\u0e04. 2513", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.util.Calendar calendar5 = null;
        dateFormat4.setCalendar(calendar5);
        java.text.NumberFormat numberFormat7 = dateFormat4.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator8 = numberFormat3.formatToCharacterIterator((java.lang.Object) dateFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar2);
// flaky "40) test0314(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064492961,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=47,MILLISECOND=39,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat7);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) '#', (int) (byte) 100, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        dateFormat0.setCalendar(calendar2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat5 = null;
        dateFormat4.setNumberFormat(numberFormat5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateFormat0.format((java.lang.Object) numberFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "41) test0317(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064492926,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=47,MILLISECOND=74,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat4);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parse("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.lang.StringBuffer stringBuffer4 = null;
        java.text.FieldPosition fieldPosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer6 = dateFormat0.format((java.lang.Object) 1L, stringBuffer4, fieldPosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        java.util.TimeZone timeZone10 = dateFormat4.getTimeZone();
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = dateFormat4.parseObject("Thu, 01 Jan 1970 00:00:00 GMT", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(attributedCharacterIterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar5 = dateFormat4.getCalendar();
        dateFormat0.setCalendar(calendar5);
        boolean boolean7 = dateFormat0.isLenient();
        java.text.ParsePosition parsePosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = dateFormat0.parseObject("hi!", parsePosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(attributedCharacterIterator2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "42) test0321(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "sun.util.BuddhistCalendar[time=-734064492763,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=47,MILLISECOND=237,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(3);
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        boolean boolean6 = dateFormat1.equals((java.lang.Object) numberFormat4);
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateFormat1.format(date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(12, 10, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) '4', 16, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateFormat1.format(date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(attributedCharacterIterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "43) test0328(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064492687,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=47,MILLISECOND=313,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat4);
        java.util.TimeZone timeZone6 = dateFormat1.getTimeZone();
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
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
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat5.parseAsISO8601("yyyy-MM-dd", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
// flaky "44) test0331(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0e21\u0e04. 2513" + "'", str2, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.util.Calendar calendar5 = dateFormat3.getCalendar();
        java.text.NumberFormat numberFormat6 = dateFormat3.getNumberFormat();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = stdDateFormat2.format((java.lang.Object) dateFormat3, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar5);
// flaky "45) test0332(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "sun.util.BuddhistCalendar[time=-734064492639,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=47,MILLISECOND=361,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat6);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(false);
        boolean boolean3 = dateFormat0.isLenient();
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = dateFormat0.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parseAsRFC1123("", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(3);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat1.parseObject("\u0e21\u0e04. 2513", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        boolean boolean4 = dateFormat2.equals((java.lang.Object) (byte) 10);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = dateFormat2.parseObject("Thu, 01 Jan 1970 00:00:00 GMT", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (byte) 0, 0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) ' ', 12, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "46) test0340(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064492501,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=47,MILLISECOND=499,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat1.parse("\u0e21\u0e04. 2513");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"1 ?.?. 2513\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat1 = null;
        dateFormat0.setNumberFormat(numberFormat1);
        // The following exception was thrown during execution in test generation
        try {
            dateFormat0.setLenient(false);
// flaky "47) test0342(com.fasterxml.jackson.databind.util.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parseAsISO8601("\u0e21\u0e04. 2513", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "48) test0344(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064492458,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=47,MILLISECOND=542,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parseAsRFC1123("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar3 = dateFormat2.getCalendar();
        dateFormat0.setCalendar(calendar3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = dateFormat0.parseObject("\u0e21\u0e04. 2513", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(calendar3);
// flaky "49) test0346(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar3.toString(), "sun.util.BuddhistCalendar[time=-734064492405,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=47,MILLISECOND=595,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(4, (int) (short) -1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.Class<?> wildcardClass1 = dateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar5 = dateFormat4.getCalendar();
        dateFormat2.setCalendar(calendar5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateFormat0.format((java.lang.Object) calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "50) test0349(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "sun.util.BuddhistCalendar[time=-734064492352,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=47,MILLISECOND=648,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.util.Calendar calendar4 = dateFormat3.getCalendar();
        java.lang.Class<?> wildcardClass5 = calendar4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = stdDateFormat2.format((java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "51) test0350(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=-734064499079,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=40,MILLISECOND=921,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(3, (int) (byte) 100, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar6 = dateFormat5.getCalendar();
        java.util.TimeZone timeZone7 = dateFormat5.getTimeZone();
        java.lang.StringBuffer stringBuffer8 = null;
        java.text.FieldPosition fieldPosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = stdDateFormat4.format((java.lang.Object) dateFormat5, stringBuffer8, fieldPosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(calendar6);
// flaky "52) test0354(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar6.toString(), "sun.util.BuddhistCalendar[time=-734064492238,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=47,MILLISECOND=762,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(14, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat4);
        java.util.TimeZone timeZone6 = dateFormat1.getTimeZone();
        java.util.Locale locale7 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6, locale7);
        java.util.Date date9 = null;
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = stdDateFormat8.format(date9, stringBuffer10, fieldPosition11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(false);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat0.parseObject("yyyy-MM-dd", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parse("hi!", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.util.TimeZone timeZone5 = dateFormat3.getTimeZone();
        dateFormat3.setLenient(true);
        boolean boolean9 = dateFormat3.equals((java.lang.Object) 'a');
        java.util.Calendar calendar10 = dateFormat3.getCalendar();
        dateFormat0.setCalendar(calendar10);
        java.util.Date date12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateFormat0.format(date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar2);
// flaky "53) test0359(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064492176,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=47,MILLISECOND=824,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(calendar10);
// flaky "8) test0359(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar10.toString(), "sun.util.BuddhistCalendar[time=-734064492176,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=47,MILLISECOND=824,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar3 = dateFormat2.getCalendar();
        dateFormat0.setCalendar(calendar3);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar7 = dateFormat6.getCalendar();
        java.util.TimeZone timeZone8 = dateFormat6.getTimeZone();
        boolean boolean9 = dateFormat0.equals((java.lang.Object) timeZone8);
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone11 = dateFormat10.getTimeZone();
        java.util.Locale locale12 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone11, locale12);
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = dateFormat0.format((java.lang.Object) locale12, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(calendar3);
// flaky "54) test0360(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar3.toString(), "sun.util.BuddhistCalendar[time=-734064492166,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=47,MILLISECOND=834,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(calendar7);
// flaky "9) test0360(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar7.toString(), "sun.util.BuddhistCalendar[time=-734064492166,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=47,MILLISECOND=834,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        dateFormat0.setCalendar(calendar2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = dateFormat0.parseObject("", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "55) test0363(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064492112,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=47,MILLISECOND=888,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parse("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.util.TimeZone timeZone0 = null;
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
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar8 = dateFormat7.getCalendar();
        java.util.TimeZone timeZone9 = dateFormat7.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = numberFormat4.format((java.lang.Object) dateFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(calendar8);
// flaky "56) test0367(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar8.toString(), "sun.util.BuddhistCalendar[time=-734064492075,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=47,MILLISECOND=925,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
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
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "57) test0368(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064492066,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=47,MILLISECOND=934,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) (short) 100, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar11 = dateFormat10.getCalendar();
        java.util.TimeZone timeZone12 = dateFormat10.getTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone12);
        boolean boolean14 = dateFormat13.isLenient();
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = dateFormat1.format((java.lang.Object) dateFormat13, stringBuffer15, fieldPosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(attributedCharacterIterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(calendar11);
// flaky "58) test0370(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar11.toString(), "sun.util.BuddhistCalendar[time=-734064492049,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=47,MILLISECOND=951,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = stdDateFormat5.withLocale(locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "59) test0371(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064492039,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=47,MILLISECOND=961,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateInstance(0);
        boolean boolean6 = dateFormat5.isLenient();
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat8 = dateFormat7.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat8);
        java.util.Calendar calendar10 = dateFormat5.getCalendar();
        boolean boolean11 = dateFormat5.isLenient();
        java.util.Calendar calendar12 = dateFormat5.getCalendar();
        java.util.Calendar calendar13 = dateFormat5.getCalendar();
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = dateFormat0.format((java.lang.Object) dateFormat5, stringBuffer14, fieldPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(attributedCharacterIterator2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertNotNull(calendar10);
// flaky "60) test0372(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar10.toString(), "sun.util.BuddhistCalendar[time=-734064492031,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=47,MILLISECOND=969,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(calendar12);
// flaky "10) test0372(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar12.toString(), "sun.util.BuddhistCalendar[time=-734064492031,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=47,MILLISECOND=969,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar13);
// flaky "1) test0372(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar13.toString(), "sun.util.BuddhistCalendar[time=-734064492031,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=47,MILLISECOND=969,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.text.NumberFormat numberFormat9 = dateFormat4.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = numberFormat9.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(attributedCharacterIterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(numberFormat9);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(2, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stdDateFormat4.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "61) test0376(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064491951,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=48,MILLISECOND=49,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.util.Calendar calendar5 = dateFormat3.getCalendar();
        java.text.NumberFormat numberFormat6 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat6);
        java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.util.Calendar calendar9 = dateFormat8.getCalendar();
        dateFormat2.setCalendar(calendar9);
        dateFormat1.setCalendar(calendar9);
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance(3);
        dateFormat13.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateFormat1.format((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar5);
// flaky "62) test0377(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "sun.util.BuddhistCalendar[time=-734064491936,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=48,MILLISECOND=64,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(calendar9);
// flaky "11) test0377(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=-734064499079,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=40,MILLISECOND=921,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat13);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = stdDateFormat3.format((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parse("\u0e21\u0e04. 2513", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(0);
        boolean boolean3 = dateFormat2.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat5);
        java.text.AttributedCharacterIterator attributedCharacterIterator8 = numberFormat5.formatToCharacterIterator((java.lang.Object) 1);
        java.lang.StringBuffer stringBuffer9 = null;
        java.text.FieldPosition fieldPosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = stdDateFormat0.format((java.lang.Object) numberFormat5, stringBuffer9, fieldPosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(attributedCharacterIterator8);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
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
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        boolean boolean4 = dateFormat1.isLenient();
        java.util.TimeZone timeZone5 = null;
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone5);
        boolean boolean7 = dateFormat6.isLenient();
        java.lang.StringBuffer stringBuffer8 = null;
        java.text.FieldPosition fieldPosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = dateFormat1.format((java.lang.Object) dateFormat6, stringBuffer8, fieldPosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "63) test0383(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064491839,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=48,MILLISECOND=161,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.util.TimeZone timeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.lang.StringBuffer stringBuffer3 = null;
        java.text.FieldPosition fieldPosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = dateFormat0.format((java.lang.Object) "yyyy-MM-dd", stringBuffer3, fieldPosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "64) test0386(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=-734064499079,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=40,MILLISECOND=921,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) ' ', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        java.util.TimeZone timeZone4 = dateFormat2.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator6 = numberFormat1.formatToCharacterIterator((java.lang.Object) stdDateFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat4.parse("EEE, dd MMM yyyy HH:mm:ss zzz");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parseAsISO8601("", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) (byte) -1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = stdDateFormat1.withLocale(locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) '4', 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.lang.Class<?> wildcardClass3 = attributedCharacterIterator2.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(attributedCharacterIterator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((-1), locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.NumberFormat numberFormat2 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        boolean boolean5 = dateFormat4.isLenient();
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator10 = dateFormat7.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean11 = dateFormat4.equals((java.lang.Object) dateFormat7);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar13 = dateFormat12.getCalendar();
        dateFormat7.setCalendar(calendar13);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator15 = dateFormat0.formatToCharacterIterator((java.lang.Object) calendar13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(attributedCharacterIterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(calendar13);
// flaky "65) test0399(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar13.toString(), "sun.util.BuddhistCalendar[time=-734064491656,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=48,MILLISECOND=344,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) -1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(11, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = stdDateFormat4.withLocale(locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
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
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        dateFormat0.setLenient(true);
        java.util.Calendar calendar6 = dateFormat0.getCalendar();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = dateFormat0.parseObject("\u0e21\u0e04. 2513", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(attributedCharacterIterator2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar6);
        org.junit.Assert.assertEquals(calendar6.toString(), "sun.util.BuddhistCalendar[time=2,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=2,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone5 = dateFormat4.getTimeZone();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone5);
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone5);
        dateFormat7.setLenient(true);
        java.util.Calendar calendar10 = dateFormat7.getCalendar();
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = dateFormat0.format((java.lang.Object) calendar10, stringBuffer11, fieldPosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(calendar10);
// flaky "66) test0405(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=-734064499079,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1946,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=40,MILLISECOND=921,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        dateFormat0.setLenient(true);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone6 = dateFormat5.getTimeZone();
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone6);
        java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone6);
        dateFormat8.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator11 = dateFormat0.formatToCharacterIterator((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "67) test0407(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064491571,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=48,MILLISECOND=429,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(7, 0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(3);
        java.lang.Class<?> wildcardClass2 = dateFormat1.getClass();
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parse("yyyy-MM-dd", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat1.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat4.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.util.TimeZone timeZone5 = dateFormat3.getTimeZone();
        dateFormat3.setLenient(true);
        boolean boolean9 = dateFormat3.equals((java.lang.Object) 'a');
        java.util.Calendar calendar10 = dateFormat3.getCalendar();
        dateFormat0.setCalendar(calendar10);
        java.util.TimeZone timeZone12 = dateFormat0.getTimeZone();
        java.util.Locale locale13 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale13);
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = stdDateFormat14.parse("\u0e21\u0e04. 2513", parsePosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar2);
// flaky "68) test0413(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064491495,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=48,MILLISECOND=505,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(calendar10);
// flaky "12) test0413(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar10.toString(), "sun.util.BuddhistCalendar[time=-734064491495,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=48,MILLISECOND=505,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 10, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.util.TimeZone timeZone5 = dateFormat3.getTimeZone();
        dateFormat3.setLenient(true);
        boolean boolean9 = dateFormat3.equals((java.lang.Object) 'a');
        java.util.Calendar calendar10 = dateFormat3.getCalendar();
        dateFormat0.setCalendar(calendar10);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.util.Calendar calendar13 = null;
        dateFormat12.setCalendar(calendar13);
        java.text.NumberFormat numberFormat15 = dateFormat12.getNumberFormat();
        boolean boolean17 = dateFormat12.equals((java.lang.Object) 100);
        java.lang.StringBuffer stringBuffer18 = null;
        java.text.FieldPosition fieldPosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = dateFormat0.format((java.lang.Object) dateFormat12, stringBuffer18, fieldPosition19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar2);
// flaky "69) test0415(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064491479,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=48,MILLISECOND=521,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(calendar10);
// flaky "13) test0415(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar10.toString(), "sun.util.BuddhistCalendar[time=-734064491479,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=48,MILLISECOND=521,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat3.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((-1), 2, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parseAsISO8601("yyyy-MM-dd", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(3);
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator4 = dateFormat2.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone5 = dateFormat2.getTimeZone();
        java.util.Calendar calendar6 = dateFormat2.getCalendar();
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = dateFormat1.format((java.lang.Object) dateFormat2, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(attributedCharacterIterator4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar6);
        org.junit.Assert.assertEquals(calendar6.toString(), "sun.util.BuddhistCalendar[time=2,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=2,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat3);
        dateFormat0.setNumberFormat(numberFormat3);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar9 = dateFormat8.getCalendar();
        dateFormat6.setCalendar(calendar9);
        dateFormat0.setCalendar(calendar9);
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone12);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar16 = dateFormat15.getCalendar();
        dateFormat13.setCalendar(calendar16);
        dateFormat13.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = dateFormat0.format((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(calendar9);
// flaky "70) test0421(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar9.toString(), "sun.util.BuddhistCalendar[time=-734064491418,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=48,MILLISECOND=582,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(calendar16);
// flaky "14) test0421(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar16.toString(), "sun.util.BuddhistCalendar[time=-734064491418,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=48,MILLISECOND=582,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        dateFormat4.setLenient(false);
        java.lang.Class<?> wildcardClass7 = dateFormat4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateFormat0.format((java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar2);
// flaky "71) test0422(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064491408,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=48,MILLISECOND=592,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        boolean boolean2 = dateFormat0.equals((java.lang.Object) 1.0f);
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass6 = dateFormat5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat0.formatToCharacterIterator((java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parseAsISO8601("", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(false);
        boolean boolean3 = dateFormat0.isLenient();
        boolean boolean4 = dateFormat0.isLenient();
        java.lang.Class<?> wildcardClass5 = dateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
// flaky "72) test0427(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0e21\u0e04. 2513" + "'", str2, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(6, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parseAsRFC1123("", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.util.TimeZone timeZone5 = dateFormat3.getTimeZone();
        dateFormat3.setLenient(true);
        boolean boolean9 = dateFormat3.equals((java.lang.Object) 'a');
        java.util.Calendar calendar10 = dateFormat3.getCalendar();
        dateFormat0.setCalendar(calendar10);
        java.util.TimeZone timeZone12 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12);
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar2);
// flaky "73) test0430(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064491274,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=48,MILLISECOND=726,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(calendar10);
// flaky "15) test0430(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar10.toString(), "sun.util.BuddhistCalendar[time=-734064491274,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=48,MILLISECOND=726,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parseAsRFC1123("hi!", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (short) 1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(100, 0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat5.parseAsISO8601("Thu, 01 Jan 1970 00:00:00 GMT", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
// flaky "74) test0434(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0e21\u0e04. 2513" + "'", str2, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(16, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsISO8601("\u0e21\u0e04. 2513", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(3);
        java.util.TimeZone timeZone2 = null;
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        boolean boolean4 = dateFormat1.equals((java.lang.Object) timeZone2);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = dateFormat1.format((java.lang.Object) dateFormat6, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateFormat6);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat5.parse("", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
// flaky "75) test0439(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0e21\u0e04. 2513" + "'", str2, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parseAsISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale2);
        java.text.ParsePosition parsePosition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat3.parseAsISO8601("\u0e21\u0e04. 2513", parsePosition5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = numberFormat3.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar2);
// flaky "76) test0442(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064491079,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=48,MILLISECOND=921,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat3);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3);
        java.lang.Class<?> wildcardClass5 = timeZone3.getClass();
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "77) test0443(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064491069,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=48,MILLISECOND=931,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar4 = dateFormat3.getCalendar();
        dateFormat1.setCalendar(calendar4);
        dateFormat1.setLenient(false);
        boolean boolean8 = dateFormat1.isLenient();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "78) test0444(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734064491042,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=48,MILLISECOND=958,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat3);
        dateFormat0.setNumberFormat(numberFormat3);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar9 = dateFormat8.getCalendar();
        dateFormat6.setCalendar(calendar9);
        dateFormat0.setCalendar(calendar9);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator14 = dateFormat12.formatToCharacterIterator((java.lang.Object) 2);
        java.text.NumberFormat numberFormat15 = dateFormat12.getNumberFormat();
        java.lang.Class<?> wildcardClass16 = numberFormat15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator17 = dateFormat0.formatToCharacterIterator((java.lang.Object) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(calendar9);
// flaky "79) test0445(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar9.toString(), "sun.util.BuddhistCalendar[time=-734064491031,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=48,MILLISECOND=969,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(attributedCharacterIterator14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (short) 10, (int) (byte) 10, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        java.text.ParsePosition parsePosition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = stdDateFormat5.parse("\u0e21\u0e04. 2513", parsePosition7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
// flaky "80) test0447(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0e21\u0e04. 2513" + "'", str2, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.util.TimeZone timeZone5 = dateFormat3.getTimeZone();
        dateFormat3.setLenient(true);
        boolean boolean9 = dateFormat3.equals((java.lang.Object) 'a');
        java.util.Calendar calendar10 = dateFormat3.getCalendar();
        dateFormat0.setCalendar(calendar10);
        java.util.TimeZone timeZone12 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12);
        java.util.Date date14 = null;
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = stdDateFormat13.format(date14, stringBuffer15, fieldPosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar2);
// flaky "81) test0448(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064491001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=48,MILLISECOND=999,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(calendar10);
// flaky "16) test0448(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar10.toString(), "sun.util.BuddhistCalendar[time=-734064491001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=48,MILLISECOND=999,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.text.NumberFormat numberFormat9 = dateFormat4.getNumberFormat();
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat11 = dateFormat10.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator12 = numberFormat9.formatToCharacterIterator((java.lang.Object) numberFormat11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(attributedCharacterIterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(3, (int) ' ', locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat0.parseAsISO8601("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        boolean boolean4 = dateFormat2.equals((java.lang.Object) (byte) 10);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone7 = dateFormat6.getTimeZone();
        java.util.Calendar calendar8 = dateFormat6.getCalendar();
        java.text.NumberFormat numberFormat9 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat9);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator11 = dateFormat2.formatToCharacterIterator((java.lang.Object) dateFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar8);
// flaky "82) test0452(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar8.toString(), "sun.util.BuddhistCalendar[time=-734064490944,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=49,MILLISECOND=56,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat9);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = stdDateFormat4.format(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = stdDateFormat0.format(date1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stdDateFormat0);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat2.parse("yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Locale locale4 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale4);
        java.util.Date date6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = stdDateFormat5.format(date6, stringBuffer7, fieldPosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
// flaky "83) test0456(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0e21\u0e04. 2513" + "'", str2, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(10, 100, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.ParsePosition parsePosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = stdDateFormat4.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar13 = dateFormat12.getCalendar();
        java.util.TimeZone timeZone14 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone14);
        java.lang.Class<?> wildcardClass16 = dateFormat15.getClass();
        java.lang.StringBuffer stringBuffer17 = null;
        java.text.FieldPosition fieldPosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = stdDateFormat10.format((java.lang.Object) wildcardClass16, stringBuffer17, fieldPosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(attributedCharacterIterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(calendar13);
// flaky "84) test0459(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar13.toString(), "sun.util.BuddhistCalendar[time=-734064490853,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=49,MILLISECOND=147,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat4);
        java.util.TimeZone timeZone6 = dateFormat1.getTimeZone();
        java.util.Locale locale7 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6, locale7);
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone6, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = stdDateFormat1.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(13, 4, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.util.Date date2 = null;
        java.lang.StringBuffer stringBuffer3 = null;
        java.text.FieldPosition fieldPosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer5 = stdDateFormat1.format(date2, stringBuffer3, fieldPosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (short) -1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) 100, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        dateFormat0.setLenient(true);
        java.util.Calendar calendar6 = dateFormat0.getCalendar();
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = dateFormat0.parseObject("hi!", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(attributedCharacterIterator2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar6);
        org.junit.Assert.assertEquals(calendar6.toString(), "sun.util.BuddhistCalendar[time=2,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=2,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parse("Thu, 01 Jan 1970 00:00:00 GMT", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dateFormat1.format(date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar2);
// flaky "85) test0468(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064490750,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=49,MILLISECOND=250,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (short) 10, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateInstance(3);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        dateFormat8.setNumberFormat(numberFormat10);
        boolean boolean12 = dateFormat7.equals((java.lang.Object) numberFormat10);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator13 = dateFormat5.formatToCharacterIterator((java.lang.Object) numberFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
// flaky "86) test0470(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0e21\u0e04. 2513" + "'", str2, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Locale locale2 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale2);
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat3.setTimeZone(timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((-1), 4, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat4);
        java.util.TimeZone timeZone6 = dateFormat1.getTimeZone();
        java.util.Locale locale7 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6, locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = stdDateFormat8.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = stdDateFormat10.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(attributedCharacterIterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.util.Calendar calendar1 = null;
        dateFormat0.setCalendar(calendar1);
        java.util.Calendar calendar3 = dateFormat0.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            dateFormat0.setLenient(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNull(calendar3);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat4);
        java.util.TimeZone timeZone6 = dateFormat1.getTimeZone();
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateFormat1.format(date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 0, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat4);
        java.util.TimeZone timeZone6 = dateFormat1.getTimeZone();
        java.util.Locale locale7 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6, locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = stdDateFormat8.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.util.TimeZone timeZone5 = dateFormat3.getTimeZone();
        dateFormat3.setLenient(true);
        boolean boolean9 = dateFormat3.equals((java.lang.Object) 'a');
        java.util.Calendar calendar10 = dateFormat3.getCalendar();
        dateFormat0.setCalendar(calendar10);
        java.util.TimeZone timeZone12 = dateFormat0.getTimeZone();
        java.util.Locale locale13 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale13);
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = stdDateFormat14.parseAsISO8601("Thu, 01 Jan 1970 00:00:00 GMT", parsePosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar2);
// flaky "87) test0482(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064490540,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=49,MILLISECOND=460,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(calendar10);
// flaky "17) test0482(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar10.toString(), "sun.util.BuddhistCalendar[time=-734064490540,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=49,MILLISECOND=460,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.util.Calendar calendar1 = null;
        dateFormat0.setCalendar(calendar1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = dateFormat0.isLenient();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.util.Locale locale1 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale1);
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = stdDateFormat2.parseAsISO8601("\u0e21\u0e04. 2513", parsePosition4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar3 = dateFormat2.getCalendar();
        dateFormat0.setCalendar(calendar3);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance(3);
        java.util.Calendar calendar7 = dateFormat6.getCalendar();
        java.lang.StringBuffer stringBuffer8 = null;
        java.text.FieldPosition fieldPosition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = dateFormat0.format((java.lang.Object) calendar7, stringBuffer8, fieldPosition9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(calendar3);
// flaky "88) test0486(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar3.toString(), "sun.util.BuddhistCalendar[time=-734064490475,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=49,MILLISECOND=525,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(calendar7);
// flaky "18) test0486(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar7.toString(), "sun.util.BuddhistCalendar[time=-734064490475,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=49,MILLISECOND=525,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = stdDateFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e21\u0e32\u0e15\u0e23\u0e10\u0e32\u0e19\u0e01\u0e23\u0e35\u0e19\u0e34\u0e0a");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.util.TimeZone timeZone5 = dateFormat3.getTimeZone();
        dateFormat3.setLenient(true);
        boolean boolean9 = dateFormat3.equals((java.lang.Object) 'a');
        java.util.Calendar calendar10 = dateFormat3.getCalendar();
        dateFormat0.setCalendar(calendar10);
        java.util.TimeZone timeZone12 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12);
        java.text.ParsePosition parsePosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stdDateFormat13.parseObject("", parsePosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar2);
// flaky "89) test0489(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064490451,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=49,MILLISECOND=549,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(calendar10);
// flaky "19) test0489(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar10.toString(), "sun.util.BuddhistCalendar[time=-734064490451,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=49,MILLISECOND=549,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat3);
        dateFormat0.setNumberFormat(numberFormat3);
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = dateFormat0.format((java.lang.Object) 2, stringBuffer7, fieldPosition8);
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
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Calendar calendar3 = dateFormat1.getCalendar();
        java.text.NumberFormat numberFormat4 = dateFormat1.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat4);
        boolean boolean6 = dateFormat0.isLenient();
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone8 = dateFormat7.getTimeZone();
        java.util.Calendar calendar9 = dateFormat7.getCalendar();
        boolean boolean10 = dateFormat7.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateFormat0.format((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar3);
// flaky "90) test0491(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar3.toString(), "sun.util.BuddhistCalendar[time=-734064490415,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=49,MILLISECOND=585,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar9);
// flaky "20) test0491(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar9.toString(), "sun.util.BuddhistCalendar[time=-734064490415,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=49,MILLISECOND=585,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat1 = null;
        dateFormat0.setNumberFormat(numberFormat1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat0.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat3.withLocale(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.util.TimeZone timeZone0 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = null; // flaky "91) test0494(com.fasterxml.jackson.databind.util.RegressionTest0)": stdDateFormat1.parse("\u0e21\u0e04. 2513");
// flaky "21) test0494(com.fasterxml.jackson.databind.util.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar4 = dateFormat3.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat3.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat0.formatToCharacterIterator((java.lang.Object) timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(calendar4);
// flaky "92) test0495(com.fasterxml.jackson.databind.util.RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=-734064490353,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=11,SECOND=49,MILLISECOND=647,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (short) 1, (int) (short) 100, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = stdDateFormat4.parse("yyyy-MM-dd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        dateFormat0.setLenient(true);
        boolean boolean6 = dateFormat0.equals((java.lang.Object) 'a');
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = dateFormat0.parseObject("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }
}
