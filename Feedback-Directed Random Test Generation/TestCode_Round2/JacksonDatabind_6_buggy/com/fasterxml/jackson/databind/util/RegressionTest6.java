package com.fasterxml.jackson.databind.util;

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
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.util.Calendar calendar5 = dateFormat3.getCalendar();
        java.text.NumberFormat numberFormat6 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat6);
        boolean boolean8 = dateFormat2.isLenient();
        java.util.TimeZone timeZone9 = dateFormat2.getTimeZone();
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(0);
        boolean boolean12 = dateFormat11.isLenient();
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        dateFormat11.setNumberFormat(numberFormat14);
        java.util.TimeZone timeZone16 = dateFormat11.getTimeZone();
        java.util.TimeZone timeZone17 = dateFormat11.getTimeZone();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance();
        java.lang.String str20 = dateFormat18.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone21 = dateFormat18.getTimeZone();
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone24 = dateFormat23.getTimeZone();
        java.util.TimeZone timeZone25 = dateFormat23.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone25);
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        dateFormat28.setNumberFormat(numberFormat30);
        dateFormat27.setNumberFormat(numberFormat30);
        stdDateFormat26.setNumberFormat(numberFormat30);
        boolean boolean35 = stdDateFormat26.looksLikeISO8601("");
        java.util.Locale locale36 = stdDateFormat26._locale;
        java.text.DateFormat dateFormat37 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21, locale36);
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone17, locale36);
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone9, locale36);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateTimeInstance(10, (int) ' ', locale36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar5);
// flaky "1) test3001(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar5.toString(), "sun.util.BuddhistCalendar[time=-734064441426,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=574,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat18);
// flaky "1) test3001(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u0e21\u0e04. 2513" + "'", str20, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(numberFormat30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat37);
        org.junit.Assert.assertNotNull(dateFormat38);
        org.junit.Assert.assertNotNull(dateFormat39);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat17 = stdDateFormat3._formatISO8601_z;
        java.lang.String str18 = stdDateFormat3.toString();
        java.util.Locale locale19 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatPlain;
        boolean boolean22 = stdDateFormat3.looksLikeISO8601("\u0e21\u0e04. 2513 07:00:00");
        java.text.DateFormat dateFormat23 = stdDateFormat3._formatPlain;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str18, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(dateFormat23);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        boolean boolean13 = dateFormat11.equals((java.lang.Object) 1.0f);
        boolean boolean14 = dateFormat11.isLenient();
        java.util.TimeZone timeZone15 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.withTimeZone(timeZone15);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar20 = dateFormat19.getCalendar();
        dateFormat17.setCalendar(calendar20);
        stdDateFormat16.setCalendar(calendar20);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(calendar20);
// flaky "2) test3003(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar20.toString(), "sun.util.BuddhistCalendar[time=-734064441408,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=592,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat14 = null;
        stdDateFormat3._formatPlain = dateFormat14;
        java.util.TimeZone timeZone16 = stdDateFormat3._timezone;
        java.util.TimeZone timeZone17 = stdDateFormat3._timezone;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.Locale locale13 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        boolean boolean16 = dateFormat15.isLenient();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat18);
        java.util.TimeZone timeZone20 = dateFormat15.getTimeZone();
        stdDateFormat3.setTimeZone(timeZone20);
        java.text.ParsePosition parsePosition23 = null;
        java.util.Date date24 = stdDateFormat3.parse("10", parsePosition23);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar28 = dateFormat27.getCalendar();
        dateFormat25.setCalendar(calendar28);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar32 = dateFormat31.getCalendar();
        java.util.TimeZone timeZone33 = dateFormat31.getTimeZone();
        boolean boolean34 = dateFormat25.equals((java.lang.Object) timeZone33);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat3.withTimeZone(timeZone33);
        java.util.TimeZone timeZone36 = stdDateFormat35._timezone;
        java.text.DateFormat dateFormat37 = stdDateFormat35._formatPlain;
        java.text.DateFormat dateFormat38 = stdDateFormat35._formatISO8601_z;
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        dateFormat39.setLenient(false);
        java.text.NumberFormat numberFormat42 = dateFormat39.getNumberFormat();
        stdDateFormat35.setNumberFormat(numberFormat42);
        java.util.TimeZone timeZone44 = stdDateFormat35._timezone;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(calendar28);
// flaky "3) test3005(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar28.toString(), "sun.util.BuddhistCalendar[time=-734064441392,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=608,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(calendar32);
// flaky "2) test3005(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar32.toString(), "sun.util.BuddhistCalendar[time=-734064441392,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=608,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(stdDateFormat35);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat37);
        org.junit.Assert.assertNull(dateFormat38);
        org.junit.Assert.assertNotNull(dateFormat39);
        org.junit.Assert.assertNotNull(numberFormat42);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat3.withTimeZone(timeZone17);
        java.text.DateFormat dateFormat19 = stdDateFormat18._formatISO8601_z;
        java.text.DateFormat dateFormat20 = stdDateFormat18._formatPlain;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNull(dateFormat20);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.lang.String str11 = stdDateFormat3.toString();
        java.util.TimeZone timeZone12 = stdDateFormat3._timezone;
        java.util.TimeZone timeZone13 = null;
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat3.setTimeZone(timeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatISO8601;
        boolean boolean18 = stdDateFormat3.looksLikeISO8601("10");
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateInstance();
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 1L);
        dateFormat19.setLenient(true);
        boolean boolean24 = dateFormat19.isLenient();
        stdDateFormat3._formatPlain = dateFormat19;
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar27 = dateFormat26.getCalendar();
        java.util.TimeZone timeZone28 = dateFormat26.getTimeZone();
        boolean boolean29 = dateFormat26.isLenient();
        dateFormat26.setLenient(true);
        java.text.NumberFormat numberFormat32 = dateFormat26.getNumberFormat();
        stdDateFormat3.setNumberFormat(numberFormat32);
        java.text.DateFormat dateFormat34 = stdDateFormat3._formatPlain;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateFormat19);
// flaky "4) test3008(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u0e21\u0e04. 2513" + "'", str21, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(calendar27);
// flaky "3) test3008(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar27.toString(), "sun.util.BuddhistCalendar[time=-734064441367,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=633,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertNotNull(dateFormat34);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601;
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = stdDateFormat3.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ", parsePosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat14);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        stdDateFormat4.setNumberFormat(numberFormat6);
        java.lang.String str8 = stdDateFormat4.toString();
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateInstance(0);
        boolean boolean11 = dateFormat10.isLenient();
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator16 = dateFormat13.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean17 = dateFormat10.equals((java.lang.Object) dateFormat13);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        java.util.Calendar calendar20 = dateFormat18.getCalendar();
        dateFormat13.setCalendar(calendar20);
        dateFormat13.setLenient(true);
        stdDateFormat4._formatISO8601_z = dateFormat13;
        java.util.TimeZone timeZone25 = stdDateFormat4._timezone;
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone25);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone28 = dateFormat27.getTimeZone();
        java.util.TimeZone timeZone29 = dateFormat27.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone29);
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        dateFormat32.setNumberFormat(numberFormat34);
        dateFormat31.setNumberFormat(numberFormat34);
        stdDateFormat30.setNumberFormat(numberFormat34);
        boolean boolean39 = stdDateFormat30.looksLikeISO8601("");
        java.util.TimeZone timeZone40 = stdDateFormat30._timezone;
        java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        stdDateFormat30._formatRFC1123 = dateFormat41;
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat44 = dateFormat43.getNumberFormat();
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar46 = dateFormat45.getCalendar();
        dateFormat43.setCalendar(calendar46);
        stdDateFormat30._formatPlain = dateFormat43;
        java.text.DateFormat dateFormat49 = stdDateFormat30._formatPlain;
        java.text.DateFormat dateFormat50 = java.text.DateFormat.getDateInstance();
        java.lang.String str52 = dateFormat50.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone53 = dateFormat50.getTimeZone();
        java.text.DateFormat dateFormat54 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone53);
        java.text.DateFormat dateFormat55 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone53);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat56 = stdDateFormat30.withTimeZone(timeZone53);
        java.text.DateFormat dateFormat57 = stdDateFormat30._formatISO8601;
        java.text.DateFormat dateFormat58 = stdDateFormat30._formatRFC1123;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator59 = dateFormat26.formatToCharacterIterator((java.lang.Object) dateFormat58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "5) test3010(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064441344,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=656,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)" + "'", str8, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(attributedCharacterIterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(calendar20);
// flaky "4) test3010(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar20.toString(), "sun.util.BuddhistCalendar[time=-734064441344,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=656,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat41);
        org.junit.Assert.assertNotNull(dateFormat43);
        org.junit.Assert.assertNotNull(numberFormat44);
        org.junit.Assert.assertNotNull(dateFormat45);
        org.junit.Assert.assertNotNull(calendar46);
// flaky "1) test3010(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar46.toString(), "sun.util.BuddhistCalendar[time=-734064441344,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=656,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat49);
        org.junit.Assert.assertNotNull(dateFormat50);
// flaky "1) test3010(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\u0e21\u0e04. 2513" + "'", str52, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat54);
        org.junit.Assert.assertNotNull(dateFormat55);
        org.junit.Assert.assertNotNull(stdDateFormat56);
        org.junit.Assert.assertNull(dateFormat57);
        org.junit.Assert.assertNotNull(dateFormat58);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
        dateFormat0.setLenient(true);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        boolean boolean7 = dateFormat6.isLenient();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator12 = dateFormat9.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean13 = dateFormat6.equals((java.lang.Object) dateFormat9);
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        java.util.Calendar calendar16 = dateFormat14.getCalendar();
        dateFormat9.setCalendar(calendar16);
        dateFormat9.setLenient(true);
        boolean boolean20 = dateFormat0.equals((java.lang.Object) dateFormat9);
        java.util.TimeZone timeZone21 = dateFormat9.getTimeZone();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.util.TimeZone timeZone24 = dateFormat22.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        dateFormat27.setNumberFormat(numberFormat29);
        dateFormat26.setNumberFormat(numberFormat29);
        stdDateFormat25.setNumberFormat(numberFormat29);
        boolean boolean34 = stdDateFormat25.looksLikeISO8601("");
        java.util.TimeZone timeZone35 = stdDateFormat25._timezone;
        java.lang.String str36 = stdDateFormat25.toString();
        boolean boolean38 = stdDateFormat25.looksLikeISO8601("hi!");
        java.util.Locale locale39 = stdDateFormat25._locale;
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21, locale39);
        org.junit.Assert.assertNotNull(dateFormat0);
// flaky "6) test3011(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0e21\u0e04. 2513" + "'", str2, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(attributedCharacterIterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(calendar16);
// flaky "5) test3011(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar16.toString(), "sun.util.BuddhistCalendar[time=-734064441323,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=677,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(numberFormat29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str36, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat40);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        stdDateFormat3._formatRFC1123 = dateFormat14;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar19 = dateFormat18.getCalendar();
        dateFormat16.setCalendar(calendar19);
        stdDateFormat3._formatPlain = dateFormat16;
        java.util.Calendar calendar22 = stdDateFormat3.getCalendar();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(calendar19);
// flaky "7) test3012(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar19.toString(), "sun.util.BuddhistCalendar[time=-734064441312,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=688,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(calendar22);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        boolean boolean13 = dateFormat11.equals((java.lang.Object) 1.0f);
        boolean boolean14 = dateFormat11.isLenient();
        java.util.TimeZone timeZone15 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.withTimeZone(timeZone15);
        boolean boolean18 = stdDateFormat16.looksLikeISO8601("yyyy-MM-dd");
        java.text.DateFormat dateFormat19 = stdDateFormat16._formatRFC1123;
        java.text.NumberFormat numberFormat20 = stdDateFormat16.getNumberFormat();
        java.text.DateFormat dateFormat21 = stdDateFormat16._formatISO8601;
        java.text.DateFormat dateFormat22 = stdDateFormat16._formatPlain;
        java.text.ParsePosition parsePosition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date25 = stdDateFormat16.parse("hi!", parsePosition24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertNull(dateFormat22);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat3.withTimeZone(timeZone17);
        java.text.DateFormat dateFormat19 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatISO8601_z;
        java.lang.String str21 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat22 = stdDateFormat3._formatISO8601_z;
        // The following exception was thrown during execution in test generation
        try {
            java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str21, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat22);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        dateFormat0.setLenient(true);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone7 = dateFormat6.getTimeZone();
        java.util.TimeZone timeZone8 = dateFormat6.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone8);
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        dateFormat11.setNumberFormat(numberFormat13);
        dateFormat10.setNumberFormat(numberFormat13);
        stdDateFormat9.setNumberFormat(numberFormat13);
        dateFormat0.setNumberFormat(numberFormat13);
        java.util.TimeZone timeZone18 = dateFormat0.getTimeZone();
        java.util.Calendar calendar19 = dateFormat0.getCalendar();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar2);
// flaky "8) test3015(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064441273,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=727,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar19);
// flaky "6) test3015(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar19.toString(), "sun.util.BuddhistCalendar[time=-734064441273,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=727,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 1);
        dateFormat1.setLenient(true);
        dateFormat1.setLenient(true);
        dateFormat1.setLenient(false);
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        stdDateFormat3._timezone = timeZone17;
        java.text.DateFormat dateFormat19 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatRFC1123;
        java.util.Date date22 = stdDateFormat3.parse("10");
        java.util.TimeZone timeZone23 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone25 = dateFormat24.getTimeZone();
        java.util.TimeZone timeZone26 = dateFormat24.getTimeZone();
        java.util.TimeZone timeZone27 = dateFormat24.getTimeZone();
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance(0);
        boolean boolean30 = dateFormat29.isLenient();
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator35 = dateFormat32.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean36 = dateFormat29.equals((java.lang.Object) dateFormat32);
        java.util.TimeZone timeZone37 = dateFormat32.getTimeZone();
        java.util.TimeZone timeZone38 = dateFormat32.getTimeZone();
        java.text.NumberFormat numberFormat39 = dateFormat32.getNumberFormat();
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone41 = dateFormat40.getTimeZone();
        java.util.TimeZone timeZone42 = dateFormat40.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat43 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone42);
        java.text.DateFormat dateFormat44 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat47 = dateFormat46.getNumberFormat();
        dateFormat45.setNumberFormat(numberFormat47);
        dateFormat44.setNumberFormat(numberFormat47);
        stdDateFormat43.setNumberFormat(numberFormat47);
        java.text.DateFormat dateFormat51 = java.text.DateFormat.getDateInstance();
        boolean boolean53 = dateFormat51.equals((java.lang.Object) 1.0f);
        boolean boolean54 = dateFormat51.isLenient();
        java.util.TimeZone timeZone55 = dateFormat51.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat56 = stdDateFormat43.withTimeZone(timeZone55);
        java.util.Calendar calendar57 = null;
        stdDateFormat43.setCalendar(calendar57);
        java.text.DateFormat dateFormat59 = stdDateFormat43._formatPlain;
        java.util.Date date61 = stdDateFormat43.parse("10");
        java.lang.String str62 = dateFormat32.format(date61);
        java.lang.String str63 = dateFormat24.format(date61);
        java.lang.StringBuffer stringBuffer64 = null;
        java.text.FieldPosition fieldPosition65 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer66 = stdDateFormat3.format(date61, stringBuffer64, fieldPosition65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(attributedCharacterIterator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(numberFormat39);
        org.junit.Assert.assertNotNull(dateFormat40);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat44);
        org.junit.Assert.assertNotNull(dateFormat45);
        org.junit.Assert.assertNotNull(dateFormat46);
        org.junit.Assert.assertNotNull(numberFormat47);
        org.junit.Assert.assertNotNull(dateFormat51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat56);
        org.junit.Assert.assertNull(dateFormat59);
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 07:00:00 ICT 1970");
// flaky "9) test3018(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513" + "'", str62, "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513");
// flaky "7) test3018(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\u0e21\u0e04. 2513 07:00:00" + "'", str63, "\u0e21\u0e04. 2513 07:00:00");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat17 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat18 = null;
        stdDateFormat3._formatRFC1123 = dateFormat18;
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatRFC1123;
        java.util.Calendar calendar21 = null;
        stdDateFormat3.setCalendar(calendar21);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(dateFormat20);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat3.withTimeZone(timeZone17);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar22 = dateFormat21.getCalendar();
        dateFormat19.setCalendar(calendar22);
        stdDateFormat3.setCalendar(calendar22);
        boolean boolean26 = stdDateFormat3.looksLikeISO8601("10");
        boolean boolean27 = stdDateFormat3.isLenient();
        stdDateFormat3.setLenient(false);
        java.text.DateFormat dateFormat30 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat31 = stdDateFormat3._formatRFC1123;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(calendar22);
// flaky "10) test3020(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar22.toString(), "sun.util.BuddhistCalendar[time=-734064441219,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=781,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(dateFormat30);
        org.junit.Assert.assertNull(dateFormat31);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.util.TimeZone timeZone3 = null;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone6 = dateFormat5.getTimeZone();
        java.util.TimeZone timeZone7 = dateFormat5.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone7);
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat12 = dateFormat11.getNumberFormat();
        dateFormat10.setNumberFormat(numberFormat12);
        dateFormat9.setNumberFormat(numberFormat12);
        stdDateFormat8.setNumberFormat(numberFormat12);
        boolean boolean17 = stdDateFormat8.looksLikeISO8601("");
        java.util.Locale locale18 = stdDateFormat8._locale;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance(0, locale18);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3, locale18);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance(0, locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateTimeInstance(8, 0, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        boolean boolean14 = stdDateFormat3.equals((java.lang.Object) 5);
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar17 = dateFormat16.getCalendar();
        stdDateFormat3._formatISO8601_z = dateFormat16;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance(0);
        boolean boolean21 = dateFormat20.isLenient();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator26 = dateFormat23.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean27 = dateFormat20.equals((java.lang.Object) dateFormat23);
        java.util.TimeZone timeZone28 = dateFormat23.getTimeZone();
        boolean boolean29 = dateFormat23.isLenient();
        stdDateFormat3._formatISO8601 = dateFormat23;
        dateFormat23.setLenient(false);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "11) test3022(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar17.toString(), "sun.util.BuddhistCalendar[time=-734064441179,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=821,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(attributedCharacterIterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat4);
        java.util.TimeZone timeZone6 = dateFormat1.getTimeZone();
        java.util.TimeZone timeZone7 = dateFormat1.getTimeZone();
        java.lang.Class<?> wildcardClass8 = timeZone7.getClass();
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat3.withTimeZone(timeZone17);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar22 = dateFormat21.getCalendar();
        dateFormat19.setCalendar(calendar22);
        stdDateFormat3.setCalendar(calendar22);
        java.util.TimeZone timeZone25 = stdDateFormat3.getTimeZone();
        java.text.DateFormat dateFormat26 = stdDateFormat3._formatISO8601_z;
        java.text.ParsePosition parsePosition28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date29 = stdDateFormat3.parseAsRFC1123("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(calendar22);
// flaky "12) test3024(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar22.toString(), "sun.util.BuddhistCalendar[time=-734064441164,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=836,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat26);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601_z;
        boolean boolean17 = stdDateFormat3.looksLikeISO8601("yyyy-MM-dd");
        java.util.TimeZone timeZone18 = stdDateFormat3._timezone;
        java.lang.String str19 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat21 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.util.TimeZone timeZone24 = dateFormat22.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        dateFormat27.setNumberFormat(numberFormat29);
        dateFormat26.setNumberFormat(numberFormat29);
        stdDateFormat25.setNumberFormat(numberFormat29);
        boolean boolean34 = stdDateFormat25.looksLikeISO8601("");
        java.util.Locale locale35 = stdDateFormat25._locale;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance(0);
        boolean boolean38 = dateFormat37.isLenient();
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat40 = dateFormat39.getNumberFormat();
        dateFormat37.setNumberFormat(numberFormat40);
        java.util.TimeZone timeZone42 = dateFormat37.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat43 = stdDateFormat25.withTimeZone(timeZone42);
        java.text.DateFormat dateFormat44 = stdDateFormat43._formatPlain;
        java.util.Date date46 = stdDateFormat43.parse("2513-01-01T00:00:00.000+0700");
        java.lang.StringBuffer stringBuffer47 = null;
        java.text.FieldPosition fieldPosition48 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer49 = stdDateFormat3.format(date46, stringBuffer47, fieldPosition48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str19, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(numberFormat29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(dateFormat39);
        org.junit.Assert.assertNotNull(numberFormat40);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat43);
        org.junit.Assert.assertNull(dateFormat44);
        org.junit.Assert.assertNotNull(date46);
// flaky "13) test3025(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601;
        java.text.ParsePosition parsePosition17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = stdDateFormat3.parseAsRFC1123("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", parsePosition17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        java.util.TimeZone timeZone4 = dateFormat2.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        dateFormat7.setNumberFormat(numberFormat9);
        dateFormat6.setNumberFormat(numberFormat9);
        stdDateFormat5.setNumberFormat(numberFormat9);
        boolean boolean14 = stdDateFormat5.looksLikeISO8601("");
        java.util.TimeZone timeZone15 = stdDateFormat5._timezone;
        java.lang.String str16 = stdDateFormat5.toString();
        java.text.DateFormat dateFormat17 = stdDateFormat5._formatISO8601_z;
        boolean boolean19 = stdDateFormat5.looksLikeISO8601("yyyy-MM-dd");
        java.util.TimeZone timeZone20 = stdDateFormat5._timezone;
        java.lang.String str21 = stdDateFormat5.toString();
        java.util.Locale locale22 = stdDateFormat5._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateTimeInstance(0, 14, locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str16, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str21, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat17 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator20 = dateFormat18.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone21 = dateFormat18.getTimeZone();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar23 = dateFormat22.getCalendar();
        dateFormat18.setCalendar(calendar23);
        dateFormat18.setLenient(true);
        stdDateFormat3._formatPlain = dateFormat18;
        java.text.DateFormat dateFormat28 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat29 = stdDateFormat3._formatPlain;
        boolean boolean31 = stdDateFormat3.looksLikeISO8601("");
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(attributedCharacterIterator20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(calendar23);
// flaky "14) test3028(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar23.toString(), "sun.util.BuddhistCalendar[time=-734064441111,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=889,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(dateFormat28);
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.util.TimeZone timeZone5 = dateFormat3.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        dateFormat8.setNumberFormat(numberFormat10);
        dateFormat7.setNumberFormat(numberFormat10);
        stdDateFormat6.setNumberFormat(numberFormat10);
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("");
        java.util.Locale locale16 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance(0);
        boolean boolean19 = dateFormat18.isLenient();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat21);
        java.util.TimeZone timeZone23 = dateFormat18.getTimeZone();
        stdDateFormat6.setTimeZone(timeZone23);
        java.text.ParsePosition parsePosition26 = null;
        java.util.Date date27 = stdDateFormat6.parse("10", parsePosition26);
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone29 = dateFormat28.getTimeZone();
        java.util.TimeZone timeZone30 = dateFormat28.getTimeZone();
        stdDateFormat6._formatRFC1123 = dateFormat28;
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance(0);
        boolean boolean34 = dateFormat33.isLenient();
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator39 = dateFormat36.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean40 = dateFormat33.equals((java.lang.Object) dateFormat36);
        java.util.TimeZone timeZone41 = dateFormat36.getTimeZone();
        java.util.TimeZone timeZone42 = dateFormat36.getTimeZone();
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getDateInstance();
        java.lang.String str45 = dateFormat43.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone46 = dateFormat43.getTimeZone();
        boolean boolean47 = dateFormat43.isLenient();
        java.text.NumberFormat numberFormat48 = dateFormat43.getNumberFormat();
        dateFormat36.setNumberFormat(numberFormat48);
        java.util.Calendar calendar50 = dateFormat36.getCalendar();
        stdDateFormat6._formatISO8601_z = dateFormat36;
        java.text.DateFormat dateFormat52 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator54 = dateFormat52.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone55 = dateFormat52.getTimeZone();
        java.text.DateFormat dateFormat56 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar57 = dateFormat56.getCalendar();
        dateFormat52.setCalendar(calendar57);
        boolean boolean59 = dateFormat52.isLenient();
        dateFormat52.setLenient(true);
        boolean boolean63 = dateFormat52.equals((java.lang.Object) (short) 1);
        java.text.DateFormat dateFormat64 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone65 = dateFormat64.getTimeZone();
        java.util.Calendar calendar66 = dateFormat64.getCalendar();
        java.text.DateFormat dateFormat67 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone68 = dateFormat67.getTimeZone();
        java.util.TimeZone timeZone69 = dateFormat67.getTimeZone();
        dateFormat67.setLenient(true);
        boolean boolean73 = dateFormat67.equals((java.lang.Object) 'a');
        java.util.Calendar calendar74 = dateFormat67.getCalendar();
        dateFormat64.setCalendar(calendar74);
        dateFormat52.setCalendar(calendar74);
        java.text.NumberFormat numberFormat77 = dateFormat52.getNumberFormat();
        java.text.DateFormat dateFormat78 = java.text.DateFormat.getDateInstance();
        java.lang.String str80 = dateFormat78.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone81 = dateFormat78.getTimeZone();
        java.util.Calendar calendar82 = dateFormat78.getCalendar();
        java.text.NumberFormat numberFormat83 = dateFormat78.getNumberFormat();
        dateFormat52.setNumberFormat(numberFormat83);
        dateFormat36.setNumberFormat(numberFormat83);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str86 = dateFormat0.format((java.lang.Object) numberFormat83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "15) test3029(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar2);
// flaky "8) test3029(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(dateFormat38);
        org.junit.Assert.assertNotNull(attributedCharacterIterator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat43);
// flaky "2) test3029(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u0e21\u0e04. 2513" + "'", str45, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(numberFormat48);
        org.junit.Assert.assertNotNull(calendar50);
        org.junit.Assert.assertEquals(calendar50.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat52);
        org.junit.Assert.assertNotNull(attributedCharacterIterator54);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat56);
        org.junit.Assert.assertNotNull(calendar57);
// flaky "2) test3029(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar57.toString(), "sun.util.BuddhistCalendar[time=-734064441094,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=906,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(dateFormat64);
        org.junit.Assert.assertNotNull(timeZone65);
        org.junit.Assert.assertEquals(timeZone65.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar66);
// flaky "1) test3029(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar66.toString(), "sun.util.BuddhistCalendar[time=-734064441094,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=906,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat67);
        org.junit.Assert.assertNotNull(timeZone68);
        org.junit.Assert.assertEquals(timeZone68.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone69);
        org.junit.Assert.assertEquals(timeZone69.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(calendar74);
// flaky "1) test3029(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar74.toString(), "sun.util.BuddhistCalendar[time=-734064441094,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=906,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat77);
        org.junit.Assert.assertNotNull(dateFormat78);
// flaky "1) test3029(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\u0e21\u0e04. 2513" + "'", str80, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone81);
        org.junit.Assert.assertEquals(timeZone81.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar82);
        org.junit.Assert.assertEquals(calendar82.toString(), "sun.util.BuddhistCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat83);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        boolean boolean14 = stdDateFormat3.equals((java.lang.Object) 5);
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone18 = dateFormat17.getTimeZone();
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        stdDateFormat3.setTimeZone(timeZone18);
        java.util.TimeZone timeZone22 = stdDateFormat3._timezone;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.text.NumberFormat numberFormat4 = dateFormat0.getNumberFormat();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(attributedCharacterIterator2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(numberFormat4);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat14 = null;
        stdDateFormat3._formatPlain = dateFormat14;
        java.text.NumberFormat numberFormat16 = stdDateFormat3.getNumberFormat();
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.util.Calendar calendar18 = dateFormat17.getCalendar();
        stdDateFormat3.setCalendar(calendar18);
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar22 = dateFormat21.getCalendar();
        java.util.TimeZone timeZone23 = dateFormat21.getTimeZone();
        boolean boolean24 = dateFormat21.isLenient();
        java.util.TimeZone timeZone25 = dateFormat21.getTimeZone();
        java.util.TimeZone timeZone26 = dateFormat21.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = stdDateFormat3.withTimeZone(timeZone26);
        java.lang.String str28 = stdDateFormat27.toString();
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar30 = dateFormat29.getCalendar();
        java.util.Calendar calendar31 = dateFormat29.getCalendar();
        stdDateFormat27.setCalendar(calendar31);
        java.lang.Class<?> wildcardClass33 = stdDateFormat27.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(calendar18);
// flaky "16) test3032(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar18.toString(), "sun.util.BuddhistCalendar[time=-734064441079,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=921,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(calendar22);
// flaky "9) test3032(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar22.toString(), "sun.util.BuddhistCalendar[time=-734064441041,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=959,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str28, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(calendar30);
// flaky "3) test3032(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar30.toString(), "sun.util.BuddhistCalendar[time=-734064441041,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=959,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar31);
// flaky "3) test3032(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar31.toString(), "sun.util.BuddhistCalendar[time=-734064441041,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=959,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        boolean boolean13 = dateFormat11.equals((java.lang.Object) 1.0f);
        boolean boolean14 = dateFormat11.isLenient();
        java.util.TimeZone timeZone15 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.withTimeZone(timeZone15);
        boolean boolean18 = stdDateFormat16.looksLikeISO8601("yyyy-MM-dd");
        java.lang.String str19 = stdDateFormat16.toString();
        boolean boolean21 = stdDateFormat16.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)");
        java.util.Locale locale22 = stdDateFormat16._locale;
        boolean boolean24 = stdDateFormat16.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone26 = dateFormat25.getTimeZone();
        java.util.TimeZone timeZone27 = dateFormat25.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone27);
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        dateFormat30.setNumberFormat(numberFormat32);
        dateFormat29.setNumberFormat(numberFormat32);
        stdDateFormat28.setNumberFormat(numberFormat32);
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance();
        boolean boolean38 = dateFormat36.equals((java.lang.Object) 1.0f);
        boolean boolean39 = dateFormat36.isLenient();
        java.util.TimeZone timeZone40 = dateFormat36.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat41 = stdDateFormat28.withTimeZone(timeZone40);
        boolean boolean43 = stdDateFormat41.looksLikeISO8601("yyyy-MM-dd");
        java.lang.String str44 = stdDateFormat41.toString();
        java.text.DateFormat dateFormat45 = stdDateFormat41._formatRFC1123;
        java.text.DateFormat dateFormat46 = stdDateFormat41._formatISO8601;
        java.util.Date date48 = stdDateFormat41.parse("2513-01-01T07:00:00.010+0700");
        java.lang.StringBuffer stringBuffer49 = null;
        java.text.FieldPosition fieldPosition50 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer51 = stdDateFormat16.format(date48, stringBuffer49, fieldPosition50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str19, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str44, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat45);
        org.junit.Assert.assertNull(dateFormat46);
        org.junit.Assert.assertNotNull(date48);
// flaky "17) test3033(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone18 = dateFormat17.getTimeZone();
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = stdDateFormat3.withTimeZone(timeZone18);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.util.Calendar calendar24 = dateFormat22.getCalendar();
        java.text.NumberFormat numberFormat25 = dateFormat22.getNumberFormat();
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone27 = dateFormat26.getTimeZone();
        java.util.TimeZone timeZone28 = dateFormat26.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone28);
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        dateFormat31.setNumberFormat(numberFormat33);
        dateFormat30.setNumberFormat(numberFormat33);
        stdDateFormat29.setNumberFormat(numberFormat33);
        boolean boolean38 = stdDateFormat29.looksLikeISO8601("");
        java.util.Locale locale39 = stdDateFormat29._locale;
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateInstance(0);
        boolean boolean42 = dateFormat41.isLenient();
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat44 = dateFormat43.getNumberFormat();
        dateFormat41.setNumberFormat(numberFormat44);
        java.util.TimeZone timeZone46 = dateFormat41.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat47 = stdDateFormat29.withTimeZone(timeZone46);
        java.text.ParsePosition parsePosition49 = null;
        java.util.Date date50 = stdDateFormat29.parse("10", parsePosition49);
        java.lang.String str51 = dateFormat22.format(date50);
        java.lang.StringBuffer stringBuffer52 = null;
        java.text.FieldPosition fieldPosition53 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer54 = stdDateFormat3.format(date50, stringBuffer52, fieldPosition53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(stdDateFormat21);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar24);
        org.junit.Assert.assertEquals(calendar24.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(numberFormat33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(dateFormat43);
        org.junit.Assert.assertNotNull(numberFormat44);
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat47);
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 07:00:00 ICT 1970");
// flaky "18) test3034(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\u0e21\u0e04. 2513 07:00:00" + "'", str51, "\u0e21\u0e04. 2513 07:00:00");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        boolean boolean13 = dateFormat11.equals((java.lang.Object) 1.0f);
        boolean boolean14 = dateFormat11.isLenient();
        java.util.TimeZone timeZone15 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.withTimeZone(timeZone15);
        java.util.Calendar calendar17 = null;
        stdDateFormat3.setCalendar(calendar17);
        java.text.DateFormat dateFormat19 = stdDateFormat3._formatPlain;
        java.util.TimeZone timeZone20 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat21 = stdDateFormat3._formatPlain;
        java.util.TimeZone timeZone22 = stdDateFormat3._timezone;
        java.text.ParsePosition parsePosition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date25 = stdDateFormat3.parseAsISO8601("hi!", parsePosition24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.lang.String str15 = stdDateFormat3.toString();
        java.text.NumberFormat numberFormat16 = stdDateFormat3.getNumberFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone18 = dateFormat17.getTimeZone();
        java.text.NumberFormat numberFormat19 = dateFormat17.getNumberFormat();
        stdDateFormat3._formatISO8601_z = dateFormat17;
        dateFormat17.setLenient(true);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone24 = dateFormat23.getTimeZone();
        boolean boolean25 = dateFormat23.isLenient();
        boolean boolean26 = dateFormat23.isLenient();
        boolean boolean27 = dateFormat17.equals((java.lang.Object) boolean26);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.text.ParsePosition parsePosition14 = null;
        java.util.Date date15 = stdDateFormat3.parse("10", parsePosition14);
        boolean boolean17 = stdDateFormat3.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)");
        java.util.Locale locale18 = stdDateFormat3._locale;
        java.util.TimeZone timeZone19 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatRFC1123;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date22 = null; // flaky "19) test3037(com.fasterxml.jackson.databind.util.RegressionTest6)": stdDateFormat3.parse("\u0e21\u0e04. 2513 07:00:00");
// flaky "10) test3037(com.fasterxml.jackson.databind.util.RegressionTest6)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat20);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        boolean boolean14 = stdDateFormat3.equals((java.lang.Object) 5);
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar17 = dateFormat16.getCalendar();
        stdDateFormat3._formatISO8601_z = dateFormat16;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance(0);
        boolean boolean21 = dateFormat20.isLenient();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator26 = dateFormat23.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean27 = dateFormat20.equals((java.lang.Object) dateFormat23);
        java.util.TimeZone timeZone28 = dateFormat23.getTimeZone();
        boolean boolean29 = dateFormat23.isLenient();
        stdDateFormat3._formatISO8601 = dateFormat23;
        java.text.DateFormat dateFormat31 = stdDateFormat3._formatRFC1123;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "20) test3038(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar17.toString(), "sun.util.BuddhistCalendar[time=-734064440966,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=34,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(attributedCharacterIterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(dateFormat31);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
        java.text.NumberFormat numberFormat12 = dateFormat1.getNumberFormat();
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone14 = dateFormat13.getTimeZone();
        java.util.TimeZone timeZone15 = dateFormat13.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15);
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        dateFormat17.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean25 = stdDateFormat16.looksLikeISO8601("");
        java.util.TimeZone timeZone26 = stdDateFormat16._timezone;
        java.text.DateFormat dateFormat27 = stdDateFormat16._formatISO8601_z;
        boolean boolean29 = stdDateFormat16.looksLikeISO8601("Thu, 01 Jan 2513 07:00:00 ICT");
        java.util.Calendar calendar30 = null;
        stdDateFormat16.setCalendar(calendar30);
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance(0);
        boolean boolean34 = dateFormat33.isLenient();
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator39 = dateFormat36.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean40 = dateFormat33.equals((java.lang.Object) dateFormat36);
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat42 = dateFormat41.getNumberFormat();
        java.util.Calendar calendar43 = dateFormat41.getCalendar();
        dateFormat36.setCalendar(calendar43);
        stdDateFormat16._formatPlain = dateFormat36;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = dateFormat1.format((java.lang.Object) dateFormat36);
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
// flaky "21) test3039(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar5.toString(), "sun.util.BuddhistCalendar[time=-734064440956,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=44,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNotNull(dateFormat8);
// flaky "11) test3039(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertNull(calendar9);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(dateFormat38);
        org.junit.Assert.assertNotNull(attributedCharacterIterator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(dateFormat41);
        org.junit.Assert.assertNotNull(numberFormat42);
        org.junit.Assert.assertNotNull(calendar43);
// flaky "4) test3039(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar43.toString(), "sun.util.BuddhistCalendar[time=-734064440956,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=44,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        stdDateFormat4.setNumberFormat(numberFormat6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = stdDateFormat4.isLenient();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "22) test3040(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064440943,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=57,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar3 = dateFormat2.getCalendar();
        dateFormat0.setCalendar(calendar3);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar7 = dateFormat6.getCalendar();
        java.util.TimeZone timeZone8 = dateFormat6.getTimeZone();
        boolean boolean9 = dateFormat0.equals((java.lang.Object) timeZone8);
        dateFormat0.setLenient(true);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(calendar3);
// flaky "23) test3041(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar3.toString(), "sun.util.BuddhistCalendar[time=-734064440936,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=64,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(calendar7);
// flaky "12) test3041(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar7.toString(), "sun.util.BuddhistCalendar[time=-734064440936,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=64,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        boolean boolean13 = dateFormat11.equals((java.lang.Object) 1.0f);
        boolean boolean14 = dateFormat11.isLenient();
        java.util.TimeZone timeZone15 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.withTimeZone(timeZone15);
        java.util.Locale locale17 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat18 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.util.Calendar calendar20 = dateFormat19.getCalendar();
        stdDateFormat3._formatRFC1123 = dateFormat19;
        boolean boolean23 = stdDateFormat3.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.util.Date date25 = stdDateFormat3.parse("10");
        java.text.DateFormat dateFormat26 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone28 = dateFormat27.getTimeZone();
        java.util.TimeZone timeZone29 = dateFormat27.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone29);
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        dateFormat32.setNumberFormat(numberFormat34);
        dateFormat31.setNumberFormat(numberFormat34);
        stdDateFormat30.setNumberFormat(numberFormat34);
        boolean boolean39 = stdDateFormat30.looksLikeISO8601("");
        java.util.TimeZone timeZone40 = stdDateFormat30._timezone;
        java.lang.String str41 = stdDateFormat30.toString();
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone44 = dateFormat43.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat45 = stdDateFormat30.withTimeZone(timeZone44);
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat48 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar49 = dateFormat48.getCalendar();
        dateFormat46.setCalendar(calendar49);
        stdDateFormat30.setCalendar(calendar49);
        boolean boolean53 = stdDateFormat30.looksLikeISO8601("10");
        java.text.DateFormat dateFormat54 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator56 = dateFormat54.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone57 = dateFormat54.getTimeZone();
        java.text.DateFormat dateFormat58 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone57);
        stdDateFormat30.setTimeZone(timeZone57);
        java.text.DateFormat dateFormat60 = stdDateFormat30._formatPlain;
        java.text.DateFormat dateFormat62 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.util.Calendar calendar63 = dateFormat62.getCalendar();
        stdDateFormat30.setCalendar(calendar63);
        // The following exception was thrown during execution in test generation
        try {
            dateFormat26.setCalendar(calendar63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
// flaky "24) test3042(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertNull(calendar20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str41, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat43);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat45);
        org.junit.Assert.assertNotNull(dateFormat46);
        org.junit.Assert.assertNotNull(dateFormat48);
        org.junit.Assert.assertNotNull(calendar49);
// flaky "13) test3042(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar49.toString(), "sun.util.BuddhistCalendar[time=-734064440928,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=72,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(dateFormat54);
        org.junit.Assert.assertNotNull(attributedCharacterIterator56);
        org.junit.Assert.assertNotNull(timeZone57);
        org.junit.Assert.assertEquals(timeZone57.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat58);
        org.junit.Assert.assertNull(dateFormat60);
        org.junit.Assert.assertNotNull(dateFormat62);
        org.junit.Assert.assertNotNull(calendar63);
// flaky "5) test3042(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar63.toString(), "sun.util.BuddhistCalendar[time=-734064440928,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=72,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatPlain;
        java.util.TimeZone timeZone16 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat17 = null;
        stdDateFormat3._formatISO8601 = dateFormat17;
        java.text.DateFormat dateFormat19 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator23 = dateFormat21.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone24 = dateFormat21.getTimeZone();
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar26 = dateFormat25.getCalendar();
        dateFormat21.setCalendar(calendar26);
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone29 = dateFormat28.getTimeZone();
        java.util.TimeZone timeZone30 = dateFormat28.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone30);
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat35 = dateFormat34.getNumberFormat();
        dateFormat33.setNumberFormat(numberFormat35);
        dateFormat32.setNumberFormat(numberFormat35);
        stdDateFormat31.setNumberFormat(numberFormat35);
        boolean boolean40 = stdDateFormat31.looksLikeISO8601("");
        java.text.ParsePosition parsePosition42 = null;
        java.util.Date date43 = stdDateFormat31.parse("10", parsePosition42);
        java.lang.String str44 = dateFormat21.format(date43);
        java.lang.StringBuffer stringBuffer45 = null;
        java.text.FieldPosition fieldPosition46 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer47 = stdDateFormat3.format(date43, stringBuffer45, fieldPosition46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(attributedCharacterIterator23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(calendar26);
        org.junit.Assert.assertEquals(calendar26.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "07:00:00" + "'", str44, "07:00:00");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        boolean boolean13 = dateFormat11.equals((java.lang.Object) 1.0f);
        boolean boolean14 = dateFormat11.isLenient();
        java.util.TimeZone timeZone15 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.withTimeZone(timeZone15);
        java.util.Locale locale17 = stdDateFormat16._locale;
        boolean boolean19 = stdDateFormat16.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.util.Locale locale20 = stdDateFormat16._locale;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone22);
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone22);
        java.util.Calendar calendar25 = dateFormat24.getCalendar();
        stdDateFormat16._formatISO8601 = dateFormat24;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(calendar25);
// flaky "25) test3044(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar25.toString(), "sun.util.BuddhistCalendar[time=-734064441079,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=921,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.util.TimeZone timeZone5 = dateFormat3.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        dateFormat8.setNumberFormat(numberFormat10);
        dateFormat7.setNumberFormat(numberFormat10);
        stdDateFormat6.setNumberFormat(numberFormat10);
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("");
        java.util.Locale locale16 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance(0, locale16);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance((int) (short) 0, locale16);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance(1, locale16);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(15, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat3.withTimeZone(timeZone17);
        java.lang.String str19 = stdDateFormat18.toString();
        java.text.DateFormat dateFormat20 = stdDateFormat18._formatISO8601_z;
        java.util.Calendar calendar21 = stdDateFormat18.getCalendar();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str19, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNull(calendar21);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        boolean boolean16 = dateFormat15.isLenient();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat18);
        dateFormat13.setNumberFormat(numberFormat18);
        boolean boolean21 = stdDateFormat3.equals((java.lang.Object) numberFormat18);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone23);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = stdDateFormat3.withTimeZone(timeZone23);
        java.text.DateFormat dateFormat26 = stdDateFormat3._formatISO8601;
        java.text.ParsePosition parsePosition28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date29 = stdDateFormat3.parse("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(stdDateFormat25);
        org.junit.Assert.assertNull(dateFormat26);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat17 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat18 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat19 = stdDateFormat3._formatPlain;
        java.util.TimeZone timeZone20 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone20);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        boolean boolean24 = dateFormat22.isLenient();
        boolean boolean25 = dateFormat22.isLenient();
        java.text.NumberFormat numberFormat26 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat26);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(dateFormat18);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(numberFormat26);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        boolean boolean13 = dateFormat11.equals((java.lang.Object) 1.0f);
        boolean boolean14 = dateFormat11.isLenient();
        java.util.TimeZone timeZone15 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.withTimeZone(timeZone15);
        boolean boolean18 = stdDateFormat16.looksLikeISO8601("yyyy-MM-dd");
        java.text.DateFormat dateFormat19 = stdDateFormat16._formatRFC1123;
        java.text.NumberFormat numberFormat20 = stdDateFormat16.getNumberFormat();
        java.lang.String str21 = stdDateFormat16.toString();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar24 = dateFormat23.getCalendar();
        java.util.TimeZone timeZone25 = dateFormat23.getTimeZone();
        stdDateFormat16._timezone = timeZone25;
        java.util.TimeZone timeZone27 = null;
        stdDateFormat16._timezone = timeZone27;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str21, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(calendar24);
// flaky "26) test3051(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar24.toString(), "sun.util.BuddhistCalendar[time=-734064440824,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=176,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat3.withTimeZone(timeZone17);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar22 = dateFormat21.getCalendar();
        dateFormat19.setCalendar(calendar22);
        stdDateFormat3.setCalendar(calendar22);
        java.util.TimeZone timeZone25 = stdDateFormat3.getTimeZone();
        java.text.DateFormat dateFormat26 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone28 = dateFormat27.getTimeZone();
        java.util.TimeZone timeZone29 = dateFormat27.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone29);
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        dateFormat32.setNumberFormat(numberFormat34);
        dateFormat31.setNumberFormat(numberFormat34);
        stdDateFormat30.setNumberFormat(numberFormat34);
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateInstance();
        boolean boolean40 = dateFormat38.equals((java.lang.Object) 1.0f);
        boolean boolean41 = dateFormat38.isLenient();
        java.util.TimeZone timeZone42 = dateFormat38.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat43 = stdDateFormat30.withTimeZone(timeZone42);
        boolean boolean45 = stdDateFormat43.looksLikeISO8601("yyyy-MM-dd");
        java.lang.String str46 = stdDateFormat43.toString();
        java.text.DateFormat dateFormat47 = stdDateFormat43._formatRFC1123;
        java.text.DateFormat dateFormat48 = stdDateFormat43._formatISO8601;
        java.util.Date date50 = stdDateFormat43.parse("2513-01-01T07:00:00.010+0700");
        java.lang.StringBuffer stringBuffer51 = null;
        java.text.FieldPosition fieldPosition52 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer53 = stdDateFormat3.format(date50, stringBuffer51, fieldPosition52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(calendar22);
// flaky "27) test3052(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar22.toString(), "sun.util.BuddhistCalendar[time=-734064440807,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=193,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(dateFormat38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str46, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat47);
        org.junit.Assert.assertNull(dateFormat48);
        org.junit.Assert.assertNotNull(date50);
// flaky "14) test3052(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.util.Locale locale11 = stdDateFormat3._locale;
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = stdDateFormat3.parseAsISO8601("2513-01-01T00:00:00.000+0700", parsePosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        stdDateFormat4.setNumberFormat(numberFormat6);
        java.lang.String str8 = stdDateFormat4.toString();
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateInstance(0);
        boolean boolean11 = dateFormat10.isLenient();
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator16 = dateFormat13.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean17 = dateFormat10.equals((java.lang.Object) dateFormat13);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        java.util.Calendar calendar20 = dateFormat18.getCalendar();
        dateFormat13.setCalendar(calendar20);
        dateFormat13.setLenient(true);
        stdDateFormat4._formatISO8601_z = dateFormat13;
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar28 = dateFormat27.getCalendar();
        dateFormat25.setCalendar(calendar28);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar32 = dateFormat31.getCalendar();
        java.util.TimeZone timeZone33 = dateFormat31.getTimeZone();
        boolean boolean34 = dateFormat25.equals((java.lang.Object) timeZone33);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat4.withTimeZone(timeZone33);
        java.text.DateFormat dateFormat36 = stdDateFormat4._formatRFC1123;
        boolean boolean38 = stdDateFormat4.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.ParsePosition parsePosition40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date41 = stdDateFormat4.parseAsISO8601("EEE, dd MMM yyyy HH:mm:ss zzz", parsePosition40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "28) test3054(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064440772,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=228,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)" + "'", str8, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(attributedCharacterIterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(calendar20);
// flaky "15) test3054(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar20.toString(), "sun.util.BuddhistCalendar[time=-734064440772,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=228,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(calendar28);
// flaky "6) test3054(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar28.toString(), "sun.util.BuddhistCalendar[time=-734064440772,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=228,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(calendar32);
// flaky "4) test3054(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar32.toString(), "sun.util.BuddhistCalendar[time=-734064440772,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=228,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(stdDateFormat35);
        org.junit.Assert.assertNull(dateFormat36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat3.withTimeZone(timeZone17);
        java.text.DateFormat dateFormat19 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        dateFormat20.setLenient(false);
        boolean boolean23 = dateFormat20.isLenient();
        boolean boolean24 = dateFormat20.isLenient();
        java.util.Calendar calendar25 = dateFormat20.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            dateFormat19.setCalendar(calendar25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(calendar25);
// flaky "29) test3055(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar25.toString(), "sun.util.BuddhistCalendar[time=-734064440753,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=247,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatISO8601;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat17 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat18 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.util.Calendar calendar20 = dateFormat19.getCalendar();
        java.util.Calendar calendar21 = dateFormat19.getCalendar();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance(0);
        boolean boolean24 = dateFormat23.isLenient();
        boolean boolean25 = dateFormat19.equals((java.lang.Object) dateFormat23);
        stdDateFormat3._formatISO8601 = dateFormat23;
        java.text.NumberFormat numberFormat27 = dateFormat23.getNumberFormat();
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.util.Calendar calendar30 = dateFormat29.getCalendar();
        java.util.Calendar calendar31 = dateFormat29.getCalendar();
        java.util.Calendar calendar32 = dateFormat29.getCalendar();
        dateFormat23.setCalendar(calendar32);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(calendar20);
// flaky "30) test3057(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar20.toString(), "sun.util.BuddhistCalendar[time=-734064441079,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=921,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar21);
// flaky "16) test3057(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar21.toString(), "sun.util.BuddhistCalendar[time=-734064441079,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=921,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(numberFormat27);
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(calendar30);
// flaky "7) test3057(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar30.toString(), "sun.util.BuddhistCalendar[time=-734064440718,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=282,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar31);
// flaky "5) test3057(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar31.toString(), "sun.util.BuddhistCalendar[time=-734064440718,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=282,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar32);
// flaky "2) test3057(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar32.toString(), "sun.util.BuddhistCalendar[time=-734064440718,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=282,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone7 = dateFormat6.getTimeZone();
        java.util.Calendar calendar8 = dateFormat6.getCalendar();
        java.text.NumberFormat numberFormat9 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat9);
        stdDateFormat4.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat12 = stdDateFormat4._formatPlain;
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar14 = dateFormat13.getCalendar();
        java.util.TimeZone timeZone15 = dateFormat13.getTimeZone();
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15);
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15);
        stdDateFormat4.setTimeZone(timeZone15);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar8);
// flaky "31) test3058(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar8.toString(), "sun.util.BuddhistCalendar[time=-734064440707,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=293,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(calendar14);
// flaky "17) test3058(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar14.toString(), "sun.util.BuddhistCalendar[time=-734064440707,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=293,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone18 = dateFormat17.getTimeZone();
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = stdDateFormat3.withTimeZone(timeZone18);
        java.util.Calendar calendar22 = stdDateFormat3.getCalendar();
        java.text.DateFormat dateFormat23 = stdDateFormat3._formatRFC1123;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(stdDateFormat21);
        org.junit.Assert.assertNull(calendar22);
        org.junit.Assert.assertNull(dateFormat23);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.Locale locale13 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        boolean boolean16 = dateFormat15.isLenient();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat18);
        java.util.TimeZone timeZone20 = dateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = stdDateFormat3.withTimeZone(timeZone20);
        java.text.DateFormat dateFormat22 = null;
        stdDateFormat21._formatRFC1123 = dateFormat22;
        java.text.ParsePosition parsePosition25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date26 = stdDateFormat21.parse("yyyy-MM-dd", parsePosition25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat21);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(13, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.text.ParsePosition parsePosition14 = null;
        java.util.Date date15 = stdDateFormat3.parse("10", parsePosition14);
        boolean boolean17 = stdDateFormat3.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)");
        java.util.Locale locale18 = stdDateFormat3._locale;
        java.lang.Class<?> wildcardClass19 = locale18.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        boolean boolean13 = dateFormat11.equals((java.lang.Object) 1.0f);
        boolean boolean14 = dateFormat11.isLenient();
        java.util.TimeZone timeZone15 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.withTimeZone(timeZone15);
        boolean boolean18 = stdDateFormat16.looksLikeISO8601("yyyy-MM-dd");
        java.lang.String str19 = stdDateFormat16.toString();
        java.lang.String str20 = stdDateFormat16.toString();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str19, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str20, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        stdDateFormat3._timezone = timeZone17;
        java.text.DateFormat dateFormat19 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance(0);
        boolean boolean23 = dateFormat22.isLenient();
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator28 = dateFormat25.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean29 = dateFormat22.equals((java.lang.Object) dateFormat25);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar31 = dateFormat30.getCalendar();
        dateFormat25.setCalendar(calendar31);
        stdDateFormat3.setCalendar(calendar31);
        java.lang.String str34 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat35 = stdDateFormat3._formatISO8601_z;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(attributedCharacterIterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(calendar31);
// flaky "32) test3064(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar31.toString(), "sun.util.BuddhistCalendar[time=-734064440658,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=342,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str34, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat35);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar17 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone18 = dateFormat16.getTimeZone();
        boolean boolean19 = dateFormat16.isLenient();
        stdDateFormat3._formatPlain = dateFormat16;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance();
        java.lang.String str23 = dateFormat21.format((java.lang.Object) 1L);
        dateFormat21.setLenient(true);
        stdDateFormat3._formatRFC1123 = dateFormat21;
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar30 = dateFormat29.getCalendar();
        dateFormat27.setCalendar(calendar30);
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar34 = dateFormat33.getCalendar();
        java.util.TimeZone timeZone35 = dateFormat33.getTimeZone();
        boolean boolean36 = dateFormat27.equals((java.lang.Object) timeZone35);
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateInstance(0);
        boolean boolean39 = dateFormat38.isLenient();
        java.text.NumberFormat numberFormat40 = dateFormat38.getNumberFormat();
        dateFormat27.setNumberFormat(numberFormat40);
        stdDateFormat3._formatISO8601_z = dateFormat27;
        java.util.TimeZone timeZone43 = dateFormat27.getTimeZone();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "33) test3065(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar17.toString(), "sun.util.BuddhistCalendar[time=-734064440640,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=360,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateFormat21);
// flaky "18) test3065(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u0e21\u0e04. 2513" + "'", str23, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(calendar30);
// flaky "8) test3065(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar30.toString(), "sun.util.BuddhistCalendar[time=-734064440640,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=360,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(calendar34);
// flaky "6) test3065(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar34.toString(), "sun.util.BuddhistCalendar[time=-734064440640,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=360,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateFormat38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(numberFormat40);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat3.withTimeZone(timeZone17);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar22 = dateFormat21.getCalendar();
        dateFormat19.setCalendar(calendar22);
        stdDateFormat3.setCalendar(calendar22);
        java.util.TimeZone timeZone25 = stdDateFormat3.getTimeZone();
        java.text.DateFormat dateFormat26 = stdDateFormat3._formatPlain;
        java.util.TimeZone timeZone27 = stdDateFormat3._timezone;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(calendar22);
// flaky "34) test3066(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar22.toString(), "sun.util.BuddhistCalendar[time=-734064440628,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=372,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(7, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.text.ParsePosition parsePosition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = stdDateFormat3.parseObject("Thu, 01 Jan 2513 07:00:00 ICT", parsePosition12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        java.text.AttributedCharacterIterator attributedCharacterIterator5 = dateFormat0.formatToCharacterIterator((java.lang.Object) 0L);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone7 = dateFormat6.getTimeZone();
        java.util.Calendar calendar8 = dateFormat6.getCalendar();
        java.text.NumberFormat numberFormat9 = dateFormat6.getNumberFormat();
        dateFormat6.setLenient(true);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.util.TimeZone timeZone14 = dateFormat12.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone14);
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        dateFormat16.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        dateFormat6.setNumberFormat(numberFormat19);
        boolean boolean24 = dateFormat0.equals((java.lang.Object) numberFormat19);
        java.util.Calendar calendar25 = dateFormat0.getCalendar();
        java.text.ParsePosition parsePosition27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = dateFormat0.parseObject("Thu, 01 Jan 2513 07:00:00 ICT", parsePosition27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(attributedCharacterIterator2);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(attributedCharacterIterator5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar8);
// flaky "35) test3069(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar8.toString(), "sun.util.BuddhistCalendar[time=-734064440579,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=421,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(calendar25);
        org.junit.Assert.assertEquals(calendar25.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.Locale locale13 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        boolean boolean16 = dateFormat15.isLenient();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat18);
        java.util.TimeZone timeZone20 = dateFormat15.getTimeZone();
        stdDateFormat3.setTimeZone(timeZone20);
        java.text.ParsePosition parsePosition23 = null;
        java.util.Date date24 = stdDateFormat3.parse("10", parsePosition23);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone26 = dateFormat25.getTimeZone();
        java.util.TimeZone timeZone27 = dateFormat25.getTimeZone();
        stdDateFormat3._formatRFC1123 = dateFormat25;
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance(0);
        boolean boolean31 = dateFormat30.isLenient();
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator36 = dateFormat33.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean37 = dateFormat30.equals((java.lang.Object) dateFormat33);
        java.util.TimeZone timeZone38 = dateFormat33.getTimeZone();
        java.util.TimeZone timeZone39 = dateFormat33.getTimeZone();
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateInstance();
        java.lang.String str42 = dateFormat40.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone43 = dateFormat40.getTimeZone();
        boolean boolean44 = dateFormat40.isLenient();
        java.text.NumberFormat numberFormat45 = dateFormat40.getNumberFormat();
        dateFormat33.setNumberFormat(numberFormat45);
        java.util.Calendar calendar47 = dateFormat33.getCalendar();
        stdDateFormat3._formatISO8601_z = dateFormat33;
        java.text.DateFormat dateFormat49 = stdDateFormat3._formatRFC1123;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(dateFormat35);
        org.junit.Assert.assertNotNull(attributedCharacterIterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat40);
// flaky "36) test3070(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u0e21\u0e04. 2513" + "'", str42, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(numberFormat45);
        org.junit.Assert.assertNotNull(calendar47);
        org.junit.Assert.assertEquals(calendar47.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat49);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.Locale locale13 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        boolean boolean16 = dateFormat15.isLenient();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat18);
        java.util.TimeZone timeZone20 = dateFormat15.getTimeZone();
        stdDateFormat3.setTimeZone(timeZone20);
        boolean boolean23 = stdDateFormat3.looksLikeISO8601("");
        java.text.DateFormat dateFormat24 = stdDateFormat3._formatRFC1123;
        // The following exception was thrown during execution in test generation
        try {
            dateFormat24.setLenient(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(dateFormat24);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        boolean boolean13 = dateFormat11.equals((java.lang.Object) 1.0f);
        boolean boolean14 = dateFormat11.isLenient();
        java.util.TimeZone timeZone15 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.withTimeZone(timeZone15);
        boolean boolean18 = stdDateFormat16.looksLikeISO8601("yyyy-MM-dd");
        java.lang.String str19 = stdDateFormat16.toString();
        java.text.DateFormat dateFormat20 = stdDateFormat16._formatRFC1123;
        java.lang.String str21 = stdDateFormat16.toString();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str19, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str21, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat14 = null;
        stdDateFormat3._formatPlain = dateFormat14;
        java.text.NumberFormat numberFormat16 = stdDateFormat3.getNumberFormat();
        boolean boolean18 = stdDateFormat3.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.util.Calendar calendar19 = stdDateFormat3.getCalendar();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(calendar19);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.Locale locale13 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        boolean boolean16 = dateFormat15.isLenient();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat18);
        java.util.TimeZone timeZone20 = dateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = stdDateFormat3.withTimeZone(timeZone20);
        java.text.DateFormat dateFormat22 = stdDateFormat3._formatISO8601;
        java.util.TimeZone timeZone23 = stdDateFormat3._timezone;
        java.util.Calendar calendar24 = stdDateFormat3.getCalendar();
        boolean boolean26 = stdDateFormat3.looksLikeISO8601("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat21);
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(calendar24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat3);
        dateFormat0.setNumberFormat(numberFormat3);
        dateFormat0.setLenient(false);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(numberFormat3);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(0);
        boolean boolean17 = dateFormat16.isLenient();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator22 = dateFormat19.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean23 = dateFormat16.equals((java.lang.Object) dateFormat19);
        java.util.TimeZone timeZone24 = dateFormat19.getTimeZone();
        java.util.TimeZone timeZone25 = dateFormat19.getTimeZone();
        java.text.NumberFormat numberFormat26 = dateFormat19.getNumberFormat();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone28 = dateFormat27.getTimeZone();
        java.util.TimeZone timeZone29 = dateFormat27.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone29);
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        dateFormat32.setNumberFormat(numberFormat34);
        dateFormat31.setNumberFormat(numberFormat34);
        stdDateFormat30.setNumberFormat(numberFormat34);
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateInstance();
        boolean boolean40 = dateFormat38.equals((java.lang.Object) 1.0f);
        boolean boolean41 = dateFormat38.isLenient();
        java.util.TimeZone timeZone42 = dateFormat38.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat43 = stdDateFormat30.withTimeZone(timeZone42);
        java.util.Calendar calendar44 = null;
        stdDateFormat30.setCalendar(calendar44);
        java.text.DateFormat dateFormat46 = stdDateFormat30._formatPlain;
        java.util.Date date48 = stdDateFormat30.parse("10");
        java.lang.String str49 = dateFormat19.format(date48);
        java.lang.StringBuffer stringBuffer50 = null;
        java.text.FieldPosition fieldPosition51 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer52 = stdDateFormat3.format(date48, stringBuffer50, fieldPosition51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(attributedCharacterIterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(dateFormat38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat43);
        org.junit.Assert.assertNull(dateFormat46);
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 07:00:00 ICT 1970");
// flaky "37) test3077(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513" + "'", str49, "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat3.withTimeZone(timeZone17);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar22 = dateFormat21.getCalendar();
        dateFormat19.setCalendar(calendar22);
        stdDateFormat3.setCalendar(calendar22);
        boolean boolean26 = stdDateFormat3.looksLikeISO8601("10");
        stdDateFormat3.setLenient(false);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone30 = dateFormat29.getTimeZone();
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone30);
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone30);
        java.util.Calendar calendar33 = dateFormat32.getCalendar();
        stdDateFormat3._formatISO8601_z = dateFormat32;
        java.util.Calendar calendar35 = stdDateFormat3.getCalendar();
        java.text.DateFormat dateFormat36 = stdDateFormat3._formatPlain;
        java.util.TimeZone timeZone37 = stdDateFormat3.getTimeZone();
        java.text.ParsePosition parsePosition39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date40 = stdDateFormat3.parseAsRFC1123("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", parsePosition39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(calendar22);
// flaky "38) test3078(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar22.toString(), "sun.util.BuddhistCalendar[time=-734064440482,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=518,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(calendar33);
// flaky "19) test3078(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar33.toString(), "sun.util.BuddhistCalendar[time=-734064441079,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=921,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar35);
// flaky "9) test3078(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar35.toString(), "sun.util.BuddhistCalendar[time=-734064440482,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=518,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(dateFormat36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat3.withTimeZone(timeZone17);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance(0);
        boolean boolean21 = dateFormat20.isLenient();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator26 = dateFormat23.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean27 = dateFormat20.equals((java.lang.Object) dateFormat23);
        java.text.NumberFormat numberFormat28 = dateFormat23.getNumberFormat();
        stdDateFormat3._formatISO8601_z = dateFormat23;
        java.text.DateFormat dateFormat30 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat31 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateTimeInstance(0, 0);
        java.util.Calendar calendar35 = dateFormat34.getCalendar();
        dateFormat31.setCalendar(calendar35);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(attributedCharacterIterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(calendar35);
// flaky "39) test3079(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar35.toString(), "sun.util.BuddhistCalendar[time=-734064440473,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=527,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.Locale locale13 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        boolean boolean16 = dateFormat15.isLenient();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat18);
        java.util.TimeZone timeZone20 = dateFormat15.getTimeZone();
        stdDateFormat3.setTimeZone(timeZone20);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance(3);
        java.util.Calendar calendar24 = dateFormat23.getCalendar();
        java.util.TimeZone timeZone25 = dateFormat23.getTimeZone();
        stdDateFormat3._timezone = timeZone25;
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.lang.Object obj30 = null; // flaky "40) test3080(com.fasterxml.jackson.databind.util.RegressionTest6)": dateFormat28.parseObject("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513");
        java.util.Calendar calendar31 = dateFormat28.getCalendar();
        stdDateFormat3.setCalendar(calendar31);
        java.util.Date date34 = stdDateFormat3.parse("10");
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(calendar24);
// flaky "20) test3080(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar24.toString(), "sun.util.BuddhistCalendar[time=-734064440463,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=537,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat28);
// flaky "10) test3080(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertNotNull(obj30);
// flaky "7) test3080(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(obj30.toString(), "Thu Jan 01 00:00:00 ICT 1970");
// flaky "3) test3080(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "Thu Jan 01 00:00:00 ICT 1970");
// flaky "2) test3080(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(calendar31);
// flaky "2) test3080(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar31.toString(), "sun.util.BuddhistCalendar[time=-25200000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1,DAY_OF_YEAR=?,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        boolean boolean13 = dateFormat11.equals((java.lang.Object) 1.0f);
        boolean boolean14 = dateFormat11.isLenient();
        java.util.TimeZone timeZone15 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.withTimeZone(timeZone15);
        java.text.NumberFormat numberFormat17 = stdDateFormat3.getNumberFormat();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar17 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone18 = dateFormat16.getTimeZone();
        boolean boolean19 = dateFormat16.isLenient();
        stdDateFormat3._formatPlain = dateFormat16;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance();
        java.lang.String str23 = dateFormat21.format((java.lang.Object) 1L);
        dateFormat21.setLenient(true);
        stdDateFormat3._formatRFC1123 = dateFormat21;
        java.util.TimeZone timeZone27 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance(1);
        stdDateFormat3._formatISO8601_z = dateFormat29;
        java.util.Locale locale31 = stdDateFormat3._locale;
        java.util.TimeZone timeZone32 = null;
        stdDateFormat3._timezone = timeZone32;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "41) test3082(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar17.toString(), "sun.util.BuddhistCalendar[time=-734064440446,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=554,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateFormat21);
// flaky "21) test3082(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u0e21\u0e04. 2513" + "'", str23, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat3.withTimeZone(timeZone17);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar22 = dateFormat21.getCalendar();
        dateFormat19.setCalendar(calendar22);
        stdDateFormat3.setCalendar(calendar22);
        java.util.TimeZone timeZone25 = stdDateFormat3.getTimeZone();
        java.text.DateFormat dateFormat26 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator31 = dateFormat28.formatToCharacterIterator((java.lang.Object) 0);
        stdDateFormat3._formatRFC1123 = dateFormat28;
        stdDateFormat3.setLenient(true);
        java.text.DateFormat dateFormat35 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone37 = dateFormat36.getTimeZone();
        java.util.TimeZone timeZone38 = dateFormat36.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone38);
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat43 = dateFormat42.getNumberFormat();
        dateFormat41.setNumberFormat(numberFormat43);
        dateFormat40.setNumberFormat(numberFormat43);
        stdDateFormat39.setNumberFormat(numberFormat43);
        boolean boolean48 = stdDateFormat39.looksLikeISO8601("");
        java.util.TimeZone timeZone49 = stdDateFormat39._timezone;
        java.lang.String str50 = stdDateFormat39.toString();
        java.text.DateFormat dateFormat52 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone53 = dateFormat52.getTimeZone();
        stdDateFormat39._timezone = timeZone53;
        java.text.DateFormat dateFormat55 = stdDateFormat39._formatRFC1123;
        java.text.DateFormat dateFormat56 = stdDateFormat39._formatRFC1123;
        java.text.DateFormat dateFormat58 = java.text.DateFormat.getDateInstance(0);
        boolean boolean59 = dateFormat58.isLenient();
        java.text.DateFormat dateFormat61 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat63 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator64 = dateFormat61.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean65 = dateFormat58.equals((java.lang.Object) dateFormat61);
        java.text.DateFormat dateFormat66 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar67 = dateFormat66.getCalendar();
        dateFormat61.setCalendar(calendar67);
        stdDateFormat39.setCalendar(calendar67);
        java.text.DateFormat dateFormat70 = stdDateFormat39._formatISO8601;
        java.util.TimeZone timeZone71 = stdDateFormat39.getTimeZone();
        stdDateFormat3.setTimeZone(timeZone71);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(calendar22);
// flaky "42) test3083(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar22.toString(), "sun.util.BuddhistCalendar[time=-734064440437,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=563,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(attributedCharacterIterator31);
        org.junit.Assert.assertNull(dateFormat35);
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat40);
        org.junit.Assert.assertNotNull(dateFormat41);
        org.junit.Assert.assertNotNull(dateFormat42);
        org.junit.Assert.assertNotNull(numberFormat43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str50, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat52);
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat55);
        org.junit.Assert.assertNull(dateFormat56);
        org.junit.Assert.assertNotNull(dateFormat58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(dateFormat61);
        org.junit.Assert.assertNotNull(dateFormat63);
        org.junit.Assert.assertNotNull(attributedCharacterIterator64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(dateFormat66);
        org.junit.Assert.assertNotNull(calendar67);
// flaky "22) test3083(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar67.toString(), "sun.util.BuddhistCalendar[time=-734064440437,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=563,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(dateFormat70);
        org.junit.Assert.assertNotNull(timeZone71);
        org.junit.Assert.assertEquals(timeZone71.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateTimeInstance((int) (byte) 1, 0);
        java.util.TimeZone timeZone5 = dateFormat4.getTimeZone();
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone11 = dateFormat10.getTimeZone();
        java.util.TimeZone timeZone12 = dateFormat10.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat17);
        dateFormat14.setNumberFormat(numberFormat17);
        stdDateFormat13.setNumberFormat(numberFormat17);
        boolean boolean22 = stdDateFormat13.looksLikeISO8601("");
        java.util.Locale locale23 = stdDateFormat13._locale;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance((int) (short) 1, locale23);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale23);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale23);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance(2, locale23);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5, locale23);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateTimeInstance(3, 12, locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(dateFormat28);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        boolean boolean13 = dateFormat11.equals((java.lang.Object) 1.0f);
        boolean boolean14 = dateFormat11.isLenient();
        java.util.TimeZone timeZone15 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.withTimeZone(timeZone15);
        java.util.Locale locale17 = stdDateFormat16._locale;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone20 = dateFormat19.getTimeZone();
        java.util.Calendar calendar21 = dateFormat19.getCalendar();
        java.text.NumberFormat numberFormat22 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat22);
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.util.Calendar calendar25 = dateFormat24.getCalendar();
        dateFormat18.setCalendar(calendar25);
        java.text.NumberFormat numberFormat27 = dateFormat18.getNumberFormat();
        stdDateFormat16.setNumberFormat(numberFormat27);
        boolean boolean30 = stdDateFormat16.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.ParsePosition parsePosition32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date33 = stdDateFormat16.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", parsePosition32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar21);
// flaky "43) test3085(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar21.toString(), "sun.util.BuddhistCalendar[time=-734064440412,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=588,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertNotNull(dateFormat24);
// flaky "23) test3085(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertNull(calendar25);
        org.junit.Assert.assertNotNull(numberFormat27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601;
        java.util.TimeZone timeZone15 = stdDateFormat3._timezone;
        java.util.Calendar calendar16 = stdDateFormat3.getCalendar();
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.util.Calendar calendar18 = dateFormat17.getCalendar();
        java.util.Calendar calendar19 = dateFormat17.getCalendar();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance(0);
        boolean boolean22 = dateFormat21.isLenient();
        boolean boolean23 = dateFormat17.equals((java.lang.Object) dateFormat21);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        dateFormat24.setLenient(false);
        dateFormat24.setLenient(false);
        boolean boolean29 = dateFormat24.isLenient();
        dateFormat24.setLenient(true);
        dateFormat24.setLenient(false);
        java.util.Calendar calendar34 = dateFormat24.getCalendar();
        dateFormat17.setCalendar(calendar34);
        stdDateFormat3._formatISO8601_z = dateFormat17;
        java.text.DateFormat dateFormat37 = stdDateFormat3._formatISO8601;
        java.text.ParsePosition parsePosition39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date40 = stdDateFormat3.parseAsRFC1123("2513-01-01T07:00:00.000+0700", parsePosition39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(calendar16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(calendar18);
// flaky "44) test3086(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar18.toString(), "sun.util.BuddhistCalendar[time=-734064441079,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=921,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar19);
// flaky "24) test3086(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar19.toString(), "sun.util.BuddhistCalendar[time=-734064441079,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=38,MILLISECOND=921,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(calendar34);
// flaky "11) test3086(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar34.toString(), "sun.util.BuddhistCalendar[time=-734064440403,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=597,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(dateFormat37);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat3.withTimeZone(timeZone17);
        java.text.NumberFormat numberFormat19 = stdDateFormat18.getNumberFormat();
        java.util.Locale locale20 = stdDateFormat18._locale;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        stdDateFormat3._timezone = timeZone17;
        java.text.DateFormat dateFormat19 = stdDateFormat3._formatRFC1123;
        boolean boolean21 = stdDateFormat3.looksLikeISO8601("07:00:00");
        java.text.DateFormat dateFormat22 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateTimeInstance((int) (byte) 1, (int) (short) 1);
        stdDateFormat3._formatRFC1123 = dateFormat25;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertNotNull(dateFormat25);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        boolean boolean13 = dateFormat11.equals((java.lang.Object) 1.0f);
        boolean boolean14 = dateFormat11.isLenient();
        java.util.TimeZone timeZone15 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.withTimeZone(timeZone15);
        java.text.ParsePosition parsePosition18 = null;
        java.lang.Object obj19 = stdDateFormat16.parseObject("10", parsePosition18);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance();
        java.lang.String str22 = dateFormat20.format((java.lang.Object) 1L);
        dateFormat20.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = stdDateFormat16.format((java.lang.Object) dateFormat20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat20);
// flaky "45) test3089(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u0e21\u0e04. 2513" + "'", str22, "\u0e21\u0e04. 2513");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat14 = null;
        stdDateFormat3._formatPlain = dateFormat14;
        java.text.NumberFormat numberFormat16 = stdDateFormat3.getNumberFormat();
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.util.Calendar calendar18 = dateFormat17.getCalendar();
        stdDateFormat3.setCalendar(calendar18);
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.util.Calendar calendar23 = dateFormat22.getCalendar();
        java.util.TimeZone timeZone24 = dateFormat22.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = stdDateFormat3.withTimeZone(timeZone24);
        java.util.TimeZone timeZone26 = stdDateFormat3.getTimeZone();
        java.util.Locale locale27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26, locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(calendar18);
// flaky "46) test3090(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar18.toString(), "sun.util.BuddhistCalendar[time=-734064440403,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=597,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(calendar23);
// flaky "25) test3090(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar23.toString(), "sun.util.BuddhistCalendar[time=-734064440370,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=630,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        boolean boolean13 = dateFormat11.equals((java.lang.Object) 1.0f);
        boolean boolean14 = dateFormat11.isLenient();
        java.util.TimeZone timeZone15 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.withTimeZone(timeZone15);
        boolean boolean18 = stdDateFormat16.looksLikeISO8601("yyyy-MM-dd");
        java.text.DateFormat dateFormat19 = stdDateFormat16._formatRFC1123;
        java.text.NumberFormat numberFormat20 = stdDateFormat16.getNumberFormat();
        java.text.DateFormat dateFormat21 = stdDateFormat16._formatISO8601;
        java.text.DateFormat dateFormat22 = stdDateFormat16._formatPlain;
        boolean boolean24 = stdDateFormat16.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.DateFormat dateFormat25 = stdDateFormat16._formatRFC1123;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(dateFormat25);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        java.util.TimeZone timeZone4 = dateFormat2.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        dateFormat7.setNumberFormat(numberFormat9);
        dateFormat6.setNumberFormat(numberFormat9);
        stdDateFormat5.setNumberFormat(numberFormat9);
        boolean boolean14 = stdDateFormat5.looksLikeISO8601("");
        java.util.TimeZone timeZone15 = stdDateFormat5._timezone;
        java.lang.String str16 = stdDateFormat5.toString();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone19 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = stdDateFormat5.withTimeZone(timeZone19);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar24 = dateFormat23.getCalendar();
        dateFormat21.setCalendar(calendar24);
        stdDateFormat5.setCalendar(calendar24);
        boolean boolean28 = stdDateFormat5.looksLikeISO8601("10");
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator31 = dateFormat29.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone32 = dateFormat29.getTimeZone();
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone32);
        stdDateFormat5.setTimeZone(timeZone32);
        java.util.Locale locale35 = stdDateFormat5._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateTimeInstance((int) (byte) 0, 16, locale35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str16, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(calendar24);
// flaky "47) test3092(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar24.toString(), "sun.util.BuddhistCalendar[time=-734064440344,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=656,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(attributedCharacterIterator31);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Calendar calendar3 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone4 = dateFormat1.getTimeZone();
        java.lang.Class<?> wildcardClass5 = dateFormat1.getClass();
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar3);
// flaky "48) test3093(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar3.toString(), "sun.util.BuddhistCalendar[time=-734064440334,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=666,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        stdDateFormat4.setNumberFormat(numberFormat6);
        java.lang.String str8 = stdDateFormat4.toString();
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateInstance(0);
        boolean boolean11 = dateFormat10.isLenient();
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator16 = dateFormat13.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean17 = dateFormat10.equals((java.lang.Object) dateFormat13);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        java.util.Calendar calendar20 = dateFormat18.getCalendar();
        dateFormat13.setCalendar(calendar20);
        dateFormat13.setLenient(true);
        stdDateFormat4._formatISO8601_z = dateFormat13;
        java.util.Locale locale25 = stdDateFormat4._locale;
        java.util.Calendar calendar26 = stdDateFormat4.getCalendar();
        java.text.DateFormat dateFormat27 = stdDateFormat4._formatISO8601_z;
        java.text.DateFormat dateFormat28 = stdDateFormat4._formatPlain;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "49) test3094(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064440319,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=681,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)" + "'", str8, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(attributedCharacterIterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(calendar20);
// flaky "26) test3094(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar20.toString(), "sun.util.BuddhistCalendar[time=-734064440319,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=681,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(locale25);
        org.junit.Assert.assertNull(calendar26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNull(dateFormat28);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        stdDateFormat4.setNumberFormat(numberFormat6);
        java.text.DateFormat dateFormat8 = stdDateFormat4._formatISO8601_z;
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateInstance();
        java.lang.String str11 = dateFormat9.format((java.lang.Object) 1L);
        dateFormat9.setLenient(true);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        boolean boolean16 = dateFormat15.isLenient();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator21 = dateFormat18.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean22 = dateFormat15.equals((java.lang.Object) dateFormat18);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        java.util.Calendar calendar25 = dateFormat23.getCalendar();
        dateFormat18.setCalendar(calendar25);
        dateFormat18.setLenient(true);
        boolean boolean29 = dateFormat9.equals((java.lang.Object) dateFormat18);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar32 = dateFormat31.getCalendar();
        java.util.TimeZone timeZone33 = dateFormat31.getTimeZone();
        boolean boolean34 = dateFormat31.isLenient();
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateInstance();
        boolean boolean37 = dateFormat35.equals((java.lang.Object) 1.0f);
        java.text.NumberFormat numberFormat38 = dateFormat35.getNumberFormat();
        dateFormat31.setNumberFormat(numberFormat38);
        dateFormat9.setNumberFormat(numberFormat38);
        stdDateFormat4._formatPlain = dateFormat9;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "50) test3095(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064440311,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=689,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
// flaky "27) test3095(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u0e21\u0e04. 2513" + "'", str11, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(attributedCharacterIterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(numberFormat24);
        org.junit.Assert.assertNotNull(calendar25);
// flaky "12) test3095(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar25.toString(), "sun.util.BuddhistCalendar[time=-734064440311,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=689,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(calendar32);
// flaky "8) test3095(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar32.toString(), "sun.util.BuddhistCalendar[time=-734064440311,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=689,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateFormat35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(numberFormat38);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 0, (int) (short) 0);
        java.util.Calendar calendar3 = dateFormat2.getCalendar();
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(calendar3);
// flaky "51) test3096(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar3.toString(), "sun.util.BuddhistCalendar[time=-734064440301,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=699,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (short) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        boolean boolean7 = dateFormat6.isLenient();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator12 = dateFormat9.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean13 = dateFormat6.equals((java.lang.Object) dateFormat9);
        java.util.TimeZone timeZone14 = dateFormat9.getTimeZone();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone16 = dateFormat15.getTimeZone();
        java.util.TimeZone timeZone17 = dateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone17);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        dateFormat20.setNumberFormat(numberFormat22);
        dateFormat19.setNumberFormat(numberFormat22);
        stdDateFormat18.setNumberFormat(numberFormat22);
        boolean boolean27 = stdDateFormat18.looksLikeISO8601("");
        java.lang.String str28 = stdDateFormat18.toString();
        java.text.DateFormat dateFormat29 = stdDateFormat18._formatISO8601_z;
        java.text.DateFormat dateFormat30 = stdDateFormat18._formatISO8601;
        java.text.DateFormat dateFormat31 = stdDateFormat18._formatISO8601_z;
        java.text.DateFormat dateFormat32 = stdDateFormat18._formatISO8601_z;
        java.util.Locale locale33 = stdDateFormat18._locale;
        boolean boolean35 = stdDateFormat18.looksLikeISO8601("yyyy-MM-dd");
        java.text.DateFormat dateFormat36 = stdDateFormat18._formatRFC1123;
        java.util.Locale locale37 = stdDateFormat18._locale;
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14, locale37);
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2, locale37);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(attributedCharacterIterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str28, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat29);
        org.junit.Assert.assertNull(dateFormat30);
        org.junit.Assert.assertNull(dateFormat31);
        org.junit.Assert.assertNull(dateFormat32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(dateFormat36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat38);
        org.junit.Assert.assertNotNull(dateFormat39);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat4);
        java.util.TimeZone timeZone6 = dateFormat1.getTimeZone();
        java.util.TimeZone timeZone7 = dateFormat1.getTimeZone();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance();
        java.lang.String str10 = dateFormat8.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone11 = dateFormat8.getTimeZone();
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone11);
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone14 = dateFormat13.getTimeZone();
        java.util.TimeZone timeZone15 = dateFormat13.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15);
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        dateFormat17.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean25 = stdDateFormat16.looksLikeISO8601("");
        java.util.Locale locale26 = stdDateFormat16._locale;
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone11, locale26);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone7, locale26);
        java.util.Calendar calendar29 = dateFormat28.getCalendar();
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
// flaky "52) test3098(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u0e21\u0e04. 2513" + "'", str10, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(calendar29);
// flaky "28) test3098(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar29.toString(), "sun.util.BuddhistCalendar[time=-734064440403,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=597,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        java.util.TimeZone timeZone4 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone8 = dateFormat7.getTimeZone();
        java.util.Calendar calendar9 = dateFormat7.getCalendar();
        java.text.NumberFormat numberFormat10 = dateFormat7.getNumberFormat();
        dateFormat6.setNumberFormat(numberFormat10);
        stdDateFormat5.setNumberFormat(numberFormat10);
        java.text.DateFormat dateFormat13 = stdDateFormat5._formatPlain;
        java.text.DateFormat dateFormat14 = stdDateFormat5._formatRFC1123;
        java.util.Locale locale15 = stdDateFormat5._locale;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance((int) (short) 0, locale15);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar9);
// flaky "53) test3099(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar9.toString(), "sun.util.BuddhistCalendar[time=-734064440273,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=727,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat16);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat8 = dateFormat7.getNumberFormat();
        dateFormat6.setNumberFormat(numberFormat8);
        dateFormat5.setNumberFormat(numberFormat8);
        stdDateFormat4.setNumberFormat(numberFormat8);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateInstance();
        boolean boolean14 = dateFormat12.equals((java.lang.Object) 1.0f);
        boolean boolean15 = dateFormat12.isLenient();
        java.util.TimeZone timeZone16 = dateFormat12.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = stdDateFormat4.withTimeZone(timeZone16);
        java.util.Calendar calendar18 = null;
        stdDateFormat4.setCalendar(calendar18);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator22 = dateFormat20.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone23 = dateFormat20.getTimeZone();
        dateFormat20.setLenient(true);
        java.util.Calendar calendar26 = dateFormat20.getCalendar();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        java.util.Calendar calendar29 = dateFormat27.getCalendar();
        dateFormat20.setCalendar(calendar29);
        stdDateFormat4.setCalendar(calendar29);
        java.text.DateFormat dateFormat32 = stdDateFormat4._formatISO8601_z;
        java.util.Locale locale33 = stdDateFormat4._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateInstance(6, locale33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat17);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(attributedCharacterIterator22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar26);
        org.junit.Assert.assertEquals(calendar26.toString(), "sun.util.BuddhistCalendar[time=2,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=2,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertNotNull(calendar29);
// flaky "54) test3100(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar29.toString(), "sun.util.BuddhistCalendar[time=-734064440256,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=744,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(dateFormat32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone6 = dateFormat5.getTimeZone();
        java.util.TimeZone timeZone7 = dateFormat5.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone7);
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat12 = dateFormat11.getNumberFormat();
        dateFormat10.setNumberFormat(numberFormat12);
        dateFormat9.setNumberFormat(numberFormat12);
        stdDateFormat8.setNumberFormat(numberFormat12);
        boolean boolean17 = stdDateFormat8.looksLikeISO8601("");
        java.util.Locale locale18 = stdDateFormat8._locale;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateInstance((int) (short) 1, locale18);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance(0, locale18);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance(1, locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateTimeInstance((int) ' ', 6, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        stdDateFormat4.setNumberFormat(numberFormat6);
        java.text.DateFormat dateFormat8 = stdDateFormat4._formatISO8601_z;
        boolean boolean10 = stdDateFormat4.looksLikeISO8601("10");
        java.text.DateFormat dateFormat11 = stdDateFormat4._formatPlain;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "55) test3102(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064440240,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=760,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dateFormat11);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat3.withTimeZone(timeZone17);
        java.text.NumberFormat numberFormat19 = stdDateFormat18.getNumberFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance(0);
        boolean boolean22 = dateFormat21.isLenient();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat24);
        java.util.TimeZone timeZone26 = dateFormat21.getTimeZone();
        java.util.TimeZone timeZone27 = dateFormat21.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = stdDateFormat18.withTimeZone(timeZone27);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(numberFormat24);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat28);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(1, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat17 = stdDateFormat3._formatISO8601_z;
        java.lang.String str18 = stdDateFormat3.toString();
        java.util.Locale locale19 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat21 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat22 = stdDateFormat3._formatISO8601;
        java.lang.String str23 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat24 = stdDateFormat3._formatRFC1123;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str18, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str23, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat24);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        stdDateFormat3._timezone = timeZone17;
        java.text.DateFormat dateFormat19 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatRFC1123;
        java.util.Locale locale21 = stdDateFormat3._locale;
        boolean boolean23 = stdDateFormat3.looksLikeISO8601("\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        stdDateFormat4.setNumberFormat(numberFormat6);
        boolean boolean9 = stdDateFormat4.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        boolean boolean11 = stdDateFormat4.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.ParsePosition parsePosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = stdDateFormat4.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", parsePosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "56) test3108(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064440151,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=849,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar17 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone18 = dateFormat16.getTimeZone();
        boolean boolean19 = dateFormat16.isLenient();
        stdDateFormat3._formatPlain = dateFormat16;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance();
        java.lang.String str23 = dateFormat21.format((java.lang.Object) 1L);
        dateFormat21.setLenient(true);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance(0);
        boolean boolean28 = dateFormat27.isLenient();
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator33 = dateFormat30.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean34 = dateFormat27.equals((java.lang.Object) dateFormat30);
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat36 = dateFormat35.getNumberFormat();
        java.util.Calendar calendar37 = dateFormat35.getCalendar();
        dateFormat30.setCalendar(calendar37);
        dateFormat30.setLenient(true);
        boolean boolean41 = dateFormat21.equals((java.lang.Object) dateFormat30);
        stdDateFormat3._formatRFC1123 = dateFormat30;
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getDateInstance();
        java.lang.String str45 = dateFormat43.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone46 = dateFormat43.getTimeZone();
        java.util.Calendar calendar47 = dateFormat43.getCalendar();
        dateFormat43.setLenient(false);
        stdDateFormat3._formatRFC1123 = dateFormat43;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = stdDateFormat3.parseObject("Thu, 01 Jan 1970 00:00:00 GMT");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "57) test3109(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar17.toString(), "sun.util.BuddhistCalendar[time=-734064440130,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=870,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateFormat21);
// flaky "29) test3109(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u0e21\u0e04. 2513" + "'", str23, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(attributedCharacterIterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateFormat35);
        org.junit.Assert.assertNotNull(numberFormat36);
        org.junit.Assert.assertNotNull(calendar37);
// flaky "13) test3109(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar37.toString(), "sun.util.BuddhistCalendar[time=-734064440130,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=870,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateFormat43);
// flaky "9) test3109(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u0e21\u0e04. 2513" + "'", str45, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar47);
        org.junit.Assert.assertEquals(calendar47.toString(), "sun.util.BuddhistCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat3.withTimeZone(timeZone17);
        java.text.DateFormat dateFormat19 = stdDateFormat3._formatRFC1123;
        java.util.TimeZone timeZone20 = stdDateFormat3._timezone;
        java.text.NumberFormat numberFormat21 = stdDateFormat3.getNumberFormat();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(numberFormat21);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        stdDateFormat4.setNumberFormat(numberFormat6);
        java.lang.String str8 = stdDateFormat4.toString();
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateInstance(0);
        boolean boolean11 = dateFormat10.isLenient();
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator16 = dateFormat13.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean17 = dateFormat10.equals((java.lang.Object) dateFormat13);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        java.util.Calendar calendar20 = dateFormat18.getCalendar();
        dateFormat13.setCalendar(calendar20);
        dateFormat13.setLenient(true);
        stdDateFormat4._formatISO8601_z = dateFormat13;
        java.lang.String str25 = stdDateFormat4.toString();
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance();
        java.lang.String str28 = dateFormat26.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone29 = dateFormat26.getTimeZone();
        stdDateFormat4._formatISO8601_z = dateFormat26;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "58) test3111(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064440109,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=891,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)" + "'", str8, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(attributedCharacterIterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(calendar20);
// flaky "30) test3111(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar20.toString(), "sun.util.BuddhistCalendar[time=-734064440109,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=891,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)" + "'", str25, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat26);
// flaky "14) test3111(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u0e21\u0e04. 2513" + "'", str28, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.lang.String str11 = stdDateFormat3.toString();
        java.util.TimeZone timeZone12 = stdDateFormat3._timezone;
        java.text.ParsePosition parsePosition14 = null;
        java.lang.Object obj15 = stdDateFormat3.parseObject("10", parsePosition14);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        boolean boolean13 = dateFormat11.equals((java.lang.Object) 1.0f);
        boolean boolean14 = dateFormat11.isLenient();
        java.util.TimeZone timeZone15 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.withTimeZone(timeZone15);
        java.text.DateFormat dateFormat17 = stdDateFormat16._formatISO8601;
        java.text.DateFormat dateFormat18 = stdDateFormat16._formatISO8601;
        java.text.DateFormat dateFormat19 = stdDateFormat16._formatRFC1123;
        java.util.TimeZone timeZone20 = stdDateFormat16._timezone;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(dateFormat18);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        boolean boolean13 = dateFormat11.equals((java.lang.Object) 1.0f);
        boolean boolean14 = dateFormat11.isLenient();
        java.util.TimeZone timeZone15 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.withTimeZone(timeZone15);
        boolean boolean18 = stdDateFormat16.looksLikeISO8601("yyyy-MM-dd");
        java.text.DateFormat dateFormat19 = stdDateFormat16._formatRFC1123;
        java.text.NumberFormat numberFormat20 = stdDateFormat16.getNumberFormat();
        java.lang.String str21 = stdDateFormat16.toString();
        java.text.DateFormat dateFormat22 = stdDateFormat16._formatPlain;
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.text.NumberFormat numberFormat24 = null;
        dateFormat23.setNumberFormat(numberFormat24);
        java.util.Calendar calendar26 = dateFormat23.getCalendar();
        stdDateFormat16._formatPlain = dateFormat23;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str21, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(calendar26);
// flaky "59) test3114(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar26.toString(), "sun.util.BuddhistCalendar[time=-734064440403,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=597,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        stdDateFormat3._timezone = timeZone17;
        java.text.DateFormat dateFormat19 = stdDateFormat3._formatPlain;
        java.util.Locale locale20 = stdDateFormat3._locale;
        java.lang.String str21 = stdDateFormat3.toString();
        java.lang.String str22 = stdDateFormat3.toString();
        boolean boolean24 = stdDateFormat3.looksLikeISO8601("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str21, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str22, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        stdDateFormat3._formatISO8601 = dateFormat14;
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        java.util.Calendar calendar21 = dateFormat17.getCalendar();
        stdDateFormat3.setCalendar(calendar21);
        java.text.ParsePosition parsePosition24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = stdDateFormat3.parseObject("\u0e21\u0e04. 2513 07:00:00", parsePosition24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(calendar21);
// flaky "60) test3116(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar21.toString(), "sun.util.BuddhistCalendar[time=-734064440044,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=956,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.util.Calendar calendar5 = dateFormat4.getCalendar();
        java.util.Calendar calendar6 = dateFormat4.getCalendar();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance(0);
        boolean boolean9 = dateFormat8.isLenient();
        boolean boolean10 = dateFormat4.equals((java.lang.Object) dateFormat8);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getTimeInstance();
        dateFormat11.setLenient(false);
        dateFormat11.setLenient(false);
        boolean boolean16 = dateFormat11.isLenient();
        dateFormat11.setLenient(true);
        dateFormat11.setLenient(false);
        java.util.Calendar calendar21 = dateFormat11.getCalendar();
        dateFormat4.setCalendar(calendar21);
        dateFormat3.setCalendar(calendar21);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "61) test3117(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar5.toString(), "sun.util.BuddhistCalendar[time=-734064440403,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=597,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar6);
// flaky "31) test3117(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar6.toString(), "sun.util.BuddhistCalendar[time=-734064440403,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=597,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(calendar21);
// flaky "15) test3117(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar21.toString(), "sun.util.BuddhistCalendar[time=-734064440036,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=964,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat17 = stdDateFormat3._formatISO8601_z;
        java.util.Locale locale18 = stdDateFormat3._locale;
        boolean boolean20 = stdDateFormat3.looksLikeISO8601("yyyy-MM-dd");
        java.text.DateFormat dateFormat21 = stdDateFormat3._formatISO8601;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(dateFormat21);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        boolean boolean16 = stdDateFormat3.looksLikeISO8601("Thu, 01 Jan 2513 07:00:00 ICT");
        java.util.Calendar calendar17 = null;
        stdDateFormat3.setCalendar(calendar17);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone20 = dateFormat19.getTimeZone();
        java.util.TimeZone timeZone21 = dateFormat19.getTimeZone();
        java.util.TimeZone timeZone22 = dateFormat19.getTimeZone();
        java.util.Calendar calendar23 = dateFormat19.getCalendar();
        java.util.TimeZone timeZone24 = dateFormat19.getTimeZone();
        stdDateFormat3.setTimeZone(timeZone24);
        java.text.DateFormat dateFormat26 = stdDateFormat3._formatPlain;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dateFormat26.isLenient();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar23);
// flaky "62) test3119(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar23.toString(), "sun.util.BuddhistCalendar[time=-734064439999,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=1,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat26);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        stdDateFormat4.setNumberFormat(numberFormat6);
        java.lang.String str8 = stdDateFormat4.toString();
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateInstance(0);
        boolean boolean11 = dateFormat10.isLenient();
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator16 = dateFormat13.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean17 = dateFormat10.equals((java.lang.Object) dateFormat13);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        java.util.Calendar calendar20 = dateFormat18.getCalendar();
        dateFormat13.setCalendar(calendar20);
        dateFormat13.setLenient(true);
        stdDateFormat4._formatISO8601_z = dateFormat13;
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar28 = dateFormat27.getCalendar();
        dateFormat25.setCalendar(calendar28);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar32 = dateFormat31.getCalendar();
        java.util.TimeZone timeZone33 = dateFormat31.getTimeZone();
        boolean boolean34 = dateFormat25.equals((java.lang.Object) timeZone33);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat4.withTimeZone(timeZone33);
        java.text.DateFormat dateFormat36 = stdDateFormat4._formatRFC1123;
        java.text.DateFormat dateFormat37 = stdDateFormat4._formatISO8601;
        java.text.DateFormat dateFormat38 = stdDateFormat4._formatISO8601_z;
        java.util.TimeZone timeZone39 = stdDateFormat4._timezone;
        java.util.TimeZone timeZone40 = null;
        stdDateFormat4._timezone = timeZone40;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "63) test3120(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064439990,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)" + "'", str8, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(attributedCharacterIterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(calendar20);
// flaky "32) test3120(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar20.toString(), "sun.util.BuddhistCalendar[time=-734064439990,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(calendar28);
// flaky "16) test3120(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar28.toString(), "sun.util.BuddhistCalendar[time=-734064439990,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(calendar32);
// flaky "10) test3120(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar32.toString(), "sun.util.BuddhistCalendar[time=-734064439990,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(stdDateFormat35);
        org.junit.Assert.assertNull(dateFormat36);
        org.junit.Assert.assertNull(dateFormat37);
        org.junit.Assert.assertNotNull(dateFormat38);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.lang.String str5 = dateFormat3.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone6 = dateFormat3.getTimeZone();
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone6);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone9 = dateFormat8.getTimeZone();
        java.util.TimeZone timeZone10 = dateFormat8.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        dateFormat12.setNumberFormat(numberFormat15);
        stdDateFormat11.setNumberFormat(numberFormat15);
        boolean boolean20 = stdDateFormat11.looksLikeISO8601("");
        java.util.TimeZone timeZone21 = stdDateFormat11._timezone;
        java.text.DateFormat dateFormat22 = null;
        stdDateFormat11._formatPlain = dateFormat22;
        java.text.NumberFormat numberFormat24 = stdDateFormat11.getNumberFormat();
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.util.Calendar calendar26 = dateFormat25.getCalendar();
        stdDateFormat11.setCalendar(calendar26);
        dateFormat7.setCalendar(calendar26);
        boolean boolean29 = dateFormat0.equals((java.lang.Object) dateFormat7);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance();
        dateFormat30.setLenient(false);
        boolean boolean33 = dateFormat30.isLenient();
        boolean boolean34 = dateFormat30.isLenient();
        java.util.Calendar calendar35 = dateFormat30.getCalendar();
        dateFormat0.setCalendar(calendar35);
        java.util.TimeZone timeZone37 = dateFormat0.getTimeZone();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "64) test3121(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064439979,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=21,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat3);
// flaky "33) test3121(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u0e21\u0e04. 2513" + "'", str5, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(numberFormat24);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(calendar26);
// flaky "17) test3121(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar26.toString(), "sun.util.BuddhistCalendar[time=-734064440036,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=39,MILLISECOND=964,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(calendar35);
// flaky "11) test3121(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar35.toString(), "sun.util.BuddhistCalendar[time=-734064439978,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=22,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat17 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat18 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat19 = stdDateFormat3._formatPlain;
        java.lang.String str20 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        java.util.TimeZone timeZone23 = dateFormat21.getTimeZone();
        java.util.TimeZone timeZone24 = dateFormat21.getTimeZone();
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone26 = dateFormat25.getTimeZone();
        boolean boolean27 = dateFormat25.isLenient();
        boolean boolean28 = dateFormat25.isLenient();
        java.text.NumberFormat numberFormat29 = dateFormat25.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat29);
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        dateFormat32.setNumberFormat(numberFormat34);
        dateFormat31.setNumberFormat(numberFormat34);
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar40 = dateFormat39.getCalendar();
        dateFormat37.setCalendar(calendar40);
        dateFormat31.setCalendar(calendar40);
        dateFormat21.setCalendar(calendar40);
        stdDateFormat3.setCalendar(calendar40);
        java.text.DateFormat dateFormat45 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat47 = java.text.DateFormat.getDateInstance(3);
        dateFormat47.setLenient(false);
        boolean boolean50 = stdDateFormat3.equals((java.lang.Object) dateFormat47);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(dateFormat18);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str20, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(numberFormat29);
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertNotNull(dateFormat37);
        org.junit.Assert.assertNotNull(dateFormat39);
        org.junit.Assert.assertNotNull(calendar40);
// flaky "65) test3122(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar40.toString(), "sun.util.BuddhistCalendar[time=-734064439959,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=41,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(dateFormat45);
        org.junit.Assert.assertNotNull(dateFormat47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        java.util.TimeZone timeZone4 = dateFormat1.getTimeZone();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone7 = dateFormat6.getTimeZone();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone9 = dateFormat8.getTimeZone();
        java.util.TimeZone timeZone10 = dateFormat8.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        dateFormat12.setNumberFormat(numberFormat15);
        stdDateFormat11.setNumberFormat(numberFormat15);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateInstance();
        boolean boolean21 = dateFormat19.equals((java.lang.Object) 1.0f);
        boolean boolean22 = dateFormat19.isLenient();
        java.util.TimeZone timeZone23 = dateFormat19.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = stdDateFormat11.withTimeZone(timeZone23);
        java.util.Locale locale25 = stdDateFormat24._locale;
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone7, locale25);
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4, locale25);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance(100, locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat3.withTimeZone(timeZone17);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar22 = dateFormat21.getCalendar();
        dateFormat19.setCalendar(calendar22);
        stdDateFormat3.setCalendar(calendar22);
        boolean boolean26 = stdDateFormat3.looksLikeISO8601("10");
        stdDateFormat3.setLenient(false);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone30 = dateFormat29.getTimeZone();
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone30);
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone30);
        java.util.Calendar calendar33 = dateFormat32.getCalendar();
        stdDateFormat3._formatISO8601_z = dateFormat32;
        java.lang.String str35 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance(0);
        boolean boolean38 = dateFormat37.isLenient();
        java.text.NumberFormat numberFormat39 = dateFormat37.getNumberFormat();
        stdDateFormat3._formatRFC1123 = dateFormat37;
        java.text.DateFormat dateFormat41 = stdDateFormat3._formatISO8601_z;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(calendar22);
// flaky "66) test3124(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar22.toString(), "sun.util.BuddhistCalendar[time=-734064439928,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=72,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(calendar33);
// flaky "34) test3124(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar33.toString(), "sun.util.BuddhistCalendar[time=-734064439959,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=41,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str35, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(numberFormat39);
        org.junit.Assert.assertNotNull(dateFormat41);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        stdDateFormat4.setNumberFormat(numberFormat6);
        java.text.DateFormat dateFormat8 = stdDateFormat4._formatISO8601_z;
        java.util.Locale locale9 = stdDateFormat4._locale;
        java.text.DateFormat dateFormat10 = stdDateFormat4._formatISO8601;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "67) test3125(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064439917,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=83,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNull(dateFormat10);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601_z;
        boolean boolean17 = stdDateFormat3.looksLikeISO8601("yyyy-MM-dd");
        java.util.TimeZone timeZone18 = stdDateFormat3._timezone;
        java.lang.String str19 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat21 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator24 = dateFormat22.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone25 = dateFormat22.getTimeZone();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance(0);
        boolean boolean28 = dateFormat27.isLenient();
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator33 = dateFormat30.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean34 = dateFormat27.equals((java.lang.Object) dateFormat30);
        java.util.TimeZone timeZone35 = dateFormat30.getTimeZone();
        java.util.TimeZone timeZone36 = dateFormat30.getTimeZone();
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator39 = dateFormat37.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone40 = dateFormat37.getTimeZone();
        dateFormat37.setLenient(true);
        java.util.Calendar calendar43 = dateFormat37.getCalendar();
        boolean boolean44 = dateFormat30.equals((java.lang.Object) calendar43);
        dateFormat22.setCalendar(calendar43);
        stdDateFormat3._formatISO8601_z = dateFormat22;
        java.text.ParsePosition parsePosition48 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date49 = stdDateFormat3.parseAsISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)", parsePosition48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str19, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(attributedCharacterIterator24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(attributedCharacterIterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat37);
        org.junit.Assert.assertNotNull(attributedCharacterIterator39);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar43);
        org.junit.Assert.assertEquals(calendar43.toString(), "sun.util.BuddhistCalendar[time=2,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=2,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(14, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.text.ParsePosition parsePosition14 = null;
        java.util.Date date15 = stdDateFormat3.parse("10", parsePosition14);
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone18 = dateFormat17.getTimeZone();
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = stdDateFormat3.withTimeZone(timeZone18);
        boolean boolean23 = stdDateFormat21.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)");
        java.text.NumberFormat numberFormat24 = stdDateFormat21.getNumberFormat();
        java.text.DateFormat dateFormat25 = stdDateFormat21._formatPlain;
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone27 = dateFormat26.getTimeZone();
        java.util.TimeZone timeZone28 = dateFormat26.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone28);
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        dateFormat31.setNumberFormat(numberFormat33);
        dateFormat30.setNumberFormat(numberFormat33);
        stdDateFormat29.setNumberFormat(numberFormat33);
        boolean boolean38 = stdDateFormat29.looksLikeISO8601("");
        boolean boolean40 = stdDateFormat29.equals((java.lang.Object) 5);
        java.text.DateFormat dateFormat41 = stdDateFormat29._formatRFC1123;
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar43 = dateFormat42.getCalendar();
        stdDateFormat29._formatISO8601_z = dateFormat42;
        boolean boolean46 = stdDateFormat29.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat47 = stdDateFormat29._formatISO8601;
        java.text.NumberFormat numberFormat48 = stdDateFormat29.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = stdDateFormat21.format((java.lang.Object) stdDateFormat29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(stdDateFormat21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(numberFormat24);
        org.junit.Assert.assertNull(dateFormat25);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(numberFormat33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(dateFormat41);
        org.junit.Assert.assertNotNull(dateFormat42);
        org.junit.Assert.assertNotNull(calendar43);
// flaky "68) test3128(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar43.toString(), "sun.util.BuddhistCalendar[time=-734064439893,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=107,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(dateFormat47);
        org.junit.Assert.assertNotNull(numberFormat48);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        boolean boolean2 = dateFormat0.isLenient();
        java.text.ParsePosition parsePosition4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = dateFormat0.parseObject("2513-01-01T07:00:00.010+0700", parsePosition4);
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
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        boolean boolean2 = dateFormat0.isLenient();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone5 = dateFormat4.getTimeZone();
        java.util.Calendar calendar6 = dateFormat4.getCalendar();
        java.text.NumberFormat numberFormat7 = dateFormat4.getNumberFormat();
        dateFormat4.setLenient(true);
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone11 = dateFormat10.getTimeZone();
        java.util.TimeZone timeZone12 = dateFormat10.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12);
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat17);
        dateFormat14.setNumberFormat(numberFormat17);
        stdDateFormat13.setNumberFormat(numberFormat17);
        dateFormat4.setNumberFormat(numberFormat17);
        dateFormat0.setNumberFormat(numberFormat17);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "69) test3130(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064439877,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=123,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar6);
// flaky "35) test3130(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar6.toString(), "sun.util.BuddhistCalendar[time=-734064439877,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=123,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        stdDateFormat4.setNumberFormat(numberFormat6);
        java.text.DateFormat dateFormat8 = stdDateFormat4._formatISO8601_z;
        java.text.DateFormat dateFormat9 = stdDateFormat4._formatRFC1123;
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        java.util.Calendar calendar13 = dateFormat11.getCalendar();
        java.text.NumberFormat numberFormat14 = dateFormat11.getNumberFormat();
        dateFormat10.setNumberFormat(numberFormat14);
        boolean boolean16 = dateFormat10.isLenient();
        java.util.Calendar calendar17 = dateFormat10.getCalendar();
        stdDateFormat4._formatRFC1123 = dateFormat10;
        java.text.DateFormat dateFormat19 = stdDateFormat4._formatISO8601;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "70) test3131(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064439868,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=132,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertNull(dateFormat8);
        org.junit.Assert.assertNull(dateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar13);
// flaky "36) test3131(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar13.toString(), "sun.util.BuddhistCalendar[time=-734064439868,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=132,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "18) test3131(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar17.toString(), "sun.util.BuddhistCalendar[time=-734064439868,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=132,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(dateFormat19);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat3.withTimeZone(timeZone17);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar22 = dateFormat21.getCalendar();
        dateFormat19.setCalendar(calendar22);
        stdDateFormat3.setCalendar(calendar22);
        java.util.TimeZone timeZone25 = stdDateFormat3.getTimeZone();
        java.text.DateFormat dateFormat26 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator31 = dateFormat28.formatToCharacterIterator((java.lang.Object) 0);
        stdDateFormat3._formatRFC1123 = dateFormat28;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date34 = stdDateFormat3.parse("Thu, 01 Jan 2513 00:00:00 GMT");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"Thu, 01 Jan 2513 00:00:00 GMT\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(calendar22);
// flaky "71) test3132(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar22.toString(), "sun.util.BuddhistCalendar[time=-734064439851,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=149,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(attributedCharacterIterator31);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat17 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat18 = null;
        stdDateFormat3._formatRFC1123 = dateFormat18;
        java.util.TimeZone timeZone20 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateTimeInstance(0, 0);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone25 = dateFormat24.getTimeZone();
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone27 = dateFormat26.getTimeZone();
        java.util.TimeZone timeZone28 = dateFormat26.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone28);
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        dateFormat31.setNumberFormat(numberFormat33);
        dateFormat30.setNumberFormat(numberFormat33);
        stdDateFormat29.setNumberFormat(numberFormat33);
        boolean boolean38 = stdDateFormat29.looksLikeISO8601("");
        java.text.ParsePosition parsePosition40 = null;
        java.util.Date date41 = stdDateFormat29.parse("10", parsePosition40);
        java.lang.String str42 = dateFormat24.format(date41);
        java.lang.String str43 = dateFormat23.format(date41);
        java.lang.StringBuffer stringBuffer44 = null;
        java.text.FieldPosition fieldPosition45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer46 = stdDateFormat3.format(date41, stringBuffer44, fieldPosition45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(numberFormat33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 07:00:00 ICT 1970");
// flaky "72) test3133(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u0e21\u0e04. 2513 07:00:00" + "'", str42, "\u0e21\u0e04. 2513 07:00:00");
// flaky "37) test3133(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19" + "'", str43, "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        stdDateFormat3._timezone = timeZone17;
        java.text.DateFormat dateFormat19 = stdDateFormat3._formatPlain;
        java.util.TimeZone timeZone20 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat21 = null;
        stdDateFormat3._formatPlain = dateFormat21;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance(0);
        boolean boolean25 = dateFormat24.isLenient();
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        dateFormat24.setNumberFormat(numberFormat27);
        java.util.Calendar calendar29 = dateFormat24.getCalendar();
        boolean boolean30 = dateFormat24.isLenient();
        java.util.Calendar calendar31 = dateFormat24.getCalendar();
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance(0);
        boolean boolean34 = dateFormat33.isLenient();
        java.text.NumberFormat numberFormat35 = dateFormat33.getNumberFormat();
        dateFormat24.setNumberFormat(numberFormat35);
        java.util.Calendar calendar37 = dateFormat24.getCalendar();
        stdDateFormat3._formatISO8601_z = dateFormat24;
        // The following exception was thrown during execution in test generation
        try {
            java.util.TimeZone timeZone39 = stdDateFormat3.getTimeZone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(numberFormat27);
        org.junit.Assert.assertNotNull(calendar29);
// flaky "73) test3134(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar29.toString(), "sun.util.BuddhistCalendar[time=-734064439823,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=177,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(calendar31);
// flaky "38) test3134(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar31.toString(), "sun.util.BuddhistCalendar[time=-734064439823,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=177,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertNotNull(calendar37);
// flaky "19) test3134(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar37.toString(), "sun.util.BuddhistCalendar[time=-734064439823,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=177,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        stdDateFormat4.setNumberFormat(numberFormat6);
        java.lang.String str8 = stdDateFormat4.toString();
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateInstance(0);
        boolean boolean11 = dateFormat10.isLenient();
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator16 = dateFormat13.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean17 = dateFormat10.equals((java.lang.Object) dateFormat13);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        java.util.Calendar calendar20 = dateFormat18.getCalendar();
        dateFormat13.setCalendar(calendar20);
        dateFormat13.setLenient(true);
        stdDateFormat4._formatISO8601_z = dateFormat13;
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance();
        boolean boolean27 = dateFormat25.equals((java.lang.Object) 1.0f);
        boolean boolean28 = dateFormat25.isLenient();
        java.util.TimeZone timeZone29 = dateFormat25.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = stdDateFormat4.withTimeZone(timeZone29);
        java.text.ParsePosition parsePosition32 = null;
        java.lang.Object obj33 = stdDateFormat30.parseObject("10", parsePosition32);
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat30.setLenient(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "74) test3135(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064439797,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=203,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)" + "'", str8, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(attributedCharacterIterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(calendar20);
// flaky "39) test3135(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar20.toString(), "sun.util.BuddhistCalendar[time=-734064439797,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=203,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat30);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        stdDateFormat4.setNumberFormat(numberFormat6);
        java.lang.String str8 = stdDateFormat4.toString();
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateInstance(0);
        boolean boolean11 = dateFormat10.isLenient();
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator16 = dateFormat13.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean17 = dateFormat10.equals((java.lang.Object) dateFormat13);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        java.util.Calendar calendar20 = dateFormat18.getCalendar();
        dateFormat13.setCalendar(calendar20);
        dateFormat13.setLenient(true);
        stdDateFormat4._formatISO8601_z = dateFormat13;
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance();
        boolean boolean27 = dateFormat25.equals((java.lang.Object) 1.0f);
        boolean boolean28 = dateFormat25.isLenient();
        java.util.TimeZone timeZone29 = dateFormat25.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = stdDateFormat4.withTimeZone(timeZone29);
        java.text.ParsePosition parsePosition32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date33 = stdDateFormat30.parseAsRFC1123("2513-01-01T07:00:00.000+0700", parsePosition32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "75) test3136(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064439787,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=213,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)" + "'", str8, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(attributedCharacterIterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(calendar20);
// flaky "40) test3136(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar20.toString(), "sun.util.BuddhistCalendar[time=-734064439787,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=213,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat30);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat3.withTimeZone(timeZone17);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance(0);
        boolean boolean21 = dateFormat20.isLenient();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator26 = dateFormat23.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean27 = dateFormat20.equals((java.lang.Object) dateFormat23);
        java.text.NumberFormat numberFormat28 = dateFormat23.getNumberFormat();
        stdDateFormat3._formatISO8601_z = dateFormat23;
        java.text.DateFormat dateFormat30 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat31 = stdDateFormat3._formatISO8601;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(attributedCharacterIterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNull(dateFormat31);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.util.TimeZone timeZone5 = dateFormat3.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        dateFormat8.setNumberFormat(numberFormat10);
        dateFormat7.setNumberFormat(numberFormat10);
        stdDateFormat6.setNumberFormat(numberFormat10);
        boolean boolean15 = stdDateFormat6.looksLikeISO8601("");
        java.util.Locale locale16 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance((int) (short) 1, locale16);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateInstance(8, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat3.withTimeZone(timeZone17);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance(0);
        boolean boolean21 = dateFormat20.isLenient();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator26 = dateFormat23.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean27 = dateFormat20.equals((java.lang.Object) dateFormat23);
        java.text.NumberFormat numberFormat28 = dateFormat23.getNumberFormat();
        stdDateFormat3._formatISO8601_z = dateFormat23;
        java.text.NumberFormat numberFormat30 = dateFormat23.getNumberFormat();
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance(0);
        boolean boolean34 = dateFormat33.isLenient();
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat36 = dateFormat35.getNumberFormat();
        dateFormat33.setNumberFormat(numberFormat36);
        dateFormat31.setNumberFormat(numberFormat36);
        dateFormat23.setNumberFormat(numberFormat36);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(attributedCharacterIterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertNotNull(numberFormat30);
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateFormat35);
        org.junit.Assert.assertNotNull(numberFormat36);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        boolean boolean13 = dateFormat11.equals((java.lang.Object) 1.0f);
        boolean boolean14 = dateFormat11.isLenient();
        java.util.TimeZone timeZone15 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.withTimeZone(timeZone15);
        java.text.DateFormat dateFormat17 = stdDateFormat16._formatISO8601;
        java.text.DateFormat dateFormat18 = stdDateFormat16._formatRFC1123;
        java.text.ParsePosition parsePosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = stdDateFormat16.parseAsRFC1123("2513-01-01T07:00:00.010+0700", parsePosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertNull(dateFormat18);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601_z;
        boolean boolean17 = stdDateFormat3.looksLikeISO8601("yyyy-MM-dd");
        java.util.TimeZone timeZone18 = stdDateFormat3._timezone;
        java.lang.String str19 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat21 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance(3);
        java.util.Calendar calendar24 = dateFormat23.getCalendar();
        dateFormat23.setLenient(false);
        stdDateFormat3._formatPlain = dateFormat23;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str19, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(calendar24);
// flaky "76) test3141(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar24.toString(), "sun.util.BuddhistCalendar[time=-734064439735,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=265,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator4 = dateFormat1.formatToCharacterIterator((java.lang.Object) 0);
        java.text.NumberFormat numberFormat5 = dateFormat1.getNumberFormat();
        java.util.Calendar calendar6 = dateFormat1.getCalendar();
        dateFormat1.setLenient(true);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(attributedCharacterIterator4);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(calendar6);
        org.junit.Assert.assertEquals(calendar6.toString(), "sun.util.BuddhistCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        boolean boolean14 = stdDateFormat3.equals((java.lang.Object) 5);
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone18 = dateFormat17.getTimeZone();
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        stdDateFormat3.setTimeZone(timeZone18);
        java.util.Calendar calendar22 = stdDateFormat3.getCalendar();
        java.text.DateFormat dateFormat23 = stdDateFormat3._formatISO8601;
        java.lang.String str24 = stdDateFormat3.toString();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNull(calendar22);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str24, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        dateFormat0.setLenient(false);
        boolean boolean3 = dateFormat0.isLenient();
        boolean boolean4 = dateFormat0.isLenient();
        boolean boolean5 = dateFormat0.isLenient();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone7 = dateFormat6.getTimeZone();
        java.util.TimeZone timeZone8 = dateFormat6.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone8);
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        dateFormat11.setNumberFormat(numberFormat13);
        dateFormat10.setNumberFormat(numberFormat13);
        stdDateFormat9.setNumberFormat(numberFormat13);
        boolean boolean18 = stdDateFormat9.looksLikeISO8601("");
        java.util.Locale locale19 = stdDateFormat9._locale;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance(0);
        boolean boolean22 = dateFormat21.isLenient();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat24);
        java.util.TimeZone timeZone26 = dateFormat21.getTimeZone();
        stdDateFormat9.setTimeZone(timeZone26);
        java.lang.String str28 = stdDateFormat9.toString();
        java.text.DateFormat dateFormat29 = stdDateFormat9._formatPlain;
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar31 = dateFormat30.getCalendar();
        java.util.TimeZone timeZone32 = dateFormat30.getTimeZone();
        boolean boolean33 = dateFormat30.isLenient();
        java.util.TimeZone timeZone34 = dateFormat30.getTimeZone();
        java.util.TimeZone timeZone35 = dateFormat30.getTimeZone();
        java.util.TimeZone timeZone36 = dateFormat30.getTimeZone();
        stdDateFormat9._timezone = timeZone36;
        java.text.DateFormat dateFormat38 = stdDateFormat9._formatISO8601_z;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator39 = dateFormat0.formatToCharacterIterator((java.lang.Object) dateFormat38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: formatToCharacterIterator must be passed non-null object");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(numberFormat24);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str28, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat29);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(calendar31);
// flaky "77) test3144(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar31.toString(), "sun.util.BuddhistCalendar[time=-734064439703,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=297,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat38);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat14 = null;
        stdDateFormat3._formatPlain = dateFormat14;
        java.text.NumberFormat numberFormat16 = stdDateFormat3.getNumberFormat();
        java.text.ParsePosition parsePosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = stdDateFormat3.parse("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19", parsePosition18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(numberFormat16);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone16 = dateFormat15.getTimeZone();
        java.util.Calendar calendar17 = dateFormat15.getCalendar();
        dateFormat15.setLenient(true);
        java.text.NumberFormat numberFormat20 = dateFormat15.getNumberFormat();
        stdDateFormat3._formatISO8601_z = dateFormat15;
        boolean boolean23 = stdDateFormat3.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar17);
// flaky "78) test3146(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar17.toString(), "sun.util.BuddhistCalendar[time=-734064439685,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=315,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat8 = dateFormat7.getNumberFormat();
        dateFormat6.setNumberFormat(numberFormat8);
        dateFormat5.setNumberFormat(numberFormat8);
        stdDateFormat4.setNumberFormat(numberFormat8);
        boolean boolean13 = stdDateFormat4.looksLikeISO8601("");
        java.util.TimeZone timeZone14 = stdDateFormat4._timezone;
        java.lang.String str15 = stdDateFormat4.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        java.util.TimeZone timeZone18 = dateFormat16.getTimeZone();
        dateFormat16.setLenient(true);
        stdDateFormat4._formatRFC1123 = dateFormat16;
        java.util.Locale locale22 = stdDateFormat4._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance(17, locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat14 = null;
        stdDateFormat3._formatPlain = dateFormat14;
        java.text.NumberFormat numberFormat16 = stdDateFormat3.getNumberFormat();
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.util.Calendar calendar18 = dateFormat17.getCalendar();
        stdDateFormat3.setCalendar(calendar18);
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar22 = dateFormat21.getCalendar();
        java.util.TimeZone timeZone23 = dateFormat21.getTimeZone();
        boolean boolean24 = dateFormat21.isLenient();
        java.util.TimeZone timeZone25 = dateFormat21.getTimeZone();
        java.util.TimeZone timeZone26 = dateFormat21.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = stdDateFormat3.withTimeZone(timeZone26);
        java.util.Locale locale28 = stdDateFormat27._locale;
        java.util.Locale locale29 = stdDateFormat27._locale;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar32 = dateFormat31.getCalendar();
        java.util.TimeZone timeZone33 = dateFormat31.getTimeZone();
        boolean boolean34 = dateFormat31.isLenient();
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateInstance();
        boolean boolean37 = dateFormat35.equals((java.lang.Object) 1.0f);
        java.text.NumberFormat numberFormat38 = dateFormat35.getNumberFormat();
        dateFormat31.setNumberFormat(numberFormat38);
        java.text.NumberFormat numberFormat40 = dateFormat31.getNumberFormat();
        stdDateFormat27._formatISO8601 = dateFormat31;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(calendar18);
// flaky "79) test3148(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar18.toString(), "sun.util.BuddhistCalendar[time=-734064439959,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=41,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(calendar22);
// flaky "41) test3148(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar22.toString(), "sun.util.BuddhistCalendar[time=-734064439661,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=339,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(calendar32);
// flaky "20) test3148(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar32.toString(), "sun.util.BuddhistCalendar[time=-734064439661,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=339,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateFormat35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(numberFormat38);
        org.junit.Assert.assertNotNull(numberFormat40);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        boolean boolean16 = dateFormat15.isLenient();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat18);
        dateFormat13.setNumberFormat(numberFormat18);
        boolean boolean21 = stdDateFormat3.equals((java.lang.Object) numberFormat18);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone23);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = stdDateFormat3.withTimeZone(timeZone23);
        java.text.DateFormat dateFormat26 = stdDateFormat25._formatRFC1123;
        boolean boolean28 = stdDateFormat25.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.DateFormat dateFormat29 = stdDateFormat25._formatISO8601_z;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(stdDateFormat25);
        org.junit.Assert.assertNull(dateFormat26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(dateFormat29);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        stdDateFormat3._formatISO8601 = dateFormat14;
        java.util.TimeZone timeZone16 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone18 = dateFormat17.getTimeZone();
        java.util.TimeZone timeZone19 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19);
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat24);
        dateFormat21.setNumberFormat(numberFormat24);
        stdDateFormat20.setNumberFormat(numberFormat24);
        boolean boolean29 = stdDateFormat20.looksLikeISO8601("");
        java.util.TimeZone timeZone30 = stdDateFormat20._timezone;
        java.lang.String str31 = stdDateFormat20.toString();
        java.text.DateFormat dateFormat32 = stdDateFormat20._formatISO8601_z;
        boolean boolean34 = stdDateFormat20.looksLikeISO8601("yyyy-MM-dd");
        java.util.TimeZone timeZone35 = stdDateFormat20._timezone;
        java.lang.String str36 = stdDateFormat20.toString();
        java.lang.String str37 = stdDateFormat20.toString();
        java.lang.String str38 = stdDateFormat20.toString();
        boolean boolean40 = stdDateFormat20.looksLikeISO8601("yyyy-MM-dd");
        java.lang.Class<?> wildcardClass41 = stdDateFormat20.getClass();
        java.lang.StringBuffer stringBuffer42 = null;
        java.text.FieldPosition fieldPosition43 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer44 = stdDateFormat3.format((java.lang.Object) wildcardClass41, stringBuffer42, fieldPosition43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(numberFormat24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str31, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str36, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str37, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str38, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.Locale locale13 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        boolean boolean16 = dateFormat15.isLenient();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat18);
        java.util.TimeZone timeZone20 = dateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = stdDateFormat3.withTimeZone(timeZone20);
        java.text.DateFormat dateFormat22 = stdDateFormat3._formatISO8601;
        java.util.TimeZone timeZone23 = stdDateFormat3._timezone;
        java.util.Calendar calendar24 = stdDateFormat3.getCalendar();
        java.util.Locale locale25 = stdDateFormat3._locale;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat21);
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(calendar24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        stdDateFormat3._timezone = timeZone17;
        java.text.DateFormat dateFormat19 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat21 = stdDateFormat3._formatISO8601_z;
        boolean boolean23 = stdDateFormat3.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat24 = stdDateFormat3._formatISO8601_z;
        boolean boolean26 = stdDateFormat3.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        java.text.DateFormat dateFormat27 = null;
        stdDateFormat3._formatISO8601 = dateFormat27;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = null; // flaky "80) test3152(com.fasterxml.jackson.databind.util.RegressionTest6)": stdDateFormat3.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
// flaky "42) test3152(com.fasterxml.jackson.databind.util.RegressionTest6)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(dateFormat24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        stdDateFormat3._formatRFC1123 = dateFormat14;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar19 = dateFormat18.getCalendar();
        dateFormat16.setCalendar(calendar19);
        stdDateFormat3._formatPlain = dateFormat16;
        java.text.ParsePosition parsePosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date24 = stdDateFormat3.parseAsISO8601("", parsePosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(calendar19);
// flaky "81) test3153(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar19.toString(), "sun.util.BuddhistCalendar[time=-734064439595,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=405,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat14 = null;
        stdDateFormat3._formatPlain = dateFormat14;
        java.util.TimeZone timeZone16 = stdDateFormat3._timezone;
        boolean boolean18 = stdDateFormat3.looksLikeISO8601("07:00:00");
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone7 = dateFormat6.getTimeZone();
        java.util.Calendar calendar8 = dateFormat6.getCalendar();
        java.text.NumberFormat numberFormat9 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat9);
        stdDateFormat4.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat12 = stdDateFormat4._formatPlain;
        java.util.Locale locale13 = stdDateFormat4._locale;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        boolean boolean16 = dateFormat14.isLenient();
        java.text.NumberFormat numberFormat17 = dateFormat14.getNumberFormat();
        stdDateFormat4.setNumberFormat(numberFormat17);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone20 = dateFormat19.getTimeZone();
        java.util.TimeZone timeZone21 = dateFormat19.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        dateFormat24.setNumberFormat(numberFormat26);
        dateFormat23.setNumberFormat(numberFormat26);
        stdDateFormat22.setNumberFormat(numberFormat26);
        boolean boolean31 = stdDateFormat22.looksLikeISO8601("");
        java.lang.String str32 = stdDateFormat22.toString();
        java.text.DateFormat dateFormat33 = stdDateFormat22._formatISO8601_z;
        java.text.DateFormat dateFormat34 = stdDateFormat22._formatPlain;
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar36 = dateFormat35.getCalendar();
        java.util.TimeZone timeZone37 = dateFormat35.getTimeZone();
        boolean boolean38 = dateFormat35.isLenient();
        stdDateFormat22._formatPlain = dateFormat35;
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateInstance();
        java.lang.String str42 = dateFormat40.format((java.lang.Object) 1L);
        dateFormat40.setLenient(true);
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getDateInstance(0);
        boolean boolean47 = dateFormat46.isLenient();
        java.text.DateFormat dateFormat49 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat51 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator52 = dateFormat49.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean53 = dateFormat46.equals((java.lang.Object) dateFormat49);
        java.text.DateFormat dateFormat54 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat55 = dateFormat54.getNumberFormat();
        java.util.Calendar calendar56 = dateFormat54.getCalendar();
        dateFormat49.setCalendar(calendar56);
        dateFormat49.setLenient(true);
        boolean boolean60 = dateFormat40.equals((java.lang.Object) dateFormat49);
        stdDateFormat22._formatRFC1123 = dateFormat49;
        java.text.DateFormat dateFormat62 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar63 = dateFormat62.getCalendar();
        java.util.TimeZone timeZone64 = dateFormat62.getTimeZone();
        boolean boolean65 = dateFormat62.isLenient();
        java.util.TimeZone timeZone66 = dateFormat62.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat67 = stdDateFormat22.withTimeZone(timeZone66);
        java.lang.String str68 = stdDateFormat67.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator69 = stdDateFormat4.formatToCharacterIterator((java.lang.Object) str68);
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
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar8);
// flaky "82) test3156(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar8.toString(), "sun.util.BuddhistCalendar[time=-734064439574,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=426,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str32, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat33);
        org.junit.Assert.assertNull(dateFormat34);
        org.junit.Assert.assertNotNull(dateFormat35);
        org.junit.Assert.assertNotNull(calendar36);
// flaky "43) test3156(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar36.toString(), "sun.util.BuddhistCalendar[time=-734064439574,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=426,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(dateFormat40);
// flaky "21) test3156(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u0e21\u0e04. 2513" + "'", str42, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(dateFormat46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(dateFormat49);
        org.junit.Assert.assertNotNull(dateFormat51);
        org.junit.Assert.assertNotNull(attributedCharacterIterator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(dateFormat54);
        org.junit.Assert.assertNotNull(numberFormat55);
        org.junit.Assert.assertNotNull(calendar56);
// flaky "12) test3156(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar56.toString(), "sun.util.BuddhistCalendar[time=-734064439574,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=426,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(dateFormat62);
        org.junit.Assert.assertNotNull(calendar63);
// flaky "4) test3156(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar63.toString(), "sun.util.BuddhistCalendar[time=-734064439574,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=426,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone64);
        org.junit.Assert.assertEquals(timeZone64.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(timeZone66);
        org.junit.Assert.assertEquals(timeZone66.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str68, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.text.DateFormat dateFormat13 = stdDateFormat3._formatPlain;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, 0);
        java.util.TimeZone timeZone18 = dateFormat17.getTimeZone();
        stdDateFormat3.setTimeZone(timeZone18);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        stdDateFormat3._formatRFC1123 = dateFormat14;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar19 = dateFormat18.getCalendar();
        dateFormat16.setCalendar(calendar19);
        stdDateFormat3._formatPlain = dateFormat16;
        java.text.DateFormat dateFormat22 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance();
        java.lang.String str25 = dateFormat23.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone26 = dateFormat23.getTimeZone();
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = stdDateFormat3.withTimeZone(timeZone26);
        java.text.DateFormat dateFormat30 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone32 = dateFormat31.getTimeZone();
        java.util.TimeZone timeZone33 = dateFormat31.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone33);
        java.text.DateFormat dateFormat35 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat38 = dateFormat37.getNumberFormat();
        dateFormat36.setNumberFormat(numberFormat38);
        dateFormat35.setNumberFormat(numberFormat38);
        stdDateFormat34.setNumberFormat(numberFormat38);
        boolean boolean43 = stdDateFormat34.looksLikeISO8601("");
        java.util.Locale locale44 = stdDateFormat34._locale;
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getDateInstance(0);
        boolean boolean47 = dateFormat46.isLenient();
        java.text.DateFormat dateFormat48 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat49 = dateFormat48.getNumberFormat();
        dateFormat46.setNumberFormat(numberFormat49);
        java.util.TimeZone timeZone51 = dateFormat46.getTimeZone();
        stdDateFormat34.setTimeZone(timeZone51);
        java.text.ParsePosition parsePosition54 = null;
        java.util.Date date55 = stdDateFormat34.parse("10", parsePosition54);
        java.lang.StringBuffer stringBuffer56 = null;
        java.text.FieldPosition fieldPosition57 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer58 = stdDateFormat3.format(date55, stringBuffer56, fieldPosition57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(calendar19);
// flaky "83) test3158(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar19.toString(), "sun.util.BuddhistCalendar[time=-734064439546,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=454,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(dateFormat23);
// flaky "44) test3158(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u0e21\u0e04. 2513" + "'", str25, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(stdDateFormat29);
        org.junit.Assert.assertNull(dateFormat30);
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat35);
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(dateFormat37);
        org.junit.Assert.assertNotNull(numberFormat38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(dateFormat48);
        org.junit.Assert.assertNotNull(numberFormat49);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat14 = null;
        stdDateFormat3._formatPlain = dateFormat14;
        java.text.NumberFormat numberFormat16 = stdDateFormat3.getNumberFormat();
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.util.Calendar calendar18 = dateFormat17.getCalendar();
        stdDateFormat3.setCalendar(calendar18);
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar22 = dateFormat21.getCalendar();
        java.util.TimeZone timeZone23 = dateFormat21.getTimeZone();
        boolean boolean24 = dateFormat21.isLenient();
        java.util.TimeZone timeZone25 = dateFormat21.getTimeZone();
        java.util.TimeZone timeZone26 = dateFormat21.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = stdDateFormat3.withTimeZone(timeZone26);
        java.lang.String str28 = stdDateFormat27.toString();
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar30 = dateFormat29.getCalendar();
        java.util.Calendar calendar31 = dateFormat29.getCalendar();
        stdDateFormat27.setCalendar(calendar31);
        java.lang.String str33 = stdDateFormat27.toString();
        java.util.Locale locale34 = stdDateFormat27._locale;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(calendar18);
// flaky "84) test3159(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar18.toString(), "sun.util.BuddhistCalendar[time=-734064439959,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=41,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(calendar22);
// flaky "45) test3159(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar22.toString(), "sun.util.BuddhistCalendar[time=-734064439532,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=468,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str28, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(calendar30);
// flaky "22) test3159(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar30.toString(), "sun.util.BuddhistCalendar[time=-734064439532,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=468,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar31);
// flaky "13) test3159(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar31.toString(), "sun.util.BuddhistCalendar[time=-734064439532,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=468,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str33, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        boolean boolean2 = dateFormat0.isLenient();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone5 = null;
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone7 = dateFormat6.getTimeZone();
        java.util.TimeZone timeZone8 = dateFormat6.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone8);
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat13 = dateFormat12.getNumberFormat();
        dateFormat11.setNumberFormat(numberFormat13);
        dateFormat10.setNumberFormat(numberFormat13);
        stdDateFormat9.setNumberFormat(numberFormat13);
        boolean boolean18 = stdDateFormat9.looksLikeISO8601("");
        java.util.TimeZone timeZone19 = stdDateFormat9._timezone;
        java.lang.String str20 = stdDateFormat9.toString();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = stdDateFormat9.withTimeZone(timeZone23);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar28 = dateFormat27.getCalendar();
        dateFormat25.setCalendar(calendar28);
        stdDateFormat9.setCalendar(calendar28);
        boolean boolean32 = stdDateFormat9.looksLikeISO8601("10");
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator35 = dateFormat33.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone36 = dateFormat33.getTimeZone();
        java.text.DateFormat dateFormat37 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone36);
        stdDateFormat9.setTimeZone(timeZone36);
        java.util.Locale locale39 = stdDateFormat9._locale;
        boolean boolean41 = stdDateFormat9.looksLikeISO8601("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513");
        java.util.Locale locale42 = stdDateFormat9._locale;
        java.text.DateFormat dateFormat43 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5, locale42);
        java.text.DateFormat dateFormat44 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4, locale42);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "85) test3160(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064439521,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=479,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str20, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat24);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(calendar28);
// flaky "46) test3160(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar28.toString(), "sun.util.BuddhistCalendar[time=-734064439521,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=479,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(attributedCharacterIterator35);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat37);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat43);
        org.junit.Assert.assertNotNull(dateFormat44);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        boolean boolean2 = dateFormat0.equals((java.lang.Object) 1.0f);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        java.util.Locale locale5 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4, locale5);
        java.text.ParsePosition parsePosition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stdDateFormat6.parseObject("", parsePosition8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        java.util.TimeZone timeZone4 = dateFormat2.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        dateFormat7.setNumberFormat(numberFormat9);
        dateFormat6.setNumberFormat(numberFormat9);
        stdDateFormat5.setNumberFormat(numberFormat9);
        boolean boolean14 = stdDateFormat5.looksLikeISO8601("");
        java.text.ParsePosition parsePosition16 = null;
        java.util.Date date17 = stdDateFormat5.parse("10", parsePosition16);
        java.lang.String str18 = dateFormat0.format(date17);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone20 = dateFormat19.getTimeZone();
        java.util.TimeZone timeZone21 = dateFormat19.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        dateFormat24.setNumberFormat(numberFormat26);
        dateFormat23.setNumberFormat(numberFormat26);
        stdDateFormat22.setNumberFormat(numberFormat26);
        boolean boolean31 = stdDateFormat22.looksLikeISO8601("");
        java.text.ParsePosition parsePosition33 = null;
        java.util.Date date34 = stdDateFormat22.parse("10", parsePosition33);
        java.text.DateFormat dateFormat35 = stdDateFormat22._formatISO8601;
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone37 = dateFormat36.getTimeZone();
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone37);
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone37);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat40 = stdDateFormat22.withTimeZone(timeZone37);
        boolean boolean42 = stdDateFormat40.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)");
        java.text.DateFormat dateFormat43 = stdDateFormat40._formatRFC1123;
        boolean boolean45 = stdDateFormat40.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = dateFormat0.format((java.lang.Object) "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 07:00:00 ICT 1970");
// flaky "86) test3162(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u0e21\u0e04. 2513 07:00:00" + "'", str18, "\u0e21\u0e04. 2513 07:00:00");
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNull(dateFormat35);
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat38);
        org.junit.Assert.assertNotNull(dateFormat39);
        org.junit.Assert.assertNotNull(stdDateFormat40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(dateFormat43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        boolean boolean16 = stdDateFormat3.looksLikeISO8601("Thu, 01 Jan 2513 07:00:00 ICT");
        java.util.Calendar calendar17 = null;
        stdDateFormat3.setCalendar(calendar17);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance(0);
        boolean boolean21 = dateFormat20.isLenient();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator26 = dateFormat23.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean27 = dateFormat20.equals((java.lang.Object) dateFormat23);
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        java.util.Calendar calendar30 = dateFormat28.getCalendar();
        dateFormat23.setCalendar(calendar30);
        stdDateFormat3._formatPlain = dateFormat23;
        java.text.NumberFormat numberFormat33 = stdDateFormat3.getNumberFormat();
        java.util.TimeZone timeZone34 = null;
        // The following exception was thrown during execution in test generation
        try {
            stdDateFormat3.setTimeZone(timeZone34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(attributedCharacterIterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(numberFormat29);
        org.junit.Assert.assertNotNull(calendar30);
// flaky "87) test3163(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar30.toString(), "sun.util.BuddhistCalendar[time=-734064439442,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=558,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat33);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        boolean boolean13 = dateFormat11.equals((java.lang.Object) 1.0f);
        boolean boolean14 = dateFormat11.isLenient();
        java.util.TimeZone timeZone15 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.withTimeZone(timeZone15);
        boolean boolean18 = stdDateFormat16.looksLikeISO8601("yyyy-MM-dd");
        java.lang.String str19 = stdDateFormat16.toString();
        java.text.DateFormat dateFormat20 = stdDateFormat16._formatRFC1123;
        java.text.DateFormat dateFormat21 = stdDateFormat16._formatISO8601;
        java.text.DateFormat dateFormat22 = stdDateFormat16._formatISO8601_z;
        java.text.DateFormat dateFormat23 = stdDateFormat16._formatISO8601_z;
        java.lang.String str25 = stdDateFormat16.format((java.lang.Object) (short) 100);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str19, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNull(dateFormat21);
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertNull(dateFormat23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2513-01-01T07:00:00.100+0700" + "'", str25, "2513-01-01T07:00:00.100+0700");
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatISO8601;
        boolean boolean18 = stdDateFormat3.looksLikeISO8601("10");
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateInstance();
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 1L);
        dateFormat19.setLenient(true);
        boolean boolean24 = dateFormat19.isLenient();
        stdDateFormat3._formatPlain = dateFormat19;
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar27 = dateFormat26.getCalendar();
        java.util.TimeZone timeZone28 = dateFormat26.getTimeZone();
        boolean boolean29 = dateFormat26.isLenient();
        dateFormat26.setLenient(true);
        java.text.NumberFormat numberFormat32 = dateFormat26.getNumberFormat();
        stdDateFormat3.setNumberFormat(numberFormat32);
        java.util.Locale locale34 = stdDateFormat3._locale;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateFormat19);
// flaky "88) test3165(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u0e21\u0e04. 2513" + "'", str21, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(calendar27);
// flaky "47) test3165(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar27.toString(), "sun.util.BuddhistCalendar[time=-734064439425,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=575,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
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
        dateFormat0.setLenient(true);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar2);
// flaky "89) test3166(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=-734064439407,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=593,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(calendar10);
// flaky "48) test3166(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar10.toString(), "sun.util.BuddhistCalendar[time=-734064439407,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=593,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.Locale locale3 = null;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        stdDateFormat4.setNumberFormat(numberFormat6);
        java.lang.String str8 = stdDateFormat4.toString();
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateInstance(0);
        boolean boolean11 = dateFormat10.isLenient();
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator16 = dateFormat13.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean17 = dateFormat10.equals((java.lang.Object) dateFormat13);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        java.util.Calendar calendar20 = dateFormat18.getCalendar();
        dateFormat13.setCalendar(calendar20);
        dateFormat13.setLenient(true);
        stdDateFormat4._formatISO8601_z = dateFormat13;
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar28 = dateFormat27.getCalendar();
        dateFormat25.setCalendar(calendar28);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar32 = dateFormat31.getCalendar();
        java.util.TimeZone timeZone33 = dateFormat31.getTimeZone();
        boolean boolean34 = dateFormat25.equals((java.lang.Object) timeZone33);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat4.withTimeZone(timeZone33);
        java.text.DateFormat dateFormat36 = stdDateFormat4._formatRFC1123;
        java.text.DateFormat dateFormat37 = stdDateFormat4._formatISO8601;
        java.text.DateFormat dateFormat38 = stdDateFormat4._formatISO8601;
        java.text.DateFormat dateFormat39 = stdDateFormat4._formatPlain;
        java.text.DateFormat dateFormat40 = stdDateFormat4._formatPlain;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
// flaky "90) test3167(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=-734064439399,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=601,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)" + "'", str8, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)");
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertNotNull(attributedCharacterIterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertNotNull(calendar20);
// flaky "49) test3167(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar20.toString(), "sun.util.BuddhistCalendar[time=-734064439399,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=601,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(calendar28);
// flaky "23) test3167(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar28.toString(), "sun.util.BuddhistCalendar[time=-734064439399,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=601,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(calendar32);
// flaky "14) test3167(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar32.toString(), "sun.util.BuddhistCalendar[time=-734064439399,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=601,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(stdDateFormat35);
        org.junit.Assert.assertNull(dateFormat36);
        org.junit.Assert.assertNull(dateFormat37);
        org.junit.Assert.assertNull(dateFormat38);
        org.junit.Assert.assertNull(dateFormat39);
        org.junit.Assert.assertNull(dateFormat40);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        boolean boolean14 = stdDateFormat3.equals((java.lang.Object) 5);
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar17 = dateFormat16.getCalendar();
        stdDateFormat3._formatISO8601_z = dateFormat16;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance(0);
        boolean boolean21 = dateFormat20.isLenient();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator26 = dateFormat23.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean27 = dateFormat20.equals((java.lang.Object) dateFormat23);
        java.util.TimeZone timeZone28 = dateFormat23.getTimeZone();
        boolean boolean29 = dateFormat23.isLenient();
        stdDateFormat3._formatISO8601 = dateFormat23;
        java.util.Locale locale31 = stdDateFormat3._locale;
        java.util.TimeZone timeZone32 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator35 = dateFormat33.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone36 = dateFormat33.getTimeZone();
        java.util.Calendar calendar37 = dateFormat33.getCalendar();
        java.util.Calendar calendar38 = dateFormat33.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = stdDateFormat3.format((java.lang.Object) calendar38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "91) test3168(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar17.toString(), "sun.util.BuddhistCalendar[time=-734064439388,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=612,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(attributedCharacterIterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(attributedCharacterIterator35);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar37);
        org.junit.Assert.assertEquals(calendar37.toString(), "sun.util.BuddhistCalendar[time=2,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=2,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "sun.util.BuddhistCalendar[time=2,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=2,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        stdDateFormat3._timezone = timeZone17;
        java.text.DateFormat dateFormat19 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance(0);
        boolean boolean23 = dateFormat22.isLenient();
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator28 = dateFormat25.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean29 = dateFormat22.equals((java.lang.Object) dateFormat25);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar31 = dateFormat30.getCalendar();
        dateFormat25.setCalendar(calendar31);
        stdDateFormat3.setCalendar(calendar31);
        java.util.Calendar calendar34 = stdDateFormat3.getCalendar();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(attributedCharacterIterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(calendar31);
// flaky "92) test3169(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar31.toString(), "sun.util.BuddhistCalendar[time=-734064439377,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=623,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar34);
// flaky "50) test3169(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar34.toString(), "sun.util.BuddhistCalendar[time=-734064439377,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=623,ZONE_OFFSET=25200000,DST_OFFSET=0]");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatPlain;
        java.util.TimeZone timeZone16 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat17 = null;
        stdDateFormat3._formatISO8601 = dateFormat17;
        java.util.TimeZone timeZone19 = stdDateFormat3._timezone;
        java.util.TimeZone timeZone20 = null;
        stdDateFormat3._timezone = timeZone20;
        java.text.DateFormat dateFormat22 = stdDateFormat3._formatISO8601_z;
        // The following exception was thrown during execution in test generation
        try {
            dateFormat22.setLenient(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat22);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone7 = dateFormat6.getTimeZone();
        java.util.Calendar calendar8 = dateFormat6.getCalendar();
        java.text.NumberFormat numberFormat9 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat9);
        stdDateFormat4.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat12 = stdDateFormat4._formatISO8601;
        boolean boolean14 = stdDateFormat4.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.text.DateFormat dateFormat15 = stdDateFormat4._formatISO8601;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar8);
// flaky "93) test3171(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar8.toString(), "sun.util.BuddhistCalendar[time=-734064439351,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=649,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dateFormat15);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        boolean boolean13 = dateFormat11.equals((java.lang.Object) 1.0f);
        boolean boolean14 = dateFormat11.isLenient();
        java.util.TimeZone timeZone15 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.withTimeZone(timeZone15);
        java.util.Locale locale17 = stdDateFormat16._locale;
        boolean boolean19 = stdDateFormat16.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.text.DateFormat dateFormat20 = null;
        stdDateFormat16._formatISO8601 = dateFormat20;
        java.util.TimeZone timeZone22 = stdDateFormat16._timezone;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone22);
// flaky "94) test3172(com.fasterxml.jackson.databind.util.RegressionTest6)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat3.withTimeZone(timeZone17);
        java.text.DateFormat dateFormat19 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatISO8601_z;
        java.lang.String str21 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.util.TimeZone timeZone24 = dateFormat22.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        dateFormat27.setNumberFormat(numberFormat29);
        dateFormat26.setNumberFormat(numberFormat29);
        stdDateFormat25.setNumberFormat(numberFormat29);
        boolean boolean34 = stdDateFormat25.looksLikeISO8601("");
        java.util.TimeZone timeZone35 = stdDateFormat25._timezone;
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        stdDateFormat25._formatRFC1123 = dateFormat36;
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat39 = dateFormat38.getNumberFormat();
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar41 = dateFormat40.getCalendar();
        dateFormat38.setCalendar(calendar41);
        stdDateFormat25._formatPlain = dateFormat38;
        java.text.DateFormat dateFormat44 = stdDateFormat25._formatPlain;
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar46 = dateFormat45.getCalendar();
        java.util.TimeZone timeZone47 = dateFormat45.getTimeZone();
        boolean boolean48 = dateFormat45.isLenient();
        java.util.TimeZone timeZone49 = dateFormat45.getTimeZone();
        stdDateFormat25.setTimeZone(timeZone49);
        java.util.Calendar calendar51 = stdDateFormat25.getCalendar();
        java.lang.StringBuffer stringBuffer52 = null;
        java.text.FieldPosition fieldPosition53 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer54 = stdDateFormat3.format((java.lang.Object) stdDateFormat25, stringBuffer52, fieldPosition53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str21, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(numberFormat29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(dateFormat38);
        org.junit.Assert.assertNotNull(numberFormat39);
        org.junit.Assert.assertNotNull(dateFormat40);
        org.junit.Assert.assertNotNull(calendar41);
// flaky "95) test3173(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar41.toString(), "sun.util.BuddhistCalendar[time=-734064439336,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=664,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat44);
        org.junit.Assert.assertNotNull(dateFormat45);
        org.junit.Assert.assertNotNull(calendar46);
// flaky "51) test3173(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar46.toString(), "sun.util.BuddhistCalendar[time=-734064439336,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=664,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(calendar51);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone7 = dateFormat6.getTimeZone();
        java.util.Calendar calendar8 = dateFormat6.getCalendar();
        java.text.NumberFormat numberFormat9 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat9);
        stdDateFormat4.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat12 = stdDateFormat4._formatISO8601;
        java.text.DateFormat dateFormat13 = stdDateFormat4._formatRFC1123;
        java.lang.String str14 = stdDateFormat4.toString();
        java.lang.String str15 = stdDateFormat4.toString();
        java.text.DateFormat dateFormat16 = stdDateFormat4._formatPlain;
        java.text.ParsePosition parsePosition18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = dateFormat16.parseObject("", parsePosition18);
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
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar8);
// flaky "96) test3174(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar8.toString(), "sun.util.BuddhistCalendar[time=-734064439315,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=685,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNull(dateFormat12);
        org.junit.Assert.assertNull(dateFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat16);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 0, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance(1);
        stdDateFormat3._formatISO8601 = dateFormat17;
        java.lang.Class<?> wildcardClass19 = stdDateFormat3.getClass();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601;
        java.util.TimeZone timeZone15 = stdDateFormat3._timezone;
        java.util.Calendar calendar16 = stdDateFormat3.getCalendar();
        java.util.TimeZone timeZone17 = stdDateFormat3._timezone;
        java.util.TimeZone timeZone18 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat19 = stdDateFormat3._formatISO8601_z;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar20 = dateFormat19.getCalendar();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(calendar16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat19);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat8 = dateFormat7.getNumberFormat();
        dateFormat6.setNumberFormat(numberFormat8);
        dateFormat5.setNumberFormat(numberFormat8);
        stdDateFormat4.setNumberFormat(numberFormat8);
        boolean boolean13 = stdDateFormat4.looksLikeISO8601("");
        java.util.TimeZone timeZone14 = stdDateFormat4._timezone;
        java.lang.String str15 = stdDateFormat4.toString();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone18 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = stdDateFormat4.withTimeZone(timeZone18);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar23 = dateFormat22.getCalendar();
        dateFormat20.setCalendar(calendar23);
        stdDateFormat4.setCalendar(calendar23);
        boolean boolean27 = stdDateFormat4.looksLikeISO8601("10");
        java.util.Locale locale28 = stdDateFormat4._locale;
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance(3, locale28);
        java.text.ParsePosition parsePosition31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = dateFormat29.parseObject("10", parsePosition31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str15, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat19);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(calendar23);
// flaky "97) test3178(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar23.toString(), "sun.util.BuddhistCalendar[time=-734064439237,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=763,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat29);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        boolean boolean14 = stdDateFormat3.equals((java.lang.Object) 5);
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatPlain;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dateFormat15);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 1);
        dateFormat1.setLenient(true);
        dateFormat1.setLenient(true);
        java.util.Calendar calendar6 = dateFormat1.getCalendar();
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone9 = dateFormat8.getTimeZone();
        java.util.Calendar calendar10 = dateFormat8.getCalendar();
        java.text.NumberFormat numberFormat11 = dateFormat8.getNumberFormat();
        dateFormat7.setNumberFormat(numberFormat11);
        boolean boolean13 = dateFormat7.isLenient();
        java.util.Calendar calendar14 = dateFormat7.getCalendar();
        java.text.NumberFormat numberFormat15 = dateFormat7.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat15);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(calendar6);
// flaky "98) test3180(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar6.toString(), "sun.util.BuddhistCalendar[time=-734064439205,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=795,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar10);
// flaky "52) test3180(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar10.toString(), "sun.util.BuddhistCalendar[time=-734064439205,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=795,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(calendar14);
// flaky "24) test3180(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar14.toString(), "sun.util.BuddhistCalendar[time=-734064439205,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=795,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat15);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat14 = null;
        stdDateFormat3._formatPlain = dateFormat14;
        java.util.TimeZone timeZone16 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat17 = stdDateFormat3._formatPlain;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = dateFormat17.parseObject("2513-01-01T07:00:00.010+0700");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat17);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(12, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601;
        java.util.TimeZone timeZone15 = stdDateFormat3._timezone;
        java.util.Calendar calendar16 = stdDateFormat3.getCalendar();
        java.util.TimeZone timeZone17 = stdDateFormat3._timezone;
        java.util.TimeZone timeZone18 = stdDateFormat3._timezone;
        boolean boolean20 = stdDateFormat3.looksLikeISO8601("");
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        java.util.TimeZone timeZone23 = dateFormat21.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23);
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        dateFormat26.setNumberFormat(numberFormat28);
        dateFormat25.setNumberFormat(numberFormat28);
        stdDateFormat24.setNumberFormat(numberFormat28);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance();
        boolean boolean34 = dateFormat32.equals((java.lang.Object) 1.0f);
        boolean boolean35 = dateFormat32.isLenient();
        java.util.TimeZone timeZone36 = dateFormat32.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = stdDateFormat24.withTimeZone(timeZone36);
        java.util.Calendar calendar38 = null;
        stdDateFormat24.setCalendar(calendar38);
        java.text.DateFormat dateFormat40 = stdDateFormat24._formatPlain;
        java.util.Date date42 = stdDateFormat24.parse("10");
        java.lang.StringBuffer stringBuffer43 = null;
        java.text.FieldPosition fieldPosition44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer45 = stdDateFormat3.format(date42, stringBuffer43, fieldPosition44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(calendar16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat37);
        org.junit.Assert.assertNull(dateFormat40);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat17 = stdDateFormat3._formatISO8601_z;
        java.lang.String str18 = stdDateFormat3.toString();
        java.util.Locale locale19 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance(0);
        boolean boolean23 = dateFormat22.isLenient();
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat25);
        java.util.Calendar calendar27 = dateFormat22.getCalendar();
        boolean boolean28 = dateFormat22.isLenient();
        stdDateFormat3._formatISO8601_z = dateFormat22;
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone31 = dateFormat30.getTimeZone();
        java.util.TimeZone timeZone32 = dateFormat30.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone32);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat37 = dateFormat36.getNumberFormat();
        dateFormat35.setNumberFormat(numberFormat37);
        dateFormat34.setNumberFormat(numberFormat37);
        stdDateFormat33.setNumberFormat(numberFormat37);
        boolean boolean42 = stdDateFormat33.looksLikeISO8601("");
        java.util.TimeZone timeZone43 = stdDateFormat33._timezone;
        java.lang.String str44 = stdDateFormat33.toString();
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone47 = dateFormat46.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat48 = stdDateFormat33.withTimeZone(timeZone47);
        java.text.DateFormat dateFormat49 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat51 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar52 = dateFormat51.getCalendar();
        dateFormat49.setCalendar(calendar52);
        stdDateFormat33.setCalendar(calendar52);
        java.util.Locale locale55 = stdDateFormat33._locale;
        java.util.TimeZone timeZone56 = stdDateFormat33.getTimeZone();
        java.lang.StringBuffer stringBuffer57 = null;
        java.text.FieldPosition fieldPosition58 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer59 = dateFormat22.format((java.lang.Object) timeZone56, stringBuffer57, fieldPosition58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str18, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertNotNull(calendar27);
// flaky "99) test3186(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar27.toString(), "sun.util.BuddhistCalendar[time=-734064439145,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=855,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(dateFormat35);
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(numberFormat37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str44, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat46);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat48);
        org.junit.Assert.assertNotNull(dateFormat49);
        org.junit.Assert.assertNotNull(dateFormat51);
        org.junit.Assert.assertNotNull(calendar52);
// flaky "53) test3186(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar52.toString(), "sun.util.BuddhistCalendar[time=-734064439145,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=855,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone56);
        org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.Locale locale13 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        boolean boolean16 = dateFormat15.isLenient();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat18);
        java.util.TimeZone timeZone20 = dateFormat15.getTimeZone();
        stdDateFormat3.setTimeZone(timeZone20);
        java.text.ParsePosition parsePosition23 = null;
        java.util.Date date24 = stdDateFormat3.parse("10", parsePosition23);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone26 = dateFormat25.getTimeZone();
        java.util.TimeZone timeZone27 = dateFormat25.getTimeZone();
        stdDateFormat3._formatRFC1123 = dateFormat25;
        java.text.DateFormat dateFormat29 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat30 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat31 = stdDateFormat3._formatISO8601_z;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat29);
        org.junit.Assert.assertNull(dateFormat30);
        org.junit.Assert.assertNull(dateFormat31);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.lang.String str11 = stdDateFormat3.toString();
        java.lang.String str12 = stdDateFormat3.toString();
        java.text.NumberFormat numberFormat13 = stdDateFormat3.getNumberFormat();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str11, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str12, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(numberFormat13);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat17 = stdDateFormat3._formatPlain;
        java.lang.String str18 = stdDateFormat3.toString();
        java.text.ParsePosition parsePosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = stdDateFormat3.parse("", parsePosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str18, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.Locale locale13 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        boolean boolean16 = dateFormat15.isLenient();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat18);
        java.util.TimeZone timeZone20 = dateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = stdDateFormat3.withTimeZone(timeZone20);
        java.text.DateFormat dateFormat22 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone24 = dateFormat23.getTimeZone();
        java.util.TimeZone timeZone25 = dateFormat23.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone25);
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        dateFormat28.setNumberFormat(numberFormat30);
        dateFormat27.setNumberFormat(numberFormat30);
        stdDateFormat26.setNumberFormat(numberFormat30);
        boolean boolean35 = stdDateFormat26.looksLikeISO8601("");
        java.util.TimeZone timeZone36 = stdDateFormat26._timezone;
        java.text.DateFormat dateFormat37 = null;
        stdDateFormat26._formatPlain = dateFormat37;
        java.util.Date date40 = stdDateFormat26.parse("10");
        java.lang.StringBuffer stringBuffer41 = null;
        java.text.FieldPosition fieldPosition42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer43 = stdDateFormat3.format(date40, stringBuffer41, fieldPosition42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat21);
        org.junit.Assert.assertNull(dateFormat22);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(numberFormat30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatPlain;
        java.util.TimeZone timeZone16 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat17 = null;
        stdDateFormat3._formatISO8601 = dateFormat17;
        java.text.ParsePosition parsePosition20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = stdDateFormat3.parse("", parsePosition20);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        boolean boolean13 = dateFormat11.equals((java.lang.Object) 1.0f);
        boolean boolean14 = dateFormat11.isLenient();
        java.util.TimeZone timeZone15 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.withTimeZone(timeZone15);
        java.util.Calendar calendar17 = null;
        stdDateFormat3.setCalendar(calendar17);
        java.text.DateFormat dateFormat19 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        dateFormat20.setNumberFormat(numberFormat22);
        stdDateFormat3._formatRFC1123 = dateFormat20;
        java.text.ParsePosition parsePosition26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = stdDateFormat3.parse("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513", parsePosition26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(numberFormat22);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        dateFormat0.setLenient(true);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        boolean boolean7 = dateFormat6.isLenient();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        dateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = dateFormat6.getTimeZone();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.util.TimeZone timeZone14 = dateFormat12.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone14);
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        dateFormat16.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        boolean boolean24 = stdDateFormat15.looksLikeISO8601("");
        java.text.ParsePosition parsePosition26 = null;
        java.util.Date date27 = stdDateFormat15.parse("10", parsePosition26);
        java.lang.String str28 = dateFormat6.format(date27);
        java.lang.String str29 = dateFormat0.format(date27);
        java.text.ParsePosition parsePosition31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = dateFormat0.parseObject("Thu, 01 Jan 2513 00:00:00 GMT", parsePosition31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 07:00:00 ICT 1970");
// flaky "100) test3193(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513" + "'", str28, "\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513");
// flaky "54) test3193(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u0e21\u0e04. 2513 07:00:00" + "'", str29, "\u0e21\u0e04. 2513 07:00:00");
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = dateFormat0.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(attributedCharacterIterator2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "sun.util.BuddhistCalendar[time=2,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=2,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance();
        boolean boolean13 = dateFormat11.equals((java.lang.Object) 1.0f);
        boolean boolean14 = dateFormat11.isLenient();
        java.util.TimeZone timeZone15 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.withTimeZone(timeZone15);
        java.text.ParsePosition parsePosition18 = null;
        java.lang.Object obj19 = stdDateFormat16.parseObject("10", parsePosition18);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance();
        java.lang.String str22 = dateFormat20.format((java.lang.Object) 1L);
        dateFormat20.setLenient(true);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance(0);
        boolean boolean27 = dateFormat26.isLenient();
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator32 = dateFormat29.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean33 = dateFormat26.equals((java.lang.Object) dateFormat29);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat35 = dateFormat34.getNumberFormat();
        java.util.Calendar calendar36 = dateFormat34.getCalendar();
        dateFormat29.setCalendar(calendar36);
        dateFormat29.setLenient(true);
        boolean boolean40 = dateFormat20.equals((java.lang.Object) dateFormat29);
        java.util.TimeZone timeZone41 = dateFormat29.getTimeZone();
        stdDateFormat16.setTimeZone(timeZone41);
        java.text.DateFormat dateFormat43 = stdDateFormat16._formatISO8601;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date45 = null; // flaky "101) test3195(com.fasterxml.jackson.databind.util.RegressionTest6)": stdDateFormat16.parse("\u0e21\u0e04. 2513 07:00:00");
// flaky "55) test3195(com.fasterxml.jackson.databind.util.RegressionTest6)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat20);
// flaky "25) test3195(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u0e21\u0e04. 2513" + "'", str22, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(attributedCharacterIterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertNotNull(calendar36);
// flaky "15) test3195(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar36.toString(), "sun.util.BuddhistCalendar[time=-734064439046,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=954,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat43);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat14 = null;
        stdDateFormat3._formatPlain = dateFormat14;
        java.text.NumberFormat numberFormat16 = stdDateFormat3.getNumberFormat();
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.util.Calendar calendar18 = dateFormat17.getCalendar();
        stdDateFormat3.setCalendar(calendar18);
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar22 = dateFormat21.getCalendar();
        java.util.TimeZone timeZone23 = dateFormat21.getTimeZone();
        boolean boolean24 = dateFormat21.isLenient();
        java.util.TimeZone timeZone25 = dateFormat21.getTimeZone();
        java.util.TimeZone timeZone26 = dateFormat21.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = stdDateFormat3.withTimeZone(timeZone26);
        java.util.Locale locale28 = stdDateFormat27._locale;
        java.util.Calendar calendar29 = stdDateFormat27.getCalendar();
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone31 = dateFormat30.getTimeZone();
        java.util.TimeZone timeZone32 = dateFormat30.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone32);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat37 = dateFormat36.getNumberFormat();
        dateFormat35.setNumberFormat(numberFormat37);
        dateFormat34.setNumberFormat(numberFormat37);
        stdDateFormat33.setNumberFormat(numberFormat37);
        boolean boolean42 = stdDateFormat33.looksLikeISO8601("");
        java.util.TimeZone timeZone43 = stdDateFormat33._timezone;
        java.lang.String str44 = stdDateFormat33.toString();
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone47 = dateFormat46.getTimeZone();
        stdDateFormat33._timezone = timeZone47;
        java.text.DateFormat dateFormat49 = stdDateFormat33._formatRFC1123;
        java.text.DateFormat dateFormat50 = stdDateFormat33._formatRFC1123;
        java.text.DateFormat dateFormat52 = java.text.DateFormat.getDateInstance(0);
        boolean boolean53 = dateFormat52.isLenient();
        java.text.DateFormat dateFormat55 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat57 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator58 = dateFormat55.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean59 = dateFormat52.equals((java.lang.Object) dateFormat55);
        java.text.DateFormat dateFormat60 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar61 = dateFormat60.getCalendar();
        dateFormat55.setCalendar(calendar61);
        stdDateFormat33.setCalendar(calendar61);
        java.text.DateFormat dateFormat64 = stdDateFormat33._formatISO8601;
        java.util.TimeZone timeZone65 = stdDateFormat33.getTimeZone();
        stdDateFormat27._timezone = timeZone65;
        java.text.ParsePosition parsePosition68 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date69 = stdDateFormat27.parseAsRFC1123("2513-01-01T00:00:00.000+0700", parsePosition68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(calendar18);
// flaky "102) test3197(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar18.toString(), "sun.util.BuddhistCalendar[time=-734064439959,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=41,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(dateFormat20);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(calendar22);
// flaky "56) test3197(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar22.toString(), "sun.util.BuddhistCalendar[time=-734064439010,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=990,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(calendar29);
// flaky "26) test3197(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar29.toString(), "sun.util.BuddhistCalendar[time=-734064439959,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=41,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(dateFormat35);
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(numberFormat37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str44, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat46);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat49);
        org.junit.Assert.assertNull(dateFormat50);
        org.junit.Assert.assertNotNull(dateFormat52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(dateFormat55);
        org.junit.Assert.assertNotNull(dateFormat57);
        org.junit.Assert.assertNotNull(attributedCharacterIterator58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(dateFormat60);
        org.junit.Assert.assertNotNull(calendar61);
// flaky "16) test3197(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar61.toString(), "sun.util.BuddhistCalendar[time=-734064439010,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=990,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(dateFormat64);
        org.junit.Assert.assertNotNull(timeZone65);
        org.junit.Assert.assertEquals(timeZone65.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat8 = dateFormat7.getNumberFormat();
        dateFormat6.setNumberFormat(numberFormat8);
        dateFormat5.setNumberFormat(numberFormat8);
        stdDateFormat4.setNumberFormat(numberFormat8);
        boolean boolean13 = stdDateFormat4.looksLikeISO8601("");
        java.util.TimeZone timeZone14 = stdDateFormat4._timezone;
        java.text.DateFormat dateFormat15 = null;
        stdDateFormat4._formatPlain = dateFormat15;
        java.text.NumberFormat numberFormat17 = stdDateFormat4.getNumberFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar19 = dateFormat18.getCalendar();
        java.util.TimeZone timeZone20 = dateFormat18.getTimeZone();
        stdDateFormat4._formatISO8601_z = dateFormat18;
        java.util.TimeZone timeZone22 = stdDateFormat4._timezone;
        java.util.Locale locale23 = stdDateFormat4._locale;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance(9, locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(numberFormat8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertNotNull(dateFormat18);
        org.junit.Assert.assertNotNull(calendar19);
// flaky "103) test3198(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar19.toString(), "sun.util.BuddhistCalendar[time=-734064438983,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=41,MILLISECOND=17,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar17 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone18 = dateFormat16.getTimeZone();
        boolean boolean19 = dateFormat16.isLenient();
        stdDateFormat3._formatPlain = dateFormat16;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance();
        java.lang.String str23 = dateFormat21.format((java.lang.Object) 1L);
        dateFormat21.setLenient(true);
        stdDateFormat3._formatRFC1123 = dateFormat21;
        java.util.TimeZone timeZone27 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat28 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance(0);
        boolean boolean31 = dateFormat30.isLenient();
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator36 = dateFormat33.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean37 = dateFormat30.equals((java.lang.Object) dateFormat33);
        java.util.TimeZone timeZone38 = dateFormat33.getTimeZone();
        java.util.TimeZone timeZone39 = dateFormat33.getTimeZone();
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateInstance();
        java.lang.String str42 = dateFormat40.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone43 = dateFormat40.getTimeZone();
        boolean boolean44 = dateFormat40.isLenient();
        java.text.NumberFormat numberFormat45 = dateFormat40.getNumberFormat();
        dateFormat33.setNumberFormat(numberFormat45);
        stdDateFormat3.setNumberFormat(numberFormat45);
        java.text.DateFormat dateFormat48 = stdDateFormat3._formatPlain;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "104) test3199(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar17.toString(), "sun.util.BuddhistCalendar[time=-734064438974,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=41,MILLISECOND=26,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateFormat21);
// flaky "57) test3199(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u0e21\u0e04. 2513" + "'", str23, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(dateFormat35);
        org.junit.Assert.assertNotNull(attributedCharacterIterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat40);
// flaky "27) test3199(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u0e21\u0e04. 2513" + "'", str42, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone43);
        org.junit.Assert.assertEquals(timeZone43.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(numberFormat45);
        org.junit.Assert.assertNotNull(dateFormat48);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar17 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone18 = dateFormat16.getTimeZone();
        boolean boolean19 = dateFormat16.isLenient();
        stdDateFormat3._formatPlain = dateFormat16;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance();
        java.lang.String str23 = dateFormat21.format((java.lang.Object) 1L);
        dateFormat21.setLenient(true);
        stdDateFormat3._formatRFC1123 = dateFormat21;
        java.util.TimeZone timeZone27 = stdDateFormat3._timezone;
        java.lang.String str28 = stdDateFormat3.toString();
        java.util.Locale locale29 = stdDateFormat3._locale;
        java.util.Date date31 = stdDateFormat3.parse("10");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date33 = stdDateFormat3.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Can not parse date \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\": not compatible with any of standard forms (\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\", \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\", \"EEE, dd MMM yyyy HH:mm:ss zzz\", \"yyyy-MM-dd\")");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "105) test3200(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar17.toString(), "sun.util.BuddhistCalendar[time=-734064438957,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=41,MILLISECOND=43,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateFormat21);
// flaky "58) test3200(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u0e21\u0e04. 2513" + "'", str23, "\u0e21\u0e04. 2513");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str28, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 07:00:00 ICT 1970");
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.TimeZone timeZone13 = stdDateFormat3._timezone;
        java.lang.String str14 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat3.withTimeZone(timeZone17);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar22 = dateFormat21.getCalendar();
        dateFormat19.setCalendar(calendar22);
        stdDateFormat3.setCalendar(calendar22);
        boolean boolean26 = stdDateFormat3.looksLikeISO8601("10");
        stdDateFormat3.setLenient(false);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone30 = dateFormat29.getTimeZone();
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone30);
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone30);
        java.util.Calendar calendar33 = dateFormat32.getCalendar();
        stdDateFormat3._formatISO8601_z = dateFormat32;
        java.util.Calendar calendar35 = stdDateFormat3.getCalendar();
        java.text.DateFormat dateFormat36 = stdDateFormat3._formatPlain;
        java.util.TimeZone timeZone37 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat38 = stdDateFormat3._formatPlain;
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str14, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(stdDateFormat18);
        org.junit.Assert.assertNotNull(dateFormat19);
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(calendar22);
// flaky "106) test3201(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar22.toString(), "sun.util.BuddhistCalendar[time=-734064438948,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=41,MILLISECOND=52,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(calendar33);
// flaky "59) test3201(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar33.toString(), "sun.util.BuddhistCalendar[time=-734064439959,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=40,MILLISECOND=41,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar35);
// flaky "28) test3201(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar35.toString(), "sun.util.BuddhistCalendar[time=-734064438948,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=41,MILLISECOND=52,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(dateFormat36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat38);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.util.Locale locale13 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        boolean boolean16 = dateFormat15.isLenient();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat18);
        java.util.TimeZone timeZone20 = dateFormat15.getTimeZone();
        stdDateFormat3.setTimeZone(timeZone20);
        java.text.ParsePosition parsePosition23 = null;
        java.util.Date date24 = stdDateFormat3.parse("10", parsePosition23);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar28 = dateFormat27.getCalendar();
        dateFormat25.setCalendar(calendar28);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar32 = dateFormat31.getCalendar();
        java.util.TimeZone timeZone33 = dateFormat31.getTimeZone();
        boolean boolean34 = dateFormat25.equals((java.lang.Object) timeZone33);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat3.withTimeZone(timeZone33);
        java.util.TimeZone timeZone36 = stdDateFormat35._timezone;
        java.text.DateFormat dateFormat37 = stdDateFormat35._formatPlain;
        java.text.DateFormat dateFormat38 = stdDateFormat35._formatISO8601_z;
        java.text.DateFormat dateFormat39 = stdDateFormat35._formatISO8601_z;
        // The following exception was thrown during execution in test generation
        try {
            java.util.TimeZone timeZone40 = dateFormat39.getTimeZone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 07:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(calendar28);
// flaky "107) test3202(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar28.toString(), "sun.util.BuddhistCalendar[time=-734064438923,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=41,MILLISECOND=77,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat31);
        org.junit.Assert.assertNotNull(calendar32);
// flaky "60) test3202(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar32.toString(), "sun.util.BuddhistCalendar[time=-734064438923,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=41,MILLISECOND=77,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(stdDateFormat35);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNull(dateFormat37);
        org.junit.Assert.assertNull(dateFormat38);
        org.junit.Assert.assertNull(dateFormat39);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        boolean boolean12 = stdDateFormat3.looksLikeISO8601("");
        java.lang.String str13 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat14 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat17 = stdDateFormat3._formatISO8601_z;
        java.lang.String str18 = stdDateFormat3.toString();
        java.lang.String str19 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone21 = dateFormat20.getTimeZone();
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21);
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21);
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21);
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone28 = dateFormat27.getTimeZone();
        java.util.Calendar calendar29 = dateFormat27.getCalendar();
        java.text.NumberFormat numberFormat30 = dateFormat27.getNumberFormat();
        dateFormat26.setNumberFormat(numberFormat30);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone33 = dateFormat32.getTimeZone();
        boolean boolean34 = dateFormat32.isLenient();
        boolean boolean35 = dateFormat32.isLenient();
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat37 = dateFormat36.getNumberFormat();
        dateFormat32.setNumberFormat(numberFormat37);
        dateFormat26.setNumberFormat(numberFormat37);
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar41 = dateFormat40.getCalendar();
        java.util.TimeZone timeZone42 = dateFormat40.getTimeZone();
        boolean boolean43 = dateFormat40.isLenient();
        java.util.TimeZone timeZone44 = dateFormat40.getTimeZone();
        java.util.TimeZone timeZone45 = dateFormat40.getTimeZone();
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone47 = dateFormat46.getTimeZone();
        java.util.TimeZone timeZone48 = dateFormat46.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat49 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone48);
        java.text.DateFormat dateFormat50 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat51 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat52 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat53 = dateFormat52.getNumberFormat();
        dateFormat51.setNumberFormat(numberFormat53);
        dateFormat50.setNumberFormat(numberFormat53);
        stdDateFormat49.setNumberFormat(numberFormat53);
        boolean boolean58 = stdDateFormat49.looksLikeISO8601("");
        java.text.ParsePosition parsePosition60 = null;
        java.util.Date date61 = stdDateFormat49.parse("10", parsePosition60);
        java.lang.String str62 = dateFormat40.format(date61);
        java.lang.String str63 = dateFormat26.format(date61);
        java.lang.String str64 = dateFormat25.format(date61);
        java.lang.StringBuffer stringBuffer65 = null;
        java.text.FieldPosition fieldPosition66 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer67 = stdDateFormat3.format(date61, stringBuffer65, fieldPosition66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str13, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNull(dateFormat14);
        org.junit.Assert.assertNull(dateFormat15);
        org.junit.Assert.assertNull(dateFormat16);
        org.junit.Assert.assertNull(dateFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str18, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)" + "'", str19, "DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertNotNull(dateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat22);
        org.junit.Assert.assertNotNull(dateFormat23);
        org.junit.Assert.assertNotNull(dateFormat24);
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(calendar29);
// flaky "108) test3203(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals(calendar29.toString(), "sun.util.BuddhistCalendar[time=-734064438913,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2489,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=28,DAY_OF_YEAR=271,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=12,SECOND=41,MILLISECOND=87,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat30);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(numberFormat37);
        org.junit.Assert.assertNotNull(dateFormat40);
        org.junit.Assert.assertNotNull(calendar41);
        org.junit.Assert.assertEquals(calendar41.toString(), "sun.util.BuddhistCalendar[time=10,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2513,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=0,SECOND=0,MILLISECOND=10,ZONE_OFFSET=25200000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat46);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        org.junit.Assert.assertNotNull(dateFormat50);
        org.junit.Assert.assertNotNull(dateFormat51);
        org.junit.Assert.assertNotNull(dateFormat52);
        org.junit.Assert.assertNotNull(numberFormat53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 07:00:00 ICT 1970");
// flaky "61) test3203(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\u0e21\u0e04. 2513 07:00:00" + "'", str62, "\u0e21\u0e04. 2513 07:00:00");
// flaky "29) test3203(com.fasterxml.jackson.databind.util.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\u0e21\u0e04. 2513 07:00:00" + "'", str63, "\u0e21\u0e04. 2513 07:00:00");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "2513-01-01T07:00:00.010+0700" + "'", str64, "2513-01-01T07:00:00.010+0700");
    }
}
