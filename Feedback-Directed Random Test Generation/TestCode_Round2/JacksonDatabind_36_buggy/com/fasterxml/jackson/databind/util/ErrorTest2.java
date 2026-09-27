package com.fasterxml.jackson.databind.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
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
        java.lang.Boolean boolean18 = stdDateFormat0._lenient;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean26 = stdDateFormat19.isLenient();
        boolean boolean27 = stdDateFormat19.isLenient();
        java.lang.Boolean boolean28 = stdDateFormat19._lenient;
        boolean boolean30 = stdDateFormat19.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance();
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        dateFormat32.setNumberFormat(numberFormat34);
        dateFormat31.setNumberFormat(numberFormat34);
        stdDateFormat19._formatPlain = dateFormat31;
        stdDateFormat0._formatPlain = dateFormat31;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat19.", stdDateFormat0.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat0));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
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
        java.text.NumberFormat numberFormat14 = stdDateFormat0.getNumberFormat();
        java.util.TimeZone timeZone15 = stdDateFormat0._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean23 = stdDateFormat16.isLenient();
        boolean boolean25 = stdDateFormat16.looksLikeISO8601("");
        java.lang.String str26 = stdDateFormat16.toString();
        boolean boolean28 = stdDateFormat16.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone29 = stdDateFormat16.getTimeZone();
        java.util.TimeZone timeZone30 = stdDateFormat16.getTimeZone();
        boolean boolean31 = stdDateFormat16.isLenient();
        java.util.TimeZone timeZone32 = stdDateFormat16._timezone;
        java.util.Locale locale33 = stdDateFormat16._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone15, locale33);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
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
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatISO8601;
        java.lang.Boolean boolean16 = stdDateFormat0._lenient;
        java.util.TimeZone timeZone17 = stdDateFormat0._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat0.setLenient(false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.DateFormat dateFormat10 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        stdDateFormat11.setNumberFormat(numberFormat15);
        boolean boolean18 = stdDateFormat11.isLenient();
        java.text.DateFormat dateFormat19 = stdDateFormat11._formatISO8601;
        java.util.TimeZone timeZone20 = stdDateFormat11.getTimeZone();
        boolean boolean22 = stdDateFormat11.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        boolean boolean24 = stdDateFormat11.looksLikeISO8601("0");
        java.text.NumberFormat numberFormat25 = stdDateFormat11.getNumberFormat();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        dateFormat28.setNumberFormat(numberFormat30);
        stdDateFormat26.setNumberFormat(numberFormat30);
        boolean boolean34 = stdDateFormat26.looksLikeISO8601("hi!");
        java.lang.String str35 = stdDateFormat26.toString();
        java.util.Locale locale36 = stdDateFormat26._locale;
        java.text.DateFormat dateFormat37 = stdDateFormat26._formatPlain;
        java.util.Locale locale38 = stdDateFormat26._locale;
        stdDateFormat26._lenient = false;
        java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat43 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat44 = dateFormat43.getNumberFormat();
        dateFormat42.setNumberFormat(numberFormat44);
        java.text.DateFormat dateFormat46 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat47 = dateFormat46.getNumberFormat();
        java.util.Calendar calendar48 = dateFormat46.getCalendar();
        dateFormat42.setCalendar(calendar48);
        dateFormat41.setCalendar(calendar48);
        stdDateFormat26.setCalendar(calendar48);
        stdDateFormat11.setCalendar(calendar48);
        java.util.Locale locale53 = stdDateFormat11._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat54 = stdDateFormat0.withLocale(locale53);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat54 and stdDateFormat11.", stdDateFormat54.equals(stdDateFormat11) == stdDateFormat11.equals(stdDateFormat54));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
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
        stdDateFormat0._lenient = false;
        java.lang.String str15 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance((int) (short) 1);
        dateFormat17.setLenient(true);
        stdDateFormat0._formatISO8601 = dateFormat17;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        dateFormat23.setNumberFormat(numberFormat25);
        stdDateFormat21.setNumberFormat(numberFormat25);
        boolean boolean28 = stdDateFormat21.isLenient();
        java.text.DateFormat dateFormat29 = stdDateFormat21._formatISO8601;
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        java.util.Calendar calendar32 = dateFormat30.getCalendar();
        stdDateFormat21.setCalendar(calendar32);
        java.util.Calendar calendar34 = stdDateFormat21.getCalendar();
        boolean boolean35 = stdDateFormat21.isLenient();
        boolean boolean37 = stdDateFormat21.looksLikeISO8601("");
        stdDateFormat21._lenient = true;
        java.util.Calendar calendar40 = stdDateFormat21.getCalendar();
        dateFormat17.setCalendar(calendar40);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat21.", stdDateFormat0.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat0));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
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
        java.util.TimeZone timeZone15 = stdDateFormat0._timezone;
        java.text.DateFormat dateFormat16 = stdDateFormat0._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean24 = stdDateFormat17.isLenient();
        boolean boolean26 = stdDateFormat17.looksLikeISO8601("");
        stdDateFormat17._clearFormats();
        java.text.DateFormat dateFormat28 = stdDateFormat17._formatPlain;
        java.util.TimeZone timeZone29 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone29);
        stdDateFormat17._timezone = timeZone29;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateTimeInstance();
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        stdDateFormat17._formatISO8601 = dateFormat32;
        stdDateFormat0._formatISO8601 = stdDateFormat17;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
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
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        boolean boolean22 = stdDateFormat15.isLenient();
        boolean boolean24 = stdDateFormat15.looksLikeISO8601("");
        stdDateFormat15._clearFormats();
        java.text.DateFormat dateFormat26 = stdDateFormat15._formatISO8601;
        java.util.TimeZone timeZone27 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone27);
        stdDateFormat15.setTimeZone(timeZone27);
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone27);
        stdDateFormat0.setTimeZone(timeZone27);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat15.", stdDateFormat0.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
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
        boolean boolean13 = stdDateFormat0.isLenient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date15 = stdDateFormat0.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
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
        java.util.Calendar calendar18 = stdDateFormat0.getCalendar();
        stdDateFormat0._lenient = false;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        dateFormat23.setNumberFormat(numberFormat25);
        stdDateFormat21.setNumberFormat(numberFormat25);
        boolean boolean28 = stdDateFormat21.isLenient();
        boolean boolean30 = stdDateFormat21.looksLikeISO8601("");
        java.lang.String str31 = stdDateFormat21.toString();
        boolean boolean33 = stdDateFormat21.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone34 = stdDateFormat21.getTimeZone();
        java.util.Locale locale35 = stdDateFormat21._locale;
        java.util.Locale locale36 = stdDateFormat21._locale;
        java.util.Locale locale37 = stdDateFormat21._locale;
        stdDateFormat21._clearFormats();
        stdDateFormat0._formatISO8601_z = stdDateFormat21;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat21.", stdDateFormat0.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat0));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
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
        stdDateFormat0._lenient = true;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        stdDateFormat18.setNumberFormat(numberFormat20);
        java.text.DateFormat dateFormat22 = stdDateFormat18._formatISO8601;
        java.util.Locale locale23 = stdDateFormat18._locale;
        java.util.TimeZone timeZone24 = stdDateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = stdDateFormat0.withTimeZone(timeZone24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat18.", stdDateFormat0.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat0));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
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
        java.util.Locale locale13 = stdDateFormat0._locale;
        java.util.TimeZone timeZone14 = stdDateFormat0._timezone;
        java.util.TimeZone timeZone15 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean23 = stdDateFormat16.isLenient();
        boolean boolean25 = stdDateFormat16.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance();
        stdDateFormat16._formatPlain = dateFormat26;
        java.text.DateFormat dateFormat28 = stdDateFormat16._formatISO8601_z;
        java.text.DateFormat dateFormat29 = stdDateFormat16._formatPlain;
        java.util.TimeZone timeZone30 = stdDateFormat16.getTimeZone();
        java.util.TimeZone timeZone31 = stdDateFormat16.getTimeZone();
        stdDateFormat0._formatPlain = stdDateFormat16;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat15, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat15.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
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
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean24 = stdDateFormat17.isLenient();
        java.text.DateFormat dateFormat25 = stdDateFormat17._formatISO8601;
        stdDateFormat17._clearFormats();
        stdDateFormat17._clearFormats();
        java.lang.String str28 = stdDateFormat17.toString();
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        boolean boolean32 = dateFormat30.equals((java.lang.Object) "yyyy-MM-dd");
        stdDateFormat17._formatRFC1123 = dateFormat30;
        java.text.NumberFormat numberFormat34 = dateFormat30.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601_z;
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateTimeInstance();
        dateFormat10.setLenient(false);
        dateFormat10.setLenient(false);
        boolean boolean15 = stdDateFormat0.equals((java.lang.Object) false);
        java.util.Locale locale16 = stdDateFormat0._locale;
        java.lang.String str17 = stdDateFormat0.toString();
        java.util.Calendar calendar18 = stdDateFormat0.getCalendar();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean26 = stdDateFormat19.isLenient();
        java.util.TimeZone timeZone27 = stdDateFormat19._timezone;
        boolean boolean29 = stdDateFormat19.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.text.NumberFormat numberFormat30 = stdDateFormat19.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat19.", stdDateFormat0.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat0));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
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
        java.util.Locale locale12 = stdDateFormat0._locale;
        java.util.Locale locale13 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        stdDateFormat16.setNumberFormat(numberFormat18);
        java.text.DateFormat dateFormat20 = stdDateFormat16._formatISO8601;
        java.util.Calendar calendar21 = dateFormat20.getCalendar();
        stdDateFormat0._formatRFC1123 = dateFormat20;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
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
        stdDateFormat0._lenient = false;
        java.text.DateFormat dateFormat17 = stdDateFormat0._formatRFC1123;
        stdDateFormat0._clearFormats();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean26 = stdDateFormat19.isLenient();
        boolean boolean28 = stdDateFormat19.looksLikeISO8601("");
        boolean boolean29 = stdDateFormat19.isLenient();
        java.lang.Boolean boolean30 = stdDateFormat19._lenient;
        boolean boolean32 = stdDateFormat19.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.text.DateFormat dateFormat33 = stdDateFormat19._formatPlain;
        stdDateFormat19._lenient = false;
        stdDateFormat0._formatPlain = stdDateFormat19;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat19.", stdDateFormat0.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat0));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean26 = stdDateFormat19.isLenient();
        boolean boolean28 = stdDateFormat19.looksLikeISO8601("");
        stdDateFormat19._clearFormats();
        java.text.DateFormat dateFormat30 = stdDateFormat19._formatISO8601;
        boolean boolean31 = stdDateFormat19.isLenient();
        java.util.Locale locale32 = stdDateFormat19._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone18, locale32);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
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
        stdDateFormat0._clearFormats();
        boolean boolean15 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean23 = stdDateFormat16.isLenient();
        boolean boolean25 = stdDateFormat16.looksLikeISO8601("");
        stdDateFormat16._clearFormats();
        java.text.DateFormat dateFormat27 = stdDateFormat16._formatISO8601;
        java.util.TimeZone timeZone28 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone28);
        stdDateFormat16.setTimeZone(timeZone28);
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone28);
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone28);
        stdDateFormat0.setTimeZone(timeZone28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
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
        boolean boolean12 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat17);
        stdDateFormat13.setNumberFormat(numberFormat17);
        boolean boolean21 = stdDateFormat13.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat22 = stdDateFormat13._formatISO8601_z;
        boolean boolean24 = stdDateFormat13.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.text.DateFormat dateFormat25 = stdDateFormat13._formatRFC1123;
        stdDateFormat13._lenient = true;
        java.util.TimeZone timeZone28 = stdDateFormat13._timezone;
        java.lang.String str29 = stdDateFormat13.toString();
        java.lang.Boolean boolean30 = stdDateFormat13._lenient;
        java.util.Locale locale31 = stdDateFormat13._locale;
        stdDateFormat0._formatISO8601 = stdDateFormat13;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat13.", stdDateFormat0.equals(stdDateFormat13) == stdDateFormat13.equals(stdDateFormat0));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
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
        java.util.Calendar calendar14 = stdDateFormat0.getCalendar();
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatRFC1123;
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
        java.lang.String str28 = stdDateFormat16.toString();
        java.util.TimeZone timeZone29 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone29);
        stdDateFormat16._formatRFC1123 = dateFormat30;
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat35 = dateFormat34.getNumberFormat();
        dateFormat33.setNumberFormat(numberFormat35);
        java.text.NumberFormat numberFormat37 = dateFormat33.getNumberFormat();
        stdDateFormat16.setNumberFormat(numberFormat37);
        java.lang.String str39 = stdDateFormat16.toString();
        stdDateFormat0._formatRFC1123 = stdDateFormat16;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
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
        java.text.DateFormat dateFormat16 = stdDateFormat0._formatISO8601_z;
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
        java.util.Locale locale30 = stdDateFormat17._locale;
        java.lang.Boolean boolean31 = stdDateFormat17._lenient;
        stdDateFormat0._formatISO8601 = stdDateFormat17;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
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
        java.util.Calendar calendar16 = stdDateFormat0.getCalendar();
        boolean boolean18 = stdDateFormat0.looksLikeISO8601("Wed, 31 Dec 1969 23:59:59 UTC");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat0.setLenient(false);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
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
        stdDateFormat0._lenient = false;
        java.text.DateFormat dateFormat17 = stdDateFormat0._formatRFC1123;
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean20 = dateFormat18.equals((java.lang.Object) true);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        dateFormat23.setNumberFormat(numberFormat25);
        stdDateFormat21.setNumberFormat(numberFormat25);
        boolean boolean28 = stdDateFormat21.isLenient();
        java.text.DateFormat dateFormat29 = stdDateFormat21._formatISO8601;
        java.util.TimeZone timeZone30 = stdDateFormat21.getTimeZone();
        boolean boolean32 = stdDateFormat21.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        boolean boolean34 = stdDateFormat21.looksLikeISO8601("0");
        java.text.NumberFormat numberFormat35 = stdDateFormat21.getNumberFormat();
        boolean boolean36 = stdDateFormat21.isLenient();
        boolean boolean37 = dateFormat18.equals((java.lang.Object) boolean36);
        stdDateFormat0._formatRFC1123 = dateFormat18;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat21.", stdDateFormat0.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat0));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
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
        stdDateFormat0._lenient = true;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        boolean boolean22 = stdDateFormat15.isLenient();
        boolean boolean23 = stdDateFormat15.isLenient();
        stdDateFormat15._clearFormats();
        boolean boolean26 = stdDateFormat15.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        stdDateFormat15._clearFormats();
        java.util.Date date29 = stdDateFormat15.parse("1970-01-01T00:00:00.010+0000");
        java.lang.String str30 = stdDateFormat0.format(date29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat15.", stdDateFormat0.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
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
        java.util.TimeZone timeZone13 = stdDateFormat0.getTimeZone();
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        dateFormat14.setNumberFormat(numberFormat16);
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        java.util.Calendar calendar20 = dateFormat18.getCalendar();
        dateFormat14.setCalendar(calendar20);
        dateFormat14.setLenient(true);
        stdDateFormat0._formatRFC1123 = dateFormat14;
        java.text.DateFormat dateFormat25 = stdDateFormat0._formatISO8601;
        java.util.Locale locale26 = stdDateFormat0._locale;
        boolean boolean28 = stdDateFormat0.looksLikeISO8601("-1");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat29, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat29.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat29.equals(stdDateFormat0));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
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
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        boolean boolean15 = dateFormat13.equals((java.lang.Object) "yyyy-MM-dd");
        stdDateFormat0._formatRFC1123 = dateFormat13;
        stdDateFormat0._clearFormats();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        dateFormat20.setNumberFormat(numberFormat22);
        stdDateFormat18.setNumberFormat(numberFormat22);
        java.lang.String str25 = stdDateFormat18.toString();
        java.text.DateFormat dateFormat26 = stdDateFormat18._formatISO8601;
        java.text.DateFormat dateFormat27 = stdDateFormat18._formatRFC1123;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean28 = stdDateFormat0.equals((java.lang.Object) stdDateFormat18);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
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
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean23 = stdDateFormat16.isLenient();
        boolean boolean25 = stdDateFormat16.looksLikeISO8601("");
        boolean boolean26 = stdDateFormat16.isLenient();
        java.util.Locale locale27 = stdDateFormat16._locale;
        java.util.TimeZone timeZone28 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat16._timezone = timeZone28;
        java.lang.String str30 = stdDateFormat16.toString();
        boolean boolean32 = stdDateFormat16.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.util.TimeZone timeZone33 = stdDateFormat16._timezone;
        stdDateFormat0.setTimeZone(timeZone33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
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
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        java.lang.String str17 = dateFormat14.format((java.lang.Object) 3);
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat14.setNumberFormat(numberFormat19);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat24);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        dateFormat26.setNumberFormat(numberFormat28);
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        java.util.Calendar calendar32 = dateFormat30.getCalendar();
        dateFormat26.setCalendar(calendar32);
        dateFormat22.setCalendar(calendar32);
        java.text.NumberFormat numberFormat35 = dateFormat22.getNumberFormat();
        dateFormat14.setNumberFormat(numberFormat35);
        stdDateFormat0._formatISO8601 = dateFormat14;
        java.util.TimeZone timeZone38 = stdDateFormat0.getTimeZone();
        java.util.Calendar calendar39 = stdDateFormat0.getCalendar();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat10 and dateFormat18.", dateFormat10.equals(dateFormat18) == dateFormat18.equals(dateFormat10));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
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
        boolean boolean16 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        boolean boolean17 = stdDateFormat0.isLenient();
        stdDateFormat0._lenient = true;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat24);
        stdDateFormat20.setNumberFormat(numberFormat24);
        boolean boolean27 = stdDateFormat20.isLenient();
        boolean boolean29 = stdDateFormat20.looksLikeISO8601("");
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateTimeInstance();
        dateFormat30.setLenient(false);
        dateFormat30.setLenient(true);
        java.util.Calendar calendar35 = dateFormat30.getCalendar();
        stdDateFormat20._formatRFC1123 = dateFormat30;
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat40 = dateFormat39.getNumberFormat();
        dateFormat38.setNumberFormat(numberFormat40);
        java.text.NumberFormat numberFormat42 = dateFormat38.getNumberFormat();
        stdDateFormat20.setNumberFormat(numberFormat42);
        stdDateFormat20._clearFormats();
        boolean boolean46 = stdDateFormat20.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.lang.String str47 = stdDateFormat20.toString();
        boolean boolean48 = stdDateFormat20.isLenient();
        stdDateFormat20._clearFormats();
        java.text.DateFormat dateFormat50 = stdDateFormat20._formatPlain;
        java.util.Date date52 = stdDateFormat20.parse("1970-01-01T00:00:00.010+0000");
        java.lang.String str53 = stdDateFormat0.format(date52);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat20.", stdDateFormat0.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat0));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
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
        java.util.Locale locale12 = stdDateFormat0._locale;
        java.util.Locale locale13 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getInstance();
        boolean boolean16 = dateFormat14.equals((java.lang.Object) 2);
        stdDateFormat0._formatISO8601_z = dateFormat14;
        java.text.DateFormat dateFormat18 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean26 = stdDateFormat19.isLenient();
        boolean boolean28 = stdDateFormat19.looksLikeISO8601("");
        java.lang.String str29 = stdDateFormat19.toString();
        boolean boolean31 = stdDateFormat19.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone32 = stdDateFormat19.getTimeZone();
        java.text.DateFormat dateFormat33 = stdDateFormat19._formatPlain;
        java.text.DateFormat dateFormat34 = stdDateFormat19._formatISO8601;
        java.lang.Boolean boolean35 = stdDateFormat19._lenient;
        java.text.DateFormat dateFormat36 = stdDateFormat19._formatPlain;
        java.util.TimeZone timeZone37 = stdDateFormat19._timezone;
        stdDateFormat19._clearFormats();
        stdDateFormat0._formatPlain = stdDateFormat19;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat19.", stdDateFormat0.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat0));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
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
        stdDateFormat0._clearFormats();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        stdDateFormat30.setNumberFormat(numberFormat32);
        stdDateFormat0._formatISO8601_z = stdDateFormat30;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat30.", stdDateFormat0.equals(stdDateFormat30) == stdDateFormat30.equals(stdDateFormat0));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601_z;
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.util.Locale locale12 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat13 = stdDateFormat0._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        boolean boolean21 = stdDateFormat14.isLenient();
        boolean boolean23 = stdDateFormat14.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.util.Locale locale24 = stdDateFormat14._locale;
        java.lang.String str25 = stdDateFormat14.toString();
        java.util.Locale locale26 = stdDateFormat14._locale;
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance();
        dateFormat27.setLenient(false);
        dateFormat27.setLenient(false);
        java.text.NumberFormat numberFormat32 = dateFormat27.getNumberFormat();
        java.util.Calendar calendar33 = dateFormat27.getCalendar();
        stdDateFormat14._formatPlain = dateFormat27;
        stdDateFormat0._formatISO8601 = stdDateFormat14;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat14.", stdDateFormat0.equals(stdDateFormat14) == stdDateFormat14.equals(stdDateFormat0));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
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
        java.text.DateFormat dateFormat23 = stdDateFormat0._formatRFC1123;
        java.lang.Boolean boolean24 = stdDateFormat0._lenient;
        boolean boolean25 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        dateFormat28.setNumberFormat(numberFormat30);
        stdDateFormat26.setNumberFormat(numberFormat30);
        boolean boolean33 = stdDateFormat26.isLenient();
        boolean boolean35 = stdDateFormat26.looksLikeISO8601("");
        boolean boolean36 = stdDateFormat26.isLenient();
        java.util.Locale locale37 = stdDateFormat26._locale;
        java.util.TimeZone timeZone38 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat26._timezone = timeZone38;
        java.text.NumberFormat numberFormat40 = stdDateFormat26.getNumberFormat();
        java.util.TimeZone timeZone41 = stdDateFormat26._timezone;
        java.lang.String str42 = stdDateFormat26.toString();
        java.util.TimeZone timeZone43 = stdDateFormat26._timezone;
        stdDateFormat0._formatISO8601_z = stdDateFormat26;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat26.", stdDateFormat0.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat0));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
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
        boolean boolean17 = stdDateFormat0.looksLikeISO8601("Wed, 31 Dec 1969 23:59:59 UTC");
        java.text.NumberFormat numberFormat18 = stdDateFormat0.getNumberFormat();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        java.text.DateFormat dateFormat26 = stdDateFormat19._formatISO8601;
        stdDateFormat19._lenient = true;
        java.lang.String str29 = stdDateFormat19.toString();
        java.text.DateFormat dateFormat30 = stdDateFormat19._formatPlain;
        java.util.Locale locale31 = stdDateFormat19._locale;
        java.util.Locale locale32 = stdDateFormat19._locale;
        java.text.DateFormat dateFormat33 = stdDateFormat19._formatISO8601_z;
        java.util.Locale locale34 = stdDateFormat19._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat0.withLocale(locale34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat35 and stdDateFormat19.", stdDateFormat35.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat35));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
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
        java.text.DateFormat dateFormat18 = stdDateFormat0._formatISO8601;
        java.lang.Boolean boolean19 = stdDateFormat0._lenient;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat24);
        stdDateFormat20.setNumberFormat(numberFormat24);
        boolean boolean27 = stdDateFormat20.isLenient();
        boolean boolean29 = stdDateFormat20.looksLikeISO8601("");
        stdDateFormat20._clearFormats();
        java.text.DateFormat dateFormat31 = stdDateFormat20._formatISO8601;
        java.util.TimeZone timeZone32 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone32);
        stdDateFormat20.setTimeZone(timeZone32);
        java.lang.String str35 = stdDateFormat20.toString();
        java.text.DateFormat dateFormat36 = stdDateFormat20._formatISO8601;
        stdDateFormat0._formatISO8601 = stdDateFormat20;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat20.", stdDateFormat0.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat0));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
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
        boolean boolean17 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat18 = stdDateFormat0._formatISO8601;
        java.util.Locale locale19 = stdDateFormat0._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat0.setLenient(false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
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
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean23 = stdDateFormat16.isLenient();
        boolean boolean25 = stdDateFormat16.looksLikeISO8601("");
        java.lang.String str26 = stdDateFormat16.toString();
        boolean boolean28 = stdDateFormat16.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone29 = stdDateFormat16.getTimeZone();
        java.util.TimeZone timeZone30 = stdDateFormat16.getTimeZone();
        boolean boolean31 = stdDateFormat16.isLenient();
        java.util.TimeZone timeZone32 = stdDateFormat16._timezone;
        java.util.Locale locale33 = stdDateFormat16._locale;
        java.util.Locale locale34 = stdDateFormat16._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale34, (java.lang.Boolean) false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
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
        boolean boolean12 = stdDateFormat0.isLenient();
        java.util.TimeZone timeZone13 = stdDateFormat0.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date15 = stdDateFormat0.parse("Wed, 31 Dec 1969 23:59:59 UTC");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat16.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
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
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance();
        stdDateFormat0._formatISO8601 = dateFormat13;
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean23 = stdDateFormat16.isLenient();
        boolean boolean25 = stdDateFormat16.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        stdDateFormat0._formatISO8601 = stdDateFormat16;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
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
        boolean boolean15 = stdDateFormat0.isLenient();
        java.lang.Boolean boolean16 = stdDateFormat0._lenient;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat17.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
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
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone18);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date17 = stdDateFormat0.parse("\u0e21\u0e04. 2513 06:59:59");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.NumberFormat numberFormat10 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatRFC1123;
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat17);
        stdDateFormat13.setNumberFormat(numberFormat17);
        boolean boolean20 = stdDateFormat13.isLenient();
        boolean boolean22 = stdDateFormat13.looksLikeISO8601("");
        java.lang.String str23 = stdDateFormat13.toString();
        boolean boolean25 = stdDateFormat13.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone26 = stdDateFormat13.getTimeZone();
        java.util.TimeZone timeZone27 = stdDateFormat13.getTimeZone();
        boolean boolean29 = stdDateFormat13.looksLikeISO8601("hi!");
        java.util.Locale locale30 = stdDateFormat13._locale;
        stdDateFormat13._clearFormats();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean32 = stdDateFormat0.equals((java.lang.Object) stdDateFormat13);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        dateFormat20.setNumberFormat(numberFormat22);
        stdDateFormat18.setNumberFormat(numberFormat22);
        boolean boolean25 = stdDateFormat18.isLenient();
        boolean boolean27 = stdDateFormat18.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.util.Locale locale28 = stdDateFormat18._locale;
        java.text.DateFormat dateFormat29 = stdDateFormat18._formatPlain;
        java.lang.Class<?> wildcardClass30 = stdDateFormat18.getClass();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean31 = stdDateFormat0.equals((java.lang.Object) stdDateFormat18);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat12 = dateFormat11.getNumberFormat();
        dateFormat10.setNumberFormat(numberFormat12);
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat10.setNumberFormat(numberFormat15);
        boolean boolean17 = stdDateFormat0.equals((java.lang.Object) dateFormat10);
        java.text.NumberFormat numberFormat18 = stdDateFormat0.getNumberFormat();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean26 = stdDateFormat19.isLenient();
        boolean boolean28 = stdDateFormat19.looksLikeISO8601("");
        stdDateFormat19._clearFormats();
        java.text.DateFormat dateFormat30 = stdDateFormat19._formatISO8601;
        java.util.TimeZone timeZone31 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone31);
        stdDateFormat19.setTimeZone(timeZone31);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat0.withTimeZone(timeZone31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat19.", stdDateFormat0.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat0));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
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
        java.util.Locale locale13 = stdDateFormat0._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat14, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat14.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat14.equals(stdDateFormat0));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
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
        boolean boolean20 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateTimeInstance(2, (int) (byte) 1);
        stdDateFormat0._formatISO8601_z = dateFormat23;
        java.text.DateFormat dateFormat25 = stdDateFormat0._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        dateFormat28.setNumberFormat(numberFormat30);
        stdDateFormat26.setNumberFormat(numberFormat30);
        boolean boolean34 = stdDateFormat26.looksLikeISO8601("hi!");
        java.lang.String str35 = stdDateFormat26.toString();
        java.util.Locale locale36 = stdDateFormat26._locale;
        java.text.DateFormat dateFormat37 = stdDateFormat26._formatPlain;
        java.util.Locale locale38 = stdDateFormat26._locale;
        stdDateFormat26._lenient = false;
        stdDateFormat0._formatPlain = stdDateFormat26;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat26.", stdDateFormat0.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat0));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
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
        java.lang.String str14 = stdDateFormat0.toString();
        boolean boolean16 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.lang.String str17 = stdDateFormat0.toString();
        java.lang.String str18 = stdDateFormat0.toString();
        boolean boolean20 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.lang.String str21 = stdDateFormat0.toString();
        java.util.TimeZone timeZone22 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        stdDateFormat23.setNumberFormat(numberFormat25);
        java.text.DateFormat dateFormat27 = stdDateFormat23._formatISO8601;
        java.util.Locale locale28 = stdDateFormat23._locale;
        java.util.TimeZone timeZone29 = stdDateFormat23.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = stdDateFormat0.withTimeZone(timeZone29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat23.", stdDateFormat0.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat0));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
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
        java.util.TimeZone timeZone16 = stdDateFormat0._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean24 = stdDateFormat17.isLenient();
        java.text.DateFormat dateFormat25 = stdDateFormat17._formatISO8601;
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        java.util.Calendar calendar28 = dateFormat26.getCalendar();
        stdDateFormat17.setCalendar(calendar28);
        boolean boolean31 = stdDateFormat17.equals((java.lang.Object) 7);
        java.util.Locale locale32 = stdDateFormat17._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean33 = stdDateFormat0.equals((java.lang.Object) stdDateFormat17);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601;
        stdDateFormat0._clearFormats();
        java.util.TimeZone timeZone9 = stdDateFormat0._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat10, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat10.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat10.equals(stdDateFormat0));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.text.DateFormat dateFormat10 = stdDateFormat0._formatRFC1123;
        java.lang.Boolean boolean11 = stdDateFormat0._lenient;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat12, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat12.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat12.equals(stdDateFormat0));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
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
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean24 = stdDateFormat16.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat25 = stdDateFormat16._formatISO8601_z;
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateTimeInstance();
        dateFormat26.setLenient(false);
        dateFormat26.setLenient(false);
        boolean boolean31 = stdDateFormat16.equals((java.lang.Object) false);
        java.util.Locale locale32 = stdDateFormat16._locale;
        java.lang.String str33 = stdDateFormat16.toString();
        java.util.Locale locale34 = stdDateFormat16._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale34, (java.lang.Boolean) true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
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
        java.util.Locale locale12 = stdDateFormat0._locale;
        java.util.Locale locale13 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatISO8601_z;
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatRFC1123;
        java.lang.Boolean boolean16 = stdDateFormat0._lenient;
        boolean boolean18 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean27 = stdDateFormat19.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat28 = stdDateFormat19._formatISO8601_z;
        boolean boolean30 = stdDateFormat19.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.util.Locale locale31 = stdDateFormat19._locale;
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.lang.String[] strArray33 = com.fasterxml.jackson.databind.util.StdDateFormat.ALL_FORMATS;
        boolean boolean34 = dateFormat32.equals((java.lang.Object) strArray33);
        java.util.Calendar calendar35 = dateFormat32.getCalendar();
        java.text.NumberFormat numberFormat36 = dateFormat32.getNumberFormat();
        stdDateFormat19.setNumberFormat(numberFormat36);
        stdDateFormat0.setNumberFormat(numberFormat36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat19.", stdDateFormat0.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat0));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
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
        java.util.TimeZone timeZone15 = stdDateFormat0._timezone;
        java.text.DateFormat dateFormat16 = stdDateFormat0._formatRFC1123;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date18 = stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
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
        java.text.DateFormat dateFormat18 = stdDateFormat0._formatRFC1123;
        java.text.NumberFormat numberFormat19 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat20 = stdDateFormat0._formatISO8601;
        java.util.TimeZone timeZone21 = stdDateFormat0._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        dateFormat24.setNumberFormat(numberFormat26);
        stdDateFormat22.setNumberFormat(numberFormat26);
        boolean boolean29 = stdDateFormat22.isLenient();
        boolean boolean31 = stdDateFormat22.looksLikeISO8601("");
        java.text.DateFormat dateFormat32 = stdDateFormat22._formatRFC1123;
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat35 = dateFormat34.getNumberFormat();
        dateFormat33.setNumberFormat(numberFormat35);
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat38 = dateFormat37.getNumberFormat();
        dateFormat33.setNumberFormat(numberFormat38);
        java.text.NumberFormat numberFormat40 = dateFormat33.getNumberFormat();
        stdDateFormat22.setNumberFormat(numberFormat40);
        boolean boolean42 = stdDateFormat22.isLenient();
        java.util.Locale locale43 = stdDateFormat22._locale;
        boolean boolean44 = stdDateFormat0.equals((java.lang.Object) locale43);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat22.", stdDateFormat0.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat0));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
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
        java.util.TimeZone timeZone13 = stdDateFormat0.getTimeZone();
        java.util.TimeZone timeZone14 = stdDateFormat0._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean23 = stdDateFormat16.isLenient();
        boolean boolean25 = stdDateFormat16.looksLikeISO8601("");
        stdDateFormat16._clearFormats();
        java.text.DateFormat dateFormat27 = stdDateFormat16._formatPlain;
        java.util.TimeZone timeZone28 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone28);
        stdDateFormat16._timezone = timeZone28;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateTimeInstance();
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        stdDateFormat16._formatISO8601 = dateFormat31;
        java.text.DateFormat dateFormat34 = stdDateFormat16._formatISO8601;
        java.util.TimeZone timeZone35 = stdDateFormat16.getTimeZone();
        stdDateFormat0.setTimeZone(timeZone35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat2);
        java.text.DateFormat dateFormat4 = stdDateFormat0._formatISO8601;
        java.util.Locale locale5 = stdDateFormat0._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        dateFormat8.setNumberFormat(numberFormat10);
        stdDateFormat6.setNumberFormat(numberFormat10);
        boolean boolean14 = stdDateFormat6.looksLikeISO8601("hi!");
        java.lang.String str15 = stdDateFormat6.toString();
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        java.text.NumberFormat numberFormat17 = stdDateFormat6.getNumberFormat();
        boolean boolean18 = stdDateFormat6.isLenient();
        boolean boolean20 = stdDateFormat6.looksLikeISO8601("hi!");
        java.util.Date date22 = stdDateFormat6.parse("-1");
        java.lang.String str23 = stdDateFormat0.format(date22);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat6.", stdDateFormat0.equals(stdDateFormat6) == stdDateFormat6.equals(stdDateFormat0));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
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
        java.lang.Boolean boolean15 = stdDateFormat0._lenient;
        java.text.NumberFormat numberFormat16 = stdDateFormat0.getNumberFormat();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat17.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601;
        stdDateFormat0._lenient = true;
        java.lang.String str10 = stdDateFormat0.toString();
        java.util.TimeZone timeZone11 = stdDateFormat0.getTimeZone();
        boolean boolean13 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        boolean boolean21 = stdDateFormat14.isLenient();
        boolean boolean23 = stdDateFormat14.looksLikeISO8601("");
        java.lang.String str24 = stdDateFormat14.toString();
        java.text.DateFormat dateFormat25 = stdDateFormat14._formatPlain;
        java.lang.String str26 = stdDateFormat14.toString();
        java.util.Locale locale27 = stdDateFormat14._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = stdDateFormat0.withLocale(locale27);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat28 and stdDateFormat14.", stdDateFormat28.equals(stdDateFormat14) == stdDateFormat14.equals(stdDateFormat28));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
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
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatISO8601_z;
        java.text.DateFormat dateFormat13 = stdDateFormat0._formatPlain;
        java.util.TimeZone timeZone14 = stdDateFormat0.getTimeZone();
        java.util.TimeZone timeZone15 = stdDateFormat0._timezone;
        java.lang.String str16 = stdDateFormat0.toString();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean24 = stdDateFormat17.isLenient();
        java.text.DateFormat dateFormat25 = stdDateFormat17._formatISO8601;
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        java.util.Calendar calendar28 = dateFormat26.getCalendar();
        stdDateFormat17.setCalendar(calendar28);
        boolean boolean31 = stdDateFormat17.equals((java.lang.Object) 7);
        java.lang.String str32 = stdDateFormat17.toString();
        java.text.DateFormat dateFormat33 = stdDateFormat17._formatISO8601_z;
        java.lang.String str34 = stdDateFormat17.toString();
        java.util.Date date36 = stdDateFormat17.parse("-1");
        stdDateFormat0._formatISO8601_z = stdDateFormat17;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        boolean boolean22 = stdDateFormat15.isLenient();
        boolean boolean24 = stdDateFormat15.looksLikeISO8601("");
        boolean boolean25 = stdDateFormat15.isLenient();
        java.util.Locale locale26 = stdDateFormat15._locale;
        java.util.TimeZone timeZone27 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat15._timezone = timeZone27;
        java.lang.String str29 = stdDateFormat15.toString();
        stdDateFormat15._lenient = false;
        java.util.TimeZone timeZone32 = stdDateFormat15.getTimeZone();
        java.util.TimeZone timeZone33 = stdDateFormat15._timezone;
        stdDateFormat0._timezone = timeZone33;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat15.", stdDateFormat0.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat2);
        java.text.DateFormat dateFormat4 = stdDateFormat0._formatISO8601;
        java.util.Locale locale5 = stdDateFormat0._locale;
        java.util.TimeZone timeZone6 = stdDateFormat0.getTimeZone();
        java.util.Calendar calendar7 = stdDateFormat0.getCalendar();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat12 = dateFormat11.getNumberFormat();
        dateFormat10.setNumberFormat(numberFormat12);
        stdDateFormat8.setNumberFormat(numberFormat12);
        stdDateFormat0.setNumberFormat(numberFormat12);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat8.", stdDateFormat0.equals(stdDateFormat8) == stdDateFormat8.equals(stdDateFormat0));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat17.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
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
        java.util.Calendar calendar14 = stdDateFormat0.getCalendar();
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatRFC1123;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat0.setLenient(false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601;
        stdDateFormat0._lenient = true;
        stdDateFormat0._lenient = true;
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatISO8601;
        java.text.DateFormat dateFormat13 = stdDateFormat0._formatRFC1123;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date15 = stdDateFormat0.parse("Wed, 31 Dec 1969 23:59:59 UTC");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
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
        java.lang.String str14 = stdDateFormat0.toString();
        boolean boolean16 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.lang.String str17 = stdDateFormat0.toString();
        java.lang.String str18 = stdDateFormat0.toString();
        boolean boolean20 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.lang.String str21 = stdDateFormat0.toString();
        java.util.TimeZone timeZone22 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat23, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat23.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat23.equals(stdDateFormat0));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean26 = stdDateFormat19.isLenient();
        boolean boolean28 = stdDateFormat19.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        boolean boolean30 = stdDateFormat19.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.text.DateFormat dateFormat31 = stdDateFormat19._formatISO8601;
        stdDateFormat19._lenient = true;
        java.util.TimeZone timeZone34 = stdDateFormat19._timezone;
        stdDateFormat0._formatPlain = stdDateFormat19;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat19.", stdDateFormat0.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat0));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
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
        java.util.TimeZone timeZone12 = stdDateFormat0._timezone;
        java.util.Calendar calendar13 = stdDateFormat0.getCalendar();
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        boolean boolean23 = stdDateFormat15.looksLikeISO8601("hi!");
        java.lang.String str24 = stdDateFormat15.toString();
        java.util.TimeZone timeZone25 = stdDateFormat15._timezone;
        java.text.NumberFormat numberFormat26 = stdDateFormat15.getNumberFormat();
        boolean boolean27 = stdDateFormat15.isLenient();
        boolean boolean29 = stdDateFormat15.looksLikeISO8601("hi!");
        java.util.Date date31 = stdDateFormat15.parse("-1");
        stdDateFormat0._formatPlain = stdDateFormat15;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat15.", stdDateFormat0.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
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
        boolean boolean13 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        java.util.Locale locale21 = stdDateFormat14._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = stdDateFormat0.withLocale(locale21);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat22 and stdDateFormat14.", stdDateFormat22.equals(stdDateFormat14) == stdDateFormat14.equals(stdDateFormat22));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean8 = stdDateFormat0.isLenient();
        stdDateFormat0._clearFormats();
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        stdDateFormat0._clearFormats();
        java.util.TimeZone timeZone13 = stdDateFormat0._timezone;
        java.lang.String str14 = stdDateFormat0.toString();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        java.text.DateFormat dateFormat22 = stdDateFormat15._formatISO8601;
        stdDateFormat15._lenient = true;
        java.lang.String str25 = stdDateFormat15.toString();
        java.util.TimeZone timeZone26 = stdDateFormat15.getTimeZone();
        boolean boolean28 = stdDateFormat15.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.util.Locale locale29 = stdDateFormat15._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = stdDateFormat0.withLocale(locale29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat30 and stdDateFormat15.", stdDateFormat30.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat30));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
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
        java.lang.String str14 = stdDateFormat0.toString();
        boolean boolean16 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        stdDateFormat0.setLenient(false);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean26 = stdDateFormat19.isLenient();
        boolean boolean28 = stdDateFormat19.looksLikeISO8601("");
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateTimeInstance();
        dateFormat29.setLenient(false);
        dateFormat29.setLenient(true);
        java.util.Calendar calendar34 = dateFormat29.getCalendar();
        stdDateFormat19._formatRFC1123 = dateFormat29;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat39 = dateFormat38.getNumberFormat();
        dateFormat37.setNumberFormat(numberFormat39);
        java.text.NumberFormat numberFormat41 = dateFormat37.getNumberFormat();
        stdDateFormat19.setNumberFormat(numberFormat41);
        java.util.TimeZone timeZone43 = stdDateFormat19._timezone;
        stdDateFormat0._formatISO8601 = stdDateFormat19;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat19.", stdDateFormat0.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat0));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        stdDateFormat0._clearFormats();
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatISO8601;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        stdDateFormat0.setTimeZone(timeZone12);
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        dateFormat20.setNumberFormat(numberFormat22);
        stdDateFormat18.setNumberFormat(numberFormat22);
        boolean boolean25 = stdDateFormat18.isLenient();
        boolean boolean27 = stdDateFormat18.looksLikeISO8601("");
        java.lang.String str28 = stdDateFormat18.toString();
        boolean boolean30 = stdDateFormat18.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone31 = stdDateFormat18.getTimeZone();
        java.util.TimeZone timeZone32 = stdDateFormat18.getTimeZone();
        boolean boolean33 = stdDateFormat18.isLenient();
        java.util.TimeZone timeZone34 = stdDateFormat18._timezone;
        java.util.Locale locale35 = stdDateFormat18._locale;
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance((int) (short) 0, locale35);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat18.", stdDateFormat0.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat0));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
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
        boolean boolean12 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat17);
        stdDateFormat13.setNumberFormat(numberFormat17);
        boolean boolean20 = stdDateFormat13.isLenient();
        boolean boolean22 = stdDateFormat13.looksLikeISO8601("");
        java.lang.String str23 = stdDateFormat13.toString();
        boolean boolean25 = stdDateFormat13.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone26 = stdDateFormat13.getTimeZone();
        java.util.Locale locale27 = stdDateFormat13._locale;
        java.lang.String str28 = stdDateFormat13.toString();
        stdDateFormat13._clearFormats();
        stdDateFormat13._clearFormats();
        stdDateFormat0._formatISO8601_z = stdDateFormat13;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat13.", stdDateFormat0.equals(stdDateFormat13) == stdDateFormat13.equals(stdDateFormat0));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
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
        boolean boolean17 = stdDateFormat0.looksLikeISO8601("Wed, 31 Dec 1969 23:59:59 UTC");
        java.lang.String str18 = stdDateFormat0.toString();
        java.util.TimeZone timeZone19 = stdDateFormat0._timezone;
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone19);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        dateFormat23.setNumberFormat(numberFormat25);
        stdDateFormat21.setNumberFormat(numberFormat25);
        boolean boolean28 = stdDateFormat21.isLenient();
        boolean boolean30 = stdDateFormat21.looksLikeISO8601("");
        java.text.NumberFormat numberFormat31 = stdDateFormat21.getNumberFormat();
        java.util.TimeZone timeZone32 = stdDateFormat21._timezone;
        java.util.Locale locale33 = stdDateFormat21._locale;
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone19, locale33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat21.", stdDateFormat0.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat0));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean26 = stdDateFormat19.isLenient();
        boolean boolean28 = stdDateFormat19.looksLikeISO8601("");
        java.lang.String str29 = stdDateFormat19.toString();
        boolean boolean31 = stdDateFormat19.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone32 = stdDateFormat19.getTimeZone();
        java.util.Locale locale33 = stdDateFormat19._locale;
        java.util.Locale locale34 = stdDateFormat19._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat0.withLocale(locale34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat35 and stdDateFormat19.", stdDateFormat35.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat35));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
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
        java.util.Locale locale15 = stdDateFormat0._locale;
        boolean boolean16 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean24 = stdDateFormat17.isLenient();
        boolean boolean26 = stdDateFormat17.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        boolean boolean27 = stdDateFormat17.isLenient();
        java.lang.Boolean boolean28 = stdDateFormat17._lenient;
        boolean boolean30 = stdDateFormat17.looksLikeISO8601("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        stdDateFormat17._clearFormats();
        java.lang.Boolean boolean32 = stdDateFormat17._lenient;
        java.util.TimeZone timeZone33 = stdDateFormat17._timezone;
        stdDateFormat0._formatISO8601_z = stdDateFormat17;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.lang.String str10 = stdDateFormat0.toString();
        java.lang.Boolean boolean11 = stdDateFormat0._lenient;
        java.util.TimeZone timeZone12 = stdDateFormat0._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date14 = stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
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
        java.lang.String str15 = stdDateFormat0.toString();
        java.util.TimeZone timeZone16 = stdDateFormat0._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean25 = stdDateFormat17.looksLikeISO8601("hi!");
        java.lang.String str26 = stdDateFormat17.toString();
        java.util.TimeZone timeZone27 = stdDateFormat17._timezone;
        java.text.NumberFormat numberFormat28 = stdDateFormat17.getNumberFormat();
        java.lang.String str29 = stdDateFormat17.toString();
        java.util.TimeZone timeZone30 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone30);
        stdDateFormat17._formatRFC1123 = dateFormat31;
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat36 = dateFormat35.getNumberFormat();
        dateFormat34.setNumberFormat(numberFormat36);
        java.text.NumberFormat numberFormat38 = dateFormat34.getNumberFormat();
        stdDateFormat17.setNumberFormat(numberFormat38);
        stdDateFormat0.setNumberFormat(numberFormat38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
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
        java.text.DateFormat dateFormat13 = stdDateFormat0._formatISO8601_z;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj15 = stdDateFormat0.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.text.DateFormat dateFormat10 = stdDateFormat0._formatRFC1123;
        java.lang.Boolean boolean11 = stdDateFormat0._lenient;
        java.util.TimeZone timeZone12 = stdDateFormat0._timezone;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateTimeInstance(2, (int) (byte) 1);
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        stdDateFormat0._formatISO8601 = dateFormat15;
        java.util.TimeZone timeZone18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        dateFormat23.setNumberFormat(numberFormat25);
        stdDateFormat21.setNumberFormat(numberFormat25);
        boolean boolean29 = stdDateFormat21.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat30 = stdDateFormat21._formatISO8601_z;
        boolean boolean32 = stdDateFormat21.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.util.Locale locale33 = stdDateFormat21._locale;
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18, locale33);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat0.withLocale(locale33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat35 and stdDateFormat21.", stdDateFormat35.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat35));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
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
        java.util.Calendar calendar14 = stdDateFormat0.getCalendar();
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatRFC1123;
        java.util.Date date17 = stdDateFormat0.parse("1970-01-01T00:00:00.000+0000");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        dateFormat20.setNumberFormat(numberFormat22);
        stdDateFormat18.setNumberFormat(numberFormat22);
        boolean boolean25 = stdDateFormat18.isLenient();
        boolean boolean27 = stdDateFormat18.looksLikeISO8601("");
        boolean boolean28 = stdDateFormat18.isLenient();
        stdDateFormat0._formatPlain = stdDateFormat18;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat18.", stdDateFormat0.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat0));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
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
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        boolean boolean15 = dateFormat13.equals((java.lang.Object) "yyyy-MM-dd");
        stdDateFormat0._formatRFC1123 = dateFormat13;
        stdDateFormat0._lenient = false;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean26 = stdDateFormat19.isLenient();
        java.text.DateFormat dateFormat27 = stdDateFormat19._formatISO8601;
        stdDateFormat19._clearFormats();
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance((int) (short) 1);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance(2);
        java.util.Calendar calendar33 = dateFormat32.getCalendar();
        dateFormat30.setCalendar(calendar33);
        stdDateFormat19.setCalendar(calendar33);
        stdDateFormat0._formatISO8601_z = stdDateFormat19;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat19.", stdDateFormat0.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat0));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
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
        stdDateFormat0._clearFormats();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        boolean boolean21 = stdDateFormat14.isLenient();
        boolean boolean23 = stdDateFormat14.looksLikeISO8601("");
        boolean boolean24 = stdDateFormat14.isLenient();
        java.lang.Boolean boolean25 = stdDateFormat14._lenient;
        java.util.Locale locale26 = stdDateFormat14._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = stdDateFormat0.withLocale(locale26);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat27 and stdDateFormat14.", stdDateFormat27.equals(stdDateFormat14) == stdDateFormat14.equals(stdDateFormat27));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat15, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat15.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        stdDateFormat0._clearFormats();
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatISO8601;
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatRFC1123;
        java.util.TimeZone timeZone13 = stdDateFormat0._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        boolean boolean21 = stdDateFormat14.isLenient();
        java.text.DateFormat dateFormat22 = stdDateFormat14._formatISO8601;
        stdDateFormat14._clearFormats();
        stdDateFormat14._clearFormats();
        java.lang.String str25 = stdDateFormat14.toString();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        boolean boolean29 = dateFormat27.equals((java.lang.Object) "yyyy-MM-dd");
        stdDateFormat14._formatRFC1123 = dateFormat27;
        stdDateFormat14._lenient = false;
        java.util.TimeZone timeZone33 = stdDateFormat14._timezone;
        java.text.DateFormat dateFormat34 = stdDateFormat14._formatISO8601_z;
        java.text.DateFormat dateFormat35 = stdDateFormat14._formatPlain;
        stdDateFormat0._formatPlain = stdDateFormat14;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat14.", stdDateFormat0.equals(stdDateFormat14) == stdDateFormat14.equals(stdDateFormat0));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.text.NumberFormat numberFormat10 = stdDateFormat0.getNumberFormat();
        java.lang.Boolean boolean11 = stdDateFormat0._lenient;
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatRFC1123;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat0.setLenient(true);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
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
        java.lang.Boolean boolean13 = stdDateFormat0._lenient;
        java.lang.Boolean boolean14 = stdDateFormat0._lenient;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        java.lang.Boolean boolean22 = stdDateFormat15._lenient;
        java.util.TimeZone timeZone23 = stdDateFormat15.getTimeZone();
        java.text.DateFormat dateFormat24 = stdDateFormat15._formatISO8601;
        stdDateFormat15._lenient = false;
        stdDateFormat0._formatPlain = stdDateFormat15;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat15.", stdDateFormat0.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
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
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        dateFormat20.setNumberFormat(numberFormat22);
        stdDateFormat18.setNumberFormat(numberFormat22);
        boolean boolean25 = stdDateFormat18.isLenient();
        boolean boolean27 = stdDateFormat18.looksLikeISO8601("");
        boolean boolean28 = stdDateFormat18.isLenient();
        java.util.Locale locale29 = stdDateFormat18._locale;
        java.util.TimeZone timeZone30 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat18._timezone = timeZone30;
        java.text.NumberFormat numberFormat32 = stdDateFormat18.getNumberFormat();
        java.util.Locale locale33 = stdDateFormat18._locale;
        java.util.Locale locale34 = stdDateFormat18._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat18.", stdDateFormat0.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat0));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
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
        java.text.DateFormat dateFormat17 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        dateFormat20.setNumberFormat(numberFormat22);
        stdDateFormat18.setNumberFormat(numberFormat22);
        boolean boolean25 = stdDateFormat18.isLenient();
        boolean boolean27 = stdDateFormat18.looksLikeISO8601("");
        stdDateFormat18._clearFormats();
        java.text.DateFormat dateFormat29 = stdDateFormat18._formatPlain;
        java.util.TimeZone timeZone30 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone30);
        stdDateFormat18._timezone = timeZone30;
        java.util.Locale locale33 = stdDateFormat18._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat0.withLocale(locale33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat34 and stdDateFormat18.", stdDateFormat34.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat34));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat0.setLenient(false);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean26 = stdDateFormat19.isLenient();
        boolean boolean28 = stdDateFormat19.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        boolean boolean29 = stdDateFormat19.isLenient();
        java.util.TimeZone timeZone30 = stdDateFormat19._timezone;
        java.text.DateFormat dateFormat31 = stdDateFormat19._formatISO8601_z;
        java.lang.Boolean boolean32 = stdDateFormat19._lenient;
        java.util.Calendar calendar33 = stdDateFormat19.getCalendar();
        stdDateFormat0._formatISO8601 = stdDateFormat19;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat19.", stdDateFormat0.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat0));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
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
        java.lang.Boolean boolean24 = stdDateFormat0._lenient;
        java.text.DateFormat dateFormat25 = stdDateFormat0._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        dateFormat28.setNumberFormat(numberFormat30);
        stdDateFormat26.setNumberFormat(numberFormat30);
        boolean boolean33 = stdDateFormat26.isLenient();
        boolean boolean35 = stdDateFormat26.looksLikeISO8601("");
        boolean boolean36 = stdDateFormat26.isLenient();
        java.util.Locale locale37 = stdDateFormat26._locale;
        java.util.TimeZone timeZone38 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat26._timezone = timeZone38;
        java.lang.String str40 = stdDateFormat26.toString();
        stdDateFormat26._lenient = false;
        java.util.TimeZone timeZone43 = stdDateFormat26.getTimeZone();
        java.util.TimeZone timeZone44 = stdDateFormat26._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean45 = stdDateFormat0.equals((java.lang.Object) stdDateFormat26);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
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
        java.util.Locale locale19 = stdDateFormat0._locale;
        java.util.Calendar calendar20 = stdDateFormat0.getCalendar();
        java.util.TimeZone timeZone21 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        dateFormat24.setNumberFormat(numberFormat26);
        stdDateFormat22.setNumberFormat(numberFormat26);
        boolean boolean30 = stdDateFormat22.looksLikeISO8601("hi!");
        java.lang.String str31 = stdDateFormat22.toString();
        java.util.TimeZone timeZone32 = stdDateFormat22._timezone;
        java.util.Locale locale33 = stdDateFormat22._locale;
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21, locale33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat22.", stdDateFormat0.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat0));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
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
        java.util.Date date16 = stdDateFormat0.parse("1970-01-01T00:00:00.010+0000");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean25 = stdDateFormat17.looksLikeISO8601("hi!");
        java.lang.String str26 = stdDateFormat17.toString();
        java.util.TimeZone timeZone27 = stdDateFormat17._timezone;
        java.text.NumberFormat numberFormat28 = stdDateFormat17.getNumberFormat();
        boolean boolean29 = stdDateFormat17.isLenient();
        stdDateFormat0._formatPlain = stdDateFormat17;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
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
        boolean boolean16 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat17 = stdDateFormat0._formatPlain;
        java.util.TimeZone timeZone18 = stdDateFormat0.getTimeZone();
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
        java.util.TimeZone timeZone33 = stdDateFormat19.getTimeZone();
        java.text.DateFormat dateFormat34 = stdDateFormat19._formatRFC1123;
        java.util.Locale locale35 = stdDateFormat19._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18, locale35, (java.lang.Boolean) false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat19.", stdDateFormat0.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat0));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
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
        java.util.TimeZone timeZone16 = stdDateFormat0._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat17.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
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
        java.text.DateFormat dateFormat17 = stdDateFormat0._formatISO8601_z;
        java.text.DateFormat dateFormat18 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat24);
        stdDateFormat20.setNumberFormat(numberFormat24);
        boolean boolean28 = stdDateFormat20.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat29 = stdDateFormat20._formatISO8601_z;
        boolean boolean31 = stdDateFormat20.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.text.DateFormat dateFormat32 = stdDateFormat20._formatRFC1123;
        java.text.DateFormat dateFormat33 = stdDateFormat20._formatISO8601_z;
        java.util.Locale locale34 = stdDateFormat20._locale;
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getTimeInstance(0, locale34);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = stdDateFormat0.withLocale(locale34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat36 and stdDateFormat20.", stdDateFormat36.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat36));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
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
        java.util.Locale locale19 = stdDateFormat0._locale;
        java.util.Calendar calendar20 = stdDateFormat0.getCalendar();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        dateFormat23.setNumberFormat(numberFormat25);
        stdDateFormat21.setNumberFormat(numberFormat25);
        boolean boolean28 = stdDateFormat21.isLenient();
        boolean boolean30 = stdDateFormat21.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getTimeInstance();
        stdDateFormat21._formatPlain = dateFormat31;
        java.text.DateFormat dateFormat33 = stdDateFormat21._formatISO8601_z;
        stdDateFormat21._lenient = false;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat39 = dateFormat38.getNumberFormat();
        dateFormat37.setNumberFormat(numberFormat39);
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat42 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat43 = dateFormat42.getNumberFormat();
        dateFormat41.setNumberFormat(numberFormat43);
        java.text.DateFormat dateFormat45 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat46 = dateFormat45.getNumberFormat();
        java.util.Calendar calendar47 = dateFormat45.getCalendar();
        dateFormat41.setCalendar(calendar47);
        dateFormat37.setCalendar(calendar47);
        java.text.NumberFormat numberFormat50 = dateFormat37.getNumberFormat();
        stdDateFormat21.setNumberFormat(numberFormat50);
        stdDateFormat0.setNumberFormat(numberFormat50);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat21.", stdDateFormat0.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat0));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
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
        java.text.DateFormat dateFormat18 = stdDateFormat0._formatRFC1123;
        java.text.NumberFormat numberFormat19 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat20 = stdDateFormat0._formatISO8601;
        java.util.TimeZone timeZone21 = stdDateFormat0._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        dateFormat24.setNumberFormat(numberFormat26);
        stdDateFormat22.setNumberFormat(numberFormat26);
        boolean boolean30 = stdDateFormat22.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat31 = stdDateFormat22._formatISO8601_z;
        boolean boolean33 = stdDateFormat22.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.text.DateFormat dateFormat34 = stdDateFormat22._formatRFC1123;
        java.text.DateFormat dateFormat35 = stdDateFormat22._formatISO8601_z;
        java.util.Locale locale36 = stdDateFormat22._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = stdDateFormat0.withLocale(locale36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat37 and stdDateFormat22.", stdDateFormat37.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat37));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
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
        boolean boolean13 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.util.TimeZone timeZone14 = stdDateFormat0._timezone;
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean24 = stdDateFormat16.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat25 = stdDateFormat16._formatISO8601_z;
        java.text.DateFormat dateFormat26 = stdDateFormat16._formatPlain;
        java.text.DateFormat dateFormat27 = stdDateFormat16._formatISO8601_z;
        java.util.TimeZone timeZone28 = stdDateFormat16._timezone;
        java.lang.Boolean boolean29 = stdDateFormat16._lenient;
        java.util.Date date31 = stdDateFormat16.parse("0");
        boolean boolean32 = stdDateFormat16.isLenient();
        java.lang.Boolean boolean33 = stdDateFormat16._lenient;
        stdDateFormat0._formatPlain = stdDateFormat16;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        stdDateFormat0._clearFormats();
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatISO8601;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        stdDateFormat0.setTimeZone(timeZone12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date16 = stdDateFormat0.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601;
        stdDateFormat0._lenient = true;
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatPlain;
        java.util.Locale locale13 = stdDateFormat0._locale;
        java.util.TimeZone timeZone14 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
        stdDateFormat0.setTimeZone(timeZone14);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        java.text.DateFormat dateFormat26 = stdDateFormat19._formatISO8601;
        stdDateFormat19._lenient = true;
        java.lang.String str29 = stdDateFormat19.toString();
        java.text.DateFormat dateFormat30 = stdDateFormat19._formatPlain;
        java.util.Locale locale31 = stdDateFormat19._locale;
        java.util.Locale locale32 = stdDateFormat19._locale;
        java.text.DateFormat dateFormat33 = stdDateFormat19._formatISO8601_z;
        java.util.Locale locale34 = stdDateFormat19._locale;
        java.util.Locale locale35 = stdDateFormat19._locale;
        java.util.Locale locale36 = stdDateFormat19._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat37 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone14, locale36);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat0.setLenient(false);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
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
        stdDateFormat0._clearFormats();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean24 = stdDateFormat16.looksLikeISO8601("hi!");
        java.lang.String str25 = stdDateFormat16.toString();
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean28 = dateFormat26.equals((java.lang.Object) true);
        stdDateFormat16._formatISO8601 = dateFormat26;
        boolean boolean30 = stdDateFormat16.isLenient();
        boolean boolean32 = stdDateFormat16.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.text.NumberFormat numberFormat33 = stdDateFormat16.getNumberFormat();
        stdDateFormat0._formatRFC1123 = stdDateFormat16;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
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
        java.lang.Boolean boolean13 = stdDateFormat0._lenient;
        java.util.Date date15 = stdDateFormat0.parse("0");
        boolean boolean16 = stdDateFormat0.isLenient();
        boolean boolean17 = stdDateFormat0.isLenient();
        java.text.NumberFormat numberFormat18 = stdDateFormat0.getNumberFormat();
        stdDateFormat0._lenient = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date22 = stdDateFormat0.parse("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
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
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatRFC1123;
        java.util.TimeZone timeZone15 = stdDateFormat0.getTimeZone();
        java.text.DateFormat dateFormat16 = stdDateFormat0._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean24 = stdDateFormat17.isLenient();
        java.text.DateFormat dateFormat25 = stdDateFormat17._formatISO8601;
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        java.util.Calendar calendar28 = dateFormat26.getCalendar();
        stdDateFormat17.setCalendar(calendar28);
        java.util.Calendar calendar30 = stdDateFormat17.getCalendar();
        stdDateFormat17._lenient = true;
        java.util.TimeZone timeZone33 = stdDateFormat17._timezone;
        java.util.TimeZone timeZone34 = stdDateFormat17._timezone;
        java.text.NumberFormat numberFormat35 = stdDateFormat17.getNumberFormat();
        boolean boolean36 = stdDateFormat0.equals((java.lang.Object) numberFormat35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
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
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatISO8601_z;
        boolean boolean16 = stdDateFormat0.looksLikeISO8601("31/12/69 23:59");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj18 = stdDateFormat0.parseObject("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
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
        java.util.Locale locale16 = stdDateFormat0._locale;
        java.util.Locale locale17 = stdDateFormat0._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        dateFormat20.setNumberFormat(numberFormat22);
        stdDateFormat18.setNumberFormat(numberFormat22);
        boolean boolean25 = stdDateFormat18.isLenient();
        boolean boolean27 = stdDateFormat18.looksLikeISO8601("");
        java.lang.String str28 = stdDateFormat18.toString();
        java.util.Locale locale29 = stdDateFormat18._locale;
        boolean boolean30 = stdDateFormat18.isLenient();
        stdDateFormat0._formatPlain = stdDateFormat18;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat18.", stdDateFormat0.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat0));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601;
        stdDateFormat0._clearFormats();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        dateFormat12.setNumberFormat(numberFormat14);
        stdDateFormat10.setNumberFormat(numberFormat14);
        boolean boolean17 = stdDateFormat10.isLenient();
        boolean boolean19 = stdDateFormat10.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        boolean boolean21 = stdDateFormat10.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.text.DateFormat dateFormat22 = stdDateFormat10._formatISO8601;
        stdDateFormat10._lenient = true;
        java.util.Locale locale25 = stdDateFormat10._locale;
        stdDateFormat10._lenient = false;
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance(0);
        stdDateFormat10._formatRFC1123 = dateFormat29;
        stdDateFormat10._clearFormats();
        stdDateFormat10._lenient = true;
        stdDateFormat10._clearFormats();
        stdDateFormat0._formatISO8601 = stdDateFormat10;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat10.", stdDateFormat0.equals(stdDateFormat10) == stdDateFormat10.equals(stdDateFormat0));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
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
        boolean boolean13 = stdDateFormat0.isLenient();
        java.lang.Boolean boolean14 = stdDateFormat0._lenient;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        boolean boolean22 = stdDateFormat15.isLenient();
        boolean boolean24 = stdDateFormat15.looksLikeISO8601("");
        java.text.DateFormat dateFormat25 = stdDateFormat15._formatRFC1123;
        java.text.NumberFormat numberFormat26 = stdDateFormat15.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat26);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat15.", stdDateFormat0.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
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
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        boolean boolean22 = stdDateFormat15.isLenient();
        boolean boolean24 = stdDateFormat15.looksLikeISO8601("");
        boolean boolean25 = stdDateFormat15.isLenient();
        java.util.Locale locale26 = stdDateFormat15._locale;
        java.util.TimeZone timeZone27 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat15._timezone = timeZone27;
        java.lang.String str29 = stdDateFormat15.toString();
        java.text.DateFormat dateFormat30 = stdDateFormat15._formatPlain;
        java.util.Calendar calendar31 = stdDateFormat15.getCalendar();
        java.util.Locale locale32 = stdDateFormat15._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale32, (java.lang.Boolean) false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat15.", stdDateFormat0.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean8 = stdDateFormat0.isLenient();
        java.util.TimeZone timeZone9 = stdDateFormat0.getTimeZone();
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateTimeInstance();
        dateFormat10.setLenient(false);
        dateFormat10.setLenient(true);
        java.util.Calendar calendar15 = dateFormat10.getCalendar();
        stdDateFormat0.setCalendar(calendar15);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        dateFormat18.setLenient(true);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        dateFormat23.setNumberFormat(numberFormat25);
        stdDateFormat21.setNumberFormat(numberFormat25);
        boolean boolean29 = stdDateFormat21.looksLikeISO8601("hi!");
        java.lang.String str30 = stdDateFormat21.toString();
        java.util.TimeZone timeZone31 = stdDateFormat21._timezone;
        java.text.AttributedCharacterIterator attributedCharacterIterator33 = stdDateFormat21.formatToCharacterIterator((java.lang.Object) 0);
        java.util.Date date35 = stdDateFormat21.parse("-1");
        java.lang.String str36 = dateFormat18.format(date35);
        java.lang.String str37 = stdDateFormat0.format(date35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat21.", stdDateFormat0.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat0));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.util.Locale locale10 = stdDateFormat0._locale;
        java.lang.String str11 = stdDateFormat0.toString();
        stdDateFormat0._clearFormats();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat17);
        stdDateFormat13.setNumberFormat(numberFormat17);
        boolean boolean21 = stdDateFormat13.looksLikeISO8601("hi!");
        java.lang.String str22 = stdDateFormat13.toString();
        java.util.TimeZone timeZone23 = stdDateFormat13._timezone;
        java.text.NumberFormat numberFormat24 = stdDateFormat13.getNumberFormat();
        java.util.TimeZone timeZone25 = stdDateFormat13.getTimeZone();
        java.util.Locale locale26 = stdDateFormat13._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = stdDateFormat0.withLocale(locale26);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat27 and stdDateFormat13.", stdDateFormat27.equals(stdDateFormat13) == stdDateFormat13.equals(stdDateFormat27));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
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
        java.util.TimeZone timeZone15 = stdDateFormat0.getTimeZone();
        stdDateFormat0._clearFormats();
        java.text.DateFormat dateFormat17 = stdDateFormat0._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat18, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat18.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat18.equals(stdDateFormat0));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
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
        boolean boolean17 = stdDateFormat0.looksLikeISO8601("Wed, 31 Dec 1969 23:59:59 UTC");
        java.lang.String str18 = stdDateFormat0.toString();
        java.util.TimeZone timeZone19 = stdDateFormat0._timezone;
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone19);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        dateFormat23.setNumberFormat(numberFormat25);
        stdDateFormat21.setNumberFormat(numberFormat25);
        boolean boolean28 = stdDateFormat21.isLenient();
        boolean boolean30 = stdDateFormat21.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.util.Locale locale31 = stdDateFormat21._locale;
        java.lang.String str32 = stdDateFormat21.toString();
        java.util.Locale locale33 = stdDateFormat21._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19, locale33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat21.", stdDateFormat0.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat0));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
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
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatISO8601_z;
        boolean boolean15 = stdDateFormat0.isLenient();
        stdDateFormat0._clearFormats();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean24 = stdDateFormat17.isLenient();
        java.text.DateFormat dateFormat25 = stdDateFormat17._formatISO8601;
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        java.util.Calendar calendar28 = dateFormat26.getCalendar();
        stdDateFormat17.setCalendar(calendar28);
        java.util.Calendar calendar30 = stdDateFormat17.getCalendar();
        java.text.DateFormat dateFormat31 = stdDateFormat17._formatISO8601_z;
        java.util.Locale locale32 = stdDateFormat17._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = stdDateFormat0.withLocale(locale32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat33 and stdDateFormat17.", stdDateFormat33.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat33));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
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
        java.lang.Boolean boolean13 = stdDateFormat0._lenient;
        java.util.TimeZone timeZone14 = stdDateFormat0._timezone;
        java.util.TimeZone timeZone15 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15);
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15);
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = stdDateFormat0.withTimeZone(timeZone15);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat20, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat20.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat20.equals(stdDateFormat0));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date2 = stdDateFormat0.parse("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.text.DateFormat dateFormat10 = stdDateFormat0._formatRFC1123;
        java.lang.Boolean boolean11 = stdDateFormat0._lenient;
        java.util.TimeZone timeZone12 = stdDateFormat0._timezone;
        java.text.DateFormat dateFormat13 = stdDateFormat0._formatISO8601;
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatPlain;
        java.util.Calendar calendar15 = stdDateFormat0.getCalendar();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat16.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.lang.Boolean boolean7 = stdDateFormat0._lenient;
        java.util.TimeZone timeZone8 = stdDateFormat0.getTimeZone();
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
        java.text.DateFormat dateFormat24 = stdDateFormat10._formatISO8601;
        java.text.DateFormat dateFormat25 = stdDateFormat10._formatRFC1123;
        boolean boolean27 = stdDateFormat10.looksLikeISO8601("Wed, 31 Dec 1969 23:59:59 UTC");
        java.text.DateFormat dateFormat28 = stdDateFormat10._formatISO8601_z;
        java.lang.String str29 = stdDateFormat10.toString();
        boolean boolean30 = stdDateFormat10.isLenient();
        stdDateFormat0._formatRFC1123 = stdDateFormat10;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat10.", stdDateFormat0.equals(stdDateFormat10) == stdDateFormat10.equals(stdDateFormat0));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
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
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatISO8601;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        boolean boolean19 = dateFormat17.equals((java.lang.Object) "yyyy-MM-dd");
        java.util.TimeZone timeZone20 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone20);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat24);
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        java.util.Calendar calendar28 = dateFormat26.getCalendar();
        dateFormat22.setCalendar(calendar28);
        boolean boolean30 = dateFormat21.equals((java.lang.Object) calendar28);
        dateFormat17.setCalendar(calendar28);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        java.lang.String str35 = dateFormat32.format((java.lang.Object) 3);
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat37 = dateFormat36.getNumberFormat();
        dateFormat32.setNumberFormat(numberFormat37);
        dateFormat17.setNumberFormat(numberFormat37);
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
        boolean boolean67 = dateFormat17.equals((java.lang.Object) stdDateFormat40);
        java.text.NumberFormat numberFormat68 = stdDateFormat40.getNumberFormat();
        java.util.TimeZone timeZone69 = stdDateFormat40._timezone;
        java.text.DateFormat dateFormat70 = stdDateFormat40._formatRFC1123;
        java.util.Locale locale71 = stdDateFormat40._locale;
        java.lang.Boolean boolean72 = stdDateFormat40._lenient;
        stdDateFormat0._formatISO8601_z = stdDateFormat40;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat40.", stdDateFormat0.equals(stdDateFormat40) == stdDateFormat40.equals(stdDateFormat0));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
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
        boolean boolean15 = stdDateFormat0.isLenient();
        java.util.TimeZone timeZone16 = stdDateFormat0._timezone;
        java.util.Locale locale17 = stdDateFormat0._locale;
        java.util.Locale locale18 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat19 = stdDateFormat0._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat24);
        stdDateFormat20.setNumberFormat(numberFormat24);
        java.util.TimeZone timeZone27 = stdDateFormat20.getTimeZone();
        stdDateFormat0._formatISO8601 = stdDateFormat20;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat20.", stdDateFormat0.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat0));
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
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
        stdDateFormat0._clearFormats();
        java.util.TimeZone timeZone14 = stdDateFormat0.getTimeZone();
        java.lang.String str15 = stdDateFormat0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat0.setLenient(true);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
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
        stdDateFormat0._clearFormats();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance((int) (short) 1);
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat17);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean27 = stdDateFormat19.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat28 = stdDateFormat19._formatISO8601_z;
        boolean boolean30 = stdDateFormat19.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.util.Locale locale31 = stdDateFormat19._locale;
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.lang.String[] strArray33 = com.fasterxml.jackson.databind.util.StdDateFormat.ALL_FORMATS;
        boolean boolean34 = dateFormat32.equals((java.lang.Object) strArray33);
        java.util.Calendar calendar35 = dateFormat32.getCalendar();
        java.text.NumberFormat numberFormat36 = dateFormat32.getNumberFormat();
        stdDateFormat19.setNumberFormat(numberFormat36);
        java.text.DateFormat dateFormat38 = stdDateFormat19._formatISO8601_z;
        stdDateFormat0._formatISO8601 = stdDateFormat19;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat19.", stdDateFormat0.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat0));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
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
        java.text.DateFormat dateFormat16 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat17.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        dateFormat25.setNumberFormat(numberFormat27);
        stdDateFormat23.setNumberFormat(numberFormat27);
        boolean boolean31 = stdDateFormat23.looksLikeISO8601("hi!");
        java.lang.String str32 = stdDateFormat23.toString();
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean35 = dateFormat33.equals((java.lang.Object) true);
        stdDateFormat23._formatISO8601 = dateFormat33;
        boolean boolean37 = stdDateFormat23.isLenient();
        boolean boolean39 = stdDateFormat23.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.text.NumberFormat numberFormat40 = stdDateFormat23.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat40);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat23.", stdDateFormat0.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat0));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat13, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat13.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat13.equals(stdDateFormat0));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.util.Locale locale10 = stdDateFormat0._locale;
        java.util.Calendar calendar11 = stdDateFormat0.getCalendar();
        stdDateFormat0._clearFormats();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date14 = stdDateFormat0.parse("EEE, dd MMM yyyy HH:mm:ss zzz");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
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
        boolean boolean13 = stdDateFormat0.looksLikeISO8601("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        stdDateFormat0._clearFormats();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj16 = stdDateFormat0.parseObject("\u0e21\u0e04. 2513");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601;
        java.lang.String str10 = stdDateFormat0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat0.setLenient(false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
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
        stdDateFormat0._clearFormats();
        stdDateFormat0._lenient = false;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        dateFormat29.setNumberFormat(numberFormat31);
        stdDateFormat27.setNumberFormat(numberFormat31);
        boolean boolean34 = stdDateFormat27.isLenient();
        java.text.DateFormat dateFormat35 = stdDateFormat27._formatISO8601;
        stdDateFormat27._clearFormats();
        stdDateFormat27._clearFormats();
        java.lang.String str38 = stdDateFormat27.toString();
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        boolean boolean42 = dateFormat40.equals((java.lang.Object) "yyyy-MM-dd");
        stdDateFormat27._formatRFC1123 = dateFormat40;
        stdDateFormat27._lenient = false;
        java.util.TimeZone timeZone46 = stdDateFormat27.getTimeZone();
        stdDateFormat0._formatISO8601 = stdDateFormat27;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat27.", stdDateFormat0.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat0));
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        dateFormat14.setNumberFormat(numberFormat16);
        stdDateFormat12.setNumberFormat(numberFormat16);
        boolean boolean20 = stdDateFormat12.looksLikeISO8601("hi!");
        java.lang.String str21 = stdDateFormat12.toString();
        java.util.TimeZone timeZone22 = stdDateFormat12._timezone;
        java.text.NumberFormat numberFormat23 = stdDateFormat12.getNumberFormat();
        java.lang.String str24 = stdDateFormat12.toString();
        java.util.TimeZone timeZone25 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone25);
        stdDateFormat12._formatRFC1123 = dateFormat26;
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        dateFormat29.setNumberFormat(numberFormat31);
        java.text.NumberFormat numberFormat33 = dateFormat29.getNumberFormat();
        stdDateFormat12.setNumberFormat(numberFormat33);
        java.util.Locale locale35 = stdDateFormat12._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = stdDateFormat0.withLocale(locale35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat36 and stdDateFormat12.", stdDateFormat36.equals(stdDateFormat12) == stdDateFormat12.equals(stdDateFormat36));
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
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
        java.util.Locale locale13 = stdDateFormat0._locale;
        java.util.TimeZone timeZone14 = stdDateFormat0._timezone;
        java.util.Locale locale15 = stdDateFormat0._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean23 = stdDateFormat16.isLenient();
        java.text.DateFormat dateFormat24 = stdDateFormat16._formatISO8601;
        stdDateFormat16._clearFormats();
        stdDateFormat16._clearFormats();
        java.lang.String str27 = stdDateFormat16.toString();
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        boolean boolean31 = dateFormat29.equals((java.lang.Object) "yyyy-MM-dd");
        stdDateFormat16._formatRFC1123 = dateFormat29;
        stdDateFormat16._lenient = false;
        java.text.NumberFormat numberFormat35 = stdDateFormat16.getNumberFormat();
        java.util.TimeZone timeZone36 = stdDateFormat16.getTimeZone();
        stdDateFormat0._formatRFC1123 = stdDateFormat16;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
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
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        boolean boolean15 = dateFormat13.equals((java.lang.Object) "yyyy-MM-dd");
        stdDateFormat0._formatRFC1123 = dateFormat13;
        stdDateFormat0._lenient = false;
        java.util.TimeZone timeZone19 = stdDateFormat0._timezone;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateTimeInstance();
        dateFormat20.setLenient(false);
        dateFormat20.setLenient(false);
        java.text.NumberFormat numberFormat25 = dateFormat20.getNumberFormat();
        java.util.Calendar calendar26 = dateFormat20.getCalendar();
        stdDateFormat0._formatISO8601 = dateFormat20;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        dateFormat30.setNumberFormat(numberFormat32);
        stdDateFormat28.setNumberFormat(numberFormat32);
        boolean boolean35 = stdDateFormat28.isLenient();
        java.text.DateFormat dateFormat36 = stdDateFormat28._formatISO8601;
        stdDateFormat28._clearFormats();
        stdDateFormat28._clearFormats();
        java.lang.String str39 = stdDateFormat28.toString();
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        boolean boolean43 = dateFormat41.equals((java.lang.Object) "yyyy-MM-dd");
        stdDateFormat28._formatRFC1123 = dateFormat41;
        stdDateFormat28._clearFormats();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean46 = stdDateFormat0.equals((java.lang.Object) stdDateFormat28);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
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
        boolean boolean12 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat17);
        stdDateFormat13.setNumberFormat(numberFormat17);
        boolean boolean21 = stdDateFormat13.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat22 = stdDateFormat13._formatISO8601;
        java.util.Locale locale23 = stdDateFormat13._locale;
        java.text.DateFormat dateFormat24 = stdDateFormat13._formatISO8601_z;
        stdDateFormat0._formatPlain = stdDateFormat13;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat13.", stdDateFormat0.equals(stdDateFormat13) == stdDateFormat13.equals(stdDateFormat0));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        java.text.DateFormat dateFormat21 = stdDateFormat14._formatISO8601;
        stdDateFormat14._lenient = true;
        java.lang.String str24 = stdDateFormat14.toString();
        java.text.DateFormat dateFormat25 = stdDateFormat14._formatPlain;
        java.util.Locale locale26 = stdDateFormat14._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale26);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat14.", stdDateFormat0.equals(stdDateFormat14) == stdDateFormat14.equals(stdDateFormat0));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        boolean boolean10 = stdDateFormat0.isLenient();
        stdDateFormat0._lenient = true;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat13, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat13.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat13.equals(stdDateFormat0));
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        stdDateFormat0._clearFormats();
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatISO8601;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        stdDateFormat0.setTimeZone(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean23 = stdDateFormat16.isLenient();
        boolean boolean25 = stdDateFormat16.looksLikeISO8601("");
        java.text.DateFormat dateFormat26 = stdDateFormat16._formatRFC1123;
        java.lang.Boolean boolean27 = stdDateFormat16._lenient;
        java.util.TimeZone timeZone28 = stdDateFormat16._timezone;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateTimeInstance(2, (int) (byte) 1);
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        stdDateFormat16._formatISO8601 = dateFormat31;
        java.util.Locale locale34 = stdDateFormat16._locale;
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateInstance((int) (short) 0, locale34);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale34, (java.lang.Boolean) false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj16 = stdDateFormat0.parseObject("Wed, 31 Dec 1969 23:59:59 UTC");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601;
        stdDateFormat0._lenient = true;
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat17);
        stdDateFormat13.setNumberFormat(numberFormat17);
        boolean boolean20 = stdDateFormat13.isLenient();
        boolean boolean22 = stdDateFormat13.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.DateFormat dateFormat23 = stdDateFormat13._formatISO8601_z;
        java.lang.Boolean boolean24 = stdDateFormat13._lenient;
        boolean boolean25 = stdDateFormat13.isLenient();
        stdDateFormat0._formatPlain = stdDateFormat13;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat13.", stdDateFormat0.equals(stdDateFormat13) == stdDateFormat13.equals(stdDateFormat0));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj14 = stdDateFormat0.parseObject("31/12/69 23:59");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
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
        boolean boolean13 = stdDateFormat0.isLenient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date15 = stdDateFormat0.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
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
        java.util.TimeZone timeZone14 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean25 = stdDateFormat17.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat26 = stdDateFormat17._formatISO8601_z;
        boolean boolean28 = stdDateFormat17.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.util.Locale locale29 = stdDateFormat17._locale;
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14, locale29);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
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
        boolean boolean16 = stdDateFormat0.isLenient();
        stdDateFormat0._lenient = true;
        stdDateFormat0._lenient = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat0.setLenient(false);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
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
        boolean boolean16 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat17 = stdDateFormat0._formatPlain;
        java.util.TimeZone timeZone18 = stdDateFormat0.getTimeZone();
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
        java.util.Locale locale34 = stdDateFormat19._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18, locale34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat19.", stdDateFormat0.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat0));
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        boolean boolean21 = stdDateFormat14.isLenient();
        boolean boolean23 = stdDateFormat14.looksLikeISO8601("");
        boolean boolean24 = stdDateFormat14.isLenient();
        java.util.Locale locale25 = stdDateFormat14._locale;
        java.util.TimeZone timeZone26 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat14._timezone = timeZone26;
        java.text.DateFormat dateFormat28 = stdDateFormat14._formatISO8601;
        java.text.DateFormat dateFormat29 = stdDateFormat14._formatRFC1123;
        boolean boolean31 = stdDateFormat14.looksLikeISO8601("Wed, 31 Dec 1969 23:59:59 UTC");
        java.lang.String str32 = stdDateFormat14.toString();
        java.util.TimeZone timeZone33 = stdDateFormat14._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat0.withTimeZone(timeZone33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat14.", stdDateFormat0.equals(stdDateFormat14) == stdDateFormat14.equals(stdDateFormat0));
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
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
        stdDateFormat0._clearFormats();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date15 = stdDateFormat0.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
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
        boolean boolean14 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        boolean boolean22 = stdDateFormat15.isLenient();
        boolean boolean24 = stdDateFormat15.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        stdDateFormat0._formatISO8601_z = stdDateFormat15;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat15.", stdDateFormat0.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
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
        java.util.Date date16 = stdDateFormat0.parse("1970-01-01T00:00:00.010+0000");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean24 = stdDateFormat17.isLenient();
        boolean boolean26 = stdDateFormat17.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        boolean boolean27 = stdDateFormat17.isLenient();
        java.lang.Boolean boolean28 = stdDateFormat17._lenient;
        stdDateFormat17._lenient = false;
        java.text.DateFormat dateFormat31 = stdDateFormat17._formatPlain;
        java.util.Locale locale32 = stdDateFormat17._locale;
        java.lang.Object obj34 = stdDateFormat17.parseObject("1970-01-01T00:00:00.000Z");
        stdDateFormat0._formatRFC1123 = stdDateFormat17;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
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
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean25 = stdDateFormat17.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat26 = stdDateFormat17._formatISO8601_z;
        java.text.DateFormat dateFormat27 = stdDateFormat17._formatPlain;
        java.text.DateFormat dateFormat28 = stdDateFormat17._formatISO8601_z;
        java.util.TimeZone timeZone29 = stdDateFormat17._timezone;
        java.text.DateFormat dateFormat30 = stdDateFormat17._formatRFC1123;
        stdDateFormat17._lenient = false;
        java.util.Locale locale33 = stdDateFormat17._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale33, (java.lang.Boolean) false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        boolean boolean21 = stdDateFormat14.isLenient();
        java.text.DateFormat dateFormat22 = stdDateFormat14._formatISO8601;
        java.util.TimeZone timeZone23 = stdDateFormat14.getTimeZone();
        boolean boolean25 = stdDateFormat14.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        boolean boolean27 = stdDateFormat14.looksLikeISO8601("0");
        java.text.NumberFormat numberFormat28 = stdDateFormat14.getNumberFormat();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        dateFormat31.setNumberFormat(numberFormat33);
        stdDateFormat29.setNumberFormat(numberFormat33);
        boolean boolean37 = stdDateFormat29.looksLikeISO8601("hi!");
        java.lang.String str38 = stdDateFormat29.toString();
        java.util.Locale locale39 = stdDateFormat29._locale;
        java.text.DateFormat dateFormat40 = stdDateFormat29._formatPlain;
        java.util.Locale locale41 = stdDateFormat29._locale;
        stdDateFormat29._lenient = false;
        java.text.DateFormat dateFormat44 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat46 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat47 = dateFormat46.getNumberFormat();
        dateFormat45.setNumberFormat(numberFormat47);
        java.text.DateFormat dateFormat49 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat50 = dateFormat49.getNumberFormat();
        java.util.Calendar calendar51 = dateFormat49.getCalendar();
        dateFormat45.setCalendar(calendar51);
        dateFormat44.setCalendar(calendar51);
        stdDateFormat29.setCalendar(calendar51);
        stdDateFormat14.setCalendar(calendar51);
        java.util.Locale locale56 = stdDateFormat14._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat58 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale56, (java.lang.Boolean) false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat14.", stdDateFormat0.equals(stdDateFormat14) == stdDateFormat14.equals(stdDateFormat0));
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
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
        java.text.DateFormat dateFormat16 = stdDateFormat0._formatISO8601_z;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat0.setLenient(false);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
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
        java.lang.Boolean boolean13 = stdDateFormat0._lenient;
        java.util.TimeZone timeZone14 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        boolean boolean22 = stdDateFormat15.isLenient();
        boolean boolean24 = stdDateFormat15.looksLikeISO8601("");
        boolean boolean25 = stdDateFormat15.isLenient();
        java.util.Locale locale26 = stdDateFormat15._locale;
        java.util.TimeZone timeZone27 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat15._timezone = timeZone27;
        java.lang.String str29 = stdDateFormat15.toString();
        java.text.DateFormat dateFormat30 = stdDateFormat15._formatPlain;
        java.text.DateFormat dateFormat31 = stdDateFormat15._formatPlain;
        boolean boolean32 = stdDateFormat15.isLenient();
        java.lang.Boolean boolean33 = stdDateFormat15._lenient;
        stdDateFormat0._formatPlain = stdDateFormat15;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat15.", stdDateFormat0.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
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
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        dateFormat12.setNumberFormat(numberFormat14);
        stdDateFormat0._formatISO8601_z = dateFormat12;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj18 = stdDateFormat0.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
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
        java.lang.Boolean boolean24 = stdDateFormat0._lenient;
        java.text.DateFormat dateFormat25 = stdDateFormat0._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat26, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat26.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat26.equals(stdDateFormat0));
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
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
        java.util.Locale locale12 = stdDateFormat0._locale;
        java.util.Locale locale13 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatISO8601_z;
        boolean boolean16 = stdDateFormat0.looksLikeISO8601("1970-01-01T00:00:00.000+0000");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean24 = stdDateFormat17.isLenient();
        java.text.DateFormat dateFormat25 = stdDateFormat17._formatISO8601;
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        java.util.Calendar calendar28 = dateFormat26.getCalendar();
        stdDateFormat17.setCalendar(calendar28);
        java.util.Calendar calendar30 = stdDateFormat17.getCalendar();
        java.lang.String str31 = stdDateFormat17.toString();
        boolean boolean33 = stdDateFormat17.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.lang.String str34 = stdDateFormat17.toString();
        java.text.NumberFormat numberFormat35 = stdDateFormat17.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
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
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        java.lang.String str17 = dateFormat14.format((java.lang.Object) 3);
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat14.setNumberFormat(numberFormat19);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat24);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        dateFormat26.setNumberFormat(numberFormat28);
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        java.util.Calendar calendar32 = dateFormat30.getCalendar();
        dateFormat26.setCalendar(calendar32);
        dateFormat22.setCalendar(calendar32);
        java.text.NumberFormat numberFormat35 = dateFormat22.getNumberFormat();
        dateFormat14.setNumberFormat(numberFormat35);
        stdDateFormat0._formatISO8601 = dateFormat14;
        java.util.TimeZone timeZone38 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat40 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat44 = dateFormat43.getNumberFormat();
        dateFormat42.setNumberFormat(numberFormat44);
        stdDateFormat40.setNumberFormat(numberFormat44);
        boolean boolean47 = stdDateFormat40.isLenient();
        boolean boolean49 = stdDateFormat40.looksLikeISO8601("");
        boolean boolean50 = stdDateFormat40.isLenient();
        java.util.Locale locale51 = stdDateFormat40._locale;
        java.text.DateFormat dateFormat52 = java.text.DateFormat.getTimeInstance((int) (short) 1, locale51);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat53 = stdDateFormat0.withLocale(locale51);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat53 and stdDateFormat40.", stdDateFormat53.equals(stdDateFormat40) == stdDateFormat40.equals(stdDateFormat53));
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean23 = stdDateFormat16.isLenient();
        boolean boolean25 = stdDateFormat16.looksLikeISO8601("");
        stdDateFormat16._clearFormats();
        java.text.DateFormat dateFormat27 = stdDateFormat16._formatISO8601;
        java.util.TimeZone timeZone28 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone28);
        stdDateFormat16.setTimeZone(timeZone28);
        stdDateFormat0._timezone = timeZone28;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
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
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        boolean boolean23 = stdDateFormat15.looksLikeISO8601("hi!");
        java.lang.String str24 = stdDateFormat15.toString();
        java.util.TimeZone timeZone25 = stdDateFormat15._timezone;
        java.text.NumberFormat numberFormat26 = stdDateFormat15.getNumberFormat();
        java.util.Locale locale27 = stdDateFormat15._locale;
        java.util.Locale locale28 = stdDateFormat15._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = stdDateFormat0.withLocale(locale28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat29 and stdDateFormat15.", stdDateFormat29.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat29));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
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
        java.util.Locale locale13 = stdDateFormat0._locale;
        java.util.TimeZone timeZone14 = stdDateFormat0._timezone;
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.lang.String[] strArray16 = com.fasterxml.jackson.databind.util.StdDateFormat.ALL_FORMATS;
        boolean boolean17 = dateFormat15.equals((java.lang.Object) strArray16);
        java.util.Calendar calendar18 = dateFormat15.getCalendar();
        dateFormat15.setLenient(false);
        stdDateFormat0._formatPlain = dateFormat15;
        java.text.DateFormat dateFormat22 = stdDateFormat0._formatPlain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj24 = stdDateFormat0.parseObject("Thu, 01 Jan 1970 00:00:00 UTC");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
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
        java.util.Locale locale17 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat18 = stdDateFormat0._formatISO8601_z;
        stdDateFormat0._lenient = true;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        dateFormat23.setNumberFormat(numberFormat25);
        stdDateFormat21.setNumberFormat(numberFormat25);
        boolean boolean29 = stdDateFormat21.looksLikeISO8601("hi!");
        java.lang.String str30 = stdDateFormat21.toString();
        java.util.Locale locale31 = stdDateFormat21._locale;
        java.text.DateFormat dateFormat32 = stdDateFormat21._formatPlain;
        java.util.Locale locale33 = stdDateFormat21._locale;
        stdDateFormat21._lenient = false;
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat39 = dateFormat38.getNumberFormat();
        dateFormat37.setNumberFormat(numberFormat39);
        java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat42 = dateFormat41.getNumberFormat();
        java.util.Calendar calendar43 = dateFormat41.getCalendar();
        dateFormat37.setCalendar(calendar43);
        dateFormat36.setCalendar(calendar43);
        stdDateFormat21.setCalendar(calendar43);
        stdDateFormat0._formatISO8601_z = stdDateFormat21;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat21.", stdDateFormat0.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat0));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
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
        stdDateFormat0._clearFormats();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat0.setLenient(false);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601;
        java.util.Calendar calendar10 = stdDateFormat0.getCalendar();
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getTimeInstance();
        java.util.Calendar calendar12 = dateFormat11.getCalendar();
        stdDateFormat0.setCalendar(calendar12);
        stdDateFormat0.setLenient(true);
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
        java.lang.String str28 = stdDateFormat16.toString();
        java.util.TimeZone timeZone29 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone29);
        stdDateFormat16._formatRFC1123 = dateFormat30;
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat35 = dateFormat34.getNumberFormat();
        dateFormat33.setNumberFormat(numberFormat35);
        java.text.NumberFormat numberFormat37 = dateFormat33.getNumberFormat();
        stdDateFormat16.setNumberFormat(numberFormat37);
        java.lang.String str39 = stdDateFormat16.toString();
        boolean boolean40 = stdDateFormat16.isLenient();
        java.lang.Boolean boolean41 = stdDateFormat16._lenient;
        java.text.DateFormat dateFormat42 = stdDateFormat16._formatRFC1123;
        stdDateFormat0._formatISO8601 = stdDateFormat16;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
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
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        java.text.DateFormat dateFormat24 = stdDateFormat17._formatISO8601;
        stdDateFormat17._lenient = true;
        java.lang.String str27 = stdDateFormat17.toString();
        java.text.DateFormat dateFormat28 = stdDateFormat17._formatPlain;
        java.text.DateFormat dateFormat29 = stdDateFormat17._formatISO8601;
        java.util.Locale locale30 = stdDateFormat17._locale;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance((int) (byte) 1, locale30);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
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
        java.lang.String str15 = stdDateFormat0.toString();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean23 = stdDateFormat16.isLenient();
        boolean boolean25 = stdDateFormat16.looksLikeISO8601("");
        stdDateFormat16._clearFormats();
        java.text.DateFormat dateFormat27 = stdDateFormat16._formatPlain;
        java.util.TimeZone timeZone28 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone28);
        stdDateFormat16._timezone = timeZone28;
        java.text.DateFormat dateFormat31 = stdDateFormat16._formatPlain;
        java.util.TimeZone timeZone32 = stdDateFormat16._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = stdDateFormat0.withTimeZone(timeZone32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.text.NumberFormat numberFormat10 = stdDateFormat0.getNumberFormat();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date12 = stdDateFormat0.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
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
        java.text.DateFormat dateFormat16 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean25 = stdDateFormat17.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat26 = stdDateFormat17._formatISO8601_z;
        boolean boolean28 = stdDateFormat17.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.text.DateFormat dateFormat29 = stdDateFormat17._formatRFC1123;
        java.lang.Boolean boolean30 = stdDateFormat17._lenient;
        boolean boolean32 = stdDateFormat17.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.text.NumberFormat numberFormat33 = stdDateFormat17.getNumberFormat();
        stdDateFormat0._formatISO8601 = stdDateFormat17;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.text.DateFormat dateFormat10 = stdDateFormat0._formatRFC1123;
        java.text.NumberFormat numberFormat11 = stdDateFormat0.getNumberFormat();
        stdDateFormat0._lenient = true;
        java.text.NumberFormat numberFormat14 = stdDateFormat0.getNumberFormat();
        boolean boolean15 = stdDateFormat0.isLenient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat0.setLenient(false);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
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
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatPlain;
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean23 = stdDateFormat16.isLenient();
        boolean boolean25 = stdDateFormat16.looksLikeISO8601("");
        java.lang.String str26 = stdDateFormat16.toString();
        boolean boolean28 = stdDateFormat16.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone29 = stdDateFormat16.getTimeZone();
        java.util.Locale locale30 = stdDateFormat16._locale;
        java.util.Calendar calendar31 = stdDateFormat16.getCalendar();
        java.text.NumberFormat numberFormat32 = stdDateFormat16.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat17);
        stdDateFormat13.setNumberFormat(numberFormat17);
        boolean boolean20 = stdDateFormat13.isLenient();
        boolean boolean22 = stdDateFormat13.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.util.TimeZone timeZone23 = stdDateFormat13._timezone;
        stdDateFormat0._formatPlain = stdDateFormat13;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat13.", stdDateFormat0.equals(stdDateFormat13) == stdDateFormat13.equals(stdDateFormat0));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
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
        stdDateFormat0._clearFormats();
        java.text.NumberFormat numberFormat16 = stdDateFormat0.getNumberFormat();
        java.util.Calendar calendar17 = stdDateFormat0.getCalendar();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        dateFormat20.setNumberFormat(numberFormat22);
        stdDateFormat18.setNumberFormat(numberFormat22);
        boolean boolean26 = stdDateFormat18.looksLikeISO8601("hi!");
        java.lang.String str27 = stdDateFormat18.toString();
        java.util.TimeZone timeZone28 = stdDateFormat18._timezone;
        java.text.NumberFormat numberFormat29 = stdDateFormat18.getNumberFormat();
        java.util.TimeZone timeZone30 = stdDateFormat18.getTimeZone();
        java.util.Locale locale31 = stdDateFormat18._locale;
        java.util.TimeZone timeZone32 = stdDateFormat18.getTimeZone();
        java.lang.Boolean boolean33 = stdDateFormat18._lenient;
        stdDateFormat0._formatISO8601 = stdDateFormat18;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat18.", stdDateFormat0.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat0));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601;
        stdDateFormat0._lenient = true;
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatPlain;
        java.util.Locale locale13 = stdDateFormat0._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj15 = stdDateFormat0.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        stdDateFormat0._clearFormats();
        java.util.Locale locale8 = stdDateFormat0._locale;
        java.util.Calendar calendar9 = stdDateFormat0.getCalendar();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat10, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat10.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat10.equals(stdDateFormat0));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.NumberFormat numberFormat10 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatRFC1123;
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.lang.String[] strArray13 = com.fasterxml.jackson.databind.util.StdDateFormat.ALL_FORMATS;
        boolean boolean14 = dateFormat12.equals((java.lang.Object) strArray13);
        java.util.Calendar calendar15 = dateFormat12.getCalendar();
        java.text.NumberFormat numberFormat16 = dateFormat12.getNumberFormat();
        boolean boolean17 = stdDateFormat0.equals((java.lang.Object) numberFormat16);
        java.util.TimeZone timeZone18 = stdDateFormat0._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date20 = stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
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
        java.util.Locale locale31 = stdDateFormat17._locale;
        java.util.Locale locale32 = stdDateFormat17._locale;
        java.util.Locale locale33 = stdDateFormat17._locale;
        java.text.DateFormat dateFormat34 = stdDateFormat17._formatISO8601;
        java.text.DateFormat dateFormat35 = stdDateFormat17._formatISO8601;
        java.text.DateFormat dateFormat36 = stdDateFormat17._formatISO8601;
        java.util.TimeZone timeZone37 = stdDateFormat17._timezone;
        java.util.Locale locale38 = stdDateFormat17._locale;
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone16, locale38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
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
        java.util.Calendar calendar14 = stdDateFormat0.getCalendar();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat16);
        java.text.DateFormat dateFormat18 = stdDateFormat0._formatRFC1123;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance();
        dateFormat19.setLenient(false);
        dateFormat19.setLenient(true);
        stdDateFormat0._formatISO8601 = dateFormat19;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        dateFormat27.setNumberFormat(numberFormat29);
        stdDateFormat25.setNumberFormat(numberFormat29);
        boolean boolean33 = stdDateFormat25.looksLikeISO8601("hi!");
        java.lang.String str34 = stdDateFormat25.toString();
        java.util.TimeZone timeZone35 = stdDateFormat25._timezone;
        java.text.NumberFormat numberFormat36 = stdDateFormat25.getNumberFormat();
        boolean boolean37 = stdDateFormat25.isLenient();
        java.util.Calendar calendar38 = stdDateFormat25.getCalendar();
        stdDateFormat0._formatPlain = stdDateFormat25;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat25.", stdDateFormat0.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat0));
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
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
        java.text.DateFormat dateFormat18 = stdDateFormat0._formatISO8601;
        java.util.Locale locale19 = stdDateFormat0._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        stdDateFormat20.setNumberFormat(numberFormat22);
        java.text.DateFormat dateFormat24 = stdDateFormat20._formatISO8601;
        java.util.Locale locale25 = stdDateFormat20._locale;
        java.util.Calendar calendar26 = stdDateFormat20.getCalendar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean27 = stdDateFormat0.equals((java.lang.Object) stdDateFormat20);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
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
        java.lang.String str16 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance(2, (int) (byte) 1);
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        stdDateFormat0._formatPlain = dateFormat19;
        java.text.DateFormat dateFormat22 = stdDateFormat0._formatRFC1123;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date24 = stdDateFormat0.parse("hi!");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601;
        java.text.DateFormat dateFormat10 = stdDateFormat0._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        stdDateFormat11.setNumberFormat(numberFormat15);
        boolean boolean18 = stdDateFormat11.isLenient();
        boolean boolean20 = stdDateFormat11.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        stdDateFormat11._formatPlain = dateFormat21;
        java.text.DateFormat dateFormat23 = stdDateFormat11._formatISO8601_z;
        java.text.DateFormat dateFormat24 = stdDateFormat11._formatPlain;
        java.util.TimeZone timeZone25 = stdDateFormat11.getTimeZone();
        java.util.TimeZone timeZone26 = stdDateFormat11._timezone;
        java.lang.String str27 = stdDateFormat11.toString();
        java.text.DateFormat dateFormat28 = stdDateFormat11._formatISO8601_z;
        java.util.Date date30 = stdDateFormat11.parse("-1");
        java.lang.String str31 = stdDateFormat0.format(date30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat11.", stdDateFormat0.equals(stdDateFormat11) == stdDateFormat11.equals(stdDateFormat0));
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
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
        java.lang.Boolean boolean13 = stdDateFormat0._lenient;
        java.util.Date date15 = stdDateFormat0.parse("0");
        boolean boolean16 = stdDateFormat0.isLenient();
        boolean boolean17 = stdDateFormat0.isLenient();
        java.text.NumberFormat numberFormat18 = stdDateFormat0.getNumberFormat();
        boolean boolean20 = stdDateFormat0.looksLikeISO8601("0");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        dateFormat23.setNumberFormat(numberFormat25);
        stdDateFormat21.setNumberFormat(numberFormat25);
        boolean boolean28 = stdDateFormat21.isLenient();
        boolean boolean30 = stdDateFormat21.looksLikeISO8601("");
        boolean boolean31 = stdDateFormat21.isLenient();
        java.util.Locale locale32 = stdDateFormat21._locale;
        java.util.TimeZone timeZone33 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat21._timezone = timeZone33;
        java.text.DateFormat dateFormat35 = stdDateFormat21._formatISO8601;
        java.text.DateFormat dateFormat36 = stdDateFormat21._formatRFC1123;
        stdDateFormat21._clearFormats();
        java.text.DateFormat dateFormat38 = stdDateFormat21._formatPlain;
        stdDateFormat0._formatISO8601 = stdDateFormat21;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat21.", stdDateFormat0.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat0));
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.lang.String str7 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601;
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat10, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat10.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat10.equals(stdDateFormat0));
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
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
        boolean boolean15 = stdDateFormat0.looksLikeISO8601("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 2513");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean23 = stdDateFormat16.isLenient();
        java.util.TimeZone timeZone24 = stdDateFormat16._timezone;
        boolean boolean26 = stdDateFormat16.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.lang.Boolean boolean27 = stdDateFormat16._lenient;
        stdDateFormat0._formatRFC1123 = stdDateFormat16;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
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
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        boolean boolean15 = dateFormat13.equals((java.lang.Object) "yyyy-MM-dd");
        stdDateFormat0._formatRFC1123 = dateFormat13;
        stdDateFormat0._lenient = false;
        java.util.TimeZone timeZone19 = stdDateFormat0._timezone;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateTimeInstance();
        dateFormat20.setLenient(false);
        dateFormat20.setLenient(false);
        java.text.NumberFormat numberFormat25 = dateFormat20.getNumberFormat();
        java.util.Calendar calendar26 = dateFormat20.getCalendar();
        stdDateFormat0._formatISO8601 = dateFormat20;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        dateFormat30.setNumberFormat(numberFormat32);
        stdDateFormat28.setNumberFormat(numberFormat32);
        boolean boolean35 = stdDateFormat28.isLenient();
        java.text.DateFormat dateFormat36 = stdDateFormat28._formatISO8601;
        stdDateFormat28._clearFormats();
        stdDateFormat28._clearFormats();
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateInstance();
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat42 = dateFormat41.getNumberFormat();
        dateFormat40.setNumberFormat(numberFormat42);
        dateFormat39.setNumberFormat(numberFormat42);
        stdDateFormat28.setNumberFormat(numberFormat42);
        boolean boolean46 = stdDateFormat28.isLenient();
        java.util.TimeZone timeZone47 = stdDateFormat28._timezone;
        java.text.DateFormat dateFormat49 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        boolean boolean51 = dateFormat49.equals((java.lang.Object) "yyyy-MM-dd");
        java.util.TimeZone timeZone52 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat53 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone52);
        java.text.DateFormat dateFormat54 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat55 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat56 = dateFormat55.getNumberFormat();
        dateFormat54.setNumberFormat(numberFormat56);
        java.text.DateFormat dateFormat58 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat59 = dateFormat58.getNumberFormat();
        java.util.Calendar calendar60 = dateFormat58.getCalendar();
        dateFormat54.setCalendar(calendar60);
        boolean boolean62 = dateFormat53.equals((java.lang.Object) calendar60);
        dateFormat49.setCalendar(calendar60);
        stdDateFormat28.setCalendar(calendar60);
        stdDateFormat0._formatPlain = stdDateFormat28;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat28.", stdDateFormat0.equals(stdDateFormat28) == stdDateFormat28.equals(stdDateFormat0));
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
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
        java.util.Date date14 = stdDateFormat0.parse("-1");
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatRFC1123;
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
        java.util.Locale locale30 = stdDateFormat17._locale;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getTimeInstance(2, locale30);
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat35 = dateFormat34.getNumberFormat();
        dateFormat33.setNumberFormat(numberFormat35);
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat39 = dateFormat38.getNumberFormat();
        dateFormat37.setNumberFormat(numberFormat39);
        java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat42 = dateFormat41.getNumberFormat();
        java.util.Calendar calendar43 = dateFormat41.getCalendar();
        dateFormat37.setCalendar(calendar43);
        dateFormat33.setCalendar(calendar43);
        dateFormat31.setCalendar(calendar43);
        stdDateFormat0._formatISO8601_z = dateFormat31;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601_z;
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("\u0e21\u0e04. 2513");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat0.setLenient(false);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
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
        boolean boolean15 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean24 = stdDateFormat16.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat25 = stdDateFormat16._formatISO8601_z;
        java.text.DateFormat dateFormat26 = stdDateFormat16._formatPlain;
        boolean boolean28 = stdDateFormat16.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        stdDateFormat16._lenient = false;
        java.lang.String str31 = stdDateFormat16.toString();
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance((int) (short) 1);
        dateFormat33.setLenient(true);
        stdDateFormat16._formatISO8601 = dateFormat33;
        stdDateFormat0._formatISO8601 = dateFormat33;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
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
        java.text.NumberFormat numberFormat14 = stdDateFormat0.getNumberFormat();
        java.util.TimeZone timeZone15 = stdDateFormat0._timezone;
        java.lang.String str16 = stdDateFormat0.toString();
        java.util.TimeZone timeZone17 = stdDateFormat0._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        stdDateFormat19.setNumberFormat(numberFormat21);
        java.text.DateFormat dateFormat23 = stdDateFormat19._formatISO8601;
        java.util.Locale locale24 = stdDateFormat19._locale;
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance((int) (short) 0, locale24);
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone17, locale24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat19.", stdDateFormat0.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat0));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
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
        java.text.NumberFormat numberFormat14 = stdDateFormat0.getNumberFormat();
        java.util.Locale locale15 = stdDateFormat0._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean23 = stdDateFormat16.isLenient();
        boolean boolean25 = stdDateFormat16.looksLikeISO8601("");
        boolean boolean26 = stdDateFormat16.isLenient();
        java.util.Locale locale27 = stdDateFormat16._locale;
        java.util.TimeZone timeZone28 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat16._timezone = timeZone28;
        java.text.DateFormat dateFormat30 = stdDateFormat16._formatISO8601;
        java.text.DateFormat dateFormat31 = stdDateFormat16._formatRFC1123;
        java.lang.Boolean boolean32 = stdDateFormat16._lenient;
        java.text.NumberFormat numberFormat33 = stdDateFormat16.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        stdDateFormat0._clearFormats();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat17);
        stdDateFormat13.setNumberFormat(numberFormat17);
        boolean boolean21 = stdDateFormat13.looksLikeISO8601("hi!");
        java.lang.String str22 = stdDateFormat13.toString();
        java.util.TimeZone timeZone23 = stdDateFormat13._timezone;
        java.text.NumberFormat numberFormat24 = stdDateFormat13.getNumberFormat();
        java.lang.String str25 = stdDateFormat13.toString();
        java.util.TimeZone timeZone26 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        stdDateFormat13._formatRFC1123 = dateFormat27;
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        dateFormat30.setNumberFormat(numberFormat32);
        java.text.NumberFormat numberFormat34 = dateFormat30.getNumberFormat();
        stdDateFormat13.setNumberFormat(numberFormat34);
        java.util.Locale locale36 = stdDateFormat13._locale;
        stdDateFormat13._clearFormats();
        stdDateFormat13._clearFormats();
        java.text.DateFormat dateFormat39 = stdDateFormat13._formatRFC1123;
        java.util.TimeZone timeZone40 = stdDateFormat13.getTimeZone();
        stdDateFormat0._formatISO8601_z = stdDateFormat13;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat13.", stdDateFormat0.equals(stdDateFormat13) == stdDateFormat13.equals(stdDateFormat0));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
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
        java.lang.Boolean boolean13 = stdDateFormat0._lenient;
        java.lang.Boolean boolean14 = stdDateFormat0._lenient;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        java.text.DateFormat dateFormat22 = stdDateFormat15._formatISO8601;
        stdDateFormat15._lenient = true;
        java.util.Calendar calendar25 = stdDateFormat15.getCalendar();
        boolean boolean26 = stdDateFormat15.isLenient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean27 = stdDateFormat0.equals((java.lang.Object) stdDateFormat15);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
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
        boolean boolean17 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd");
        java.text.DateFormat dateFormat18 = stdDateFormat0._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean26 = stdDateFormat19.isLenient();
        boolean boolean28 = stdDateFormat19.looksLikeISO8601("");
        boolean boolean29 = stdDateFormat19.isLenient();
        java.util.Locale locale30 = stdDateFormat19._locale;
        java.util.TimeZone timeZone31 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat19._timezone = timeZone31;
        java.lang.String str33 = stdDateFormat19.toString();
        boolean boolean35 = stdDateFormat19.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.lang.String str36 = stdDateFormat19.toString();
        stdDateFormat19._lenient = false;
        stdDateFormat0._formatISO8601_z = stdDateFormat19;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat19.", stdDateFormat0.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat0));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
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
        java.util.Calendar calendar15 = stdDateFormat0.getCalendar();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat16.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
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
        java.util.TimeZone timeZone14 = stdDateFormat0.getTimeZone();
        java.lang.Boolean boolean15 = stdDateFormat0._lenient;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean24 = stdDateFormat17.isLenient();
        boolean boolean26 = stdDateFormat17.looksLikeISO8601("");
        boolean boolean27 = stdDateFormat17.isLenient();
        java.util.Locale locale28 = stdDateFormat17._locale;
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance((int) (short) 0, locale28);
        java.text.AttributedCharacterIterator attributedCharacterIterator30 = stdDateFormat0.formatToCharacterIterator((java.lang.Object) (short) 0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
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
        stdDateFormat0._lenient = false;
        java.lang.String str15 = stdDateFormat0.toString();
        stdDateFormat0._clearFormats();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj18 = stdDateFormat0.parseObject("\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21 2513");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean8 = stdDateFormat0.isLenient();
        stdDateFormat0._clearFormats();
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        stdDateFormat0._clearFormats();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat0.setLenient(false);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
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
        java.lang.String str16 = stdDateFormat0.toString();
        stdDateFormat0._lenient = false;
        java.lang.Boolean boolean19 = stdDateFormat0._lenient;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat20, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat20.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat20.equals(stdDateFormat0));
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean8 = stdDateFormat0.isLenient();
        stdDateFormat0._clearFormats();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat10, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat10.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat10.equals(stdDateFormat0));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
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
        java.lang.String str16 = stdDateFormat0.toString();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean24 = stdDateFormat17.isLenient();
        boolean boolean26 = stdDateFormat17.looksLikeISO8601("");
        stdDateFormat17._clearFormats();
        java.text.DateFormat dateFormat28 = stdDateFormat17._formatPlain;
        java.util.TimeZone timeZone29 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone29);
        stdDateFormat17._timezone = timeZone29;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateTimeInstance();
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        stdDateFormat17._formatISO8601 = dateFormat32;
        stdDateFormat0._formatPlain = stdDateFormat17;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.util.Locale locale10 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        dateFormat14.setNumberFormat(numberFormat16);
        stdDateFormat12.setNumberFormat(numberFormat16);
        boolean boolean20 = stdDateFormat12.looksLikeISO8601("hi!");
        java.lang.String str21 = stdDateFormat12.toString();
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean24 = dateFormat22.equals((java.lang.Object) true);
        stdDateFormat12._formatISO8601 = dateFormat22;
        java.text.DateFormat dateFormat26 = stdDateFormat12._formatRFC1123;
        java.lang.String str27 = stdDateFormat12.toString();
        stdDateFormat0._formatISO8601 = stdDateFormat12;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat12.", stdDateFormat0.equals(stdDateFormat12) == stdDateFormat12.equals(stdDateFormat0));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        dateFormat25.setNumberFormat(numberFormat27);
        stdDateFormat23.setNumberFormat(numberFormat27);
        boolean boolean30 = stdDateFormat23.isLenient();
        boolean boolean32 = stdDateFormat23.looksLikeISO8601("");
        boolean boolean33 = stdDateFormat23.isLenient();
        java.util.Locale locale34 = stdDateFormat23._locale;
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getTimeInstance((int) (short) 1, locale34);
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getTimeInstance((int) (byte) 1, locale34);
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance(0, locale34);
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale34);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat40 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18, locale34, (java.lang.Boolean) true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat23.", stdDateFormat0.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat0));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat18, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat18.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat18.equals(stdDateFormat0));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
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
        java.text.DateFormat dateFormat13 = stdDateFormat0._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        boolean boolean21 = stdDateFormat14.isLenient();
        java.text.DateFormat dateFormat22 = stdDateFormat14._formatISO8601;
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        java.util.Calendar calendar25 = dateFormat23.getCalendar();
        stdDateFormat14.setCalendar(calendar25);
        java.util.Calendar calendar27 = stdDateFormat14.getCalendar();
        java.lang.String str28 = stdDateFormat14.toString();
        boolean boolean30 = stdDateFormat14.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.lang.String str31 = stdDateFormat14.toString();
        java.lang.Boolean boolean32 = stdDateFormat14._lenient;
        java.lang.Boolean boolean33 = stdDateFormat14._lenient;
        stdDateFormat0._formatISO8601 = stdDateFormat14;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat14.", stdDateFormat0.equals(stdDateFormat14) == stdDateFormat14.equals(stdDateFormat0));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
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
        java.util.Locale locale13 = stdDateFormat0._locale;
        java.util.TimeZone timeZone14 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
        stdDateFormat0._timezone = timeZone14;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone14);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
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
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatISO8601_z;
        boolean boolean13 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance((int) (short) 1);
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat16);
        java.text.DateFormat dateFormat18 = stdDateFormat0._formatRFC1123;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date20 = stdDateFormat0.parse("hi!");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
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
        boolean boolean24 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        dateFormat27.setNumberFormat(numberFormat29);
        stdDateFormat25.setNumberFormat(numberFormat29);
        java.text.DateFormat dateFormat32 = stdDateFormat25._formatISO8601;
        stdDateFormat25._lenient = true;
        java.lang.String str35 = stdDateFormat25.toString();
        java.text.DateFormat dateFormat36 = stdDateFormat25._formatPlain;
        java.util.Locale locale37 = stdDateFormat25._locale;
        java.util.Locale locale38 = stdDateFormat25._locale;
        java.util.TimeZone timeZone39 = stdDateFormat25.getTimeZone();
        stdDateFormat0._formatISO8601_z = stdDateFormat25;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat25.", stdDateFormat0.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat0));
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.text.NumberFormat numberFormat10 = stdDateFormat0.getNumberFormat();
        java.util.TimeZone timeZone11 = stdDateFormat0._timezone;
        java.util.Locale locale12 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance((int) (short) 1);
        java.text.AttributedCharacterIterator attributedCharacterIterator16 = dateFormat14.formatToCharacterIterator((java.lang.Object) 4);
        dateFormat14.setLenient(false);
        dateFormat14.setLenient(false);
        stdDateFormat0._formatPlain = dateFormat14;
        stdDateFormat0._clearFormats();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        dateFormat25.setNumberFormat(numberFormat27);
        stdDateFormat23.setNumberFormat(numberFormat27);
        boolean boolean31 = stdDateFormat23.looksLikeISO8601("hi!");
        java.lang.String str32 = stdDateFormat23.toString();
        java.util.TimeZone timeZone33 = stdDateFormat23._timezone;
        java.text.NumberFormat numberFormat34 = stdDateFormat23.getNumberFormat();
        java.util.TimeZone timeZone35 = stdDateFormat23.getTimeZone();
        java.lang.Boolean boolean36 = stdDateFormat23._lenient;
        java.text.NumberFormat numberFormat37 = stdDateFormat23.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat23.", stdDateFormat0.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat0));
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
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
        java.util.Locale locale12 = stdDateFormat0._locale;
        java.util.Locale locale13 = stdDateFormat0._locale;
        java.lang.String str14 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatRFC1123;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date17 = stdDateFormat0.parse("Wed, 31 Dec 1969 23:59:59 UTC");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601;
        stdDateFormat0._clearFormats();
        java.util.TimeZone timeZone9 = stdDateFormat0._timezone;
        java.util.Calendar calendar10 = stdDateFormat0.getCalendar();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        stdDateFormat11.setNumberFormat(numberFormat15);
        boolean boolean18 = stdDateFormat11.isLenient();
        boolean boolean20 = stdDateFormat11.looksLikeISO8601("");
        boolean boolean21 = stdDateFormat11.isLenient();
        java.lang.Boolean boolean22 = stdDateFormat11._lenient;
        boolean boolean24 = stdDateFormat11.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.text.DateFormat dateFormat25 = stdDateFormat11._formatISO8601_z;
        java.util.Locale locale26 = stdDateFormat11._locale;
        stdDateFormat0._formatRFC1123 = stdDateFormat11;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat11.", stdDateFormat0.equals(stdDateFormat11) == stdDateFormat11.equals(stdDateFormat0));
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat17);
        stdDateFormat13.setNumberFormat(numberFormat17);
        boolean boolean21 = stdDateFormat13.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat22 = stdDateFormat13._formatISO8601_z;
        java.text.DateFormat dateFormat23 = stdDateFormat13._formatPlain;
        java.text.DateFormat dateFormat24 = stdDateFormat13._formatISO8601_z;
        java.util.TimeZone timeZone25 = stdDateFormat13._timezone;
        java.text.DateFormat dateFormat26 = stdDateFormat13._formatISO8601;
        java.text.NumberFormat numberFormat27 = stdDateFormat13.getNumberFormat();
        java.lang.String str28 = stdDateFormat13.toString();
        stdDateFormat0._formatPlain = stdDateFormat13;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat13.", stdDateFormat0.equals(stdDateFormat13) == stdDateFormat13.equals(stdDateFormat0));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
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
        java.text.DateFormat dateFormat30 = stdDateFormat17._formatPlain;
        java.text.DateFormat dateFormat31 = stdDateFormat17._formatRFC1123;
        java.text.DateFormat dateFormat32 = stdDateFormat17._formatISO8601;
        java.text.DateFormat dateFormat33 = stdDateFormat17._formatISO8601;
        java.lang.Boolean boolean34 = stdDateFormat17._lenient;
        java.util.Locale locale35 = stdDateFormat17._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16, locale35);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat2);
        java.text.DateFormat dateFormat4 = stdDateFormat0._formatISO8601;
        java.util.Locale locale5 = stdDateFormat0._locale;
        java.util.TimeZone timeZone6 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat10 = dateFormat9.getNumberFormat();
        stdDateFormat8.setNumberFormat(numberFormat10);
        java.text.DateFormat dateFormat12 = stdDateFormat8._formatISO8601;
        java.util.Locale locale13 = stdDateFormat8._locale;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance((int) (byte) 1, locale13);
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone6, locale13);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean23 = stdDateFormat16.isLenient();
        boolean boolean25 = stdDateFormat16.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        boolean boolean26 = stdDateFormat16.isLenient();
        java.lang.Boolean boolean27 = stdDateFormat16._lenient;
        stdDateFormat16._lenient = false;
        java.text.DateFormat dateFormat30 = stdDateFormat16._formatPlain;
        java.util.Locale locale31 = stdDateFormat16._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone6, locale31);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
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
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        boolean boolean15 = dateFormat13.equals((java.lang.Object) "yyyy-MM-dd");
        stdDateFormat0._formatRFC1123 = dateFormat13;
        stdDateFormat0._lenient = false;
        java.text.NumberFormat numberFormat19 = stdDateFormat0.getNumberFormat();
        java.util.TimeZone timeZone20 = stdDateFormat0.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat0.setLenient(false);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat6 = dateFormat5.getNumberFormat();
        dateFormat4.setNumberFormat(numberFormat6);
        stdDateFormat2.setNumberFormat(numberFormat6);
        boolean boolean9 = stdDateFormat2.isLenient();
        boolean boolean11 = stdDateFormat2.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.util.Locale locale12 = stdDateFormat2._locale;
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance(2, locale12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = stdDateFormat0.withLocale(locale12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat14 and stdDateFormat14", stdDateFormat14.equals(stdDateFormat14) ? stdDateFormat14.hashCode() == stdDateFormat14.hashCode() : true);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
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
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatRFC1123;
        java.lang.String str16 = stdDateFormat0.toString();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat24);
        stdDateFormat20.setNumberFormat(numberFormat24);
        boolean boolean27 = stdDateFormat20.isLenient();
        boolean boolean29 = stdDateFormat20.looksLikeISO8601("");
        java.lang.String str30 = stdDateFormat20.toString();
        java.util.Locale locale31 = stdDateFormat20._locale;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateTimeInstance((int) (byte) 0, 0, locale31);
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getTimeInstance(0, locale31);
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat20.", stdDateFormat0.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat0));
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
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
        java.lang.Boolean boolean14 = stdDateFormat0._lenient;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        boolean boolean22 = stdDateFormat15.isLenient();
        boolean boolean24 = stdDateFormat15.looksLikeISO8601("");
        boolean boolean25 = stdDateFormat15.isLenient();
        java.util.Locale locale26 = stdDateFormat15._locale;
        java.util.TimeZone timeZone27 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat15._timezone = timeZone27;
        java.lang.String str29 = stdDateFormat15.toString();
        java.text.DateFormat dateFormat30 = stdDateFormat15._formatPlain;
        java.text.DateFormat dateFormat31 = stdDateFormat15._formatPlain;
        boolean boolean32 = stdDateFormat15.isLenient();
        java.text.DateFormat dateFormat33 = stdDateFormat15._formatISO8601;
        boolean boolean34 = stdDateFormat15.isLenient();
        stdDateFormat0._formatPlain = stdDateFormat15;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat15.", stdDateFormat0.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
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
        java.util.Locale locale15 = stdDateFormat0._locale;
        java.lang.Object obj17 = stdDateFormat0.parseObject("1970-01-01T00:00:00.000Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj19 = stdDateFormat0.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
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
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatISO8601_z;
        stdDateFormat0._lenient = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date19 = stdDateFormat0.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
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
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat24);
        stdDateFormat20.setNumberFormat(numberFormat24);
        boolean boolean27 = stdDateFormat20.isLenient();
        boolean boolean29 = stdDateFormat20.looksLikeISO8601("");
        boolean boolean30 = stdDateFormat20.isLenient();
        java.util.Locale locale31 = stdDateFormat20._locale;
        java.util.TimeZone timeZone32 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat20._timezone = timeZone32;
        java.lang.String str34 = stdDateFormat20.toString();
        java.text.DateFormat dateFormat35 = stdDateFormat20._formatPlain;
        java.text.DateFormat dateFormat36 = stdDateFormat20._formatPlain;
        boolean boolean37 = stdDateFormat20.isLenient();
        stdDateFormat20._lenient = false;
        java.util.Locale locale40 = stdDateFormat20._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat41 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18, locale40);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat20.", stdDateFormat0.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat0));
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
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
        java.text.DateFormat dateFormat18 = stdDateFormat0._formatISO8601;
        java.util.TimeZone timeZone19 = stdDateFormat0.getTimeZone();
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone19);
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone19);
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
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getTimeInstance((int) (short) 1, locale35);
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getTimeInstance((int) (byte) 1, locale35);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19, locale35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat24.", stdDateFormat0.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat0));
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
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
        boolean boolean13 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        java.text.DateFormat dateFormat22 = stdDateFormat15._formatISO8601;
        stdDateFormat15._lenient = true;
        java.lang.String str25 = stdDateFormat15.toString();
        java.text.DateFormat dateFormat26 = stdDateFormat15._formatPlain;
        java.text.DateFormat dateFormat27 = stdDateFormat15._formatISO8601;
        java.util.Locale locale28 = stdDateFormat15._locale;
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance((int) (byte) 1, locale28);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = stdDateFormat0.withLocale(locale28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat30 and stdDateFormat15.", stdDateFormat30.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat30));
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
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
        java.util.Calendar calendar14 = stdDateFormat0.getCalendar();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        boolean boolean22 = stdDateFormat15.isLenient();
        boolean boolean24 = stdDateFormat15.looksLikeISO8601("");
        boolean boolean25 = stdDateFormat15.isLenient();
        java.util.Locale locale26 = stdDateFormat15._locale;
        java.util.TimeZone timeZone27 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat15._timezone = timeZone27;
        java.lang.String str29 = stdDateFormat15.toString();
        boolean boolean31 = stdDateFormat15.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.util.Date date33 = stdDateFormat15.parse("0");
        java.lang.String str34 = stdDateFormat0.format(date33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat15.", stdDateFormat0.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
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
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean23 = stdDateFormat16.isLenient();
        boolean boolean25 = stdDateFormat16.looksLikeISO8601("");
        boolean boolean26 = stdDateFormat16.isLenient();
        java.util.Locale locale27 = stdDateFormat16._locale;
        java.util.TimeZone timeZone28 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat16._timezone = timeZone28;
        java.lang.String str30 = stdDateFormat16.toString();
        boolean boolean32 = stdDateFormat16.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.util.Date date34 = stdDateFormat16.parse("0");
        java.lang.String str35 = stdDateFormat0.format(date34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
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
        java.lang.String str14 = stdDateFormat0.toString();
        boolean boolean16 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.lang.String str17 = stdDateFormat0.toString();
        java.lang.String str18 = stdDateFormat0.toString();
        boolean boolean20 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.lang.String str21 = stdDateFormat0.toString();
        java.util.TimeZone timeZone22 = stdDateFormat0.getTimeZone();
        java.lang.String str23 = stdDateFormat0.toString();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat24, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat24.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat24.equals(stdDateFormat0));
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
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
        java.util.TimeZone timeZone16 = stdDateFormat0._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat0.setLenient(true);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
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
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        dateFormat20.setNumberFormat(numberFormat22);
        stdDateFormat18.setNumberFormat(numberFormat22);
        boolean boolean26 = stdDateFormat18.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat27 = stdDateFormat18._formatISO8601_z;
        java.text.DateFormat dateFormat28 = stdDateFormat18._formatPlain;
        boolean boolean30 = stdDateFormat18.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.util.TimeZone timeZone31 = stdDateFormat18.getTimeZone();
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        dateFormat32.setNumberFormat(numberFormat34);
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat37 = dateFormat36.getNumberFormat();
        java.util.Calendar calendar38 = dateFormat36.getCalendar();
        dateFormat32.setCalendar(calendar38);
        dateFormat32.setLenient(true);
        stdDateFormat18._formatRFC1123 = dateFormat32;
        java.text.DateFormat dateFormat43 = stdDateFormat18._formatISO8601;
        java.util.Locale locale44 = stdDateFormat18._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat45 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale44);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat18.", stdDateFormat0.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat0));
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
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
        boolean boolean13 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        boolean boolean22 = stdDateFormat15.isLenient();
        boolean boolean24 = stdDateFormat15.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance();
        stdDateFormat15._formatPlain = dateFormat25;
        java.text.DateFormat dateFormat27 = stdDateFormat15._formatISO8601_z;
        java.text.DateFormat dateFormat28 = stdDateFormat15._formatPlain;
        java.util.TimeZone timeZone29 = stdDateFormat15.getTimeZone();
        java.util.TimeZone timeZone30 = stdDateFormat15._timezone;
        java.lang.String str31 = stdDateFormat15.toString();
        stdDateFormat0._formatRFC1123 = stdDateFormat15;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat15.", stdDateFormat0.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
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
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone12);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat15, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat15.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat2);
        java.text.DateFormat dateFormat4 = stdDateFormat0._formatISO8601;
        java.util.Locale locale5 = stdDateFormat0._locale;
        java.util.TimeZone timeZone6 = stdDateFormat0.getTimeZone();
        java.util.Calendar calendar7 = stdDateFormat0.getCalendar();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat8, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat8.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat8.equals(stdDateFormat0));
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean24 = stdDateFormat17.isLenient();
        java.text.DateFormat dateFormat25 = stdDateFormat17._formatISO8601;
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        java.util.Calendar calendar28 = dateFormat26.getCalendar();
        stdDateFormat17.setCalendar(calendar28);
        java.util.Calendar calendar30 = stdDateFormat17.getCalendar();
        java.util.TimeZone timeZone31 = stdDateFormat17.getTimeZone();
        java.text.DateFormat dateFormat32 = stdDateFormat17._formatRFC1123;
        java.util.Locale locale33 = stdDateFormat17._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16, locale33);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.text.DateFormat dateFormat10 = stdDateFormat0._formatRFC1123;
        java.text.NumberFormat numberFormat11 = stdDateFormat0.getNumberFormat();
        stdDateFormat0._lenient = true;
        java.text.NumberFormat numberFormat14 = stdDateFormat0.getNumberFormat();
        java.lang.String str15 = stdDateFormat0.toString();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean23 = stdDateFormat16.isLenient();
        boolean boolean25 = stdDateFormat16.looksLikeISO8601("");
        boolean boolean26 = stdDateFormat16.isLenient();
        java.util.Locale locale27 = stdDateFormat16._locale;
        java.util.TimeZone timeZone28 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat16._timezone = timeZone28;
        java.lang.String str30 = stdDateFormat16.toString();
        stdDateFormat16._lenient = false;
        java.util.TimeZone timeZone33 = stdDateFormat16.getTimeZone();
        stdDateFormat16._clearFormats();
        boolean boolean36 = stdDateFormat16.looksLikeISO8601("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        java.util.Locale locale37 = stdDateFormat16._locale;
        boolean boolean38 = stdDateFormat0.equals((java.lang.Object) locale37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
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
        java.text.NumberFormat numberFormat12 = stdDateFormat0.getNumberFormat();
        stdDateFormat0._lenient = true;
        boolean boolean15 = stdDateFormat0.isLenient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date17 = stdDateFormat0.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601;
        java.lang.String str10 = stdDateFormat0.toString();
        java.lang.String str11 = stdDateFormat0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj13 = stdDateFormat0.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
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
        stdDateFormat0._clearFormats();
        java.util.TimeZone timeZone15 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean24 = stdDateFormat16.looksLikeISO8601("hi!");
        java.lang.String str25 = stdDateFormat16.toString();
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean28 = dateFormat26.equals((java.lang.Object) true);
        stdDateFormat16._formatISO8601 = dateFormat26;
        stdDateFormat0._formatPlain = dateFormat26;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601_z;
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.util.Locale locale12 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        stdDateFormat0.setNumberFormat(numberFormat15);
        stdDateFormat0._lenient = true;
        java.util.TimeZone timeZone20 = stdDateFormat0._timezone;
        java.text.NumberFormat numberFormat21 = stdDateFormat0.getNumberFormat();
        java.util.TimeZone timeZone22 = stdDateFormat0.getTimeZone();
        java.util.TimeZone timeZone23 = stdDateFormat0.getTimeZone();
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
        java.util.TimeZone timeZone36 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat24._timezone = timeZone36;
        java.text.DateFormat dateFormat38 = stdDateFormat24._formatISO8601;
        java.text.DateFormat dateFormat39 = stdDateFormat24._formatRFC1123;
        boolean boolean41 = stdDateFormat24.looksLikeISO8601("Wed, 31 Dec 1969 23:59:59 UTC");
        stdDateFormat24._clearFormats();
        java.util.TimeZone timeZone43 = stdDateFormat24.getTimeZone();
        stdDateFormat0._timezone = timeZone43;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat24.", stdDateFormat0.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat0));
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
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
        java.text.DateFormat dateFormat18 = stdDateFormat0._formatRFC1123;
        java.text.NumberFormat numberFormat19 = stdDateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat20 = stdDateFormat0._formatISO8601;
        java.util.TimeZone timeZone21 = stdDateFormat0._timezone;
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat24);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat27);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        dateFormat31.setNumberFormat(numberFormat33);
        stdDateFormat29.setNumberFormat(numberFormat33);
        boolean boolean36 = stdDateFormat29.isLenient();
        boolean boolean38 = stdDateFormat29.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.util.Locale locale39 = stdDateFormat29._locale;
        java.lang.String str40 = stdDateFormat29.toString();
        stdDateFormat29._clearFormats();
        boolean boolean42 = dateFormat22.equals((java.lang.Object) stdDateFormat29);
        stdDateFormat29._lenient = false;
        java.text.NumberFormat numberFormat45 = stdDateFormat29.getNumberFormat();
        stdDateFormat0._formatISO8601 = stdDateFormat29;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat29.", stdDateFormat0.equals(stdDateFormat29) == stdDateFormat29.equals(stdDateFormat0));
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat17);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        java.util.Calendar calendar21 = dateFormat19.getCalendar();
        dateFormat15.setCalendar(calendar21);
        dateFormat15.setLenient(true);
        boolean boolean25 = stdDateFormat0.equals((java.lang.Object) dateFormat15);
        java.lang.Boolean boolean26 = stdDateFormat0._lenient;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat27, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat27.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat27.equals(stdDateFormat0));
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
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
        java.lang.String str16 = stdDateFormat0.toString();
        stdDateFormat0._lenient = false;
        java.util.TimeZone timeZone19 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone19);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        dateFormat23.setNumberFormat(numberFormat25);
        stdDateFormat21.setNumberFormat(numberFormat25);
        boolean boolean28 = stdDateFormat21.isLenient();
        boolean boolean30 = stdDateFormat21.looksLikeISO8601("");
        boolean boolean31 = stdDateFormat21.isLenient();
        java.util.Locale locale32 = stdDateFormat21._locale;
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone19, locale32);
        stdDateFormat0._formatISO8601_z = dateFormat33;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat21.", stdDateFormat0.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat0));
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date16 = stdDateFormat0.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: null)");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
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
        java.lang.String str13 = stdDateFormat0.toString();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        boolean boolean21 = stdDateFormat14.isLenient();
        boolean boolean23 = stdDateFormat14.looksLikeISO8601("");
        java.lang.String str24 = stdDateFormat14.toString();
        boolean boolean26 = stdDateFormat14.looksLikeISO8601("hi!");
        java.util.TimeZone timeZone27 = stdDateFormat14.getTimeZone();
        java.util.TimeZone timeZone28 = stdDateFormat14.getTimeZone();
        boolean boolean30 = stdDateFormat14.looksLikeISO8601("hi!");
        java.util.Date date32 = stdDateFormat14.parse("-1");
        java.lang.String str33 = stdDateFormat0.format(date32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat14.", stdDateFormat0.equals(stdDateFormat14) == stdDateFormat14.equals(stdDateFormat0));
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
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
        stdDateFormat0._clearFormats();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date26 = stdDateFormat0.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
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
        boolean boolean15 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat16.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
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
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatISO8601_z;
        boolean boolean17 = stdDateFormat0.looksLikeISO8601("0");
        boolean boolean19 = stdDateFormat0.looksLikeISO8601("-1");
        boolean boolean20 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat21 = stdDateFormat0._formatISO8601_z;
        java.text.DateFormat dateFormat22 = stdDateFormat0._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        dateFormat25.setNumberFormat(numberFormat27);
        stdDateFormat23.setNumberFormat(numberFormat27);
        boolean boolean31 = stdDateFormat23.looksLikeISO8601("hi!");
        java.lang.String str32 = stdDateFormat23.toString();
        java.util.Locale locale33 = stdDateFormat23._locale;
        java.text.DateFormat dateFormat34 = stdDateFormat23._formatPlain;
        java.text.NumberFormat numberFormat35 = stdDateFormat23.getNumberFormat();
        stdDateFormat23._clearFormats();
        stdDateFormat23._lenient = true;
        java.util.TimeZone timeZone39 = stdDateFormat23._timezone;
        boolean boolean41 = stdDateFormat23.looksLikeISO8601("1970-01-01T00:00:00.000Z");
        stdDateFormat0._formatRFC1123 = stdDateFormat23;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat23.", stdDateFormat0.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat0));
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
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
        java.lang.Boolean boolean14 = stdDateFormat0._lenient;
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat16.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat2);
        java.text.DateFormat dateFormat4 = stdDateFormat0._formatISO8601;
        java.util.Locale locale5 = stdDateFormat0._locale;
        java.util.TimeZone timeZone6 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat11 = dateFormat10.getNumberFormat();
        dateFormat9.setNumberFormat(numberFormat11);
        stdDateFormat7.setNumberFormat(numberFormat11);
        java.text.DateFormat dateFormat14 = stdDateFormat7._formatISO8601;
        stdDateFormat7._lenient = true;
        java.lang.String str17 = stdDateFormat7.toString();
        java.text.DateFormat dateFormat18 = stdDateFormat7._formatPlain;
        java.text.DateFormat dateFormat19 = stdDateFormat7._formatISO8601;
        java.util.Locale locale20 = stdDateFormat7._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6, locale20, (java.lang.Boolean) false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat7.", stdDateFormat0.equals(stdDateFormat7) == stdDateFormat7.equals(stdDateFormat0));
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
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
        java.lang.String str15 = stdDateFormat0.toString();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean23 = stdDateFormat16.isLenient();
        java.text.DateFormat dateFormat24 = stdDateFormat16._formatISO8601;
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        java.util.Calendar calendar27 = dateFormat25.getCalendar();
        stdDateFormat16.setCalendar(calendar27);
        java.util.Calendar calendar29 = stdDateFormat16.getCalendar();
        boolean boolean30 = stdDateFormat16.isLenient();
        boolean boolean32 = stdDateFormat16.looksLikeISO8601("");
        java.lang.String str33 = stdDateFormat16.toString();
        java.text.DateFormat dateFormat34 = stdDateFormat16._formatISO8601;
        java.lang.Boolean boolean35 = stdDateFormat16._lenient;
        stdDateFormat16._clearFormats();
        boolean boolean37 = stdDateFormat16.isLenient();
        stdDateFormat0._formatISO8601_z = stdDateFormat16;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601;
        java.util.Locale locale10 = stdDateFormat0._locale;
        java.text.NumberFormat numberFormat11 = stdDateFormat0.getNumberFormat();
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = stdDateFormat0.withLocale(locale23);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat24 and stdDateFormat12.", stdDateFormat24.equals(stdDateFormat12) == stdDateFormat12.equals(stdDateFormat24));
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        stdDateFormat17.setNumberFormat(numberFormat19);
        java.text.DateFormat dateFormat21 = stdDateFormat17._formatISO8601;
        java.util.Locale locale22 = stdDateFormat17._locale;
        java.util.TimeZone timeZone23 = stdDateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        stdDateFormat25.setNumberFormat(numberFormat27);
        java.text.DateFormat dateFormat29 = stdDateFormat25._formatISO8601;
        java.util.Locale locale30 = stdDateFormat25._locale;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getTimeInstance((int) (byte) 1, locale30);
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone23, locale30);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = stdDateFormat0.withLocale(locale30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat33 and stdDateFormat17.", stdDateFormat33.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat33));
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat0.setLenient(true);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        java.text.DateFormat dateFormat21 = stdDateFormat14._formatISO8601;
        boolean boolean23 = stdDateFormat14.looksLikeISO8601("\u0e21\u0e04. 2513");
        stdDateFormat14._clearFormats();
        java.util.Calendar calendar25 = stdDateFormat14.getCalendar();
        java.text.DateFormat dateFormat26 = stdDateFormat14._formatISO8601_z;
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        java.util.Calendar calendar29 = dateFormat27.getCalendar();
        stdDateFormat14.setCalendar(calendar29);
        stdDateFormat0._formatISO8601 = stdDateFormat14;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat14.", stdDateFormat0.equals(stdDateFormat14) == stdDateFormat14.equals(stdDateFormat0));
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        stdDateFormat0._clearFormats();
        java.text.DateFormat dateFormat11 = stdDateFormat0._formatISO8601;
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        stdDateFormat0.setTimeZone(timeZone12);
        java.text.NumberFormat numberFormat15 = stdDateFormat0.getNumberFormat();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean25 = stdDateFormat17.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat26 = stdDateFormat17._formatISO8601_z;
        boolean boolean28 = stdDateFormat17.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.text.DateFormat dateFormat29 = stdDateFormat17._formatRFC1123;
        java.text.DateFormat dateFormat30 = stdDateFormat17._formatISO8601_z;
        java.util.Locale locale31 = stdDateFormat17._locale;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getTimeInstance(0, locale31);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = stdDateFormat0.withLocale(locale31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat33 and stdDateFormat17.", stdDateFormat33.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat33));
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
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
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatISO8601_z;
        stdDateFormat0._lenient = true;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance(2);
        stdDateFormat0._formatPlain = dateFormat18;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat24);
        stdDateFormat20.setNumberFormat(numberFormat24);
        boolean boolean27 = stdDateFormat20.isLenient();
        java.text.DateFormat dateFormat28 = stdDateFormat20._formatISO8601;
        stdDateFormat20._clearFormats();
        stdDateFormat20._clearFormats();
        java.lang.String str31 = stdDateFormat20.toString();
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        boolean boolean35 = dateFormat33.equals((java.lang.Object) "yyyy-MM-dd");
        stdDateFormat20._formatRFC1123 = dateFormat33;
        stdDateFormat20._lenient = false;
        java.text.NumberFormat numberFormat39 = stdDateFormat20.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat39);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat20.", stdDateFormat0.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat0));
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
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
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean24 = stdDateFormat16.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat25 = stdDateFormat16._formatISO8601_z;
        java.text.DateFormat dateFormat26 = stdDateFormat16._formatPlain;
        java.text.DateFormat dateFormat27 = stdDateFormat16._formatISO8601_z;
        java.util.TimeZone timeZone28 = stdDateFormat16._timezone;
        java.text.DateFormat dateFormat29 = stdDateFormat16._formatRFC1123;
        java.text.DateFormat dateFormat30 = stdDateFormat16._formatISO8601;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance(2);
        java.util.Calendar calendar33 = dateFormat32.getCalendar();
        stdDateFormat16.setCalendar(calendar33);
        java.util.Locale locale35 = stdDateFormat16._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1256");
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
        stdDateFormat0._clearFormats();
        java.lang.Boolean boolean15 = stdDateFormat0._lenient;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean23 = stdDateFormat16.isLenient();
        boolean boolean25 = stdDateFormat16.looksLikeISO8601("");
        boolean boolean26 = stdDateFormat16.isLenient();
        java.util.Locale locale27 = stdDateFormat16._locale;
        java.util.TimeZone timeZone28 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat16._timezone = timeZone28;
        java.text.DateFormat dateFormat30 = stdDateFormat16._formatISO8601;
        java.text.DateFormat dateFormat31 = stdDateFormat16._formatRFC1123;
        boolean boolean32 = stdDateFormat16.isLenient();
        boolean boolean33 = stdDateFormat16.isLenient();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean34 = stdDateFormat0.equals((java.lang.Object) stdDateFormat16);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1257");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601;
        stdDateFormat0._lenient = true;
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatRFC1123;
        boolean boolean13 = stdDateFormat0.isLenient();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        boolean boolean21 = stdDateFormat14.isLenient();
        boolean boolean23 = stdDateFormat14.looksLikeISO8601("");
        boolean boolean24 = stdDateFormat14.isLenient();
        java.util.Locale locale25 = stdDateFormat14._locale;
        java.util.TimeZone timeZone26 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat14._timezone = timeZone26;
        java.text.DateFormat dateFormat28 = stdDateFormat14._formatISO8601;
        java.text.DateFormat dateFormat29 = stdDateFormat14._formatRFC1123;
        java.lang.Boolean boolean30 = stdDateFormat14._lenient;
        java.util.Locale locale31 = stdDateFormat14._locale;
        stdDateFormat0._formatPlain = stdDateFormat14;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat14.", stdDateFormat0.equals(stdDateFormat14) == stdDateFormat14.equals(stdDateFormat0));
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1258");
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
        java.util.TimeZone timeZone12 = stdDateFormat0._timezone;
        java.lang.Boolean boolean13 = stdDateFormat0._lenient;
        java.util.Calendar calendar14 = stdDateFormat0.getCalendar();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        boolean boolean23 = stdDateFormat15.looksLikeISO8601("hi!");
        java.lang.String str24 = stdDateFormat15.toString();
        java.util.TimeZone timeZone25 = stdDateFormat15._timezone;
        java.text.NumberFormat numberFormat26 = stdDateFormat15.getNumberFormat();
        java.util.TimeZone timeZone27 = stdDateFormat15.getTimeZone();
        java.util.Locale locale28 = stdDateFormat15._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = stdDateFormat0.withLocale(locale28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat29 and stdDateFormat15.", stdDateFormat29.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat29));
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1259");
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
        java.lang.String str32 = stdDateFormat15.toString();
        java.lang.String str33 = stdDateFormat15.toString();
        boolean boolean35 = stdDateFormat15.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.lang.String str36 = stdDateFormat15.toString();
        stdDateFormat0._formatISO8601_z = stdDateFormat15;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat15.", stdDateFormat0.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1260");
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
        java.util.Locale locale19 = stdDateFormat0._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat24);
        stdDateFormat20.setNumberFormat(numberFormat24);
        boolean boolean27 = stdDateFormat20.isLenient();
        boolean boolean29 = stdDateFormat20.looksLikeISO8601("");
        boolean boolean30 = stdDateFormat20.isLenient();
        java.util.Locale locale31 = stdDateFormat20._locale;
        java.util.TimeZone timeZone32 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat20._timezone = timeZone32;
        java.lang.String str34 = stdDateFormat20.toString();
        stdDateFormat20._lenient = false;
        java.util.TimeZone timeZone37 = stdDateFormat20.getTimeZone();
        stdDateFormat0.setTimeZone(timeZone37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat20.", stdDateFormat0.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat0));
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1261");
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
        java.lang.String str12 = stdDateFormat0.toString();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat17);
        stdDateFormat13.setNumberFormat(numberFormat17);
        boolean boolean21 = stdDateFormat13.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat22 = stdDateFormat13._formatISO8601_z;
        boolean boolean24 = stdDateFormat13.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.text.DateFormat dateFormat25 = stdDateFormat13._formatRFC1123;
        java.text.DateFormat dateFormat26 = stdDateFormat13._formatISO8601_z;
        java.text.DateFormat dateFormat27 = stdDateFormat13._formatISO8601_z;
        stdDateFormat13._lenient = true;
        stdDateFormat0._formatISO8601_z = stdDateFormat13;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat13.", stdDateFormat0.equals(stdDateFormat13) == stdDateFormat13.equals(stdDateFormat0));
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1262");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601;
        java.text.NumberFormat numberFormat9 = stdDateFormat0.getNumberFormat();
        java.util.Locale locale10 = stdDateFormat0._locale;
        boolean boolean11 = stdDateFormat0.isLenient();
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
        java.util.TimeZone timeZone24 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat12._timezone = timeZone24;
        java.lang.String str26 = stdDateFormat12.toString();
        java.text.DateFormat dateFormat27 = stdDateFormat12._formatPlain;
        boolean boolean28 = stdDateFormat12.isLenient();
        stdDateFormat0._formatISO8601_z = stdDateFormat12;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat12.", stdDateFormat0.equals(stdDateFormat12) == stdDateFormat12.equals(stdDateFormat0));
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1263");
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
        java.util.Locale locale16 = stdDateFormat0._locale;
        java.util.TimeZone timeZone17 = stdDateFormat0._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        dateFormat20.setNumberFormat(numberFormat22);
        stdDateFormat18.setNumberFormat(numberFormat22);
        boolean boolean26 = stdDateFormat18.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat27 = stdDateFormat18._formatISO8601;
        java.util.Locale locale28 = stdDateFormat18._locale;
        java.text.NumberFormat numberFormat29 = stdDateFormat18.getNumberFormat();
        stdDateFormat0._formatISO8601 = stdDateFormat18;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat18.", stdDateFormat0.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat0));
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1264");
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
        java.text.NumberFormat numberFormat14 = stdDateFormat0.getNumberFormat();
        java.util.TimeZone timeZone15 = stdDateFormat0._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean24 = stdDateFormat16.looksLikeISO8601("hi!");
        java.lang.String str25 = stdDateFormat16.toString();
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean28 = dateFormat26.equals((java.lang.Object) true);
        stdDateFormat16._formatISO8601 = dateFormat26;
        java.text.DateFormat dateFormat30 = stdDateFormat16._formatRFC1123;
        java.text.DateFormat dateFormat31 = stdDateFormat16._formatISO8601_z;
        boolean boolean32 = stdDateFormat16.isLenient();
        stdDateFormat16._lenient = true;
        stdDateFormat16._lenient = false;
        stdDateFormat16._lenient = false;
        stdDateFormat0._formatISO8601 = stdDateFormat16;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1265");
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
        java.text.DateFormat dateFormat16 = stdDateFormat0._formatRFC1123;
        java.util.TimeZone timeZone17 = stdDateFormat0._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj19 = stdDateFormat0.parseObject("\u0e21\u0e04. 2513");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1266");
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
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatISO8601;
        java.lang.Boolean boolean16 = stdDateFormat0._lenient;
        java.util.TimeZone timeZone17 = stdDateFormat0._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        dateFormat20.setNumberFormat(numberFormat22);
        stdDateFormat18.setNumberFormat(numberFormat22);
        boolean boolean25 = stdDateFormat18.isLenient();
        boolean boolean27 = stdDateFormat18.looksLikeISO8601("");
        stdDateFormat18._clearFormats();
        java.text.DateFormat dateFormat29 = stdDateFormat18._formatPlain;
        java.util.TimeZone timeZone30 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone30);
        stdDateFormat18._timezone = timeZone30;
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateTimeInstance();
        java.text.NumberFormat numberFormat34 = dateFormat33.getNumberFormat();
        stdDateFormat18._formatISO8601 = dateFormat33;
        java.text.DateFormat dateFormat36 = stdDateFormat18._formatISO8601;
        java.util.TimeZone timeZone37 = stdDateFormat18.getTimeZone();
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone37);
        stdDateFormat0._timezone = timeZone37;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat18.", stdDateFormat0.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat0));
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1267");
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
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        boolean boolean15 = dateFormat13.equals((java.lang.Object) "yyyy-MM-dd");
        stdDateFormat0._formatRFC1123 = dateFormat13;
        stdDateFormat0._lenient = false;
        java.util.TimeZone timeZone19 = stdDateFormat0.getTimeZone();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance((int) (short) 1);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance(2);
        java.util.Calendar calendar24 = dateFormat23.getCalendar();
        dateFormat21.setCalendar(calendar24);
        boolean boolean27 = dateFormat21.equals((java.lang.Object) 100);
        stdDateFormat0._formatPlain = dateFormat21;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat29, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat29.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat29.equals(stdDateFormat0));
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1268");
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
        java.util.Locale locale17 = stdDateFormat0._locale;
        stdDateFormat0._clearFormats();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date20 = stdDateFormat0.parse("\u0e21\u0e04. 2513");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1269");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        boolean boolean22 = stdDateFormat14.looksLikeISO8601("hi!");
        java.lang.String str23 = stdDateFormat14.toString();
        java.util.TimeZone timeZone24 = stdDateFormat14._timezone;
        java.text.NumberFormat numberFormat25 = stdDateFormat14.getNumberFormat();
        java.lang.String str26 = stdDateFormat14.toString();
        stdDateFormat0._formatISO8601 = stdDateFormat14;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat14.", stdDateFormat0.equals(stdDateFormat14) == stdDateFormat14.equals(stdDateFormat0));
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1270");
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
        java.lang.Boolean boolean18 = stdDateFormat0._lenient;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean26 = stdDateFormat19.isLenient();
        boolean boolean27 = stdDateFormat19.isLenient();
        stdDateFormat19._clearFormats();
        java.text.NumberFormat numberFormat29 = stdDateFormat19.getNumberFormat();
        stdDateFormat0._formatRFC1123 = stdDateFormat19;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat19.", stdDateFormat0.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat0));
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1271");
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
        java.util.Calendar calendar18 = stdDateFormat0.getCalendar();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        java.lang.String str22 = dateFormat19.format((java.lang.Object) 3);
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat24);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        dateFormat27.setNumberFormat(numberFormat29);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        dateFormat31.setNumberFormat(numberFormat33);
        java.text.DateFormat dateFormat35 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat36 = dateFormat35.getNumberFormat();
        java.util.Calendar calendar37 = dateFormat35.getCalendar();
        dateFormat31.setCalendar(calendar37);
        dateFormat27.setCalendar(calendar37);
        java.text.NumberFormat numberFormat40 = dateFormat27.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat40);
        stdDateFormat0.setNumberFormat(numberFormat40);
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
        java.util.Locale locale56 = stdDateFormat43._locale;
        boolean boolean57 = stdDateFormat43.isLenient();
        stdDateFormat0._formatRFC1123 = stdDateFormat43;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat43.", stdDateFormat0.equals(stdDateFormat43) == stdDateFormat43.equals(stdDateFormat0));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1272");
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
        java.util.Calendar calendar14 = stdDateFormat0.getCalendar();
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
        stdDateFormat0.setCalendar(calendar26);
        java.text.NumberFormat numberFormat29 = stdDateFormat0.getNumberFormat();
        java.util.TimeZone timeZone30 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat35 = dateFormat34.getNumberFormat();
        dateFormat33.setNumberFormat(numberFormat35);
        stdDateFormat31.setNumberFormat(numberFormat35);
        boolean boolean39 = stdDateFormat31.looksLikeISO8601("hi!");
        java.lang.String str40 = stdDateFormat31.toString();
        java.util.TimeZone timeZone41 = stdDateFormat31._timezone;
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getTimeInstance();
        java.util.Calendar calendar43 = dateFormat42.getCalendar();
        stdDateFormat31._formatPlain = dateFormat42;
        java.util.Locale locale45 = stdDateFormat31._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = stdDateFormat0.withLocale(locale45);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat46 and stdDateFormat31.", stdDateFormat46.equals(stdDateFormat31) == stdDateFormat31.equals(stdDateFormat46));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1273");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601;
        java.util.Calendar calendar8 = stdDateFormat0.getCalendar();
        java.text.NumberFormat numberFormat9 = stdDateFormat0.getNumberFormat();
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
        java.util.TimeZone timeZone24 = stdDateFormat10.getTimeZone();
        stdDateFormat0.setTimeZone(timeZone24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat10.", stdDateFormat0.equals(stdDateFormat10) == stdDateFormat10.equals(stdDateFormat0));
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1274");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601_z;
        stdDateFormat0._clearFormats();
        stdDateFormat0._clearFormats();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat12, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat12.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat12.equals(stdDateFormat0));
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1275");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat17);
        stdDateFormat13.setNumberFormat(numberFormat17);
        boolean boolean21 = stdDateFormat13.looksLikeISO8601("hi!");
        java.lang.String str22 = stdDateFormat13.toString();
        java.util.TimeZone timeZone23 = stdDateFormat13._timezone;
        java.text.NumberFormat numberFormat24 = stdDateFormat13.getNumberFormat();
        boolean boolean25 = stdDateFormat13.isLenient();
        boolean boolean27 = stdDateFormat13.looksLikeISO8601("hi!");
        java.util.Date date29 = stdDateFormat13.parse("-1");
        java.lang.String str30 = stdDateFormat0.format(date29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat13.", stdDateFormat0.equals(stdDateFormat13) == stdDateFormat13.equals(stdDateFormat0));
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1276");
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
        stdDateFormat0._clearFormats();
        java.text.DateFormat dateFormat16 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean24 = stdDateFormat17.isLenient();
        boolean boolean26 = stdDateFormat17.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        boolean boolean27 = stdDateFormat17.isLenient();
        java.lang.Boolean boolean28 = stdDateFormat17._lenient;
        boolean boolean30 = stdDateFormat17.looksLikeISO8601("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        stdDateFormat0._formatRFC1123 = stdDateFormat17;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1277");
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
        java.util.Locale locale13 = stdDateFormat0._locale;
        java.util.Calendar calendar14 = stdDateFormat0.getCalendar();
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
        java.text.DateFormat dateFormat32 = stdDateFormat15._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat37 = dateFormat36.getNumberFormat();
        dateFormat35.setNumberFormat(numberFormat37);
        stdDateFormat33.setNumberFormat(numberFormat37);
        boolean boolean40 = stdDateFormat33.isLenient();
        java.text.DateFormat dateFormat41 = stdDateFormat33._formatISO8601;
        java.text.DateFormat dateFormat42 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat43 = dateFormat42.getNumberFormat();
        java.util.Calendar calendar44 = dateFormat42.getCalendar();
        stdDateFormat33.setCalendar(calendar44);
        boolean boolean47 = stdDateFormat33.equals((java.lang.Object) 7);
        java.lang.String str48 = stdDateFormat33.toString();
        java.lang.Boolean boolean49 = stdDateFormat33._lenient;
        java.text.DateFormat dateFormat50 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat51 = dateFormat50.getNumberFormat();
        java.util.Calendar calendar52 = dateFormat50.getCalendar();
        java.util.Calendar calendar53 = dateFormat50.getCalendar();
        java.util.Calendar calendar54 = dateFormat50.getCalendar();
        stdDateFormat33.setCalendar(calendar54);
        stdDateFormat15.setCalendar(calendar54);
        stdDateFormat0._formatISO8601 = stdDateFormat15;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat15.", stdDateFormat0.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1278");
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
        stdDateFormat0._lenient = false;
        java.text.DateFormat dateFormat20 = stdDateFormat0._formatISO8601_z;
        java.lang.Boolean boolean21 = stdDateFormat0._lenient;
        java.text.DateFormat dateFormat22 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        dateFormat25.setNumberFormat(numberFormat27);
        stdDateFormat23.setNumberFormat(numberFormat27);
        boolean boolean30 = stdDateFormat23.isLenient();
        boolean boolean32 = stdDateFormat23.looksLikeISO8601("");
        java.text.DateFormat dateFormat33 = stdDateFormat23._formatRFC1123;
        java.text.DateFormat dateFormat34 = stdDateFormat23._formatRFC1123;
        stdDateFormat0._formatISO8601_z = stdDateFormat23;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat23.", stdDateFormat0.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat0));
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1279");
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
        boolean boolean17 = stdDateFormat0.looksLikeISO8601("Wed, 31 Dec 1969 23:59:59 UTC");
        stdDateFormat0._lenient = false;
        java.util.Calendar calendar20 = stdDateFormat0.getCalendar();
        java.text.DateFormat dateFormat21 = stdDateFormat0._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        dateFormat24.setNumberFormat(numberFormat26);
        stdDateFormat22.setNumberFormat(numberFormat26);
        boolean boolean30 = stdDateFormat22.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat31 = stdDateFormat22._formatISO8601_z;
        boolean boolean33 = stdDateFormat22.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.text.DateFormat dateFormat34 = stdDateFormat22._formatRFC1123;
        java.util.TimeZone timeZone35 = stdDateFormat22.getTimeZone();
        java.util.TimeZone timeZone36 = stdDateFormat22._timezone;
        java.text.DateFormat dateFormat37 = stdDateFormat22._formatPlain;
        boolean boolean39 = stdDateFormat22.looksLikeISO8601("Thu, 01 Jan 1970 00:00:00 UTC");
        stdDateFormat0._formatRFC1123 = stdDateFormat22;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat22.", stdDateFormat0.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat0));
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1280");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat24);
        stdDateFormat20.setNumberFormat(numberFormat24);
        boolean boolean27 = stdDateFormat20.isLenient();
        java.text.DateFormat dateFormat28 = stdDateFormat20._formatISO8601;
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        java.util.Calendar calendar31 = dateFormat29.getCalendar();
        stdDateFormat20.setCalendar(calendar31);
        java.util.Calendar calendar33 = stdDateFormat20.getCalendar();
        java.lang.String str34 = stdDateFormat20.toString();
        boolean boolean36 = stdDateFormat20.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.text.DateFormat dateFormat37 = stdDateFormat20._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat42 = dateFormat41.getNumberFormat();
        dateFormat40.setNumberFormat(numberFormat42);
        stdDateFormat38.setNumberFormat(numberFormat42);
        boolean boolean45 = stdDateFormat38.isLenient();
        java.text.DateFormat dateFormat46 = stdDateFormat38._formatISO8601;
        java.text.DateFormat dateFormat47 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat48 = dateFormat47.getNumberFormat();
        java.util.Calendar calendar49 = dateFormat47.getCalendar();
        stdDateFormat38.setCalendar(calendar49);
        boolean boolean52 = stdDateFormat38.equals((java.lang.Object) 7);
        java.lang.String str53 = stdDateFormat38.toString();
        java.lang.Boolean boolean54 = stdDateFormat38._lenient;
        java.text.DateFormat dateFormat55 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat56 = dateFormat55.getNumberFormat();
        java.util.Calendar calendar57 = dateFormat55.getCalendar();
        java.util.Calendar calendar58 = dateFormat55.getCalendar();
        java.util.Calendar calendar59 = dateFormat55.getCalendar();
        stdDateFormat38.setCalendar(calendar59);
        stdDateFormat20.setCalendar(calendar59);
        java.text.DateFormat dateFormat62 = stdDateFormat20._formatRFC1123;
        stdDateFormat0._formatISO8601_z = stdDateFormat20;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat20.", stdDateFormat0.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat0));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1281");
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
        java.util.TimeZone timeZone24 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone24);
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone24);
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone24);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone24);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        dateFormat31.setNumberFormat(numberFormat33);
        stdDateFormat29.setNumberFormat(numberFormat33);
        boolean boolean36 = stdDateFormat29.isLenient();
        java.text.DateFormat dateFormat37 = stdDateFormat29._formatISO8601;
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat39 = dateFormat38.getNumberFormat();
        java.util.Calendar calendar40 = dateFormat38.getCalendar();
        stdDateFormat29.setCalendar(calendar40);
        java.util.Calendar calendar42 = stdDateFormat29.getCalendar();
        boolean boolean43 = stdDateFormat29.isLenient();
        java.util.Locale locale44 = stdDateFormat29._locale;
        java.text.DateFormat dateFormat45 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone24, locale44);
        stdDateFormat0._timezone = timeZone24;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat47 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat49 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat50 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat51 = dateFormat50.getNumberFormat();
        dateFormat49.setNumberFormat(numberFormat51);
        stdDateFormat47.setNumberFormat(numberFormat51);
        boolean boolean54 = stdDateFormat47.isLenient();
        boolean boolean56 = stdDateFormat47.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.NumberFormat numberFormat57 = stdDateFormat47.getNumberFormat();
        java.text.DateFormat dateFormat58 = stdDateFormat47._formatISO8601;
        java.util.Locale locale59 = stdDateFormat47._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat61 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24, locale59, (java.lang.Boolean) true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat47.", stdDateFormat0.equals(stdDateFormat47) == stdDateFormat47.equals(stdDateFormat0));
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1282");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.util.TimeZone timeZone5 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone5);
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5);
        java.util.TimeZone timeZone8 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone8);
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
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone8, locale21);
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone5, locale21);
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale21);
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        dateFormat28.setNumberFormat(numberFormat30);
        stdDateFormat26.setNumberFormat(numberFormat30);
        boolean boolean33 = stdDateFormat26.isLenient();
        boolean boolean35 = stdDateFormat26.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.util.Calendar calendar36 = stdDateFormat26.getCalendar();
        java.util.Date date38 = stdDateFormat26.parse("1970-01-01T00:00:00.000+0000");
        java.lang.String str39 = dateFormat25.format(date38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat10 and stdDateFormat26.", stdDateFormat10.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat10));
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1283");
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
        java.util.TimeZone timeZone12 = stdDateFormat0._timezone;
        boolean boolean14 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.lang.String str15 = stdDateFormat0.toString();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        java.text.DateFormat dateFormat23 = stdDateFormat16._formatISO8601;
        stdDateFormat16._lenient = true;
        java.lang.String str26 = stdDateFormat16.toString();
        java.text.DateFormat dateFormat27 = stdDateFormat16._formatPlain;
        java.text.DateFormat dateFormat28 = stdDateFormat16._formatISO8601;
        boolean boolean29 = stdDateFormat16.isLenient();
        java.util.Locale locale30 = stdDateFormat16._locale;
        stdDateFormat0._formatISO8601 = stdDateFormat16;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1284");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        stdDateFormat0.setNumberFormat(numberFormat2);
        java.text.DateFormat dateFormat4 = stdDateFormat0._formatISO8601;
        java.util.Locale locale5 = stdDateFormat0._locale;
        java.util.TimeZone timeZone6 = stdDateFormat0.getTimeZone();
        java.util.TimeZone timeZone8 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone8);
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone8);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        stdDateFormat11.setNumberFormat(numberFormat15);
        boolean boolean19 = stdDateFormat11.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat20 = stdDateFormat11._formatISO8601_z;
        boolean boolean22 = stdDateFormat11.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.util.Locale locale23 = stdDateFormat11._locale;
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone8, locale23);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance(1, locale23);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = stdDateFormat0.withLocale(locale23);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat26 and stdDateFormat11.", stdDateFormat26.equals(stdDateFormat11) == stdDateFormat11.equals(stdDateFormat26));
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1285");
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat17);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        java.util.Calendar calendar21 = dateFormat19.getCalendar();
        dateFormat15.setCalendar(calendar21);
        dateFormat15.setLenient(true);
        boolean boolean25 = stdDateFormat0.equals((java.lang.Object) dateFormat15);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        dateFormat28.setNumberFormat(numberFormat30);
        stdDateFormat26.setNumberFormat(numberFormat30);
        boolean boolean33 = stdDateFormat26.isLenient();
        java.text.DateFormat dateFormat34 = stdDateFormat26._formatISO8601;
        java.text.DateFormat dateFormat35 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat36 = dateFormat35.getNumberFormat();
        java.util.Calendar calendar37 = dateFormat35.getCalendar();
        stdDateFormat26.setCalendar(calendar37);
        java.util.Calendar calendar39 = stdDateFormat26.getCalendar();
        boolean boolean40 = stdDateFormat26.isLenient();
        boolean boolean42 = stdDateFormat26.looksLikeISO8601("");
        java.lang.String str43 = stdDateFormat26.toString();
        java.text.DateFormat dateFormat44 = stdDateFormat26._formatISO8601;
        java.lang.Boolean boolean45 = stdDateFormat26._lenient;
        stdDateFormat26._clearFormats();
        java.util.Calendar calendar47 = stdDateFormat26.getCalendar();
        stdDateFormat0._formatISO8601 = stdDateFormat26;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat26.", stdDateFormat0.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat0));
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1286");
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
        java.util.TimeZone timeZone27 = stdDateFormat13.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean28 = stdDateFormat0.equals((java.lang.Object) stdDateFormat13);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1287");
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
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        java.lang.String str19 = dateFormat16.format((java.lang.Object) 3);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat21);
        dateFormat1.setNumberFormat(numberFormat21);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        dateFormat26.setNumberFormat(numberFormat28);
        stdDateFormat24.setNumberFormat(numberFormat28);
        boolean boolean31 = stdDateFormat24.isLenient();
        boolean boolean33 = stdDateFormat24.looksLikeISO8601("");
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateTimeInstance();
        dateFormat34.setLenient(false);
        dateFormat34.setLenient(true);
        java.util.Calendar calendar39 = dateFormat34.getCalendar();
        stdDateFormat24._formatRFC1123 = dateFormat34;
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat44 = dateFormat43.getNumberFormat();
        dateFormat42.setNumberFormat(numberFormat44);
        java.text.NumberFormat numberFormat46 = dateFormat42.getNumberFormat();
        stdDateFormat24.setNumberFormat(numberFormat46);
        stdDateFormat24._clearFormats();
        boolean boolean50 = stdDateFormat24.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        boolean boolean51 = dateFormat1.equals((java.lang.Object) stdDateFormat24);
        java.text.NumberFormat numberFormat52 = stdDateFormat24.getNumberFormat();
        java.util.TimeZone timeZone53 = stdDateFormat24._timezone;
        java.text.DateFormat dateFormat54 = stdDateFormat24._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat55 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat57 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat58 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat59 = dateFormat58.getNumberFormat();
        dateFormat57.setNumberFormat(numberFormat59);
        stdDateFormat55.setNumberFormat(numberFormat59);
        boolean boolean62 = stdDateFormat55.isLenient();
        boolean boolean64 = stdDateFormat55.looksLikeISO8601("");
        boolean boolean65 = stdDateFormat55.isLenient();
        java.util.Locale locale66 = stdDateFormat55._locale;
        java.util.TimeZone timeZone67 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat55._timezone = timeZone67;
        stdDateFormat55._clearFormats();
        java.text.DateFormat dateFormat70 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        java.text.DateFormat dateFormat71 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat72 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat73 = dateFormat72.getNumberFormat();
        dateFormat71.setNumberFormat(numberFormat73);
        java.text.DateFormat dateFormat75 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat76 = dateFormat75.getNumberFormat();
        java.util.Calendar calendar77 = dateFormat75.getCalendar();
        dateFormat71.setCalendar(calendar77);
        dateFormat70.setCalendar(calendar77);
        java.text.DateFormat dateFormat80 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat81 = dateFormat80.getNumberFormat();
        java.util.TimeZone timeZone82 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat83 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone82);
        java.text.DateFormat dateFormat84 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat85 = dateFormat84.getNumberFormat();
        java.util.Calendar calendar86 = dateFormat84.getCalendar();
        dateFormat83.setCalendar(calendar86);
        dateFormat80.setCalendar(calendar86);
        dateFormat70.setCalendar(calendar86);
        java.util.Calendar calendar90 = dateFormat70.getCalendar();
        stdDateFormat55.setCalendar(calendar90);
        java.util.TimeZone timeZone92 = stdDateFormat55._timezone;
        java.util.TimeZone timeZone93 = stdDateFormat55._timezone;
        stdDateFormat24.setTimeZone(timeZone93);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat24 and stdDateFormat55.", stdDateFormat24.equals(stdDateFormat55) == stdDateFormat55.equals(stdDateFormat24));
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1288");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        stdDateFormat3.setNumberFormat(numberFormat7);
        java.util.Locale locale10 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale10);
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
        java.text.DateFormat dateFormat26 = stdDateFormat12._formatISO8601_z;
        java.util.Locale locale27 = stdDateFormat12._locale;
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale27);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat12.", stdDateFormat3.equals(stdDateFormat12) == stdDateFormat12.equals(stdDateFormat3));
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1289");
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
        java.text.NumberFormat numberFormat12 = stdDateFormat0.getNumberFormat();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat13, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat13.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat13.equals(stdDateFormat0));
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1290");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean8 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat9 = stdDateFormat0._formatISO8601_z;
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.util.Locale locale12 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat15 = dateFormat14.getNumberFormat();
        dateFormat13.setNumberFormat(numberFormat15);
        stdDateFormat0.setNumberFormat(numberFormat15);
        boolean boolean19 = stdDateFormat0.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat20 = stdDateFormat0._formatPlain;
        java.text.DateFormat dateFormat21 = stdDateFormat0._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat22, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat22.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat22.equals(stdDateFormat0));
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1291");
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
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatISO8601_z;
        stdDateFormat0._lenient = true;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean24 = stdDateFormat17.isLenient();
        boolean boolean26 = stdDateFormat17.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        boolean boolean28 = stdDateFormat17.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.text.DateFormat dateFormat29 = stdDateFormat17._formatISO8601;
        stdDateFormat17._lenient = true;
        java.util.Locale locale32 = stdDateFormat17._locale;
        java.util.Calendar calendar33 = stdDateFormat17.getCalendar();
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateInstance();
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat37 = dateFormat36.getNumberFormat();
        dateFormat35.setNumberFormat(numberFormat37);
        dateFormat34.setNumberFormat(numberFormat37);
        java.text.NumberFormat numberFormat40 = dateFormat34.getNumberFormat();
        stdDateFormat17.setNumberFormat(numberFormat40);
        stdDateFormat0.setNumberFormat(numberFormat40);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1292");
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
        java.lang.Boolean boolean14 = stdDateFormat0._lenient;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        boolean boolean23 = stdDateFormat15.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat24 = stdDateFormat15._formatISO8601_z;
        boolean boolean26 = stdDateFormat15.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.util.Locale locale27 = stdDateFormat15._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = stdDateFormat0.withLocale(locale27);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat28 and stdDateFormat15.", stdDateFormat28.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat28));
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1293");
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
        java.lang.String str14 = stdDateFormat0.toString();
        boolean boolean16 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        stdDateFormat0.setLenient(false);
        java.text.DateFormat dateFormat19 = stdDateFormat0._formatRFC1123;
        boolean boolean21 = stdDateFormat0.looksLikeISO8601("\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        dateFormat25.setNumberFormat(numberFormat27);
        stdDateFormat23.setNumberFormat(numberFormat27);
        boolean boolean31 = stdDateFormat23.looksLikeISO8601("hi!");
        java.lang.String str32 = stdDateFormat23.toString();
        java.util.TimeZone timeZone33 = stdDateFormat23._timezone;
        java.util.Locale locale34 = stdDateFormat23._locale;
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale34);
        boolean boolean37 = dateFormat35.equals((java.lang.Object) 6);
        stdDateFormat0._formatISO8601_z = dateFormat35;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat23.", stdDateFormat0.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat0));
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1294");
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
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatRFC1123;
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatISO8601;
        java.lang.String str16 = stdDateFormat0.toString();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean24 = stdDateFormat17.isLenient();
        java.text.DateFormat dateFormat25 = stdDateFormat17._formatISO8601;
        java.util.TimeZone timeZone26 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone26);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone26);
        stdDateFormat17.setTimeZone(timeZone26);
        stdDateFormat0._timezone = timeZone26;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1295");
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
        java.text.NumberFormat numberFormat12 = stdDateFormat0.getNumberFormat();
        stdDateFormat0._lenient = false;
        java.util.TimeZone timeZone15 = stdDateFormat0._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat16.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1296");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.util.TimeZone timeZone7 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat12 = dateFormat11.getNumberFormat();
        dateFormat10.setNumberFormat(numberFormat12);
        stdDateFormat8.setNumberFormat(numberFormat12);
        java.text.DateFormat dateFormat15 = stdDateFormat8._formatISO8601;
        stdDateFormat8._lenient = true;
        java.lang.String str18 = stdDateFormat8.toString();
        java.text.DateFormat dateFormat19 = stdDateFormat8._formatPlain;
        java.util.Locale locale20 = stdDateFormat8._locale;
        java.util.Locale locale21 = stdDateFormat8._locale;
        java.text.DateFormat dateFormat22 = stdDateFormat8._formatISO8601_z;
        java.util.Locale locale23 = stdDateFormat8._locale;
        boolean boolean24 = stdDateFormat0.equals((java.lang.Object) locale23);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat8.", stdDateFormat0.equals(stdDateFormat8) == stdDateFormat8.equals(stdDateFormat0));
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1297");
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
        java.text.DateFormat dateFormat17 = stdDateFormat0._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        dateFormat20.setNumberFormat(numberFormat22);
        stdDateFormat18.setNumberFormat(numberFormat22);
        boolean boolean25 = stdDateFormat18.isLenient();
        java.text.DateFormat dateFormat26 = stdDateFormat18._formatISO8601;
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        java.util.Calendar calendar29 = dateFormat27.getCalendar();
        stdDateFormat18.setCalendar(calendar29);
        boolean boolean32 = stdDateFormat18.equals((java.lang.Object) 7);
        java.lang.String str33 = stdDateFormat18.toString();
        java.text.DateFormat dateFormat34 = stdDateFormat18._formatISO8601_z;
        java.lang.String str35 = stdDateFormat18.toString();
        java.util.Date date37 = stdDateFormat18.parse("-1");
        java.lang.String str38 = stdDateFormat0.format(date37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat18.", stdDateFormat0.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat0));
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1298");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.util.TimeZone timeZone8 = stdDateFormat0._timezone;
        boolean boolean10 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.lang.Boolean boolean11 = stdDateFormat0._lenient;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat17);
        stdDateFormat13.setNumberFormat(numberFormat17);
        boolean boolean21 = stdDateFormat13.looksLikeISO8601("hi!");
        java.lang.String str22 = stdDateFormat13.toString();
        java.util.TimeZone timeZone23 = stdDateFormat13._timezone;
        java.util.Locale locale24 = stdDateFormat13._locale;
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance(0, locale24);
        java.util.Calendar calendar26 = dateFormat25.getCalendar();
        stdDateFormat0.setCalendar(calendar26);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat13.", stdDateFormat0.equals(stdDateFormat13) == stdDateFormat13.equals(stdDateFormat0));
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1299");
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
        stdDateFormat0._clearFormats();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        boolean boolean22 = stdDateFormat15.isLenient();
        boolean boolean24 = stdDateFormat15.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance();
        stdDateFormat15._formatPlain = dateFormat25;
        java.lang.String str27 = stdDateFormat15.toString();
        stdDateFormat0._formatISO8601 = stdDateFormat15;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat15.", stdDateFormat0.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1300");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601;
        java.util.TimeZone timeZone9 = stdDateFormat0.getTimeZone();
        java.util.TimeZone timeZone10 = stdDateFormat0.getTimeZone();
        boolean boolean12 = stdDateFormat0.looksLikeISO8601("");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat13, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat13.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat13.equals(stdDateFormat0));
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1301");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        boolean boolean21 = stdDateFormat14.isLenient();
        boolean boolean23 = stdDateFormat14.looksLikeISO8601("");
        java.lang.String str24 = stdDateFormat14.toString();
        java.util.Locale locale25 = stdDateFormat14._locale;
        stdDateFormat14._lenient = true;
        stdDateFormat0._formatISO8601_z = stdDateFormat14;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat14.", stdDateFormat0.equals(stdDateFormat14) == stdDateFormat14.equals(stdDateFormat0));
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1302");
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
        boolean boolean13 = stdDateFormat5.looksLikeISO8601("hi!");
        java.lang.String str14 = stdDateFormat5.toString();
        java.util.TimeZone timeZone15 = stdDateFormat5._timezone;
        java.text.NumberFormat numberFormat16 = stdDateFormat5.getNumberFormat();
        java.util.TimeZone timeZone17 = stdDateFormat5.getTimeZone();
        java.util.Locale locale18 = stdDateFormat5._locale;
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale18);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        dateFormat24.setNumberFormat(numberFormat26);
        stdDateFormat22.setNumberFormat(numberFormat26);
        java.text.DateFormat dateFormat29 = stdDateFormat22._formatISO8601;
        stdDateFormat22._lenient = true;
        java.lang.String str32 = stdDateFormat22.toString();
        java.util.TimeZone timeZone33 = stdDateFormat22.getTimeZone();
        boolean boolean35 = stdDateFormat22.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.util.Locale locale36 = stdDateFormat22._locale;
        java.text.DateFormat dateFormat37 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat5 and stdDateFormat22.", stdDateFormat5.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat5));
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1303");
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
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatPlain;
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean23 = stdDateFormat16.isLenient();
        java.text.DateFormat dateFormat24 = stdDateFormat16._formatISO8601;
        stdDateFormat16._clearFormats();
        stdDateFormat16._clearFormats();
        java.lang.String str27 = stdDateFormat16.toString();
        java.text.DateFormat dateFormat28 = stdDateFormat16._formatISO8601;
        java.lang.String str29 = stdDateFormat16.toString();
        java.util.Calendar calendar30 = stdDateFormat16.getCalendar();
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        stdDateFormat16.setNumberFormat(numberFormat32);
        stdDateFormat0._formatISO8601_z = stdDateFormat16;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1304");
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
        stdDateFormat0._clearFormats();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean24 = stdDateFormat16.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat25 = stdDateFormat16._formatISO8601_z;
        boolean boolean27 = stdDateFormat16.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.util.Locale locale28 = stdDateFormat16._locale;
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        dateFormat29.setNumberFormat(numberFormat31);
        stdDateFormat16.setNumberFormat(numberFormat31);
        stdDateFormat16._lenient = true;
        java.util.TimeZone timeZone36 = stdDateFormat16._timezone;
        stdDateFormat0._formatISO8601 = stdDateFormat16;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1305");
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
        stdDateFormat0._clearFormats();
        java.lang.Boolean boolean14 = stdDateFormat0._lenient;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        boolean boolean22 = stdDateFormat15.isLenient();
        boolean boolean24 = stdDateFormat15.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.text.NumberFormat numberFormat25 = stdDateFormat15.getNumberFormat();
        java.text.DateFormat dateFormat26 = stdDateFormat15._formatISO8601;
        java.text.DateFormat dateFormat27 = stdDateFormat15._formatPlain;
        boolean boolean28 = stdDateFormat15.isLenient();
        java.text.DateFormat dateFormat29 = stdDateFormat15._formatISO8601_z;
        java.text.DateFormat dateFormat30 = stdDateFormat15._formatRFC1123;
        stdDateFormat0._formatISO8601_z = stdDateFormat15;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat15.", stdDateFormat0.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1306");
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
        java.lang.String str16 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance(2, (int) (byte) 1);
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        stdDateFormat0._formatPlain = dateFormat19;
        stdDateFormat0._lenient = true;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        dateFormat26.setNumberFormat(numberFormat28);
        stdDateFormat24.setNumberFormat(numberFormat28);
        boolean boolean31 = stdDateFormat24.isLenient();
        boolean boolean33 = stdDateFormat24.looksLikeISO8601("");
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateTimeInstance();
        dateFormat34.setLenient(false);
        dateFormat34.setLenient(true);
        java.util.Calendar calendar39 = dateFormat34.getCalendar();
        stdDateFormat24._formatRFC1123 = dateFormat34;
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat44 = dateFormat43.getNumberFormat();
        dateFormat42.setNumberFormat(numberFormat44);
        java.text.NumberFormat numberFormat46 = dateFormat42.getNumberFormat();
        stdDateFormat24.setNumberFormat(numberFormat46);
        stdDateFormat24._clearFormats();
        boolean boolean50 = stdDateFormat24.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.lang.String str51 = stdDateFormat24.toString();
        boolean boolean52 = stdDateFormat24.isLenient();
        stdDateFormat24._clearFormats();
        java.text.DateFormat dateFormat54 = stdDateFormat24._formatPlain;
        java.util.Date date56 = stdDateFormat24.parse("1970-01-01T00:00:00.010+0000");
        java.lang.String str57 = stdDateFormat0.format(date56);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat24.", stdDateFormat0.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat0));
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1307");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        boolean boolean21 = stdDateFormat14.isLenient();
        boolean boolean23 = stdDateFormat14.looksLikeISO8601("");
        boolean boolean24 = stdDateFormat14.isLenient();
        java.util.Locale locale25 = stdDateFormat14._locale;
        java.util.TimeZone timeZone26 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat14._timezone = timeZone26;
        java.text.DateFormat dateFormat28 = stdDateFormat14._formatISO8601_z;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateTimeInstance(2, (int) (byte) 1);
        stdDateFormat14._formatISO8601 = dateFormat31;
        java.util.Locale locale33 = stdDateFormat14._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12, locale33, (java.lang.Boolean) true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat14.", stdDateFormat0.equals(stdDateFormat14) == stdDateFormat14.equals(stdDateFormat0));
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1308");
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
        java.util.TimeZone timeZone14 = stdDateFormat0.getTimeZone();
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
        boolean boolean28 = stdDateFormat15.isLenient();
        java.util.TimeZone timeZone29 = stdDateFormat15.getTimeZone();
        java.util.Locale locale30 = stdDateFormat15._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone14, locale30, (java.lang.Boolean) false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat15.", stdDateFormat0.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1309");
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
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatRFC1123;
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
        java.lang.String str27 = stdDateFormat13.toString();
        boolean boolean29 = stdDateFormat13.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.lang.String str30 = stdDateFormat13.toString();
        stdDateFormat0._formatPlain = stdDateFormat13;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat13.", stdDateFormat0.equals(stdDateFormat13) == stdDateFormat13.equals(stdDateFormat0));
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1310");
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
        boolean boolean20 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat21 = stdDateFormat0._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        dateFormat24.setNumberFormat(numberFormat26);
        stdDateFormat22.setNumberFormat(numberFormat26);
        boolean boolean29 = stdDateFormat22.isLenient();
        boolean boolean31 = stdDateFormat22.looksLikeISO8601("");
        boolean boolean32 = stdDateFormat22.isLenient();
        java.util.Locale locale33 = stdDateFormat22._locale;
        java.util.TimeZone timeZone34 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat22._timezone = timeZone34;
        java.lang.String str36 = stdDateFormat22.toString();
        stdDateFormat22._lenient = false;
        java.util.TimeZone timeZone39 = stdDateFormat22.getTimeZone();
        java.util.TimeZone timeZone40 = stdDateFormat22._timezone;
        stdDateFormat0._timezone = timeZone40;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat22.", stdDateFormat0.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat0));
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1311");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat8 = stdDateFormat0._formatISO8601;
        stdDateFormat0._clearFormats();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        dateFormat12.setNumberFormat(numberFormat14);
        stdDateFormat10.setNumberFormat(numberFormat14);
        boolean boolean17 = stdDateFormat10.isLenient();
        boolean boolean19 = stdDateFormat10.looksLikeISO8601("");
        java.lang.String str20 = stdDateFormat10.toString();
        boolean boolean22 = stdDateFormat10.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat23 = stdDateFormat10._formatPlain;
        boolean boolean24 = stdDateFormat10.isLenient();
        java.text.DateFormat dateFormat25 = stdDateFormat10._formatISO8601_z;
        java.text.DateFormat dateFormat26 = stdDateFormat10._formatISO8601_z;
        java.util.Calendar calendar27 = stdDateFormat10.getCalendar();
        java.util.Calendar calendar28 = stdDateFormat10.getCalendar();
        boolean boolean29 = stdDateFormat10.isLenient();
        stdDateFormat0._formatISO8601 = stdDateFormat10;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat10.", stdDateFormat0.equals(stdDateFormat10) == stdDateFormat10.equals(stdDateFormat0));
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1312");
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
        boolean boolean16 = stdDateFormat0.isLenient();
        java.lang.Boolean boolean17 = stdDateFormat0._lenient;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        dateFormat20.setNumberFormat(numberFormat22);
        stdDateFormat18.setNumberFormat(numberFormat22);
        boolean boolean26 = stdDateFormat18.looksLikeISO8601("hi!");
        java.lang.String str27 = stdDateFormat18.toString();
        java.util.TimeZone timeZone28 = stdDateFormat18._timezone;
        java.text.NumberFormat numberFormat29 = stdDateFormat18.getNumberFormat();
        java.lang.String str30 = stdDateFormat18.toString();
        java.util.TimeZone timeZone31 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone31);
        stdDateFormat18._formatRFC1123 = dateFormat32;
        boolean boolean35 = stdDateFormat18.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat36 = stdDateFormat18._formatISO8601;
        java.util.TimeZone timeZone37 = stdDateFormat18._timezone;
        stdDateFormat0._formatISO8601 = stdDateFormat18;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat18.", stdDateFormat0.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat0));
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1313");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat21, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat21.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat21.equals(stdDateFormat0));
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1314");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean24 = stdDateFormat17.isLenient();
        boolean boolean26 = stdDateFormat17.looksLikeISO8601("");
        boolean boolean27 = stdDateFormat17.isLenient();
        java.util.Locale locale28 = stdDateFormat17._locale;
        java.util.TimeZone timeZone29 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat17._timezone = timeZone29;
        java.lang.String str31 = stdDateFormat17.toString();
        boolean boolean33 = stdDateFormat17.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.util.TimeZone timeZone34 = stdDateFormat17._timezone;
        stdDateFormat0._timezone = timeZone34;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1315");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean8 = stdDateFormat0.isLenient();
        stdDateFormat0._clearFormats();
        java.util.Calendar calendar10 = stdDateFormat0.getCalendar();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat11, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat11.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat11.equals(stdDateFormat0));
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1316");
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
        boolean boolean16 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat17 = stdDateFormat0._formatPlain;
        java.util.TimeZone timeZone18 = stdDateFormat0.getTimeZone();
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        dateFormat23.setNumberFormat(numberFormat25);
        stdDateFormat21.setNumberFormat(numberFormat25);
        boolean boolean29 = stdDateFormat21.looksLikeISO8601("hi!");
        java.lang.String str30 = stdDateFormat21.toString();
        java.util.TimeZone timeZone31 = stdDateFormat21._timezone;
        java.text.NumberFormat numberFormat32 = stdDateFormat21.getNumberFormat();
        java.lang.String str33 = stdDateFormat21.toString();
        java.util.TimeZone timeZone34 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat35 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone34);
        stdDateFormat21._formatRFC1123 = dateFormat35;
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat40 = dateFormat39.getNumberFormat();
        dateFormat38.setNumberFormat(numberFormat40);
        java.text.NumberFormat numberFormat42 = dateFormat38.getNumberFormat();
        stdDateFormat21.setNumberFormat(numberFormat42);
        java.util.Locale locale44 = stdDateFormat21._locale;
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getTimeInstance((int) (short) 0, locale44);
        java.text.DateFormat dateFormat46 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18, locale44);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat21.", stdDateFormat0.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat0));
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1317");
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
        java.util.TimeZone timeZone16 = stdDateFormat0._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean24 = stdDateFormat17.isLenient();
        boolean boolean26 = stdDateFormat17.looksLikeISO8601("");
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance();
        dateFormat27.setLenient(false);
        dateFormat27.setLenient(true);
        java.util.Calendar calendar32 = dateFormat27.getCalendar();
        stdDateFormat17._formatRFC1123 = dateFormat27;
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat37 = dateFormat36.getNumberFormat();
        dateFormat35.setNumberFormat(numberFormat37);
        java.text.NumberFormat numberFormat39 = dateFormat35.getNumberFormat();
        stdDateFormat17.setNumberFormat(numberFormat39);
        stdDateFormat17._clearFormats();
        boolean boolean43 = stdDateFormat17.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.lang.String str44 = stdDateFormat17.toString();
        boolean boolean45 = stdDateFormat17.isLenient();
        stdDateFormat17._clearFormats();
        java.text.DateFormat dateFormat47 = stdDateFormat17._formatPlain;
        stdDateFormat0._formatRFC1123 = stdDateFormat17;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1318");
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
        java.util.TimeZone timeZone24 = stdDateFormat0._timezone;
        java.text.DateFormat dateFormat25 = stdDateFormat0._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat30 = dateFormat29.getNumberFormat();
        dateFormat28.setNumberFormat(numberFormat30);
        stdDateFormat26.setNumberFormat(numberFormat30);
        boolean boolean33 = stdDateFormat26.isLenient();
        boolean boolean35 = stdDateFormat26.looksLikeISO8601("");
        stdDateFormat26._clearFormats();
        java.text.DateFormat dateFormat37 = stdDateFormat26._formatPlain;
        java.util.TimeZone timeZone38 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone38);
        stdDateFormat26._timezone = timeZone38;
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateTimeInstance();
        java.text.NumberFormat numberFormat42 = dateFormat41.getNumberFormat();
        stdDateFormat26._formatISO8601 = dateFormat41;
        java.util.TimeZone timeZone44 = stdDateFormat26._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat45 = stdDateFormat0.withTimeZone(timeZone44);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat26.", stdDateFormat0.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat0));
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1319");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.util.Locale locale10 = stdDateFormat0._locale;
        java.util.Calendar calendar11 = stdDateFormat0.getCalendar();
        stdDateFormat0._clearFormats();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        dateFormat15.setNumberFormat(numberFormat17);
        stdDateFormat13.setNumberFormat(numberFormat17);
        boolean boolean21 = stdDateFormat13.looksLikeISO8601("hi!");
        java.lang.String str22 = stdDateFormat13.toString();
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        boolean boolean25 = dateFormat23.equals((java.lang.Object) true);
        stdDateFormat13._formatISO8601 = dateFormat23;
        boolean boolean27 = stdDateFormat13.isLenient();
        boolean boolean29 = stdDateFormat13.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        boolean boolean31 = stdDateFormat13.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        stdDateFormat0._formatPlain = stdDateFormat13;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat13.", stdDateFormat0.equals(stdDateFormat13) == stdDateFormat13.equals(stdDateFormat0));
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1320");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat2);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat5);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat11 = dateFormat10.getNumberFormat();
        dateFormat9.setNumberFormat(numberFormat11);
        stdDateFormat7.setNumberFormat(numberFormat11);
        boolean boolean14 = stdDateFormat7.isLenient();
        boolean boolean16 = stdDateFormat7.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.util.Locale locale17 = stdDateFormat7._locale;
        java.lang.String str18 = stdDateFormat7.toString();
        stdDateFormat7._clearFormats();
        boolean boolean20 = dateFormat0.equals((java.lang.Object) stdDateFormat7);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        dateFormat23.setNumberFormat(numberFormat25);
        stdDateFormat21.setNumberFormat(numberFormat25);
        boolean boolean28 = stdDateFormat21.isLenient();
        java.text.DateFormat dateFormat29 = stdDateFormat21._formatISO8601;
        java.util.TimeZone timeZone30 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone30);
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone30);
        stdDateFormat21.setTimeZone(timeZone30);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone30);
        stdDateFormat7._timezone = timeZone30;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat7 and stdDateFormat21.", stdDateFormat7.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat7));
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1321");
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
        stdDateFormat0._clearFormats();
        java.text.DateFormat dateFormat16 = stdDateFormat0._formatPlain;
        stdDateFormat0._lenient = true;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean27 = stdDateFormat19.looksLikeISO8601("hi!");
        java.lang.String str28 = stdDateFormat19.toString();
        java.util.TimeZone timeZone29 = stdDateFormat19._timezone;
        java.text.NumberFormat numberFormat30 = stdDateFormat19.getNumberFormat();
        boolean boolean31 = stdDateFormat19.isLenient();
        java.util.TimeZone timeZone32 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone32);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone32);
        java.text.DateFormat dateFormat35 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone32);
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone32);
        stdDateFormat19._timezone = timeZone32;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = stdDateFormat0.withTimeZone(timeZone32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat19.", stdDateFormat0.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat0));
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1322");
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
        boolean boolean17 = stdDateFormat0.looksLikeISO8601("Wed, 31 Dec 1969 23:59:59 UTC");
        java.text.NumberFormat numberFormat18 = stdDateFormat0.getNumberFormat();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean27 = stdDateFormat19.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat28 = stdDateFormat19._formatISO8601_z;
        java.text.DateFormat dateFormat29 = stdDateFormat19._formatPlain;
        java.text.DateFormat dateFormat30 = stdDateFormat19._formatISO8601_z;
        java.util.TimeZone timeZone31 = stdDateFormat19._timezone;
        java.lang.Boolean boolean32 = stdDateFormat19._lenient;
        java.util.Date date34 = stdDateFormat19.parse("0");
        boolean boolean35 = stdDateFormat19.isLenient();
        java.lang.Boolean boolean36 = stdDateFormat19._lenient;
        stdDateFormat0._formatRFC1123 = stdDateFormat19;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat19.", stdDateFormat0.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat0));
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1323");
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
        java.text.NumberFormat numberFormat14 = stdDateFormat0.getNumberFormat();
        java.util.TimeZone timeZone15 = stdDateFormat0._timezone;
        java.lang.String str16 = stdDateFormat0.toString();
        java.util.TimeZone timeZone17 = stdDateFormat0._timezone;
        java.util.TimeZone timeZone18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat24);
        stdDateFormat20.setNumberFormat(numberFormat24);
        boolean boolean27 = stdDateFormat20.isLenient();
        boolean boolean29 = stdDateFormat20.looksLikeISO8601("");
        boolean boolean30 = stdDateFormat20.isLenient();
        java.util.Locale locale31 = stdDateFormat20._locale;
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18, locale31);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone17, locale31, (java.lang.Boolean) true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat20.", stdDateFormat0.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat0));
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1324");
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
        java.text.DateFormat dateFormat23 = stdDateFormat0._formatISO8601_z;
        java.lang.String str24 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance(2, (int) (byte) 1);
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        boolean boolean29 = stdDateFormat0.equals((java.lang.Object) numberFormat28);
        java.util.Date date31 = stdDateFormat0.parse("-1");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat32, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat32.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat32.equals(stdDateFormat0));
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1325");
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
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone10);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat20);
        stdDateFormat16.setNumberFormat(numberFormat20);
        boolean boolean24 = stdDateFormat16.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat25 = stdDateFormat16._formatISO8601_z;
        boolean boolean27 = stdDateFormat16.looksLikeISO8601("\u0e21\u0e04. 2513");
        java.text.DateFormat dateFormat28 = stdDateFormat16._formatRFC1123;
        java.text.DateFormat dateFormat29 = stdDateFormat16._formatISO8601_z;
        java.util.Locale locale30 = stdDateFormat16._locale;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat33 = dateFormat32.getNumberFormat();
        dateFormat31.setNumberFormat(numberFormat33);
        java.text.DateFormat dateFormat35 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat36 = dateFormat35.getNumberFormat();
        java.util.Calendar calendar37 = dateFormat35.getCalendar();
        dateFormat31.setCalendar(calendar37);
        dateFormat31.setLenient(true);
        boolean boolean41 = stdDateFormat16.equals((java.lang.Object) dateFormat31);
        java.util.Locale locale42 = stdDateFormat16._locale;
        java.text.DateFormat dateFormat43 = stdDateFormat16._formatISO8601_z;
        java.util.TimeZone timeZone44 = stdDateFormat16.getTimeZone();
        java.util.Locale locale45 = stdDateFormat16._locale;
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getTimeInstance(0, locale45);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat47 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10, locale45);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat16.", stdDateFormat0.equals(stdDateFormat16) == stdDateFormat16.equals(stdDateFormat0));
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1326");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601;
        stdDateFormat0._lenient = true;
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatPlain;
        java.util.Locale locale13 = stdDateFormat0._locale;
        java.util.TimeZone timeZone14 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
        stdDateFormat0.setTimeZone(timeZone14);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean27 = stdDateFormat19.looksLikeISO8601("hi!");
        java.lang.String str28 = stdDateFormat19.toString();
        java.lang.Boolean boolean29 = stdDateFormat19._lenient;
        java.util.Locale locale30 = stdDateFormat19._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone14, locale30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat19.", stdDateFormat0.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat0));
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1327");
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
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        boolean boolean15 = dateFormat13.equals((java.lang.Object) "yyyy-MM-dd");
        stdDateFormat0._formatRFC1123 = dateFormat13;
        stdDateFormat0._lenient = false;
        java.util.TimeZone timeZone19 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat24);
        stdDateFormat20.setNumberFormat(numberFormat24);
        boolean boolean27 = stdDateFormat20.isLenient();
        boolean boolean29 = stdDateFormat20.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance();
        stdDateFormat20._formatPlain = dateFormat30;
        java.util.TimeZone timeZone32 = stdDateFormat20.getTimeZone();
        java.text.DateFormat dateFormat33 = stdDateFormat20._formatRFC1123;
        stdDateFormat0._formatPlain = stdDateFormat20;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat20.", stdDateFormat0.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat0));
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1328");
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
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatISO8601;
        java.util.Locale locale13 = stdDateFormat0._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        boolean boolean21 = stdDateFormat14.isLenient();
        boolean boolean23 = stdDateFormat14.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en_US)");
        java.util.Locale locale24 = stdDateFormat14._locale;
        java.text.DateFormat dateFormat25 = stdDateFormat14._formatPlain;
        java.util.TimeZone timeZone26 = stdDateFormat14._timezone;
        boolean boolean27 = stdDateFormat14.isLenient();
        stdDateFormat14._clearFormats();
        stdDateFormat0._formatPlain = stdDateFormat14;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat14.", stdDateFormat0.equals(stdDateFormat14) == stdDateFormat14.equals(stdDateFormat0));
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1329");
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
        boolean boolean17 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat18 = stdDateFormat0._formatISO8601;
        java.util.TimeZone timeZone19 = stdDateFormat0._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat24 = dateFormat23.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat24);
        stdDateFormat20.setNumberFormat(numberFormat24);
        boolean boolean27 = stdDateFormat20.isLenient();
        boolean boolean29 = stdDateFormat20.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance();
        stdDateFormat20._formatPlain = dateFormat30;
        java.util.TimeZone timeZone32 = stdDateFormat20._timezone;
        java.lang.Boolean boolean33 = stdDateFormat20._lenient;
        stdDateFormat20._clearFormats();
        stdDateFormat0._formatISO8601_z = stdDateFormat20;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat20.", stdDateFormat0.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat0));
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1330");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601;
        stdDateFormat0._lenient = true;
        java.lang.String str10 = stdDateFormat0.toString();
        java.util.TimeZone timeZone11 = stdDateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        dateFormat14.setNumberFormat(numberFormat16);
        stdDateFormat12.setNumberFormat(numberFormat16);
        boolean boolean19 = stdDateFormat12.isLenient();
        boolean boolean21 = stdDateFormat12.looksLikeISO8601("");
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateTimeInstance();
        dateFormat22.setLenient(false);
        dateFormat22.setLenient(true);
        java.util.Calendar calendar27 = dateFormat22.getCalendar();
        stdDateFormat12._formatRFC1123 = dateFormat22;
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        dateFormat30.setNumberFormat(numberFormat32);
        java.text.NumberFormat numberFormat34 = dateFormat30.getNumberFormat();
        stdDateFormat12.setNumberFormat(numberFormat34);
        boolean boolean36 = stdDateFormat12.isLenient();
        java.util.Locale locale37 = stdDateFormat12._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = stdDateFormat0.withLocale(locale37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat38 and stdDateFormat12.", stdDateFormat38.equals(stdDateFormat12) == stdDateFormat12.equals(stdDateFormat38));
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1331");
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
        java.util.Locale locale12 = stdDateFormat0._locale;
        java.util.Locale locale13 = stdDateFormat0._locale;
        java.lang.String str14 = stdDateFormat0.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean25 = stdDateFormat17.looksLikeISO8601("hi!");
        java.lang.String str26 = stdDateFormat17.toString();
        java.util.TimeZone timeZone27 = stdDateFormat17._timezone;
        java.text.NumberFormat numberFormat28 = stdDateFormat17.getNumberFormat();
        java.lang.String str29 = stdDateFormat17.toString();
        java.util.TimeZone timeZone30 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone30);
        stdDateFormat17._formatRFC1123 = dateFormat31;
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat36 = dateFormat35.getNumberFormat();
        dateFormat34.setNumberFormat(numberFormat36);
        java.text.NumberFormat numberFormat38 = dateFormat34.getNumberFormat();
        stdDateFormat17.setNumberFormat(numberFormat38);
        java.util.Locale locale40 = stdDateFormat17._locale;
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateInstance(2, locale40);
        stdDateFormat0._formatISO8601_z = dateFormat41;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat17.", stdDateFormat0.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat0));
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1332");
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
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatISO8601_z;
        java.lang.Boolean boolean13 = stdDateFormat0._lenient;
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
        java.util.TimeZone timeZone29 = stdDateFormat15.getTimeZone();
        java.util.Locale locale30 = stdDateFormat15._locale;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale30);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = stdDateFormat0.withLocale(locale30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat32 and stdDateFormat15.", stdDateFormat32.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat32));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1333");
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
        stdDateFormat0._clearFormats();
        stdDateFormat0._lenient = false;
        java.text.DateFormat dateFormat27 = stdDateFormat0._formatRFC1123;
        java.util.TimeZone timeZone28 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone28);
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone28);
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone28);
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone28);
        java.util.TimeZone timeZone33 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone33);
        java.text.DateFormat dateFormat35 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone33);
        java.util.TimeZone timeZone36 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat37 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone36);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat42 = dateFormat41.getNumberFormat();
        dateFormat40.setNumberFormat(numberFormat42);
        stdDateFormat38.setNumberFormat(numberFormat42);
        boolean boolean45 = stdDateFormat38.isLenient();
        boolean boolean47 = stdDateFormat38.looksLikeISO8601("");
        boolean boolean48 = stdDateFormat38.isLenient();
        java.util.Locale locale49 = stdDateFormat38._locale;
        java.text.DateFormat dateFormat50 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone36, locale49);
        java.text.DateFormat dateFormat51 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone33, locale49);
        java.text.DateFormat dateFormat52 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone28, locale49);
        java.text.DateFormat dateFormat53 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone28);
        stdDateFormat0._formatPlain = dateFormat53;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat38.", stdDateFormat0.equals(stdDateFormat38) == stdDateFormat38.equals(stdDateFormat0));
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1334");
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
        java.util.TimeZone timeZone17 = stdDateFormat0._timezone;
        boolean boolean18 = stdDateFormat0.isLenient();
        java.util.TimeZone timeZone19 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone19);
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone19);
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone19);
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone19);
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone19);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        dateFormat27.setNumberFormat(numberFormat29);
        stdDateFormat25.setNumberFormat(numberFormat29);
        boolean boolean32 = stdDateFormat25.isLenient();
        boolean boolean34 = stdDateFormat25.looksLikeISO8601("");
        stdDateFormat25._clearFormats();
        stdDateFormat25._lenient = false;
        java.util.Locale locale38 = stdDateFormat25._locale;
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone19, locale38);
        stdDateFormat0._formatRFC1123 = dateFormat39;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat25.", stdDateFormat0.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat0));
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1335");
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
        java.text.DateFormat dateFormat13 = stdDateFormat0._formatRFC1123;
        java.util.Locale locale14 = stdDateFormat0._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        boolean boolean23 = stdDateFormat15.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat24 = stdDateFormat15._formatISO8601;
        java.util.TimeZone timeZone25 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone25);
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone25);
        stdDateFormat15.setTimeZone(timeZone25);
        stdDateFormat0._timezone = timeZone25;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat15.", stdDateFormat0.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1336");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = stdDateFormat0._formatISO8601;
        stdDateFormat0._lenient = true;
        boolean boolean11 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat12 = stdDateFormat0._formatPlain;
        java.util.Locale locale13 = stdDateFormat0._locale;
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat15, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat15.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1337");
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
        java.text.DateFormat dateFormat15 = stdDateFormat0._formatISO8601_z;
        boolean boolean17 = stdDateFormat0.looksLikeISO8601("0");
        boolean boolean19 = stdDateFormat0.looksLikeISO8601("-1");
        boolean boolean20 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat21 = stdDateFormat0._formatISO8601_z;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        dateFormat24.setNumberFormat(numberFormat26);
        stdDateFormat22.setNumberFormat(numberFormat26);
        boolean boolean30 = stdDateFormat22.looksLikeISO8601("hi!");
        java.lang.String str31 = stdDateFormat22.toString();
        java.util.TimeZone timeZone32 = stdDateFormat22._timezone;
        java.text.NumberFormat numberFormat33 = stdDateFormat22.getNumberFormat();
        java.util.TimeZone timeZone34 = stdDateFormat22.getTimeZone();
        java.util.Locale locale35 = stdDateFormat22._locale;
        java.util.Calendar calendar36 = stdDateFormat22.getCalendar();
        java.util.Locale locale37 = stdDateFormat22._locale;
        stdDateFormat0._formatPlain = stdDateFormat22;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat22.", stdDateFormat0.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat0));
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1338");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean26 = stdDateFormat19.isLenient();
        boolean boolean28 = stdDateFormat19.looksLikeISO8601("");
        stdDateFormat19._clearFormats();
        java.text.DateFormat dateFormat30 = stdDateFormat19._formatISO8601;
        boolean boolean31 = stdDateFormat19.isLenient();
        java.util.Locale locale32 = stdDateFormat19._locale;
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getTimeInstance(2, locale32);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone17, locale32, (java.lang.Boolean) false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat19.", stdDateFormat0.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat0));
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1339");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat8 = dateFormat7.getNumberFormat();
        dateFormat6.setNumberFormat(numberFormat8);
        stdDateFormat4.setNumberFormat(numberFormat8);
        boolean boolean11 = stdDateFormat4.isLenient();
        java.util.TimeZone timeZone12 = stdDateFormat4._timezone;
        boolean boolean14 = stdDateFormat4.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.lang.Boolean boolean15 = stdDateFormat4._lenient;
        java.text.DateFormat dateFormat16 = stdDateFormat4._formatISO8601_z;
        java.util.Calendar calendar17 = stdDateFormat4.getCalendar();
        java.util.Locale locale18 = stdDateFormat4._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale18);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat19, stdDateFormat4, and timeZone0.", !(stdDateFormat19.equals(stdDateFormat4) && stdDateFormat4.equals(timeZone0)) || stdDateFormat19.equals(timeZone0));
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1340");
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
        java.lang.Boolean boolean13 = stdDateFormat0._lenient;
        java.text.DateFormat dateFormat14 = stdDateFormat0._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = stdDateFormat0.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat15, stdDateFormat0, and stdDateFormat0.", !(stdDateFormat15.equals(stdDateFormat0) && stdDateFormat0.equals(stdDateFormat0)) || stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1341");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        dateFormat14.setNumberFormat(numberFormat16);
        stdDateFormat12.setNumberFormat(numberFormat16);
        boolean boolean20 = stdDateFormat12.looksLikeISO8601("hi!");
        java.lang.String str21 = stdDateFormat12.toString();
        java.util.TimeZone timeZone22 = stdDateFormat12._timezone;
        java.text.NumberFormat numberFormat23 = stdDateFormat12.getNumberFormat();
        java.util.TimeZone timeZone24 = stdDateFormat12.getTimeZone();
        java.util.Locale locale25 = stdDateFormat12._locale;
        java.lang.Boolean boolean26 = stdDateFormat12._lenient;
        boolean boolean28 = stdDateFormat12.looksLikeISO8601("Thu, 01 Jan 1970 00:00:00 UTC");
        java.text.DateFormat dateFormat29 = stdDateFormat12._formatRFC1123;
        java.lang.String str30 = stdDateFormat12.toString();
        java.text.DateFormat dateFormat31 = stdDateFormat12._formatISO8601;
        stdDateFormat0._formatRFC1123 = stdDateFormat12;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat12.", stdDateFormat0.equals(stdDateFormat12) == stdDateFormat12.equals(stdDateFormat0));
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1342");
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
        java.util.TimeZone timeZone16 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16);
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone16);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone16);
        stdDateFormat0.setTimeZone(timeZone16);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat28 = dateFormat27.getNumberFormat();
        dateFormat26.setNumberFormat(numberFormat28);
        stdDateFormat24.setNumberFormat(numberFormat28);
        boolean boolean32 = stdDateFormat24.looksLikeISO8601("hi!");
        java.lang.String str33 = stdDateFormat24.toString();
        java.util.TimeZone timeZone34 = stdDateFormat24._timezone;
        java.util.Locale locale35 = stdDateFormat24._locale;
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance(3, locale35);
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance(0, locale35);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16, locale35, (java.lang.Boolean) true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat24.", stdDateFormat0.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat0));
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1343");
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
        stdDateFormat0._clearFormats();
        boolean boolean15 = stdDateFormat0.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getInstance();
        java.text.DateFormat dateFormat17 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat21);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        dateFormat25.setNumberFormat(numberFormat27);
        stdDateFormat23.setNumberFormat(numberFormat27);
        boolean boolean30 = stdDateFormat23.isLenient();
        boolean boolean32 = stdDateFormat23.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        java.util.Locale locale33 = stdDateFormat23._locale;
        java.lang.String str34 = stdDateFormat23.toString();
        stdDateFormat23._clearFormats();
        boolean boolean36 = dateFormat16.equals((java.lang.Object) stdDateFormat23);
        stdDateFormat0._formatPlain = dateFormat16;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat23.", stdDateFormat0.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat0));
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1344");
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
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12);
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone12);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        dateFormat20.setNumberFormat(numberFormat22);
        stdDateFormat18.setNumberFormat(numberFormat22);
        boolean boolean26 = stdDateFormat18.looksLikeISO8601("hi!");
        java.lang.String str27 = stdDateFormat18.toString();
        java.util.TimeZone timeZone28 = stdDateFormat18._timezone;
        java.text.NumberFormat numberFormat29 = stdDateFormat18.getNumberFormat();
        java.util.TimeZone timeZone30 = stdDateFormat18.getTimeZone();
        java.util.Locale locale31 = stdDateFormat18._locale;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getTimeInstance(0, locale31);
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12, locale31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat18.", stdDateFormat0.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat0));
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1345");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        boolean boolean21 = stdDateFormat14.isLenient();
        boolean boolean23 = stdDateFormat14.looksLikeISO8601("");
        stdDateFormat14._clearFormats();
        java.text.DateFormat dateFormat25 = stdDateFormat14._formatPlain;
        java.util.TimeZone timeZone26 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        stdDateFormat14._timezone = timeZone26;
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        stdDateFormat0._timezone = timeZone26;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat14.", stdDateFormat0.equals(stdDateFormat14) == stdDateFormat14.equals(stdDateFormat0));
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1346");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        stdDateFormat0.setNumberFormat(numberFormat4);
        boolean boolean7 = stdDateFormat0.isLenient();
        boolean boolean9 = stdDateFormat0.looksLikeISO8601("");
        java.text.DateFormat dateFormat10 = stdDateFormat0._formatRFC1123;
        java.text.NumberFormat numberFormat11 = stdDateFormat0.getNumberFormat();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        dateFormat14.setNumberFormat(numberFormat16);
        stdDateFormat12.setNumberFormat(numberFormat16);
        boolean boolean19 = stdDateFormat12.isLenient();
        boolean boolean21 = stdDateFormat12.looksLikeISO8601("");
        stdDateFormat12._clearFormats();
        java.text.DateFormat dateFormat23 = stdDateFormat12._formatPlain;
        java.util.TimeZone timeZone24 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone24);
        stdDateFormat12._timezone = timeZone24;
        java.util.Locale locale27 = stdDateFormat12._locale;
        stdDateFormat12._clearFormats();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean29 = stdDateFormat0.equals((java.lang.Object) stdDateFormat12);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1347");
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
        stdDateFormat0._lenient = false;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        dateFormat17.setNumberFormat(numberFormat19);
        stdDateFormat15.setNumberFormat(numberFormat19);
        boolean boolean22 = stdDateFormat15.isLenient();
        boolean boolean24 = stdDateFormat15.looksLikeISO8601("");
        boolean boolean25 = stdDateFormat15.isLenient();
        java.util.Locale locale26 = stdDateFormat15._locale;
        java.util.TimeZone timeZone27 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        stdDateFormat15._timezone = timeZone27;
        java.text.DateFormat dateFormat29 = stdDateFormat15._formatISO8601;
        java.text.DateFormat dateFormat30 = stdDateFormat15._formatRFC1123;
        boolean boolean32 = stdDateFormat15.looksLikeISO8601("Wed, 31 Dec 1969 23:59:59 UTC");
        stdDateFormat15._clearFormats();
        java.util.TimeZone timeZone34 = stdDateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat0.withTimeZone(timeZone34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat0 and stdDateFormat15.", stdDateFormat0.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat0));
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1348");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getTimeInstance();
        java.text.NumberFormat numberFormat8 = dateFormat7.getNumberFormat();
        dateFormat6.setNumberFormat(numberFormat8);
        stdDateFormat4.setNumberFormat(numberFormat8);
        boolean boolean12 = stdDateFormat4.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat13 = stdDateFormat4._formatISO8601_z;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateTimeInstance();
        dateFormat14.setLenient(false);
        dateFormat14.setLenient(false);
        boolean boolean19 = stdDateFormat4.equals((java.lang.Object) false);
        java.util.Locale locale20 = stdDateFormat4._locale;
        java.lang.String str21 = stdDateFormat4.toString();
        java.util.Locale locale22 = stdDateFormat4._locale;
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance(0, locale22);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0, locale22);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat24, stdDateFormat4, and timeZone0.", !(stdDateFormat24.equals(stdDateFormat4) && stdDateFormat4.equals(timeZone0)) || stdDateFormat24.equals(timeZone0));
    }
}

