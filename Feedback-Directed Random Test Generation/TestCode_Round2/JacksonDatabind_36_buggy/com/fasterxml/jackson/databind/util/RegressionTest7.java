package com.fasterxml.jackson.databind.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
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
        java.lang.String str23 = stdDateFormat0.toString();
        stdDateFormat0._lenient = false;
        java.util.Calendar calendar26 = null;
        stdDateFormat0.setCalendar(calendar26);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str23, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat1.setNumberFormat(numberFormat5);
        java.text.DateFormat dateFormat8 = stdDateFormat1._formatISO8601;
        stdDateFormat1._lenient = true;
        boolean boolean12 = stdDateFormat1.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat13 = stdDateFormat1._formatPlain;
        java.util.Locale locale14 = stdDateFormat1._locale;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(2, locale14);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat15);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
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
        boolean boolean13 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatPlain;
        java.text.NumberFormat numberFormat15 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat0._formatRFC1123 = dateFormat17;
        java.lang.String str22 = stdDateFormat0.toString();
        boolean boolean23 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat24 = stdDateFormat0._formatPlain;
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str22, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(dateFormat24);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        stdDateFormat0._clearFormats();
        java.util.Calendar calendar8 = stdDateFormat0.getCalendar();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        dateFormat11.setNumberFormat(numberFormat13);
        stdDateFormat9.setNumberFormat(numberFormat13);
        boolean boolean16 = stdDateFormat9.isLenient();
        boolean boolean18 = stdDateFormat9.looksLikeISO8601("");
        stdDateFormat9._clearFormats();
        stdDateFormat9._lenient = false;
        java.text.DateFormat dateFormat22 = null;
        stdDateFormat9._formatISO8601_z = dateFormat22;
        java.text.DateFormat dateFormat24 = stdDateFormat9._formatRFC1123;
        java.lang.StringBuffer stringBuffer25 = null;
        java.text.FieldPosition fieldPosition26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer27 = stdDateFormat0.format((java.lang.Object) dateFormat24, stringBuffer25, fieldPosition26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(calendar8);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dateFormat24);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
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
        stdDateFormat0._lenient = true;
        stdDateFormat0._clearFormats();
        stdDateFormat0._lenient = true;
        java.util.TimeZone timeZone28 = stdDateFormat0.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date30 = stdDateFormat0.parse("\u0e21\u0e04. 2513 06:59:59");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"1 ?.?. 2513 06:59:59\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
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
        org.junit.Assert.assertNull(timeZone28);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601;
        java.util.Calendar calendar10 = stdDateFormat0.getCalendar();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        stdDateFormat11.setNumberFormat(numberFormat15);
        boolean boolean18 = stdDateFormat11.isLenient();
        java.text.DateFormat dateFormat19 = stdDateFormat11._formatISO8601;
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        java.util.Calendar calendar22 = dateFormat20.getCalendar();
        stdDateFormat11.setCalendar(calendar22);
        java.util.Calendar calendar24 = stdDateFormat11.getCalendar();
        stdDateFormat11._lenient = true;
        java.util.Calendar calendar27 = stdDateFormat11.getCalendar();
        stdDateFormat0.setCalendar(calendar27);
        java.util.Calendar calendar29 = stdDateFormat0.getCalendar();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        dateFormat32.setNumberFormat(numberFormat34);
        stdDateFormat30.setNumberFormat(numberFormat34);
        boolean boolean37 = stdDateFormat30.isLenient();
        java.text.DateFormat dateFormat38 = stdDateFormat30._formatISO8601;
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat40 = dateFormat39.getNumberFormat();
        java.util.Calendar calendar41 = dateFormat39.getCalendar();
        stdDateFormat30.setCalendar(calendar41);
        java.util.Calendar calendar43 = stdDateFormat30.getCalendar();
        java.util.TimeZone timeZone44 = stdDateFormat30.getTimeZone();
        java.text.DateFormat dateFormat45 = stdDateFormat30._formatRFC1123;
        java.util.TimeZone timeZone46 = stdDateFormat30._timezone;
        java.lang.Boolean boolean47 = stdDateFormat30._lenient;
        boolean boolean48 = stdDateFormat30.isLenient();
        java.text.DateFormat dateFormat49 = stdDateFormat30._formatISO8601_z;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator50 = stdDateFormat0.formatToCharacterIterator((java.lang.Object) dateFormat49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(calendar10);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertNotNull(calendar22);
// flaky "1) test3506(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar24);
// flaky "1) test3506(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar27);
// flaky "1) test3506(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar29);
// flaky "1) test3506(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(dateFormat38);
        org.junit.Assert.assertNotNull(dateFormat39);
        org.junit.Assert.assertNotNull(numberFormat40);
        org.junit.Assert.assertNotNull(calendar41);
// flaky "1) test3506(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar41.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar43);
// flaky "1) test3506(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar43.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNull(timeZone44);
        org.junit.Assert.assertNull(dateFormat45);
        org.junit.Assert.assertNull(timeZone46);
        org.junit.Assert.assertNull(boolean47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(dateFormat49);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        stdDateFormat0._lenient = true;
        java.util.TimeZone timeZone16 = stdDateFormat0._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean24 = stdDateFormat17.isLenient();
        boolean boolean26 = stdDateFormat17.looksLikeISO8601("");
        java.lang.String str27 = stdDateFormat17.toString();
        boolean boolean29 = stdDateFormat17.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone30 = stdDateFormat17.getTimeZone();
        java.text.DateFormat dateFormat31 = stdDateFormat17._formatPlain;
        java.util.TimeZone timeZone32 = stdDateFormat17.getTimeZone();
        boolean boolean33 = stdDateFormat17.isLenient();
        java.lang.StringBuffer stringBuffer34 = null;
        java.text.FieldPosition fieldPosition35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer36 = stdDateFormat0.format((java.lang.Object) boolean33, stringBuffer34, fieldPosition35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
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
// flaky "2) test3508(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar13);
// flaky "2) test3508(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNull(timeZone16);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str27, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(timeZone30);
        org.junit.Assert.assertNull(dateFormat31);
        org.junit.Assert.assertNull(timeZone32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
        java.lang.String str15 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat16 = stdDateFormat0._formatISO8601_z;
        java.lang.String str17 = stdDateFormat0.toString();
        boolean boolean19 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
        stdDateFormat0.setLenient(false);
        java.text.DateFormat dateFormat22 = stdDateFormat0._formatRFC1123;
        // The following exception was thrown during execution in test generation
        try {
            dateFormat22.setLenient(true);
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
// flaky "3) test3509(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str17, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dateFormat22);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
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
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateTimeInstance(2, (int) (byte) 1);
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat18);
        java.util.Calendar calendar20 = stdDateFormat0.getCalendar();
        boolean boolean21 = stdDateFormat0.isLenient();
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
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNull(calendar20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
        java.util.TimeZone timeZone13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat1._timezone = timeZone13;
        java.lang.String str15 = stdDateFormat1.toString();
        java.util.Locale locale16 = stdDateFormat1._locale;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance(3, locale16);
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean26 = stdDateFormat19.isLenient();
        java.text.DateFormat dateFormat27 = stdDateFormat19._formatISO8601;
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        java.util.Calendar calendar30 = dateFormat28.getCalendar();
        stdDateFormat19.setCalendar(calendar30);
        java.util.Calendar calendar32 = stdDateFormat19.getCalendar();
        boolean boolean33 = stdDateFormat19.isLenient();
        boolean boolean34 = stdDateFormat19.isLenient();
        stdDateFormat19._clearFormats();
        java.util.Locale locale36 = stdDateFormat19._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = dateFormat17.format((java.lang.Object) locale36);
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
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(numberFormat23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(dateFormat27);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(numberFormat29);
        org.junit.Assert.assertNotNull(calendar30);
// flaky "4) test3511(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar30.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar32);
// flaky "3) test3511(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.text.DateFormat dateFormat10 = stdDateFormat0._formatRFC1123;
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        dateFormat14.setNumberFormat(numberFormat16);
        stdDateFormat12.setNumberFormat(numberFormat16);
        boolean boolean19 = stdDateFormat12.isLenient();
        boolean boolean20 = stdDateFormat12.isLenient();
        stdDateFormat12._clearFormats();
        boolean boolean23 = stdDateFormat12.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        stdDateFormat12._clearFormats();
        java.util.Date date26 = stdDateFormat12.parse("1970-01-01T00:00:00.010+0000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = dateFormat11.format(date26);
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
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
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
        java.util.Locale locale12 = stdDateFormat0._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat17);
        stdDateFormat13.setNumberFormat(numberFormat17);
        boolean boolean20 = stdDateFormat13.isLenient();
        boolean boolean22 = stdDateFormat13.looksLikeISO8601("");
        boolean boolean23 = stdDateFormat13.isLenient();
        java.util.Locale locale24 = stdDateFormat13._locale;
        java.util.TimeZone timeZone25 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat13._timezone = timeZone25;
        stdDateFormat13._clearFormats();
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        dateFormat29.setNumberFormat(numberFormat31);
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        java.util.Calendar calendar35 = dateFormat33.getCalendar();
        dateFormat29.setCalendar(calendar35);
        dateFormat28.setCalendar(calendar35);
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat39 = dateFormat38.getNumberFormat();
        java.util.TimeZone timeZone40 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone40);
        java.text.DateFormat dateFormat42 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat43 = dateFormat42.getNumberFormat();
        java.util.Calendar calendar44 = dateFormat42.getCalendar();
        dateFormat41.setCalendar(calendar44);
        dateFormat38.setCalendar(calendar44);
        dateFormat28.setCalendar(calendar44);
        java.util.Calendar calendar48 = dateFormat28.getCalendar();
        stdDateFormat13.setCalendar(calendar48);
        stdDateFormat0.setCalendar(calendar48);
        stdDateFormat0.setLenient(true);
        java.util.TimeZone timeZone53 = stdDateFormat0._timezone;
        stdDateFormat0.setLenient(true);
        java.text.ParsePosition parsePosition57 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date58 = stdDateFormat0.parse("1970-01-01T00:00:00.000Z", parsePosition57);
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
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(numberFormat31);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(calendar35);
// flaky "5) test3513(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar35.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateFormat38);
        org.junit.Assert.assertNotNull(numberFormat39);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat41);
        org.junit.Assert.assertNotNull(dateFormat42);
        org.junit.Assert.assertNotNull(numberFormat43);
        org.junit.Assert.assertNotNull(calendar44);
// flaky "4) test3513(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar48);
// flaky "2) test3513(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar48.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNull(timeZone53);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
        java.text.DateFormat dateFormat13 = stdDateFormat0._formatISO8601_z;
        java.text.NumberFormat numberFormat14 = stdDateFormat0.getNumberFormat();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        stdDateFormat15.setNumberFormat(numberFormat17);
        java.text.DateFormat dateFormat19 = stdDateFormat15._formatISO8601;
        java.util.Locale locale20 = stdDateFormat15._locale;
        java.util.TimeZone timeZone21 = stdDateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        stdDateFormat23.setNumberFormat(numberFormat25);
        java.text.DateFormat dateFormat27 = stdDateFormat23._formatISO8601;
        java.util.Locale locale28 = stdDateFormat23._locale;
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance((int) (byte) 1, locale28);
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21, locale28);
        java.lang.Class<?> wildcardClass31 = null; // flaky "6) test3514(com.fasterxml.jackson.databind.util.RegressionTest7)": timeZone21.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator32 = null; // flaky "5) test3514(com.fasterxml.jackson.databind.util.RegressionTest7)": numberFormat14.formatToCharacterIterator((java.lang.Object) timeZone21);
// flaky "3) test3514(com.fasterxml.jackson.databind.util.RegressionTest7)":             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
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
// flaky "2) test3514(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertNotNull(stdDateFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
// flaky "2) test3514(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertNotNull(timeZone21);
// flaky "2) test3514(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(stdDateFormat23);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertNull(dateFormat27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(dateFormat30);
// flaky "1) test3514(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.lang.String str3 = dateFormat0.format((java.lang.Object) 3);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat5);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        dateFormat8.setNumberFormat(numberFormat10);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        dateFormat12.setNumberFormat(numberFormat14);
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        java.util.Calendar calendar18 = dateFormat16.getCalendar();
        dateFormat12.setCalendar(calendar18);
        dateFormat8.setCalendar(calendar18);
        java.text.NumberFormat numberFormat21 = dateFormat8.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat21);
        java.util.TimeZone timeZone23 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone23);
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone23);
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        java.text.NumberFormat numberFormat27 = dateFormat25.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat27);
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean31 = dateFormat29.equals((java.lang.Object) true);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat36 = dateFormat35.getNumberFormat();
        dateFormat34.setNumberFormat(numberFormat36);
        stdDateFormat32.setNumberFormat(numberFormat36);
        boolean boolean39 = stdDateFormat32.isLenient();
        boolean boolean41 = stdDateFormat32.looksLikeISO8601("");
        stdDateFormat32._clearFormats();
        java.text.DateFormat dateFormat43 = stdDateFormat32._formatPlain;
        java.util.TimeZone timeZone44 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat45 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone44);
        stdDateFormat32._timezone = timeZone44;
        boolean boolean48 = stdDateFormat32.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.util.Date date50 = stdDateFormat32.parse("Wed, 31 Dec 1969 23:59:59 UTC");
        java.lang.String str51 = dateFormat29.format(date50);
        java.lang.String str52 = dateFormat0.format(date50);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat53 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat55 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat56 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat57 = dateFormat56.getNumberFormat();
        dateFormat55.setNumberFormat(numberFormat57);
        stdDateFormat53.setNumberFormat(numberFormat57);
        java.text.DateFormat dateFormat60 = stdDateFormat53._formatISO8601;
        stdDateFormat53._lenient = true;
        java.lang.String str63 = stdDateFormat53.toString();
        stdDateFormat53._lenient = false;
        java.text.DateFormat dateFormat66 = stdDateFormat53._formatPlain;
        java.text.DateFormat dateFormat67 = stdDateFormat53._formatISO8601;
        java.lang.Boolean boolean68 = stdDateFormat53._lenient;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator69 = dateFormat0.formatToCharacterIterator((java.lang.Object) boolean68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
// flaky "7) test3515(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u0e21\u0e04. 2513" + "'", str3, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertNotNull(calendar18);
// flaky "6) test3515(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(numberFormat27);
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(dateFormat35);
        org.junit.Assert.assertNotNull(numberFormat36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(dateFormat43);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Wed, 31 Dec 1969 23:59:59 UTC" + "'", str51, "Wed, 31 Dec 1969 23:59:59 UTC");
// flaky "4) test3515(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\u0e21\u0e04. 2513" + "'", str52, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(dateFormat55);
        org.junit.Assert.assertNotNull(dateFormat56);
        org.junit.Assert.assertNotNull(numberFormat57);
        org.junit.Assert.assertNull(dateFormat60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str63, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat66);
        org.junit.Assert.assertNull(dateFormat67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
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
        java.lang.String str15 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat16 = stdDateFormat0._formatISO8601_z;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = stdDateFormat0.parse("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 2513");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"1 ?????? 2513\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
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
// flaky "8) test3516(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat16);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
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
        java.lang.String str22 = stdDateFormat0.toString();
        java.util.TimeZone timeZone23 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone23);
        boolean boolean25 = stdDateFormat0.equals((java.lang.Object) timeZone23);
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone23);
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
// flaky "9) test3517(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar17);
// flaky "7) test3517(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str22, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateFormat26);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
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
        java.lang.String str39 = stdDateFormat0.toString();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat40 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat44 = dateFormat43.getNumberFormat();
        dateFormat42.setNumberFormat(numberFormat44);
        stdDateFormat40.setNumberFormat(numberFormat44);
        boolean boolean47 = stdDateFormat40.isLenient();
        boolean boolean49 = stdDateFormat40.looksLikeISO8601("");
        java.text.DateFormat dateFormat50 = java.text.DateFormat.getDateTimeInstance();
        dateFormat50.setLenient(false);
        dateFormat50.setLenient(true);
        java.util.Calendar calendar55 = dateFormat50.getCalendar();
        stdDateFormat40._formatRFC1123 = dateFormat50;
        java.text.DateFormat dateFormat58 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat59 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat60 = dateFormat59.getNumberFormat();
        dateFormat58.setNumberFormat(numberFormat60);
        java.text.NumberFormat numberFormat62 = dateFormat58.getNumberFormat();
        stdDateFormat40.setNumberFormat(numberFormat62);
        stdDateFormat40._clearFormats();
        boolean boolean66 = stdDateFormat40.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.lang.String str67 = stdDateFormat40.toString();
        boolean boolean68 = stdDateFormat40.isLenient();
        stdDateFormat40._clearFormats();
        java.text.DateFormat dateFormat70 = stdDateFormat40._formatPlain;
        java.util.Date date72 = stdDateFormat40.parse("1970-01-01T00:00:00.010+0000");
        java.lang.StringBuffer stringBuffer73 = null;
        java.text.FieldPosition fieldPosition74 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer75 = stdDateFormat0.format(date72, stringBuffer73, fieldPosition74);
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
// flaky "10) test3518(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
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
// flaky "8) test3518(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar33.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str39, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat42);
        org.junit.Assert.assertNotNull(dateFormat43);
        org.junit.Assert.assertNotNull(numberFormat44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateFormat50);
        org.junit.Assert.assertNotNull(calendar55);
// flaky "5) test3518(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar55.toString(), "sun.util.BuddhistCalendar[time=-734063772437,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=23,SECOND=47,MILLISECOND=563,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat58);
        org.junit.Assert.assertNotNull(dateFormat59);
        org.junit.Assert.assertNotNull(numberFormat60);
        org.junit.Assert.assertNotNull(numberFormat62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str67, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNull(dateFormat70);
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601;
        stdDateFormat0._lenient = true;
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("\u0e21\u0e04. 2513");
        stdDateFormat0._lenient = false;
        boolean boolean14 = stdDateFormat0.isLenient();
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatISO8601;
        stdDateFormat0._lenient = true;
        java.util.Locale locale15 = stdDateFormat0._locale;
        stdDateFormat0._lenient = false;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance(0);
        stdDateFormat0._formatRFC1123 = dateFormat19;
        stdDateFormat0._clearFormats();
        java.text.DateFormat dateFormat22 = stdDateFormat0._formatPlain;
        java.text.DateFormat dateFormat23 = stdDateFormat0._formatISO8601_z;
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertNull(dateFormat23);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        dateFormat0.setLenient(true);
        java.util.TimeZone timeZone4 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone4);
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4);
        java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        dateFormat11.setNumberFormat(numberFormat13);
        stdDateFormat9.setNumberFormat(numberFormat13);
        boolean boolean16 = stdDateFormat9.isLenient();
        java.text.DateFormat dateFormat17 = stdDateFormat9._formatISO8601;
        stdDateFormat9._clearFormats();
        boolean boolean20 = stdDateFormat9.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.text.ParsePosition parsePosition22 = null;
        java.util.Date date23 = stdDateFormat9.parse("0", parsePosition22);
        java.lang.String str24 = dateFormat8.format(date23);
        java.lang.StringBuffer stringBuffer25 = null;
        java.text.FieldPosition fieldPosition26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer27 = dateFormat0.format((java.lang.Object) str24, stringBuffer25, fieldPosition26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01T00:00:00.000+0000" + "'", str24, "1970-01-01T00:00:00.000+0000");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.util.Locale locale10 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatPlain;
        java.util.TimeZone timeZone12 = stdDateFormat0._timezone;
        boolean boolean13 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        java.util.Calendar calendar15 = dateFormat14.getCalendar();
        stdDateFormat0.setCalendar(calendar15);
        stdDateFormat0._clearFormats();
        stdDateFormat0._lenient = true;
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(calendar15);
// flaky "11) test3522(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar15.toString(), "sun.util.BuddhistCalendar[time=-734063772393,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=23,SECOND=47,MILLISECOND=607,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        java.util.TimeZone timeZone15 = stdDateFormat0._timezone;
        stdDateFormat0._lenient = true;
        java.lang.String str18 = stdDateFormat0.toString();
        java.util.TimeZone timeZone19 = stdDateFormat0.getTimeZone();
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(timeZone13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str18, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone19);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601;
        stdDateFormat0._lenient = true;
        java.lang.String str10 = stdDateFormat0.toString();
        stdDateFormat0._lenient = false;
        java.text.DateFormat dateFormat13 = stdDateFormat0._formatPlain;
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatISO8601;
        boolean boolean16 = stdDateFormat0.looksLikeISO8601("");
        java.text.ParsePosition parsePosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        java.lang.String str15 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat16 = null;
        stdDateFormat0._formatISO8601_z = dateFormat16;
        java.util.TimeZone timeZone18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone18);
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone18);
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone18);
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        stdDateFormat0._formatRFC1123 = dateFormat26;
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(dateFormat26);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
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
        boolean boolean13 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = stdDateFormat0.parse("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"6 ?????? 59 ???? 59 ?????? ????????????\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
        java.lang.String str22 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        dateFormat24.setNumberFormat(numberFormat26);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        java.util.Calendar calendar30 = dateFormat28.getCalendar();
        dateFormat24.setCalendar(calendar30);
        dateFormat23.setCalendar(calendar30);
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        java.util.TimeZone timeZone35 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone35);
        java.text.DateFormat dateFormat37 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat38 = dateFormat37.getNumberFormat();
        java.util.Calendar calendar39 = dateFormat37.getCalendar();
        dateFormat36.setCalendar(calendar39);
        dateFormat33.setCalendar(calendar39);
        dateFormat23.setCalendar(calendar39);
        java.util.Calendar calendar43 = dateFormat23.getCalendar();
        stdDateFormat0.setCalendar(calendar43);
        java.util.TimeZone timeZone45 = stdDateFormat0._timezone;
        java.lang.Boolean boolean46 = stdDateFormat0._lenient;
        stdDateFormat0.setLenient(true);
        boolean boolean50 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd");
        java.text.ParsePosition parsePosition52 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date53 = stdDateFormat0.parse("1970-01-01T00:00:00.000+0000", parsePosition52);
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
// flaky "12) test3527(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar17);
// flaky "9) test3527(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str22, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(numberFormat29);
        org.junit.Assert.assertNotNull(calendar30);
// flaky "6) test3527(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar30.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(dateFormat37);
        org.junit.Assert.assertNotNull(numberFormat38);
        org.junit.Assert.assertNotNull(calendar39);
// flaky "3) test3527(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar43);
// flaky "3) test3527(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar43.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNull(timeZone45);
        org.junit.Assert.assertNull(boolean46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatISO8601;
        java.lang.String str13 = stdDateFormat0.toString();
        java.lang.Boolean boolean14 = stdDateFormat0._lenient;
        java.util.TimeZone timeZone15 = stdDateFormat0._timezone;
        java.lang.String str16 = stdDateFormat0.toString();
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str16, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.Locale locale10 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatPlain;
        java.util.Locale locale12 = stdDateFormat0._locale;
        stdDateFormat0._lenient = false;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat17);
        stdDateFormat0.setNumberFormat(numberFormat17);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        java.util.TimeZone timeZone0 = null;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        dateFormat1.setLenient(false);
        java.lang.Object obj4 = null;
        java.lang.StringBuffer stringBuffer5 = null;
        java.text.FieldPosition fieldPosition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer7 = dateFormat1.format(obj4, stringBuffer5, fieldPosition6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.util.Locale locale10 = stdDateFormat0._locale;
        java.text.NumberFormat numberFormat11 = stdDateFormat0.getNumberFormat();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        dateFormat14.setNumberFormat(numberFormat16);
        stdDateFormat12.setNumberFormat(numberFormat16);
        boolean boolean19 = stdDateFormat12.isLenient();
        boolean boolean20 = stdDateFormat12.isLenient();
        stdDateFormat12._clearFormats();
        boolean boolean23 = stdDateFormat12.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        stdDateFormat12._clearFormats();
        java.util.Date date26 = stdDateFormat12.parse("1970-01-01T00:00:00.010+0000");
        java.lang.StringBuffer stringBuffer27 = null;
        java.text.FieldPosition fieldPosition28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer29 = stdDateFormat0.format(date26, stringBuffer27, fieldPosition28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatISO8601_z;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateTimeInstance(2, (int) (byte) 1);
        stdDateFormat0._formatISO8601 = dateFormat17;
        java.text.NumberFormat numberFormat19 = stdDateFormat0.getNumberFormat();
        java.util.Locale locale20 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator22 = stdDateFormat0.formatToCharacterIterator((java.lang.Object) dateFormat21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat21);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
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
        java.util.TimeZone timeZone15 = stdDateFormat0._timezone;
        stdDateFormat0._lenient = true;
        java.lang.String str18 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat19 = stdDateFormat0._formatISO8601_z;
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(timeZone13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str18, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat19);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.util.Locale locale10 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatPlain;
        java.util.TimeZone timeZone12 = stdDateFormat0._timezone;
        java.text.ParsePosition parsePosition14 = null;
        java.lang.Object obj15 = stdDateFormat0.parseObject("0", parsePosition14);
        java.text.DateFormat dateFormat16 = stdDateFormat0._formatISO8601;
        java.text.DateFormat dateFormat17 = stdDateFormat0._formatISO8601;
        java.text.ParsePosition parsePosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = stdDateFormat0.parseAsISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)", parsePosition19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(dateFormat17);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601;
        java.lang.String str10 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatRFC1123;
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat11);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.lang.Boolean boolean7 = stdDateFormat0._lenient;
        java.util.TimeZone timeZone8 = stdDateFormat0.getTimeZone();
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601;
        java.util.TimeZone timeZone10 = stdDateFormat0._timezone;
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(timeZone8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(timeZone10);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
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
        java.util.TimeZone timeZone13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone13);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        boolean boolean22 = stdDateFormat15.isLenient();
        boolean boolean24 = stdDateFormat15.looksLikeISO8601("");
        java.lang.String str25 = stdDateFormat15.toString();
        boolean boolean27 = stdDateFormat15.looksLikeISO8601("hi!");
        java.util.Locale locale28 = stdDateFormat15._locale;
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone13, locale28);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance(3, locale28);
        java.lang.StringBuffer stringBuffer31 = null;
        java.text.FieldPosition fieldPosition32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer33 = stdDateFormat0.format((java.lang.Object) 3, stringBuffer31, fieldPosition32);
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
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str25, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(dateFormat30);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
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
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatISO8601;
        stdDateFormat0._clearFormats();
        stdDateFormat0._clearFormats();
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat12);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
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
        java.util.Locale locale12 = stdDateFormat0._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat17);
        stdDateFormat13.setNumberFormat(numberFormat17);
        boolean boolean20 = stdDateFormat13.isLenient();
        boolean boolean22 = stdDateFormat13.looksLikeISO8601("");
        boolean boolean23 = stdDateFormat13.isLenient();
        java.util.Locale locale24 = stdDateFormat13._locale;
        java.util.TimeZone timeZone25 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat13._timezone = timeZone25;
        stdDateFormat13._clearFormats();
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        dateFormat29.setNumberFormat(numberFormat31);
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        java.util.Calendar calendar35 = dateFormat33.getCalendar();
        dateFormat29.setCalendar(calendar35);
        dateFormat28.setCalendar(calendar35);
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat39 = dateFormat38.getNumberFormat();
        java.util.TimeZone timeZone40 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone40);
        java.text.DateFormat dateFormat42 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat43 = dateFormat42.getNumberFormat();
        java.util.Calendar calendar44 = dateFormat42.getCalendar();
        dateFormat41.setCalendar(calendar44);
        dateFormat38.setCalendar(calendar44);
        dateFormat28.setCalendar(calendar44);
        java.util.Calendar calendar48 = dateFormat28.getCalendar();
        stdDateFormat13.setCalendar(calendar48);
        stdDateFormat0.setCalendar(calendar48);
        stdDateFormat0.setLenient(true);
        java.util.Locale locale53 = stdDateFormat0._locale;
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(numberFormat31);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(calendar35);
// flaky "13) test3539(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar35.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateFormat38);
        org.junit.Assert.assertNotNull(numberFormat39);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat41);
        org.junit.Assert.assertNotNull(dateFormat42);
        org.junit.Assert.assertNotNull(numberFormat43);
        org.junit.Assert.assertNotNull(calendar44);
// flaky "10) test3539(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar48);
// flaky "7) test3539(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar48.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en_US");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
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
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatPlain;
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatRFC1123;
        java.text.DateFormat dateFormat16 = stdDateFormat0._formatISO8601_z;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = dateFormat16.parseObject("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
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
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
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
        boolean boolean23 = stdDateFormat0.isLenient();
        java.lang.Boolean boolean24 = stdDateFormat0._lenient;
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(boolean24);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.util.TimeZone timeZone11 = stdDateFormat0._timezone;
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatISO8601_z;
        java.util.TimeZone timeZone13 = null;
        stdDateFormat0._timezone = timeZone13;
        stdDateFormat0._clearFormats();
        java.util.Calendar calendar16 = stdDateFormat0.getCalendar();
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNull(calendar16);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.lang.String str9 = stdDateFormat0.toString();
        java.util.Locale locale10 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatPlain;
        java.text.NumberFormat numberFormat12 = stdDateFormat0.getNumberFormat();
        stdDateFormat0._clearFormats();
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatRFC1123;
        java.util.TimeZone timeZone15 = stdDateFormat0._timezone;
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(timeZone15);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat1.setNumberFormat(numberFormat5);
        boolean boolean8 = stdDateFormat1.isLenient();
        java.text.DateFormat dateFormat9 = stdDateFormat1._formatISO8601;
        java.text.NumberFormat numberFormat10 = stdDateFormat1.getNumberFormat();
        java.util.Locale locale11 = stdDateFormat1._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateInstance(4, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        java.text.DateFormat dateFormat18 = stdDateFormat0._formatISO8601_z;
        java.util.Locale locale19 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat20 = stdDateFormat0._formatISO8601_z;
        stdDateFormat0._clearFormats();
        java.util.TimeZone timeZone22 = stdDateFormat0.getTimeZone();
        stdDateFormat0._lenient = false;
        java.text.DateFormat dateFormat25 = stdDateFormat0._formatPlain;
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
        org.junit.Assert.assertNull(dateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNull(dateFormat25);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
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
        stdDateFormat0._lenient = false;
        java.util.TimeZone timeZone17 = stdDateFormat0.getTimeZone();
        java.util.TimeZone timeZone18 = stdDateFormat0._timezone;
        java.text.ParsePosition parsePosition20 = null;
        java.util.Date date21 = stdDateFormat0.parse("0", parsePosition20);
        java.lang.String str22 = stdDateFormat0.toString();
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
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)" + "'", str22, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.lang.Boolean boolean11 = stdDateFormat0._lenient;
        stdDateFormat0._lenient = false;
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatPlain;
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatISO8601;
        java.util.TimeZone timeZone16 = stdDateFormat0._timezone;
        java.lang.Class<?> wildcardClass17 = stdDateFormat0.getClass();
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(timeZone16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone9);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone9);
        java.util.Calendar calendar15 = dateFormat14.getCalendar();
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(calendar15);
// flaky "14) test3548(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
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
        boolean boolean29 = stdDateFormat3.isLenient();
        java.text.DateFormat dateFormat30 = stdDateFormat3._formatPlain;
        java.util.TimeZone timeZone31 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone31);
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone31);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone31);
        stdDateFormat3._timezone = timeZone31;
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat37 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat38 = dateFormat37.getNumberFormat();
        dateFormat36.setNumberFormat(numberFormat38);
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat41 = dateFormat40.getNumberFormat();
        java.util.Calendar calendar42 = dateFormat40.getCalendar();
        dateFormat36.setCalendar(calendar42);
        dateFormat36.setLenient(true);
        dateFormat36.setLenient(false);
        stdDateFormat3._formatRFC1123 = dateFormat36;
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
// flaky "15) test3549(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNotNull(calendar23);
// flaky "11) test3549(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar23.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar27);
// flaky "8) test3549(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(dateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(dateFormat37);
        org.junit.Assert.assertNotNull(numberFormat38);
        org.junit.Assert.assertNotNull(dateFormat40);
        org.junit.Assert.assertNotNull(numberFormat41);
        org.junit.Assert.assertNotNull(calendar42);
// flaky "4) test3549(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar42.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
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
        java.util.TimeZone timeZone15 = stdDateFormat1.getTimeZone();
        boolean boolean16 = stdDateFormat1.isLenient();
        java.util.TimeZone timeZone17 = stdDateFormat1._timezone;
        java.util.Locale locale18 = stdDateFormat1._locale;
        java.util.Locale locale19 = stdDateFormat1._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance((int) (short) -1, locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
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
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(timeZone17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601_z;
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatRFC1123;
        java.text.DateFormat dateFormat13 = stdDateFormat0._formatISO8601_z;
        java.util.Locale locale14 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatPlain;
        java.lang.Boolean boolean16 = stdDateFormat0._lenient;
        java.lang.String str17 = stdDateFormat0.toString();
        java.text.ParsePosition parsePosition19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date20 = stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition19);
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
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str17, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat1.setNumberFormat(numberFormat5);
        boolean boolean8 = stdDateFormat1.isLenient();
        boolean boolean10 = stdDateFormat1.looksLikeISO8601("");
        stdDateFormat1._clearFormats();
        stdDateFormat1._lenient = false;
        java.text.DateFormat dateFormat14 = null;
        stdDateFormat1._formatISO8601_z = dateFormat14;
        java.text.DateFormat dateFormat16 = stdDateFormat1._formatRFC1123;
        java.util.Locale locale17 = stdDateFormat1._locale;
        java.util.Locale locale18 = stdDateFormat1._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance(10, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601;
        stdDateFormat0._lenient = true;
        java.lang.String str10 = stdDateFormat0.toString();
        stdDateFormat0._lenient = false;
        java.text.DateFormat dateFormat13 = stdDateFormat0._formatISO8601;
        java.util.Calendar calendar14 = stdDateFormat0.getCalendar();
        java.util.TimeZone timeZone15 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15);
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone15);
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        java.text.NumberFormat numberFormat19 = dateFormat17.getNumberFormat();
        boolean boolean21 = dateFormat17.equals((java.lang.Object) 100L);
        stdDateFormat0._formatISO8601 = dateFormat17;
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(dateFormat7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNull(calendar14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
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
        boolean boolean16 = stdDateFormat0.looksLikeISO8601("hi!");
        java.util.Date date18 = stdDateFormat0.parse("-1");
        java.lang.Boolean boolean19 = stdDateFormat0._lenient;
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(timeZone13);
        org.junit.Assert.assertNull(timeZone14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNull(boolean19);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 10, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean11 = stdDateFormat3.looksLikeISO8601("hi!");
        java.lang.String str12 = stdDateFormat3.toString();
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.util.Locale locale14 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale14);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance(3, locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance((-1), locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
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
        java.lang.Boolean boolean13 = stdDateFormat0._lenient;
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatISO8601;
        java.util.TimeZone timeZone15 = stdDateFormat0._timezone;
        java.util.Date date17 = stdDateFormat0.parse("1969-12-31T23:59:59.999+0000");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 06:59:59 ICT 1970");
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
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
        boolean boolean16 = stdDateFormat0.looksLikeISO8601("Thu, 01 Jan 1970 00:00:00 UTC");
        java.text.DateFormat dateFormat17 = stdDateFormat0._formatRFC1123;
        // The following exception was thrown during execution in test generation
        try {
            java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(dateFormat17);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
        java.util.TimeZone timeZone13 = null;
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone13);
        dateFormat14.setLenient(false);
        dateFormat14.setLenient(false);
        java.text.NumberFormat numberFormat19 = dateFormat14.getNumberFormat();
        stdDateFormat0._formatISO8601_z = dateFormat14;
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat19);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.text.NumberFormat numberFormat10 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateInstance((int) (short) 1);
        dateFormat12.setLenient(true);
        java.text.NumberFormat numberFormat15 = dateFormat12.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat15);
        stdDateFormat0._clearFormats();
        java.util.TimeZone timeZone18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone18);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone18);
        stdDateFormat0.setTimeZone(timeZone18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date23 = stdDateFormat0.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"hi!\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat20);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean10 = stdDateFormat3.isLenient();
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        stdDateFormat3._clearFormats();
        stdDateFormat3._lenient = false;
        java.text.DateFormat dateFormat16 = null;
        stdDateFormat3._formatISO8601_z = dateFormat16;
        java.util.Locale locale18 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 1, locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance(11, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat19);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat11 = dateFormat10.getNumberFormat();
        dateFormat9.setNumberFormat(numberFormat11);
        stdDateFormat7.setNumberFormat(numberFormat11);
        boolean boolean15 = stdDateFormat7.looksLikeISO8601("hi!");
        java.lang.String str16 = stdDateFormat7.toString();
        java.util.Locale locale17 = stdDateFormat7._locale;
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale17);
        java.lang.Class<?> wildcardClass19 = dateFormat18.getClass();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str16, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
        boolean boolean16 = stdDateFormat0.looksLikeISO8601("0");
        stdDateFormat0._clearFormats();
        java.util.TimeZone timeZone18 = stdDateFormat0.getTimeZone();
        boolean boolean19 = stdDateFormat0.isLenient();
        java.lang.Boolean boolean20 = stdDateFormat0._lenient;
        java.text.ParsePosition parsePosition22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date24 = stdDateFormat0.parseAsISO8601("1970-01-01T00:00:00.000Z", parsePosition22, true);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(timeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(boolean20);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
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
        boolean boolean16 = stdDateFormat0.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.util.TimeZone timeZone17 = stdDateFormat0._timezone;
        java.text.DateFormat dateFormat18 = stdDateFormat0._formatRFC1123;
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
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNull(dateFormat18);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
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
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatISO8601_z;
        java.text.DateFormat dateFormat16 = stdDateFormat0._formatRFC1123;
        java.util.TimeZone timeZone17 = stdDateFormat0._timezone;
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(timeZone17);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
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
        java.lang.String str15 = stdDateFormat0.toString();
        java.lang.Boolean boolean16 = stdDateFormat0._lenient;
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        java.util.Calendar calendar19 = dateFormat17.getCalendar();
        java.util.Calendar calendar20 = dateFormat17.getCalendar();
        java.util.Calendar calendar21 = dateFormat17.getCalendar();
        stdDateFormat0.setCalendar(calendar21);
        java.text.DateFormat dateFormat23 = stdDateFormat0._formatISO8601_z;
        java.lang.String str24 = stdDateFormat0.toString();
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(calendar11);
// flaky "16) test3566(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(calendar19);
// flaky "12) test3566(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar20);
// flaky "9) test3566(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar21);
// flaky "5) test3566(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str24, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.util.TimeZone timeZone8 = stdDateFormat0._timezone;
        boolean boolean10 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        boolean boolean11 = stdDateFormat0.isLenient();
        stdDateFormat0._clearFormats();
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(timeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
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
        stdDateFormat0._clearFormats();
        java.lang.String str24 = stdDateFormat0.toString();
        java.lang.Boolean boolean25 = stdDateFormat0._lenient;
        java.text.NumberFormat numberFormat26 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat27 = stdDateFormat0._formatRFC1123;
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str24, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNull(dateFormat27);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat2);
        java.text.DateFormat dateFormat4 = stdDateFormat0._formatISO8601;
        java.util.Locale locale5 = stdDateFormat0._locale;
        java.util.Calendar calendar6 = stdDateFormat0.getCalendar();
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("");
        org.junit.Assert.assertNotNull(stdDateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(numberFormat2);
        org.junit.Assert.assertNull(dateFormat4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNull(calendar6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601;
        stdDateFormat0._clearFormats();
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.text.ParsePosition parsePosition13 = null;
        java.util.Date date14 = stdDateFormat0.parse("0", parsePosition13);
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatPlain;
        boolean boolean16 = stdDateFormat0.isLenient();
        boolean boolean18 = stdDateFormat0.looksLikeISO8601("hi!");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
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
        java.lang.String str22 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        dateFormat24.setNumberFormat(numberFormat26);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        java.util.Calendar calendar30 = dateFormat28.getCalendar();
        dateFormat24.setCalendar(calendar30);
        dateFormat23.setCalendar(calendar30);
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        java.util.TimeZone timeZone35 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone35);
        java.text.DateFormat dateFormat37 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat38 = dateFormat37.getNumberFormat();
        java.util.Calendar calendar39 = dateFormat37.getCalendar();
        dateFormat36.setCalendar(calendar39);
        dateFormat33.setCalendar(calendar39);
        dateFormat23.setCalendar(calendar39);
        java.util.Calendar calendar43 = dateFormat23.getCalendar();
        stdDateFormat0.setCalendar(calendar43);
        java.util.TimeZone timeZone45 = stdDateFormat0._timezone;
        java.lang.Boolean boolean46 = stdDateFormat0._lenient;
        stdDateFormat0.setLenient(true);
        boolean boolean50 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd");
        java.util.TimeZone timeZone51 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat52 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone51);
        java.text.DateFormat dateFormat53 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone51);
        java.text.DateFormat dateFormat54 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone51);
        java.text.DateFormat dateFormat55 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone51);
        java.text.DateFormat dateFormat56 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone51);
        stdDateFormat0._formatRFC1123 = dateFormat56;
        java.text.ParsePosition parsePosition59 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date60 = stdDateFormat0.parseAsRFC1123("Wed, 31 Dec 1969 23:59:59 UTC", parsePosition59);
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
// flaky "17) test3571(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar17);
// flaky "13) test3571(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str22, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(numberFormat29);
        org.junit.Assert.assertNotNull(calendar30);
// flaky "10) test3571(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar30.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(dateFormat37);
        org.junit.Assert.assertNotNull(numberFormat38);
        org.junit.Assert.assertNotNull(calendar39);
// flaky "6) test3571(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar43);
// flaky "4) test3571(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar43.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNull(timeZone45);
        org.junit.Assert.assertNull(boolean46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat52);
        org.junit.Assert.assertNotNull(dateFormat53);
        org.junit.Assert.assertNotNull(dateFormat54);
        org.junit.Assert.assertNotNull(dateFormat55);
        org.junit.Assert.assertNotNull(dateFormat56);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
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
        boolean boolean14 = stdDateFormat0.isLenient();
        boolean boolean16 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        stdDateFormat0._lenient = false;
        java.text.DateFormat dateFormat19 = null;
        stdDateFormat0._formatPlain = dateFormat19;
        java.util.Date date22 = stdDateFormat0.parse("1970-01-01T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        dateFormat14.setNumberFormat(numberFormat16);
        stdDateFormat12.setNumberFormat(numberFormat16);
        boolean boolean19 = stdDateFormat12.isLenient();
        boolean boolean21 = stdDateFormat12.looksLikeISO8601("");
        boolean boolean22 = stdDateFormat12.isLenient();
        java.lang.Boolean boolean23 = stdDateFormat12._lenient;
        boolean boolean25 = stdDateFormat12.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.text.DateFormat dateFormat26 = stdDateFormat12._formatPlain;
        java.text.ParsePosition parsePosition28 = null;
        java.util.Date date29 = stdDateFormat12.parse("0", parsePosition28);
        java.lang.StringBuffer stringBuffer30 = null;
        java.text.FieldPosition fieldPosition31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer32 = stdDateFormat0.format(date29, stringBuffer30, fieldPosition31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.lang.Boolean boolean7 = stdDateFormat0._lenient;
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatPlain;
        java.text.ParsePosition parsePosition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = stdDateFormat0.parseAsRFC1123("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ICT", parsePosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(dateFormat8);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
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
        java.util.TimeZone timeZone15 = stdDateFormat0._timezone;
        java.util.Calendar calendar16 = stdDateFormat0.getCalendar();
        java.util.TimeZone timeZone17 = null;
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat0.setTimeZone(timeZone17);
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
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertNull(calendar16);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601_z;
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatRFC1123;
        stdDateFormat0._lenient = true;
        boolean boolean15 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        java.text.DateFormat dateFormat23 = stdDateFormat16._formatISO8601;
        stdDateFormat16._lenient = true;
        java.lang.String str26 = stdDateFormat16.toString();
        java.util.Date date28 = stdDateFormat16.parse("1970-01-01T00:00:00.000+0000");
        java.lang.StringBuffer stringBuffer29 = null;
        java.text.FieldPosition fieldPosition30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer31 = stdDateFormat0.format(date28, stringBuffer29, fieldPosition30);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str26, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
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
        stdDateFormat0._clearFormats();
        java.lang.Boolean boolean13 = stdDateFormat0._lenient;
        java.lang.String str14 = stdDateFormat0.toString();
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = stdDateFormat0.parseAsRFC1123("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513", parsePosition16);
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
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
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
        java.util.TimeZone timeZone13 = stdDateFormat0.getTimeZone();
        java.lang.Boolean boolean14 = stdDateFormat0._lenient;
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNull(timeZone13);
        org.junit.Assert.assertNull(boolean14);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        dateFormat7.setNumberFormat(numberFormat9);
        stdDateFormat5.setNumberFormat(numberFormat9);
        boolean boolean12 = stdDateFormat5.isLenient();
        boolean boolean14 = stdDateFormat5.looksLikeISO8601("");
        java.lang.String str15 = stdDateFormat5.toString();
        boolean boolean17 = stdDateFormat5.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone18 = stdDateFormat5.getTimeZone();
        java.util.TimeZone timeZone19 = stdDateFormat5.getTimeZone();
        boolean boolean20 = stdDateFormat5.isLenient();
        java.util.TimeZone timeZone21 = stdDateFormat5._timezone;
        java.util.Locale locale22 = stdDateFormat5._locale;
        java.util.Locale locale23 = stdDateFormat5._locale;
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale23);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(timeZone18);
        org.junit.Assert.assertNull(timeZone19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(timeZone21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat24);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.lang.Boolean boolean7 = stdDateFormat0._lenient;
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatPlain;
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        dateFormat12.setNumberFormat(numberFormat14);
        stdDateFormat10.setNumberFormat(numberFormat14);
        boolean boolean18 = stdDateFormat10.looksLikeISO8601("hi!");
        java.lang.String str19 = stdDateFormat10.toString();
        java.util.TimeZone timeZone20 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone20);
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone20);
        java.util.TimeZone timeZone23 = null;
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone23);
        dateFormat24.setLenient(false);
        dateFormat24.setLenient(false);
        boolean boolean29 = dateFormat22.equals((java.lang.Object) false);
        dateFormat22.setLenient(false);
        stdDateFormat10._formatPlain = dateFormat22;
        stdDateFormat10._lenient = true;
        java.util.TimeZone timeZone35 = stdDateFormat10._timezone;
        java.text.NumberFormat numberFormat36 = stdDateFormat10.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = dateFormat9.format((java.lang.Object) stdDateFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str19, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(timeZone35);
        org.junit.Assert.assertNotNull(numberFormat36);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.NumberFormat numberFormat10 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatISO8601;
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatPlain;
        java.util.Locale locale13 = stdDateFormat0._locale;
        java.text.NumberFormat numberFormat14 = stdDateFormat0.getNumberFormat();
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
        java.util.Calendar calendar25 = dateFormat15.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator26 = stdDateFormat0.formatToCharacterIterator((java.lang.Object) dateFormat15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertNotNull(calendar22);
// flaky "18) test3581(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar25);
// flaky "14) test3581(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar25.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601;
        java.util.TimeZone timeZone9 = stdDateFormat0.getTimeZone();
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        boolean boolean13 = stdDateFormat0.looksLikeISO8601("0");
        java.text.NumberFormat numberFormat14 = stdDateFormat0.getNumberFormat();
        java.lang.String str15 = stdDateFormat0.toString();
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(timeZone9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
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
        stdDateFormat0._lenient = false;
        java.util.Locale locale16 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat17 = stdDateFormat0._formatISO8601_z;
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNull(dateFormat10);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(timeZone12);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNull(dateFormat17);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateTimeInstance();
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        stdDateFormat0._formatISO8601 = dateFormat15;
        java.util.TimeZone timeZone18 = stdDateFormat0._timezone;
        java.lang.String str19 = stdDateFormat0.toString();
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)" + "'", str19, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(11, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone31);
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
// flaky "19) test3586(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNotNull(calendar23);
// flaky "15) test3586(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar23.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar27);
// flaky "11) test3586(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat32);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
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
        java.util.TimeZone timeZone16 = stdDateFormat0.getTimeZone();
        java.util.Date date18 = stdDateFormat0.parse("0");
        java.text.DateFormat dateFormat19 = stdDateFormat0._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat24);
        stdDateFormat20.setNumberFormat(numberFormat24);
        stdDateFormat20._clearFormats();
        java.util.Locale locale28 = stdDateFormat20._locale;
        java.util.Calendar calendar29 = stdDateFormat20.getCalendar();
        java.lang.StringBuffer stringBuffer30 = null;
        java.text.FieldPosition fieldPosition31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer32 = dateFormat19.format((java.lang.Object) calendar29, stringBuffer30, fieldPosition31);
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
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(numberFormat24);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNull(calendar29);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        dateFormat26.setNumberFormat(numberFormat28);
        stdDateFormat24.setNumberFormat(numberFormat28);
        boolean boolean31 = stdDateFormat24.isLenient();
        java.text.DateFormat dateFormat32 = stdDateFormat24._formatISO8601;
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        java.util.Calendar calendar35 = dateFormat33.getCalendar();
        stdDateFormat24.setCalendar(calendar35);
        java.util.Calendar calendar37 = stdDateFormat24.getCalendar();
        boolean boolean38 = stdDateFormat24.isLenient();
        boolean boolean40 = stdDateFormat24.looksLikeISO8601("");
        java.lang.String str41 = stdDateFormat24.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = stdDateFormat0.equals((java.lang.Object) stdDateFormat24);
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
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(dateFormat32);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(calendar35);
// flaky "20) test3588(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar35.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar37);
// flaky "16) test3588(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar37.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str41, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat11 = dateFormat10.getNumberFormat();
        dateFormat9.setNumberFormat(numberFormat11);
        stdDateFormat7.setNumberFormat(numberFormat11);
        boolean boolean14 = stdDateFormat7.isLenient();
        boolean boolean16 = stdDateFormat7.looksLikeISO8601("");
        java.lang.String str17 = stdDateFormat7.toString();
        boolean boolean19 = stdDateFormat7.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat20 = stdDateFormat7._formatPlain;
        boolean boolean21 = stdDateFormat7.isLenient();
        java.text.DateFormat dateFormat22 = stdDateFormat7._formatISO8601_z;
        java.text.DateFormat dateFormat23 = stdDateFormat7._formatISO8601_z;
        java.util.Calendar calendar24 = stdDateFormat7.getCalendar();
        java.util.Calendar calendar25 = stdDateFormat7.getCalendar();
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        java.lang.String str29 = dateFormat26.format((java.lang.Object) 3);
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        dateFormat26.setNumberFormat(numberFormat31);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat36 = dateFormat35.getNumberFormat();
        dateFormat34.setNumberFormat(numberFormat36);
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat40 = dateFormat39.getNumberFormat();
        dateFormat38.setNumberFormat(numberFormat40);
        java.text.DateFormat dateFormat42 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat43 = dateFormat42.getNumberFormat();
        java.util.Calendar calendar44 = dateFormat42.getCalendar();
        dateFormat38.setCalendar(calendar44);
        dateFormat34.setCalendar(calendar44);
        java.text.NumberFormat numberFormat47 = dateFormat34.getNumberFormat();
        dateFormat26.setNumberFormat(numberFormat47);
        stdDateFormat7.setNumberFormat(numberFormat47);
        dateFormat6.setNumberFormat(numberFormat47);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str17, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertNull(calendar24);
        org.junit.Assert.assertNull(calendar25);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(numberFormat27);
// flaky "21) test3589(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u0e21\u0e04. 2513" + "'", str29, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(numberFormat31);
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(dateFormat35);
        org.junit.Assert.assertNotNull(numberFormat36);
        org.junit.Assert.assertNotNull(dateFormat38);
        org.junit.Assert.assertNotNull(dateFormat39);
        org.junit.Assert.assertNotNull(numberFormat40);
        org.junit.Assert.assertNotNull(dateFormat42);
        org.junit.Assert.assertNotNull(numberFormat43);
        org.junit.Assert.assertNotNull(calendar44);
// flaky "17) test3589(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(numberFormat47);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
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
        java.text.DateFormat dateFormat13 = null;
        stdDateFormat0._formatISO8601_z = dateFormat13;
        java.lang.Boolean boolean15 = stdDateFormat0._lenient;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean24 = stdDateFormat16.looksLikeISO8601("hi!");
        java.lang.String str25 = stdDateFormat16.toString();
        java.util.TimeZone timeZone26 = stdDateFormat16._timezone;
        java.text.NumberFormat numberFormat27 = stdDateFormat16.getNumberFormat();
        boolean boolean29 = stdDateFormat16.looksLikeISO8601("hi!");
        java.util.Calendar calendar30 = stdDateFormat16.getCalendar();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat35 = dateFormat34.getNumberFormat();
        dateFormat33.setNumberFormat(numberFormat35);
        stdDateFormat31.setNumberFormat(numberFormat35);
        boolean boolean38 = stdDateFormat31.isLenient();
        java.text.DateFormat dateFormat39 = stdDateFormat31._formatISO8601;
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat41 = dateFormat40.getNumberFormat();
        java.util.Calendar calendar42 = dateFormat40.getCalendar();
        stdDateFormat31.setCalendar(calendar42);
        stdDateFormat16.setCalendar(calendar42);
        stdDateFormat0.setCalendar(calendar42);
        java.util.Calendar calendar46 = stdDateFormat0.getCalendar();
        stdDateFormat0._lenient = false;
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str25, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone26);
        org.junit.Assert.assertNotNull(numberFormat27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(calendar30);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(dateFormat39);
        org.junit.Assert.assertNotNull(dateFormat40);
        org.junit.Assert.assertNotNull(numberFormat41);
        org.junit.Assert.assertNotNull(calendar42);
// flaky "22) test3590(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar42.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar46);
// flaky "18) test3590(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar46.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat5);
        stdDateFormat1.setNumberFormat(numberFormat5);
        boolean boolean9 = stdDateFormat1.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat10 = stdDateFormat1._formatISO8601_z;
        java.text.DateFormat dateFormat11 = stdDateFormat1._formatPlain;
        java.text.DateFormat dateFormat12 = stdDateFormat1._formatISO8601_z;
        java.util.TimeZone timeZone13 = stdDateFormat1._timezone;
        java.text.DateFormat dateFormat14 = stdDateFormat1._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat1._formatISO8601;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance(2);
        java.util.Calendar calendar18 = dateFormat17.getCalendar();
        stdDateFormat1.setCalendar(calendar18);
        java.util.Locale locale20 = stdDateFormat1._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance(11, locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateFormat10);
        org.junit.Assert.assertNull(dateFormat11);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNull(timeZone13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(calendar18);
// flaky "23) test3591(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar18.toString(), "sun.util.BuddhistCalendar[time=-734063771755,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=23,SECOND=48,MILLISECOND=245,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
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
        java.text.DateFormat dateFormat16 = stdDateFormat0._formatISO8601_z;
        java.util.Calendar calendar17 = stdDateFormat0.getCalendar();
        java.text.DateFormat dateFormat18 = stdDateFormat0._formatRFC1123;
        // The following exception was thrown during execution in test generation
        try {
            java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
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
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(calendar17);
        org.junit.Assert.assertNull(dateFormat18);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
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
        java.util.Locale locale15 = stdDateFormat0._locale;
        boolean boolean17 = stdDateFormat0.looksLikeISO8601("Wed, 31 Dec 1969 23:59:59 UTC");
        java.util.TimeZone timeZone18 = stdDateFormat0._timezone;
        java.text.ParsePosition parsePosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = stdDateFormat0.parseAsRFC1123("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", parsePosition20);
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
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(timeZone18);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        boolean boolean10 = stdDateFormat0.isLenient();
        java.util.TimeZone timeZone11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone11);
        boolean boolean14 = dateFormat12.equals((java.lang.Object) "yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.NumberFormat numberFormat15 = dateFormat12.getNumberFormat();
        stdDateFormat0._formatISO8601_z = dateFormat12;
        java.text.AttributedCharacterIterator attributedCharacterIterator18 = stdDateFormat0.formatToCharacterIterator((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(attributedCharacterIterator18);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
        java.lang.String str15 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat16 = stdDateFormat0._formatISO8601_z;
        java.lang.String str17 = stdDateFormat0.toString();
        boolean boolean19 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
        stdDateFormat0._lenient = false;
        stdDateFormat0._lenient = true;
        java.text.DateFormat dateFormat24 = stdDateFormat0._formatISO8601;
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(calendar11);
// flaky "24) test3595(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str17, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(dateFormat24);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        boolean boolean10 = stdDateFormat0.isLenient();
        stdDateFormat0._clearFormats();
        boolean boolean13 = stdDateFormat0.looksLikeISO8601("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35 ICT");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.util.TimeZone timeZone3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat8 = dateFormat7.getNumberFormat();
        dateFormat6.setNumberFormat(numberFormat8);
        stdDateFormat4.setNumberFormat(numberFormat8);
        boolean boolean11 = stdDateFormat4.isLenient();
        boolean boolean13 = stdDateFormat4.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        boolean boolean14 = stdDateFormat4.isLenient();
        java.util.TimeZone timeZone15 = stdDateFormat4._timezone;
        java.util.Locale locale16 = stdDateFormat4._locale;
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3, locale16);
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale16);
        java.lang.Class<?> wildcardClass19 = dateFormat18.getClass();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
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
        boolean boolean13 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatPlain;
        java.text.NumberFormat numberFormat15 = stdDateFormat0.getNumberFormat();
        java.lang.String str16 = stdDateFormat0.toString();
        java.util.TimeZone timeZone17 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone17);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone17);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        dateFormat21.setLenient(true);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        dateFormat26.setNumberFormat(numberFormat28);
        stdDateFormat24.setNumberFormat(numberFormat28);
        boolean boolean32 = stdDateFormat24.looksLikeISO8601("hi!");
        java.lang.String str33 = stdDateFormat24.toString();
        java.util.TimeZone timeZone34 = stdDateFormat24._timezone;
        java.text.AttributedCharacterIterator attributedCharacterIterator36 = stdDateFormat24.formatToCharacterIterator((java.lang.Object) 0);
        java.util.Date date38 = stdDateFormat24.parse("-1");
        java.lang.String str39 = dateFormat21.format(date38);
        java.lang.String str40 = dateFormat19.format(date38);
        java.lang.StringBuffer stringBuffer41 = null;
        java.text.FieldPosition fieldPosition42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer43 = stdDateFormat0.format(date38, stringBuffer41, fieldPosition42);
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
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str16, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2a\u0e32\u0e01\u0e25\u0e40\u0e0a\u0e34\u0e07\u0e1e\u0e34\u0e01\u0e31\u0e14");
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str33, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone34);
        org.junit.Assert.assertNotNull(attributedCharacterIterator36);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 06:59:59 ICT 1970");
// flaky "25) test3598(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str39, "\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Wed, 31 Dec 1969 23:59:59 UTC" + "'", str40, "Wed, 31 Dec 1969 23:59:59 UTC");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.text.DateFormat dateFormat10 = stdDateFormat0._formatRFC1123;
        java.util.TimeZone timeZone11 = stdDateFormat0._timezone;
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dateFormat10);
        org.junit.Assert.assertNull(timeZone11);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
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
        java.util.Calendar calendar24 = stdDateFormat0.getCalendar();
        java.text.DateFormat dateFormat25 = null;
        stdDateFormat0._formatPlain = dateFormat25;
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        dateFormat28.setNumberFormat(numberFormat30);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        dateFormat32.setNumberFormat(numberFormat34);
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat37 = dateFormat36.getNumberFormat();
        java.util.Calendar calendar38 = dateFormat36.getCalendar();
        dateFormat32.setCalendar(calendar38);
        dateFormat28.setCalendar(calendar38);
        java.text.NumberFormat numberFormat41 = dateFormat28.getNumberFormat();
        stdDateFormat0._formatISO8601_z = dateFormat28;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat43 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat47 = dateFormat46.getNumberFormat();
        dateFormat45.setNumberFormat(numberFormat47);
        stdDateFormat43.setNumberFormat(numberFormat47);
        boolean boolean50 = stdDateFormat43.isLenient();
        boolean boolean52 = stdDateFormat43.looksLikeISO8601("");
        java.lang.String str53 = stdDateFormat43.toString();
        boolean boolean55 = stdDateFormat43.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone56 = stdDateFormat43.getTimeZone();
        boolean boolean57 = stdDateFormat43.isLenient();
        java.text.ParsePosition parsePosition59 = null;
        java.lang.Object obj60 = stdDateFormat43.parseObject("-1", parsePosition59);
        java.text.NumberFormat numberFormat61 = stdDateFormat43.getNumberFormat();
        java.lang.StringBuffer stringBuffer62 = null;
        java.text.FieldPosition fieldPosition63 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer64 = dateFormat28.format((java.lang.Object) stdDateFormat43, stringBuffer62, fieldPosition63);
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
// flaky "26) test3600(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar15.toString(), "sun.util.BuddhistCalendar[time=-734063771685,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=23,SECOND=48,MILLISECOND=315,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNull(calendar24);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(numberFormat30);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(numberFormat37);
        org.junit.Assert.assertNotNull(calendar38);
// flaky "19) test3600(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(numberFormat41);
        org.junit.Assert.assertNotNull(dateFormat45);
        org.junit.Assert.assertNotNull(dateFormat46);
        org.junit.Assert.assertNotNull(numberFormat47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str53, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(timeZone56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "Thu Jan 01 06:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(numberFormat61);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
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
        java.util.TimeZone timeZone15 = stdDateFormat0._timezone;
        stdDateFormat0._lenient = true;
        java.lang.String str18 = stdDateFormat0.toString();
        java.util.Locale locale19 = stdDateFormat0._locale;
        boolean boolean21 = stdDateFormat0.looksLikeISO8601("-1");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str10, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(timeZone13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(timeZone15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str18, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
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
        stdDateFormat0._lenient = true;
        java.util.TimeZone timeZone16 = stdDateFormat0._timezone;
        java.text.DateFormat dateFormat17 = stdDateFormat0._formatRFC1123;
        java.lang.String str18 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat19 = stdDateFormat0._formatPlain;
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNotNull(calendar11);
// flaky "27) test3602(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar13);
// flaky "20) test3602(com.fasterxml.jackson.databind.util.RegressionTest7)":         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=1970,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNull(timeZone16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str18, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat19);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(11, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        boolean boolean17 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat18 = stdDateFormat0._formatISO8601;
        boolean boolean19 = stdDateFormat0.isLenient();
        boolean boolean20 = stdDateFormat0.isLenient();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dateFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
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
        java.util.Locale locale12 = stdDateFormat0._locale;
        java.lang.String str13 = stdDateFormat0.toString();
        stdDateFormat0._lenient = false;
        boolean boolean16 = stdDateFormat0.isLenient();
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str9, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertNull(timeZone10);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.NumberFormat numberFormat10 = stdDateFormat0.getNumberFormat();
        java.util.TimeZone timeZone11 = stdDateFormat0._timezone;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateTimeInstance(2, (int) (byte) 1);
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat15);
        java.text.DateFormat dateFormat17 = null;
        stdDateFormat0._formatRFC1123 = dateFormat17;
        boolean boolean20 = stdDateFormat0.looksLikeISO8601("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNull(timeZone11);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }
}
