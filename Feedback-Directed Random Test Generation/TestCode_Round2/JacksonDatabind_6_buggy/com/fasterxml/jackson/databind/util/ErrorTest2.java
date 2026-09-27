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
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        java.util.TimeZone timeZone18 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        dateFormat20.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean28 = stdDateFormat19.looksLikeISO8601("");
        java.util.TimeZone timeZone29 = stdDateFormat19._timezone;
        java.lang.String str30 = stdDateFormat19.toString();
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone33 = dateFormat32.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat19.withTimeZone(timeZone33);
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance(0);
        boolean boolean37 = dateFormat36.isLenient();
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator42 = dateFormat39.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean43 = dateFormat36.equals((java.lang.Object) dateFormat39);
        java.text.NumberFormat numberFormat44 = dateFormat39.getNumberFormat();
        stdDateFormat19._formatISO8601_z = dateFormat39;
        boolean boolean47 = stdDateFormat19.looksLikeISO8601("hi!");
        java.util.Locale locale48 = stdDateFormat19._locale;
        java.util.TimeZone timeZone49 = stdDateFormat19._timezone;
        stdDateFormat3._timezone = timeZone49;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat19.", stdDateFormat3.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat3));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
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
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        java.util.TimeZone timeZone18 = dateFormat16.getTimeZone();
        java.util.TimeZone timeZone19 = dateFormat16.getTimeZone();
        stdDateFormat3.setTimeZone(timeZone19);
        java.util.Locale locale21 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat22 = stdDateFormat3._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat23, stdDateFormat3, and dateFormat0.", !(stdDateFormat23.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat23.equals(dateFormat0));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
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
        boolean boolean30 = stdDateFormat3.looksLikeISO8601("2513-01-01T00:00:00.000+0700");
        java.util.Calendar calendar31 = stdDateFormat3.getCalendar();
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone33 = dateFormat32.getTimeZone();
        java.util.TimeZone timeZone34 = dateFormat32.getTimeZone();
        java.util.TimeZone timeZone35 = dateFormat32.getTimeZone();
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone37 = dateFormat36.getTimeZone();
        boolean boolean38 = dateFormat36.isLenient();
        boolean boolean39 = dateFormat36.isLenient();
        java.text.NumberFormat numberFormat40 = dateFormat36.getNumberFormat();
        dateFormat32.setNumberFormat(numberFormat40);
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone43 = dateFormat42.getTimeZone();
        java.util.TimeZone timeZone44 = dateFormat42.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat45 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone44);
        java.text.DateFormat dateFormat46 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat47 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat48 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat49 = dateFormat48.getNumberFormat();
        dateFormat47.setNumberFormat(numberFormat49);
        dateFormat46.setNumberFormat(numberFormat49);
        stdDateFormat45.setNumberFormat(numberFormat49);
        java.text.DateFormat dateFormat53 = java.text.DateFormat.getDateInstance();
        boolean boolean55 = dateFormat53.equals((java.lang.Object) 1.0f);
        boolean boolean56 = dateFormat53.isLenient();
        java.util.TimeZone timeZone57 = dateFormat53.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat58 = stdDateFormat45.withTimeZone(timeZone57);
        boolean boolean60 = stdDateFormat45.looksLikeISO8601("");
        java.util.Date date62 = stdDateFormat45.parse("10");
        java.lang.String str63 = dateFormat32.format(date62);
        java.lang.String str64 = stdDateFormat3.format(date62);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat45.", stdDateFormat3.equals(stdDateFormat45) == stdDateFormat45.equals(stdDateFormat3));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
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
        java.text.DateFormat dateFormat29 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat30 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance(0);
        boolean boolean33 = dateFormat32.isLenient();
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat35 = dateFormat34.getNumberFormat();
        dateFormat32.setNumberFormat(numberFormat35);
        java.util.TimeZone timeZone37 = dateFormat32.getTimeZone();
        java.util.TimeZone timeZone38 = dateFormat32.getTimeZone();
        stdDateFormat3._timezone = timeZone38;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat40 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone38);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat40, stdDateFormat3, and dateFormat0.", !(stdDateFormat40.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat40.equals(dateFormat0));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone22 = stdDateFormat3.getTimeZone();
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.lang.String str6 = stdDateFormat5.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat5 and stdDateFormat5", stdDateFormat5.equals(stdDateFormat5) ? stdDateFormat5.hashCode() == stdDateFormat5.hashCode() : true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
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
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        java.util.TimeZone timeZone18 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        dateFormat20.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean28 = stdDateFormat19.looksLikeISO8601("");
        java.util.TimeZone timeZone29 = stdDateFormat19._timezone;
        java.lang.String str30 = stdDateFormat19.toString();
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone33 = dateFormat32.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat19.withTimeZone(timeZone33);
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar38 = dateFormat37.getCalendar();
        dateFormat35.setCalendar(calendar38);
        stdDateFormat19.setCalendar(calendar38);
        boolean boolean42 = stdDateFormat19.looksLikeISO8601("10");
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator45 = dateFormat43.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone46 = dateFormat43.getTimeZone();
        java.text.DateFormat dateFormat47 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone46);
        stdDateFormat19.setTimeZone(timeZone46);
        java.util.Locale locale49 = stdDateFormat19._locale;
        boolean boolean51 = stdDateFormat19.looksLikeISO8601("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513");
        java.util.Locale locale52 = stdDateFormat19._locale;
        java.text.DateFormat dateFormat53 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone54 = dateFormat53.getTimeZone();
        dateFormat53.setLenient(true);
        stdDateFormat19._formatISO8601_z = dateFormat53;
        java.util.TimeZone timeZone58 = stdDateFormat19.getTimeZone();
        stdDateFormat3._timezone = timeZone58;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat19.", stdDateFormat3.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat3));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
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
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        java.util.TimeZone timeZone18 = dateFormat16.getTimeZone();
        java.util.TimeZone timeZone19 = dateFormat16.getTimeZone();
        stdDateFormat3.setTimeZone(timeZone19);
        java.text.NumberFormat numberFormat21 = stdDateFormat3.getNumberFormat();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = stdDateFormat3.isLenient();
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = stdDateFormat4._formatRFC1123;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
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
        java.util.TimeZone timeZone31 = dateFormat23.getTimeZone();
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone31);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone31);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat33, stdDateFormat3, and dateFormat0.", !(stdDateFormat33.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat33.equals(dateFormat0));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
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
        java.text.DateFormat dateFormat30 = stdDateFormat3._formatRFC1123;
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
        java.util.TimeZone timeZone44 = stdDateFormat34._timezone;
        java.text.DateFormat dateFormat45 = stdDateFormat34._formatISO8601;
        java.util.TimeZone timeZone46 = stdDateFormat34._timezone;
        java.util.Calendar calendar47 = stdDateFormat34.getCalendar();
        java.util.TimeZone timeZone48 = stdDateFormat34._timezone;
        java.text.DateFormat dateFormat49 = stdDateFormat34._formatISO8601;
        java.text.DateFormat dateFormat50 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat51 = dateFormat50.getNumberFormat();
        boolean boolean52 = dateFormat50.isLenient();
        java.util.TimeZone timeZone53 = dateFormat50.getTimeZone();
        stdDateFormat34.setTimeZone(timeZone53);
        stdDateFormat3.setTimeZone(timeZone53);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat34.", stdDateFormat3.equals(stdDateFormat34) == stdDateFormat34.equals(stdDateFormat3));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
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
        java.text.DateFormat dateFormat30 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat31 = stdDateFormat3._formatPlain;
        java.lang.String str32 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, 0);
        java.util.TimeZone timeZone36 = dateFormat35.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = stdDateFormat3.withTimeZone(timeZone36);
        java.text.DateFormat dateFormat38 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone40 = dateFormat39.getTimeZone();
        java.util.TimeZone timeZone41 = dateFormat39.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat42 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone41);
        java.text.DateFormat dateFormat43 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat46 = dateFormat45.getNumberFormat();
        dateFormat44.setNumberFormat(numberFormat46);
        dateFormat43.setNumberFormat(numberFormat46);
        stdDateFormat42.setNumberFormat(numberFormat46);
        java.text.DateFormat dateFormat50 = java.text.DateFormat.getDateInstance();
        boolean boolean52 = dateFormat50.equals((java.lang.Object) 1.0f);
        boolean boolean53 = dateFormat50.isLenient();
        java.util.TimeZone timeZone54 = dateFormat50.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat55 = stdDateFormat42.withTimeZone(timeZone54);
        boolean boolean57 = stdDateFormat55.looksLikeISO8601("yyyy-MM-dd");
        java.text.DateFormat dateFormat58 = stdDateFormat55._formatRFC1123;
        java.text.DateFormat dateFormat60 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar61 = dateFormat60.getCalendar();
        boolean boolean62 = dateFormat60.isLenient();
        java.text.DateFormat dateFormat63 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat64 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat65 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat66 = dateFormat65.getNumberFormat();
        dateFormat64.setNumberFormat(numberFormat66);
        dateFormat63.setNumberFormat(numberFormat66);
        java.text.DateFormat dateFormat69 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat71 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar72 = dateFormat71.getCalendar();
        dateFormat69.setCalendar(calendar72);
        dateFormat63.setCalendar(calendar72);
        dateFormat60.setCalendar(calendar72);
        stdDateFormat55.setCalendar(calendar72);
        dateFormat38.setCalendar(calendar72);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat42.", stdDateFormat3.equals(stdDateFormat42) == stdDateFormat42.equals(stdDateFormat3));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
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
        java.util.TimeZone timeZone22 = stdDateFormat3._timezone;
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
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateInstance(0);
        boolean boolean39 = dateFormat38.isLenient();
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat41 = dateFormat40.getNumberFormat();
        dateFormat38.setNumberFormat(numberFormat41);
        java.util.TimeZone timeZone43 = dateFormat38.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat44 = stdDateFormat26.withTimeZone(timeZone43);
        java.text.DateFormat dateFormat45 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone43);
        stdDateFormat3._timezone = timeZone43;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat26.", stdDateFormat3.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat3));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
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
        java.util.TimeZone timeZone26 = stdDateFormat25._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone27 = stdDateFormat25.getTimeZone();
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date24 = stdDateFormat3.parse("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat34, stdDateFormat3, and dateFormat0.", !(stdDateFormat34.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat34.equals(dateFormat0));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
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
        java.util.Locale locale20 = stdDateFormat16._locale;
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.util.Calendar calendar24 = dateFormat22.getCalendar();
        stdDateFormat16._formatISO8601 = dateFormat22;
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
        java.text.DateFormat dateFormat42 = stdDateFormat29._formatISO8601;
        java.util.TimeZone timeZone43 = stdDateFormat29._timezone;
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getTimeInstance();
        dateFormat44.setLenient(false);
        boolean boolean48 = dateFormat44.equals((java.lang.Object) (short) 1);
        java.util.Calendar calendar49 = dateFormat44.getCalendar();
        stdDateFormat29._formatPlain = dateFormat44;
        stdDateFormat16._formatPlain = dateFormat44;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat16 and stdDateFormat29.", stdDateFormat16.equals(stdDateFormat29) == stdDateFormat29.equals(stdDateFormat16));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
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
        java.lang.String str14 = stdDateFormat4.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat4._formatISO8601_z;
        java.text.DateFormat dateFormat16 = stdDateFormat4._formatISO8601;
        java.text.DateFormat dateFormat17 = stdDateFormat4._formatISO8601_z;
        java.text.DateFormat dateFormat18 = stdDateFormat4._formatPlain;
        java.lang.String str19 = stdDateFormat4.toString();
        java.text.DateFormat dateFormat20 = stdDateFormat4._formatISO8601;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance();
        dateFormat21.setLenient(false);
        boolean boolean24 = dateFormat21.isLenient();
        boolean boolean25 = dateFormat21.isLenient();
        java.util.Calendar calendar26 = dateFormat21.getCalendar();
        stdDateFormat4._formatISO8601 = dateFormat21;
        stdDateFormat0._formatRFC1123 = stdDateFormat4;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat3, and dateFormat0.", !(stdDateFormat17.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat17.equals(dateFormat0));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
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
        java.util.Calendar calendar18 = stdDateFormat16.getCalendar();
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
        boolean boolean33 = stdDateFormat22.equals((java.lang.Object) 5);
        java.text.DateFormat dateFormat34 = stdDateFormat22._formatRFC1123;
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar36 = dateFormat35.getCalendar();
        stdDateFormat22._formatISO8601_z = dateFormat35;
        boolean boolean39 = stdDateFormat22.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        java.text.DateFormat dateFormat40 = stdDateFormat22._formatISO8601;
        java.text.NumberFormat numberFormat41 = stdDateFormat22.getNumberFormat();
        stdDateFormat16.setNumberFormat(numberFormat41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat16 and stdDateFormat22.", stdDateFormat16.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat16));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone8 = dateFormat7.getTimeZone();
        java.util.TimeZone timeZone9 = dateFormat7.getTimeZone();
        java.util.TimeZone timeZone10 = dateFormat7.getTimeZone();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        java.util.TimeZone timeZone16 = dateFormat14.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16);
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        dateFormat18.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance();
        boolean boolean27 = dateFormat25.equals((java.lang.Object) 1.0f);
        boolean boolean28 = dateFormat25.isLenient();
        java.util.TimeZone timeZone29 = dateFormat25.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = stdDateFormat17.withTimeZone(timeZone29);
        java.util.Locale locale31 = stdDateFormat30._locale;
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13, locale31);
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone10, locale31);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3, locale31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat6 and stdDateFormat6", stdDateFormat6.equals(stdDateFormat6) ? stdDateFormat6.hashCode() == stdDateFormat6.hashCode() : true);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(2, 2);
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.util.Date date6 = stdDateFormat4.parse("2513-01-01T07:00:00.010+0700");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
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
        java.util.TimeZone timeZone30 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone33 = dateFormat32.getTimeZone();
        java.util.TimeZone timeZone34 = dateFormat32.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone34);
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat39 = dateFormat38.getNumberFormat();
        dateFormat37.setNumberFormat(numberFormat39);
        dateFormat36.setNumberFormat(numberFormat39);
        stdDateFormat35.setNumberFormat(numberFormat39);
        boolean boolean44 = stdDateFormat35.looksLikeISO8601("");
        java.util.TimeZone timeZone45 = stdDateFormat35._timezone;
        java.lang.String str46 = stdDateFormat35.toString();
        java.text.DateFormat dateFormat48 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone49 = dateFormat48.getTimeZone();
        stdDateFormat35._timezone = timeZone49;
        java.text.DateFormat dateFormat51 = stdDateFormat35._formatPlain;
        java.util.Locale locale52 = stdDateFormat35._locale;
        java.text.DateFormat dateFormat53 = java.text.DateFormat.getTimeInstance((int) (byte) 1, locale52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat54 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone30, locale52);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
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
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator30 = dateFormat28.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone31 = dateFormat28.getTimeZone();
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone31);
        stdDateFormat4.setTimeZone(timeZone31);
        java.util.Locale locale34 = stdDateFormat4._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat0.withLocale(locale34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat35 and stdDateFormat35", stdDateFormat35.equals(stdDateFormat35) ? stdDateFormat35.hashCode() == stdDateFormat35.hashCode() : true);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
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
        java.text.DateFormat dateFormat21 = stdDateFormat3._formatRFC1123;
        java.util.Locale locale22 = stdDateFormat3._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone23 = stdDateFormat3.getTimeZone();
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
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
        java.util.TimeZone timeZone15 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat16 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15);
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
        boolean boolean31 = stdDateFormat20.equals((java.lang.Object) 5);
        java.text.DateFormat dateFormat32 = stdDateFormat20._formatRFC1123;
        java.util.Locale locale33 = stdDateFormat20._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15, locale33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat20.", stdDateFormat3.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat3));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
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
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateInstance(0);
        boolean boolean20 = dateFormat19.isLenient();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator25 = dateFormat22.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean26 = dateFormat19.equals((java.lang.Object) dateFormat22);
        dateFormat22.setLenient(true);
        stdDateFormat16._formatISO8601_z = dateFormat22;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj31 = stdDateFormat16.parseObject("Thu, 01 Jan 2513 07:00:00 ICT");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
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
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar17 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone18 = dateFormat16.getTimeZone();
        boolean boolean19 = dateFormat16.isLenient();
        java.util.TimeZone timeZone20 = dateFormat16.getTimeZone();
        stdDateFormat3._timezone = timeZone20;
        boolean boolean23 = stdDateFormat3.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.text.DateFormat dateFormat24 = stdDateFormat3._formatISO8601_z;
        java.util.TimeZone timeZone25 = stdDateFormat3._timezone;
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
        java.util.TimeZone timeZone39 = stdDateFormat29._timezone;
        java.lang.String str40 = stdDateFormat29.toString();
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone43 = dateFormat42.getTimeZone();
        stdDateFormat29._timezone = timeZone43;
        java.text.DateFormat dateFormat45 = stdDateFormat29._formatRFC1123;
        java.text.DateFormat dateFormat46 = stdDateFormat29._formatRFC1123;
        java.text.DateFormat dateFormat47 = stdDateFormat29._formatISO8601_z;
        boolean boolean49 = stdDateFormat29.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat50 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone51 = dateFormat50.getTimeZone();
        java.text.DateFormat dateFormat52 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone51);
        stdDateFormat29.setTimeZone(timeZone51);
        java.text.DateFormat dateFormat54 = stdDateFormat29._formatPlain;
        java.lang.String str55 = stdDateFormat29.toString();
        java.text.NumberFormat numberFormat56 = stdDateFormat29.getNumberFormat();
        stdDateFormat3.setNumberFormat(numberFormat56);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat29.", stdDateFormat3.equals(stdDateFormat29) == stdDateFormat29.equals(stdDateFormat3));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
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
        java.util.Locale locale16 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat17 = stdDateFormat3._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat18, stdDateFormat3, and dateFormat0.", !(stdDateFormat18.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat18.equals(dateFormat0));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
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
        java.lang.String str27 = stdDateFormat3.toString();
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
        java.util.TimeZone timeZone41 = stdDateFormat31._timezone;
        java.text.DateFormat dateFormat42 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        stdDateFormat31._formatRFC1123 = dateFormat42;
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat45 = dateFormat44.getNumberFormat();
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar47 = dateFormat46.getCalendar();
        dateFormat44.setCalendar(calendar47);
        stdDateFormat31._formatPlain = dateFormat44;
        java.text.DateFormat dateFormat50 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone51 = dateFormat50.getTimeZone();
        java.util.TimeZone timeZone52 = dateFormat50.getTimeZone();
        java.util.TimeZone timeZone53 = dateFormat50.getTimeZone();
        stdDateFormat31.setTimeZone(timeZone53);
        stdDateFormat3._formatRFC1123 = stdDateFormat31;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat31.", stdDateFormat3.equals(stdDateFormat31) == stdDateFormat31.equals(stdDateFormat3));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
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
        java.util.TimeZone timeZone19 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone21 = dateFormat20.getTimeZone();
        java.util.TimeZone timeZone22 = dateFormat20.getTimeZone();
        java.util.TimeZone timeZone23 = dateFormat20.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone27 = dateFormat26.getTimeZone();
        java.util.Calendar calendar28 = dateFormat26.getCalendar();
        java.text.NumberFormat numberFormat29 = dateFormat26.getNumberFormat();
        dateFormat25.setNumberFormat(numberFormat29);
        stdDateFormat24.setNumberFormat(numberFormat29);
        java.text.DateFormat dateFormat32 = stdDateFormat24._formatPlain;
        java.util.Locale locale33 = stdDateFormat24._locale;
        java.util.Locale locale34 = stdDateFormat24._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat3.withLocale(locale34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat35 and stdDateFormat24.", stdDateFormat35.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat35));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
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
        java.text.DateFormat dateFormat20 = stdDateFormat16._formatPlain;
        java.text.NumberFormat numberFormat21 = stdDateFormat16.getNumberFormat();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat16.setLenient(false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
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
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateInstance();
        boolean boolean16 = dateFormat14.equals((java.lang.Object) 1.0f);
        boolean boolean17 = dateFormat14.isLenient();
        java.util.TimeZone timeZone18 = dateFormat14.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = stdDateFormat6.withTimeZone(timeZone18);
        java.util.Locale locale20 = stdDateFormat19._locale;
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2, locale20);
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
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone39 = dateFormat38.getTimeZone();
        stdDateFormat25._timezone = timeZone39;
        java.text.DateFormat dateFormat41 = stdDateFormat25._formatRFC1123;
        java.text.DateFormat dateFormat42 = stdDateFormat25._formatRFC1123;
        java.util.Date date44 = stdDateFormat25.parse("10");
        java.util.Locale locale45 = stdDateFormat25._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat46 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2, locale45);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone23);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
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
        java.lang.Object obj30 = dateFormat28.parseObject("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513");
        java.util.Calendar calendar31 = dateFormat28.getCalendar();
        stdDateFormat3.setCalendar(calendar31);
        boolean boolean34 = stdDateFormat3.looksLikeISO8601("");
        java.text.DateFormat dateFormat35 = stdDateFormat3._formatPlain;
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
        java.lang.String str49 = stdDateFormat39.toString();
        java.text.DateFormat dateFormat50 = stdDateFormat39._formatISO8601_z;
        java.text.DateFormat dateFormat51 = stdDateFormat39._formatISO8601;
        java.text.DateFormat dateFormat52 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar53 = dateFormat52.getCalendar();
        java.util.TimeZone timeZone54 = dateFormat52.getTimeZone();
        boolean boolean55 = dateFormat52.isLenient();
        java.util.TimeZone timeZone56 = dateFormat52.getTimeZone();
        java.util.TimeZone timeZone57 = dateFormat52.getTimeZone();
        stdDateFormat39._formatISO8601_z = dateFormat52;
        stdDateFormat3._formatRFC1123 = stdDateFormat39;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat39.", stdDateFormat3.equals(stdDateFormat39) == stdDateFormat39.equals(stdDateFormat3));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date21 = stdDateFormat16.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone8 = dateFormat7.getTimeZone();
        java.util.TimeZone timeZone9 = dateFormat7.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        dateFormat12.setNumberFormat(numberFormat14);
        dateFormat11.setNumberFormat(numberFormat14);
        stdDateFormat10.setNumberFormat(numberFormat14);
        boolean boolean19 = stdDateFormat10.looksLikeISO8601("");
        java.util.TimeZone timeZone20 = stdDateFormat10._timezone;
        java.lang.String str21 = stdDateFormat10.toString();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.util.TimeZone timeZone24 = dateFormat22.getTimeZone();
        dateFormat22.setLenient(true);
        stdDateFormat10._formatRFC1123 = dateFormat22;
        java.util.Locale locale28 = stdDateFormat10._locale;
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance(3);
        stdDateFormat10._formatPlain = dateFormat30;
        java.util.Locale locale32 = stdDateFormat10._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale32);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat33, stdDateFormat10, and dateFormat0.", !(stdDateFormat33.equals(stdDateFormat10) && stdDateFormat10.equals(dateFormat0)) || stdDateFormat33.equals(dateFormat0));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
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
        java.text.DateFormat dateFormat13 = stdDateFormat4._formatPlain;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        java.util.TimeZone timeZone16 = dateFormat14.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16);
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat21);
        dateFormat18.setNumberFormat(numberFormat21);
        stdDateFormat17.setNumberFormat(numberFormat21);
        boolean boolean26 = stdDateFormat17.looksLikeISO8601("");
        java.util.Locale locale27 = stdDateFormat17._locale;
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance(0);
        boolean boolean30 = dateFormat29.isLenient();
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat32 = dateFormat31.getNumberFormat();
        dateFormat29.setNumberFormat(numberFormat32);
        java.util.TimeZone timeZone34 = dateFormat29.getTimeZone();
        stdDateFormat17.setTimeZone(timeZone34);
        boolean boolean37 = stdDateFormat17.looksLikeISO8601("");
        java.text.DateFormat dateFormat38 = stdDateFormat17._formatRFC1123;
        stdDateFormat4._formatISO8601_z = stdDateFormat17;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat4 and stdDateFormat17.", stdDateFormat4.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat4));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
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
        java.text.DateFormat dateFormat19 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance();
        dateFormat20.setLenient(false);
        boolean boolean23 = dateFormat20.isLenient();
        boolean boolean24 = dateFormat20.isLenient();
        java.util.Calendar calendar25 = dateFormat20.getCalendar();
        stdDateFormat3._formatISO8601 = dateFormat20;
        java.lang.String str27 = stdDateFormat3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone28 = stdDateFormat3.getTimeZone();
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
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
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar17 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone18 = dateFormat16.getTimeZone();
        boolean boolean19 = dateFormat16.isLenient();
        java.util.TimeZone timeZone20 = dateFormat16.getTimeZone();
        java.util.TimeZone timeZone21 = dateFormat16.getTimeZone();
        stdDateFormat3._formatISO8601_z = dateFormat16;
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
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateInstance(0);
        boolean boolean39 = dateFormat38.isLenient();
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat41 = dateFormat40.getNumberFormat();
        dateFormat38.setNumberFormat(numberFormat41);
        java.util.TimeZone timeZone43 = dateFormat38.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat44 = stdDateFormat26.withTimeZone(timeZone43);
        boolean boolean46 = stdDateFormat44.looksLikeISO8601("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513");
        java.text.DateFormat dateFormat47 = stdDateFormat44._formatISO8601_z;
        java.text.DateFormat dateFormat48 = stdDateFormat44._formatRFC1123;
        java.text.DateFormat dateFormat49 = stdDateFormat44._formatPlain;
        java.util.TimeZone timeZone50 = stdDateFormat44._timezone;
        stdDateFormat3.setTimeZone(timeZone50);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat26.", stdDateFormat3.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat3));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = stdDateFormat3.isLenient();
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date14 = stdDateFormat3.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
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
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance();
        java.lang.String str24 = dateFormat22.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone25 = dateFormat22.getTimeZone();
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
        java.util.Locale locale40 = stdDateFormat30._locale;
        java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone25, locale40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat42 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone20, locale40);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
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
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator29 = dateFormat27.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone30 = dateFormat27.getTimeZone();
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone30);
        stdDateFormat3.setTimeZone(timeZone30);
        java.text.DateFormat dateFormat33 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.util.Calendar calendar36 = dateFormat35.getCalendar();
        stdDateFormat3.setCalendar(calendar36);
        java.util.Locale locale38 = stdDateFormat3._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj40 = stdDateFormat3.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = stdDateFormat3.isLenient();
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone17);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat19, stdDateFormat3, and dateFormat0.", !(stdDateFormat19.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat19.equals(dateFormat0));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
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
        java.lang.String str18 = stdDateFormat8.toString();
        java.text.DateFormat dateFormat19 = stdDateFormat8._formatISO8601_z;
        java.text.DateFormat dateFormat20 = stdDateFormat8._formatPlain;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar22 = dateFormat21.getCalendar();
        java.util.TimeZone timeZone23 = dateFormat21.getTimeZone();
        boolean boolean24 = dateFormat21.isLenient();
        stdDateFormat8._formatPlain = dateFormat21;
        java.util.Locale locale26 = stdDateFormat8._locale;
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1, locale26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
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
        java.text.DateFormat dateFormat18 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat20 = dateFormat19.getNumberFormat();
        boolean boolean21 = dateFormat19.isLenient();
        java.util.TimeZone timeZone22 = dateFormat19.getTimeZone();
        stdDateFormat3.setTimeZone(timeZone22);
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
        boolean boolean37 = stdDateFormat28.looksLikeISO8601("");
        boolean boolean39 = stdDateFormat28.equals((java.lang.Object) 5);
        java.text.DateFormat dateFormat40 = stdDateFormat28._formatRFC1123;
        java.util.Locale locale41 = stdDateFormat28._locale;
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateInstance(2, locale41);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat43 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22, locale41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat28.", stdDateFormat3.equals(stdDateFormat28) == stdDateFormat28.equals(stdDateFormat3));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
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
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator29 = dateFormat27.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone30 = dateFormat27.getTimeZone();
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone30);
        stdDateFormat3.setTimeZone(timeZone30);
        java.util.Calendar calendar33 = stdDateFormat3.getCalendar();
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateTimeInstance((int) (byte) 1, 0);
        java.util.TimeZone timeZone37 = dateFormat36.getTimeZone();
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone43 = dateFormat42.getTimeZone();
        java.util.TimeZone timeZone44 = dateFormat42.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat45 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone44);
        java.text.DateFormat dateFormat46 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat47 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat48 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat49 = dateFormat48.getNumberFormat();
        dateFormat47.setNumberFormat(numberFormat49);
        dateFormat46.setNumberFormat(numberFormat49);
        stdDateFormat45.setNumberFormat(numberFormat49);
        boolean boolean54 = stdDateFormat45.looksLikeISO8601("");
        java.util.Locale locale55 = stdDateFormat45._locale;
        java.text.DateFormat dateFormat56 = java.text.DateFormat.getDateInstance((int) (short) 1, locale55);
        java.text.DateFormat dateFormat57 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale55);
        java.text.DateFormat dateFormat58 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale55);
        java.text.DateFormat dateFormat59 = java.text.DateFormat.getDateInstance(2, locale55);
        java.text.DateFormat dateFormat60 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone37, locale55);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat61 = stdDateFormat3.withLocale(locale55);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat61 and stdDateFormat45.", stdDateFormat61.equals(stdDateFormat45) == stdDateFormat45.equals(stdDateFormat61));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat21, stdDateFormat3, and dateFormat0.", !(stdDateFormat21.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat21.equals(dateFormat0));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone5 = dateFormat4.getTimeZone();
        java.util.TimeZone timeZone6 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6);
        java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat11 = dateFormat10.getNumberFormat();
        dateFormat9.setNumberFormat(numberFormat11);
        dateFormat8.setNumberFormat(numberFormat11);
        stdDateFormat7.setNumberFormat(numberFormat11);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance();
        boolean boolean17 = dateFormat15.equals((java.lang.Object) 1.0f);
        boolean boolean18 = dateFormat15.isLenient();
        java.util.TimeZone timeZone19 = dateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = stdDateFormat7.withTimeZone(timeZone19);
        boolean boolean22 = stdDateFormat7.looksLikeISO8601("");
        java.util.Date date24 = stdDateFormat7.parse("10");
        java.util.TimeZone timeZone25 = stdDateFormat7._timezone;
        stdDateFormat3.setTimeZone(timeZone25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
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
        java.util.TimeZone timeZone16 = stdDateFormat3._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat3, and dateFormat0.", !(stdDateFormat17.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat17.equals(dateFormat0));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
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
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance();
        java.lang.String str18 = dateFormat16.format((java.lang.Object) 1L);
        dateFormat16.setLenient(true);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance(0);
        boolean boolean23 = dateFormat22.isLenient();
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator28 = dateFormat25.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean29 = dateFormat22.equals((java.lang.Object) dateFormat25);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        java.util.Calendar calendar32 = dateFormat30.getCalendar();
        dateFormat25.setCalendar(calendar32);
        dateFormat25.setLenient(true);
        boolean boolean36 = dateFormat16.equals((java.lang.Object) dateFormat25);
        java.util.TimeZone timeZone37 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = stdDateFormat3.withTimeZone(timeZone37);
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone40 = dateFormat39.getTimeZone();
        java.util.TimeZone timeZone41 = dateFormat39.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat42 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone41);
        java.text.DateFormat dateFormat43 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat46 = dateFormat45.getNumberFormat();
        dateFormat44.setNumberFormat(numberFormat46);
        dateFormat43.setNumberFormat(numberFormat46);
        stdDateFormat42.setNumberFormat(numberFormat46);
        boolean boolean51 = stdDateFormat42.looksLikeISO8601("");
        java.util.Locale locale52 = stdDateFormat42._locale;
        java.text.DateFormat dateFormat54 = java.text.DateFormat.getDateInstance(0);
        boolean boolean55 = dateFormat54.isLenient();
        java.text.DateFormat dateFormat56 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat57 = dateFormat56.getNumberFormat();
        dateFormat54.setNumberFormat(numberFormat57);
        java.util.TimeZone timeZone59 = dateFormat54.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat60 = stdDateFormat42.withTimeZone(timeZone59);
        boolean boolean62 = stdDateFormat60.looksLikeISO8601("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513");
        java.text.DateFormat dateFormat63 = stdDateFormat60._formatISO8601_z;
        java.text.DateFormat dateFormat64 = stdDateFormat60._formatRFC1123;
        java.util.TimeZone timeZone65 = stdDateFormat60._timezone;
        stdDateFormat38._formatISO8601 = stdDateFormat60;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat38 and stdDateFormat60.", stdDateFormat38.equals(stdDateFormat60) == stdDateFormat60.equals(stdDateFormat38));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
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
        java.text.DateFormat dateFormat14 = stdDateFormat4._formatISO8601_z;
        java.util.Calendar calendar15 = stdDateFormat4.getCalendar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = stdDateFormat4.isLenient();
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
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
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance(0);
        boolean boolean37 = dateFormat36.isLenient();
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator42 = dateFormat39.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean43 = dateFormat36.equals((java.lang.Object) dateFormat39);
        java.util.TimeZone timeZone44 = dateFormat39.getTimeZone();
        java.util.TimeZone timeZone45 = dateFormat39.getTimeZone();
        stdDateFormat3._timezone = timeZone45;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat47 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat47, stdDateFormat3, and dateFormat0.", !(stdDateFormat47.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat47.equals(dateFormat0));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
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
        boolean boolean31 = stdDateFormat3.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator34 = dateFormat32.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone35 = dateFormat32.getTimeZone();
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone35);
        java.text.DateFormat dateFormat37 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone35);
        stdDateFormat3._timezone = timeZone35;
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar42 = dateFormat41.getCalendar();
        dateFormat39.setCalendar(calendar42);
        stdDateFormat3._formatRFC1123 = dateFormat39;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone45 = stdDateFormat3.getTimeZone();
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
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
        java.lang.String str30 = stdDateFormat20.toString();
        java.text.DateFormat dateFormat31 = stdDateFormat20._formatISO8601_z;
        java.text.DateFormat dateFormat32 = stdDateFormat20._formatISO8601;
        java.text.DateFormat dateFormat33 = stdDateFormat20._formatISO8601_z;
        java.text.DateFormat dateFormat34 = stdDateFormat20._formatPlain;
        java.lang.String str35 = stdDateFormat20.toString();
        java.text.DateFormat dateFormat36 = stdDateFormat20._formatISO8601;
        java.util.Locale locale37 = stdDateFormat20._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16, locale37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat14.", dateFormat0.equals(dateFormat14) == dateFormat14.equals(dateFormat0));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
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
        java.lang.String str20 = stdDateFormat3.toString();
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
        boolean boolean33 = stdDateFormat24.looksLikeISO8601("");
        java.util.TimeZone timeZone34 = stdDateFormat24._timezone;
        java.lang.String str35 = stdDateFormat24.toString();
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone38 = dateFormat37.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = stdDateFormat24.withTimeZone(timeZone38);
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateInstance(0);
        boolean boolean42 = dateFormat41.isLenient();
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator47 = dateFormat44.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean48 = dateFormat41.equals((java.lang.Object) dateFormat44);
        java.text.NumberFormat numberFormat49 = dateFormat44.getNumberFormat();
        stdDateFormat24._formatISO8601_z = dateFormat44;
        java.text.DateFormat dateFormat51 = stdDateFormat24._formatRFC1123;
        java.text.DateFormat dateFormat52 = stdDateFormat24._formatPlain;
        java.lang.String str53 = stdDateFormat24.toString();
        java.text.DateFormat dateFormat56 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, 0);
        java.util.TimeZone timeZone57 = dateFormat56.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat58 = stdDateFormat24.withTimeZone(timeZone57);
        stdDateFormat3._timezone = timeZone57;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat24.", stdDateFormat3.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat3));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone17 = stdDateFormat3.getTimeZone();
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
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
        java.util.Locale locale14 = stdDateFormat4._locale;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance((int) (short) 0, locale14);
        java.util.TimeZone timeZone16 = dateFormat15.getTimeZone();
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
        java.util.Locale locale28 = stdDateFormat20._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone16, locale28);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
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
        java.util.TimeZone timeZone41 = stdDateFormat31._timezone;
        java.lang.String str42 = stdDateFormat31.toString();
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone45 = dateFormat44.getTimeZone();
        stdDateFormat31._timezone = timeZone45;
        java.text.DateFormat dateFormat47 = stdDateFormat31._formatRFC1123;
        java.text.DateFormat dateFormat48 = stdDateFormat31._formatRFC1123;
        java.text.DateFormat dateFormat49 = stdDateFormat31._formatISO8601_z;
        boolean boolean51 = stdDateFormat31.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat52 = stdDateFormat31._formatISO8601_z;
        java.util.Locale locale53 = stdDateFormat31._locale;
        java.text.DateFormat dateFormat54 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale53);
        stdDateFormat3._formatRFC1123 = dateFormat54;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat31.", stdDateFormat3.equals(stdDateFormat31) == stdDateFormat31.equals(stdDateFormat3));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
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
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18);
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone23);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
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
        java.util.Calendar calendar27 = stdDateFormat3.getCalendar();
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
        boolean boolean42 = stdDateFormat31.equals((java.lang.Object) 5);
        java.text.DateFormat dateFormat43 = stdDateFormat31._formatRFC1123;
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar45 = dateFormat44.getCalendar();
        stdDateFormat31._formatISO8601_z = dateFormat44;
        java.text.DateFormat dateFormat48 = java.text.DateFormat.getDateInstance(0);
        boolean boolean49 = dateFormat48.isLenient();
        java.text.DateFormat dateFormat51 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat53 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator54 = dateFormat51.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean55 = dateFormat48.equals((java.lang.Object) dateFormat51);
        java.util.TimeZone timeZone56 = dateFormat51.getTimeZone();
        boolean boolean57 = dateFormat51.isLenient();
        stdDateFormat31._formatISO8601 = dateFormat51;
        boolean boolean59 = dateFormat51.isLenient();
        stdDateFormat3._formatISO8601_z = dateFormat51;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat31.", stdDateFormat3.equals(stdDateFormat31) == stdDateFormat31.equals(stdDateFormat3));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
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
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar25 = dateFormat24.getCalendar();
        dateFormat23.setCalendar(calendar25);
        java.util.TimeZone timeZone27 = dateFormat23.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = stdDateFormat16.withTimeZone(timeZone27);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone30 = dateFormat29.getTimeZone();
        java.util.TimeZone timeZone31 = dateFormat29.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone31);
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat36 = dateFormat35.getNumberFormat();
        dateFormat34.setNumberFormat(numberFormat36);
        dateFormat33.setNumberFormat(numberFormat36);
        stdDateFormat32.setNumberFormat(numberFormat36);
        boolean boolean41 = stdDateFormat32.looksLikeISO8601("");
        java.util.TimeZone timeZone42 = stdDateFormat32._timezone;
        java.lang.String str43 = stdDateFormat32.toString();
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone46 = dateFormat45.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat47 = stdDateFormat32.withTimeZone(timeZone46);
        java.text.DateFormat dateFormat48 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat50 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar51 = dateFormat50.getCalendar();
        dateFormat48.setCalendar(calendar51);
        stdDateFormat32.setCalendar(calendar51);
        boolean boolean55 = stdDateFormat32.looksLikeISO8601("10");
        java.util.Locale locale56 = stdDateFormat32._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat57 = stdDateFormat16.withLocale(locale56);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat57 and stdDateFormat32.", stdDateFormat57.equals(stdDateFormat32) == stdDateFormat32.equals(stdDateFormat57));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
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
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator29 = dateFormat27.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone30 = dateFormat27.getTimeZone();
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone30);
        stdDateFormat3.setTimeZone(timeZone30);
        java.util.Locale locale33 = stdDateFormat3._locale;
        boolean boolean35 = stdDateFormat3.looksLikeISO8601("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513");
        java.util.Locale locale36 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone38 = dateFormat37.getTimeZone();
        dateFormat37.setLenient(true);
        stdDateFormat3._formatISO8601_z = dateFormat37;
        java.util.TimeZone timeZone42 = stdDateFormat3.getTimeZone();
        boolean boolean44 = stdDateFormat3.looksLikeISO8601("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513");
        stdDateFormat3.setLenient(true);
        java.text.DateFormat dateFormat48 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone49 = dateFormat48.getTimeZone();
        java.util.TimeZone timeZone50 = dateFormat48.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat51 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone50);
        java.text.DateFormat dateFormat52 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat53 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat54 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat55 = dateFormat54.getNumberFormat();
        dateFormat53.setNumberFormat(numberFormat55);
        dateFormat52.setNumberFormat(numberFormat55);
        stdDateFormat51.setNumberFormat(numberFormat55);
        boolean boolean60 = stdDateFormat51.looksLikeISO8601("");
        java.util.TimeZone timeZone61 = stdDateFormat51._timezone;
        java.lang.String str62 = stdDateFormat51.toString();
        java.text.DateFormat dateFormat64 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone65 = dateFormat64.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat66 = stdDateFormat51.withTimeZone(timeZone65);
        java.text.DateFormat dateFormat68 = java.text.DateFormat.getDateInstance(0);
        boolean boolean69 = dateFormat68.isLenient();
        java.text.DateFormat dateFormat71 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat73 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator74 = dateFormat71.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean75 = dateFormat68.equals((java.lang.Object) dateFormat71);
        java.text.NumberFormat numberFormat76 = dateFormat71.getNumberFormat();
        stdDateFormat51._formatISO8601_z = dateFormat71;
        boolean boolean79 = stdDateFormat51.looksLikeISO8601("hi!");
        java.util.Locale locale80 = stdDateFormat51._locale;
        java.text.DateFormat dateFormat81 = java.text.DateFormat.getDateInstance(0, locale80);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat82 = stdDateFormat3.withLocale(locale80);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat82 and stdDateFormat51.", stdDateFormat82.equals(stdDateFormat51) == stdDateFormat51.equals(stdDateFormat82));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
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
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator29 = dateFormat27.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone30 = dateFormat27.getTimeZone();
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone30);
        stdDateFormat3.setTimeZone(timeZone30);
        java.util.Locale locale33 = stdDateFormat3._locale;
        boolean boolean35 = stdDateFormat3.looksLikeISO8601("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513");
        java.util.Locale locale36 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone38 = dateFormat37.getTimeZone();
        dateFormat37.setLenient(true);
        stdDateFormat3._formatISO8601_z = dateFormat37;
        java.util.TimeZone timeZone42 = stdDateFormat3.getTimeZone();
        java.text.DateFormat dateFormat43 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone42);
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar45 = dateFormat44.getCalendar();
        java.util.TimeZone timeZone46 = dateFormat44.getTimeZone();
        boolean boolean47 = dateFormat44.isLenient();
        java.util.TimeZone timeZone48 = dateFormat44.getTimeZone();
        java.util.TimeZone timeZone49 = dateFormat44.getTimeZone();
        java.text.DateFormat dateFormat52 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone53 = dateFormat52.getTimeZone();
        java.util.TimeZone timeZone54 = dateFormat52.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat55 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone54);
        java.text.DateFormat dateFormat56 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat57 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat58 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat59 = dateFormat58.getNumberFormat();
        dateFormat57.setNumberFormat(numberFormat59);
        dateFormat56.setNumberFormat(numberFormat59);
        stdDateFormat55.setNumberFormat(numberFormat59);
        java.text.DateFormat dateFormat63 = java.text.DateFormat.getDateInstance();
        boolean boolean65 = dateFormat63.equals((java.lang.Object) 1.0f);
        boolean boolean66 = dateFormat63.isLenient();
        java.util.TimeZone timeZone67 = dateFormat63.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat68 = stdDateFormat55.withTimeZone(timeZone67);
        java.util.Locale locale69 = stdDateFormat68._locale;
        java.text.DateFormat dateFormat70 = java.text.DateFormat.getDateInstance(2, locale69);
        java.text.DateFormat dateFormat71 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale69);
        java.text.DateFormat dateFormat72 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone49, locale69);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat73 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone42, locale69);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat55.", stdDateFormat3.equals(stdDateFormat55) == stdDateFormat55.equals(stdDateFormat3));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = stdDateFormat4._formatISO8601_z;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
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
        java.lang.String str14 = stdDateFormat4.toString();
        java.text.DateFormat dateFormat15 = stdDateFormat4._formatISO8601;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat4.setLenient(true);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
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
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatRFC1123;
        java.util.TimeZone timeZone16 = stdDateFormat3._timezone;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat3.setLenient(false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
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
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar17 = dateFormat16.getCalendar();
        java.util.TimeZone timeZone18 = dateFormat16.getTimeZone();
        boolean boolean19 = dateFormat16.isLenient();
        java.util.TimeZone timeZone20 = dateFormat16.getTimeZone();
        stdDateFormat3._timezone = timeZone20;
        java.text.DateFormat dateFormat22 = stdDateFormat3._formatRFC1123;
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
        java.lang.String str37 = stdDateFormat26.toString();
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone39 = dateFormat38.getTimeZone();
        java.util.TimeZone timeZone40 = dateFormat38.getTimeZone();
        dateFormat38.setLenient(true);
        stdDateFormat26._formatRFC1123 = dateFormat38;
        java.util.Locale locale44 = stdDateFormat26._locale;
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getDateInstance(3);
        stdDateFormat26._formatPlain = dateFormat46;
        java.text.DateFormat dateFormat48 = stdDateFormat26._formatRFC1123;
        stdDateFormat3._formatPlain = dateFormat48;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat26.", stdDateFormat3.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat3));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone6 = dateFormat5.getTimeZone();
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone8 = dateFormat7.getTimeZone();
        java.util.TimeZone timeZone9 = dateFormat7.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat14 = dateFormat13.getNumberFormat();
        dateFormat12.setNumberFormat(numberFormat14);
        dateFormat11.setNumberFormat(numberFormat14);
        stdDateFormat10.setNumberFormat(numberFormat14);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance();
        boolean boolean20 = dateFormat18.equals((java.lang.Object) 1.0f);
        boolean boolean21 = dateFormat18.isLenient();
        java.util.TimeZone timeZone22 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = stdDateFormat10.withTimeZone(timeZone22);
        java.util.Locale locale24 = stdDateFormat23._locale;
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone6, locale24);
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3, locale24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone28 = stdDateFormat3.getTimeZone();
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
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
        boolean boolean16 = stdDateFormat3.looksLikeISO8601("hi!");
        java.lang.String str17 = stdDateFormat3.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj19 = stdDateFormat3.parseObject("hi!");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
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
        java.text.DateFormat dateFormat30 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone33 = dateFormat32.getTimeZone();
        java.util.TimeZone timeZone34 = dateFormat32.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone34);
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat39 = dateFormat38.getNumberFormat();
        dateFormat37.setNumberFormat(numberFormat39);
        dateFormat36.setNumberFormat(numberFormat39);
        stdDateFormat35.setNumberFormat(numberFormat39);
        boolean boolean44 = stdDateFormat35.looksLikeISO8601("");
        java.util.TimeZone timeZone45 = stdDateFormat35._timezone;
        java.lang.String str46 = stdDateFormat35.toString();
        java.text.DateFormat dateFormat48 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone49 = dateFormat48.getTimeZone();
        stdDateFormat35._timezone = timeZone49;
        java.text.DateFormat dateFormat51 = stdDateFormat35._formatRFC1123;
        java.text.DateFormat dateFormat52 = stdDateFormat35._formatRFC1123;
        java.text.DateFormat dateFormat53 = stdDateFormat35._formatISO8601_z;
        boolean boolean55 = stdDateFormat35.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat56 = stdDateFormat35._formatISO8601_z;
        java.util.Locale locale57 = stdDateFormat35._locale;
        java.text.DateFormat dateFormat58 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale57);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat59 = stdDateFormat3.withLocale(locale57);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat59 and stdDateFormat35.", stdDateFormat59.equals(stdDateFormat35) == stdDateFormat35.equals(stdDateFormat59));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
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
        java.text.DateFormat dateFormat21 = stdDateFormat3._formatISO8601_z;
        java.lang.String str22 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat23 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone25 = dateFormat24.getTimeZone();
        java.util.Calendar calendar26 = dateFormat24.getCalendar();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone28 = dateFormat27.getTimeZone();
        java.util.TimeZone timeZone29 = dateFormat27.getTimeZone();
        dateFormat27.setLenient(true);
        boolean boolean33 = dateFormat27.equals((java.lang.Object) 'a');
        java.util.Calendar calendar34 = dateFormat27.getCalendar();
        dateFormat24.setCalendar(calendar34);
        java.util.TimeZone timeZone36 = dateFormat24.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone36);
        stdDateFormat3._formatISO8601 = stdDateFormat37;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat37.", stdDateFormat3.equals(stdDateFormat37) == stdDateFormat37.equals(stdDateFormat3));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
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
        java.text.DateFormat dateFormat20 = stdDateFormat18._formatISO8601;
        java.lang.String str21 = stdDateFormat18.toString();
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
        boolean boolean36 = stdDateFormat25.equals((java.lang.Object) 5);
        java.text.DateFormat dateFormat37 = stdDateFormat25._formatRFC1123;
        java.text.DateFormat dateFormat38 = stdDateFormat25._formatISO8601;
        java.util.TimeZone timeZone39 = stdDateFormat25._timezone;
        java.text.DateFormat dateFormat40 = stdDateFormat25._formatPlain;
        boolean boolean42 = stdDateFormat25.looksLikeISO8601("10");
        stdDateFormat18._formatISO8601_z = stdDateFormat25;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat18 and stdDateFormat25.", stdDateFormat18.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat18));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
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
        boolean boolean31 = stdDateFormat3.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat32 = stdDateFormat3._formatISO8601_z;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj34 = stdDateFormat3.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat21, stdDateFormat3, and dateFormat0.", !(stdDateFormat21.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat21.equals(dateFormat0));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
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
        java.util.TimeZone timeZone19 = stdDateFormat18._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat20, stdDateFormat3, and dateFormat0.", !(stdDateFormat20.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat20.equals(dateFormat0));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
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
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone20 = dateFormat19.getTimeZone();
        java.util.Calendar calendar21 = dateFormat19.getCalendar();
        java.text.NumberFormat numberFormat22 = dateFormat19.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat22);
        stdDateFormat3._formatRFC1123 = dateFormat18;
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, 0);
        java.util.TimeZone timeZone28 = dateFormat27.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone28);
        stdDateFormat3.setTimeZone(timeZone28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat29.", stdDateFormat3.equals(stdDateFormat29) == stdDateFormat29.equals(stdDateFormat3));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
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
        java.text.DateFormat dateFormat27 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat28 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat29 = stdDateFormat3._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat30, stdDateFormat3, and dateFormat0.", !(stdDateFormat30.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat30.equals(dateFormat0));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
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
        java.util.Locale locale20 = stdDateFormat16._locale;
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
        boolean boolean33 = stdDateFormat24.looksLikeISO8601("");
        java.util.TimeZone timeZone34 = stdDateFormat24._timezone;
        java.lang.String str35 = stdDateFormat24.toString();
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone38 = dateFormat37.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = stdDateFormat24.withTimeZone(timeZone38);
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar43 = dateFormat42.getCalendar();
        dateFormat40.setCalendar(calendar43);
        stdDateFormat24.setCalendar(calendar43);
        boolean boolean47 = stdDateFormat24.looksLikeISO8601("10");
        java.text.DateFormat dateFormat48 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator50 = dateFormat48.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone51 = dateFormat48.getTimeZone();
        java.text.DateFormat dateFormat52 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone51);
        stdDateFormat24.setTimeZone(timeZone51);
        java.util.Locale locale54 = stdDateFormat24._locale;
        java.text.DateFormat dateFormat56 = java.text.DateFormat.getDateInstance(3);
        java.text.DateFormat dateFormat57 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat58 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat59 = dateFormat58.getNumberFormat();
        dateFormat57.setNumberFormat(numberFormat59);
        boolean boolean61 = dateFormat56.equals((java.lang.Object) numberFormat59);
        stdDateFormat24._formatRFC1123 = dateFormat56;
        java.util.TimeZone timeZone63 = stdDateFormat24._timezone;
        stdDateFormat16.setTimeZone(timeZone63);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat16 and stdDateFormat24.", stdDateFormat16.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat16));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
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
        java.lang.String str19 = stdDateFormat16.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat16.setLenient(true);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
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
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        java.util.TimeZone timeZone18 = dateFormat16.getTimeZone();
        java.util.TimeZone timeZone19 = dateFormat16.getTimeZone();
        stdDateFormat3.setTimeZone(timeZone19);
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
        boolean boolean33 = stdDateFormat24.looksLikeISO8601("");
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance(0);
        boolean boolean37 = dateFormat36.isLenient();
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat39 = dateFormat38.getNumberFormat();
        dateFormat36.setNumberFormat(numberFormat39);
        dateFormat34.setNumberFormat(numberFormat39);
        boolean boolean42 = stdDateFormat24.equals((java.lang.Object) numberFormat39);
        java.text.DateFormat dateFormat43 = stdDateFormat24._formatRFC1123;
        java.util.TimeZone timeZone44 = stdDateFormat24._timezone;
        java.util.Locale locale45 = stdDateFormat24._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone19, locale45);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat24.", stdDateFormat3.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat3));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
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
        java.util.Locale locale14 = stdDateFormat4._locale;
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance((int) (short) 0, locale14);
        java.util.TimeZone timeZone16 = dateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat4, and dateFormat1.", !(stdDateFormat17.equals(stdDateFormat4) && stdDateFormat4.equals(dateFormat1)) || stdDateFormat17.equals(dateFormat1));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
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
        java.text.DateFormat dateFormat30 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat31 = stdDateFormat3._formatPlain;
        java.lang.String str32 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, 0);
        java.util.TimeZone timeZone36 = dateFormat35.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = stdDateFormat3.withTimeZone(timeZone36);
        java.util.Locale locale38 = stdDateFormat3._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat39, stdDateFormat3, and dateFormat0.", !(stdDateFormat39.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat39.equals(dateFormat0));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
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
        java.util.Locale locale22 = stdDateFormat3._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = stdDateFormat3.isLenient();
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
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
        java.util.Locale locale22 = stdDateFormat3._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date24 = stdDateFormat3.parse("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
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
        java.text.DateFormat dateFormat23 = stdDateFormat16._formatISO8601_z;
        java.text.DateFormat dateFormat24 = stdDateFormat16._formatISO8601_z;
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance(0);
        boolean boolean27 = dateFormat26.isLenient();
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator32 = dateFormat29.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean33 = dateFormat26.equals((java.lang.Object) dateFormat29);
        boolean boolean35 = dateFormat26.equals((java.lang.Object) "Thu, 01 Jan 1970 00:00:00 GMT");
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat39 = dateFormat38.getNumberFormat();
        dateFormat37.setNumberFormat(numberFormat39);
        dateFormat36.setNumberFormat(numberFormat39);
        dateFormat26.setNumberFormat(numberFormat39);
        stdDateFormat16.setNumberFormat(numberFormat39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date45 = stdDateFormat16.parse("07:00:00");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
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
        java.util.TimeZone timeZone41 = stdDateFormat31._timezone;
        java.lang.String str42 = stdDateFormat31.toString();
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone45 = dateFormat44.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = stdDateFormat31.withTimeZone(timeZone45);
        java.text.DateFormat dateFormat47 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat49 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar50 = dateFormat49.getCalendar();
        dateFormat47.setCalendar(calendar50);
        stdDateFormat31.setCalendar(calendar50);
        boolean boolean54 = stdDateFormat31.looksLikeISO8601("10");
        java.text.DateFormat dateFormat55 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator57 = dateFormat55.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone58 = dateFormat55.getTimeZone();
        java.text.DateFormat dateFormat59 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone58);
        stdDateFormat31.setTimeZone(timeZone58);
        java.text.DateFormat dateFormat61 = stdDateFormat31._formatPlain;
        java.text.DateFormat dateFormat63 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.util.Calendar calendar64 = dateFormat63.getCalendar();
        stdDateFormat31.setCalendar(calendar64);
        java.util.Locale locale66 = stdDateFormat31._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat67 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone27, locale66);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat31.", stdDateFormat3.equals(stdDateFormat31) == stdDateFormat31.equals(stdDateFormat3));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(3);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
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
        java.lang.String str16 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat17 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat18 = stdDateFormat6._formatISO8601;
        java.util.Locale locale19 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat20 = stdDateFormat6._formatRFC1123;
        java.util.Locale locale21 = stdDateFormat6._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2, locale21);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
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
        java.text.DateFormat dateFormat29 = stdDateFormat3._formatISO8601_z;
        java.text.DateFormat dateFormat30 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance(0);
        boolean boolean33 = dateFormat32.isLenient();
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat35 = dateFormat34.getNumberFormat();
        dateFormat32.setNumberFormat(numberFormat35);
        java.util.TimeZone timeZone37 = dateFormat32.getTimeZone();
        java.util.TimeZone timeZone38 = dateFormat32.getTimeZone();
        stdDateFormat3._timezone = timeZone38;
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone42 = dateFormat41.getTimeZone();
        java.util.TimeZone timeZone43 = dateFormat41.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat44 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone43);
        java.text.DateFormat dateFormat45 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat47 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat48 = dateFormat47.getNumberFormat();
        dateFormat46.setNumberFormat(numberFormat48);
        dateFormat45.setNumberFormat(numberFormat48);
        stdDateFormat44.setNumberFormat(numberFormat48);
        boolean boolean53 = stdDateFormat44.looksLikeISO8601("");
        java.util.TimeZone timeZone54 = stdDateFormat44._timezone;
        java.lang.String str55 = stdDateFormat44.toString();
        java.text.DateFormat dateFormat57 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone58 = dateFormat57.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat59 = stdDateFormat44.withTimeZone(timeZone58);
        java.text.DateFormat dateFormat60 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat62 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar63 = dateFormat62.getCalendar();
        dateFormat60.setCalendar(calendar63);
        stdDateFormat44.setCalendar(calendar63);
        boolean boolean67 = stdDateFormat44.looksLikeISO8601("10");
        java.util.Locale locale68 = stdDateFormat44._locale;
        java.text.DateFormat dateFormat69 = java.text.DateFormat.getDateInstance(3, locale68);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat70 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone38, locale68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar22 and calendar63", (calendar22.compareTo(calendar63) == 0) == calendar22.equals(calendar63));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj25 = stdDateFormat3.parseObject("Thu, 01 Jan 2513 00:00:00 GMT");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
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
        java.util.Locale locale22 = stdDateFormat3._locale;
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
        java.lang.String str36 = stdDateFormat26.toString();
        java.text.DateFormat dateFormat37 = stdDateFormat26._formatISO8601_z;
        java.text.DateFormat dateFormat38 = stdDateFormat26._formatPlain;
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar40 = dateFormat39.getCalendar();
        java.util.TimeZone timeZone41 = dateFormat39.getTimeZone();
        boolean boolean42 = dateFormat39.isLenient();
        stdDateFormat26._formatPlain = dateFormat39;
        java.util.TimeZone timeZone44 = stdDateFormat26._timezone;
        java.util.TimeZone timeZone45 = stdDateFormat26._timezone;
        boolean boolean46 = stdDateFormat3.equals((java.lang.Object) timeZone45);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat26.", stdDateFormat3.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat3));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean31 = stdDateFormat3.isLenient();
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
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
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone19 = dateFormat18.getTimeZone();
        stdDateFormat5._timezone = timeZone19;
        java.text.DateFormat dateFormat21 = stdDateFormat5._formatRFC1123;
        java.text.DateFormat dateFormat22 = stdDateFormat5._formatRFC1123;
        java.util.Date date24 = stdDateFormat5.parse("10");
        java.util.Locale locale25 = stdDateFormat5._locale;
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
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
        java.util.TimeZone timeZone32 = stdDateFormat22._timezone;
        java.lang.String str33 = stdDateFormat22.toString();
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone36 = dateFormat35.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = stdDateFormat22.withTimeZone(timeZone36);
        java.text.DateFormat dateFormat38 = stdDateFormat22._formatRFC1123;
        java.text.DateFormat dateFormat39 = stdDateFormat22._formatISO8601_z;
        java.util.Locale locale40 = stdDateFormat22._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat41 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone17, locale40);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat22.", stdDateFormat3.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat3));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar3 = dateFormat2.getCalendar();
        dateFormat0.setCalendar(calendar3);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar7 = dateFormat6.getCalendar();
        java.util.TimeZone timeZone8 = dateFormat6.getTimeZone();
        boolean boolean9 = dateFormat0.equals((java.lang.Object) timeZone8);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone8);
        boolean boolean12 = stdDateFormat10.looksLikeISO8601("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat10 and stdDateFormat10", stdDateFormat10.equals(stdDateFormat10) ? stdDateFormat10.hashCode() == stdDateFormat10.hashCode() : true);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat4.setLenient(true);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
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
        java.text.DateFormat dateFormat34 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance(0);
        boolean boolean37 = dateFormat36.isLenient();
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator42 = dateFormat39.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean43 = dateFormat36.equals((java.lang.Object) dateFormat39);
        java.util.TimeZone timeZone44 = dateFormat39.getTimeZone();
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone46 = dateFormat45.getTimeZone();
        java.util.TimeZone timeZone47 = dateFormat45.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat48 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone47);
        java.text.DateFormat dateFormat49 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat50 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat51 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat52 = dateFormat51.getNumberFormat();
        dateFormat50.setNumberFormat(numberFormat52);
        dateFormat49.setNumberFormat(numberFormat52);
        stdDateFormat48.setNumberFormat(numberFormat52);
        boolean boolean57 = stdDateFormat48.looksLikeISO8601("");
        java.lang.String str58 = stdDateFormat48.toString();
        java.text.DateFormat dateFormat59 = stdDateFormat48._formatISO8601_z;
        java.text.DateFormat dateFormat60 = stdDateFormat48._formatISO8601;
        java.text.DateFormat dateFormat61 = stdDateFormat48._formatISO8601_z;
        java.text.DateFormat dateFormat62 = stdDateFormat48._formatISO8601_z;
        java.util.Locale locale63 = stdDateFormat48._locale;
        boolean boolean65 = stdDateFormat48.looksLikeISO8601("yyyy-MM-dd");
        java.text.DateFormat dateFormat66 = stdDateFormat48._formatRFC1123;
        java.util.Locale locale67 = stdDateFormat48._locale;
        java.text.DateFormat dateFormat68 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone44, locale67);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat69 = stdDateFormat3.withLocale(locale67);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat69 and stdDateFormat48.", stdDateFormat69.equals(stdDateFormat48) == stdDateFormat48.equals(stdDateFormat69));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
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
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.util.Calendar calendar27 = dateFormat26.getCalendar();
        stdDateFormat3._formatISO8601_z = dateFormat26;
        java.text.DateFormat dateFormat29 = stdDateFormat3._formatRFC1123;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat26.", dateFormat0.equals(dateFormat26) == dateFormat26.equals(dateFormat0));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
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
        java.lang.String str22 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat23 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar25 = dateFormat24.getCalendar();
        java.util.TimeZone timeZone26 = dateFormat24.getTimeZone();
        boolean boolean27 = dateFormat24.isLenient();
        java.util.TimeZone timeZone28 = dateFormat24.getTimeZone();
        java.util.TimeZone timeZone29 = dateFormat24.getTimeZone();
        java.util.TimeZone timeZone30 = dateFormat24.getTimeZone();
        stdDateFormat3._timezone = timeZone30;
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
        java.util.Locale locale49 = stdDateFormat39._locale;
        java.text.DateFormat dateFormat50 = java.text.DateFormat.getDateInstance((int) (short) 1, locale49);
        java.text.DateFormat dateFormat51 = java.text.DateFormat.getDateInstance(0, locale49);
        java.text.DateFormat dateFormat52 = java.text.DateFormat.getTimeInstance(1, locale49);
        java.text.DateFormat dateFormat53 = java.text.DateFormat.getTimeInstance((int) (short) 0, locale49);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat54 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone30, locale49);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat39.", stdDateFormat3.equals(stdDateFormat39) == stdDateFormat39.equals(stdDateFormat3));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = stdDateFormat3.isLenient();
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator6 = dateFormat4.formatToCharacterIterator((java.lang.Object) 2);
        java.text.NumberFormat numberFormat7 = dateFormat4.getNumberFormat();
        java.text.NumberFormat numberFormat8 = dateFormat4.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat8);
        java.text.NumberFormat numberFormat10 = dateFormat0.getNumberFormat();
        boolean boolean11 = dateFormat0.isLenient();
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator14 = dateFormat12.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone15 = dateFormat12.getTimeZone();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator18 = dateFormat16.formatToCharacterIterator((java.lang.Object) 2);
        java.text.NumberFormat numberFormat19 = dateFormat16.getNumberFormat();
        java.text.NumberFormat numberFormat20 = dateFormat16.getNumberFormat();
        dateFormat12.setNumberFormat(numberFormat20);
        dateFormat0.setNumberFormat(numberFormat20);
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance(0);
        boolean boolean26 = dateFormat25.isLenient();
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator31 = dateFormat28.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean32 = dateFormat25.equals((java.lang.Object) dateFormat28);
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar34 = dateFormat33.getCalendar();
        dateFormat28.setCalendar(calendar34);
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator38 = dateFormat36.formatToCharacterIterator((java.lang.Object) 2);
        java.text.NumberFormat numberFormat39 = dateFormat36.getNumberFormat();
        java.text.AttributedCharacterIterator attributedCharacterIterator41 = dateFormat36.formatToCharacterIterator((java.lang.Object) 0L);
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone43 = dateFormat42.getTimeZone();
        java.util.Calendar calendar44 = dateFormat42.getCalendar();
        java.text.NumberFormat numberFormat45 = dateFormat42.getNumberFormat();
        dateFormat42.setLenient(true);
        java.text.DateFormat dateFormat48 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone49 = dateFormat48.getTimeZone();
        java.util.TimeZone timeZone50 = dateFormat48.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat51 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone50);
        java.text.DateFormat dateFormat52 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat53 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat54 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat55 = dateFormat54.getNumberFormat();
        dateFormat53.setNumberFormat(numberFormat55);
        dateFormat52.setNumberFormat(numberFormat55);
        stdDateFormat51.setNumberFormat(numberFormat55);
        dateFormat42.setNumberFormat(numberFormat55);
        boolean boolean60 = dateFormat36.equals((java.lang.Object) numberFormat55);
        dateFormat28.setNumberFormat(numberFormat55);
        dateFormat23.setNumberFormat(numberFormat55);
        dateFormat0.setNumberFormat(numberFormat55);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat23.", dateFormat0.equals(dateFormat23) == dateFormat23.equals(dateFormat0));
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
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
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator29 = dateFormat27.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone30 = dateFormat27.getTimeZone();
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone30);
        stdDateFormat3.setTimeZone(timeZone30);
        java.util.Locale locale33 = stdDateFormat3._locale;
        boolean boolean35 = stdDateFormat3.looksLikeISO8601("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513");
        java.util.Locale locale36 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone38 = dateFormat37.getTimeZone();
        dateFormat37.setLenient(true);
        stdDateFormat3._formatISO8601_z = dateFormat37;
        java.text.DateFormat dateFormat42 = stdDateFormat3._formatPlain;
        java.util.Locale locale43 = stdDateFormat3._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date45 = stdDateFormat3.parse("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a\u0e19\u0e32\u0e2c\u0e34\u0e01\u0e32\u0e19\u0e32\u0e17\u0e35\u0e27\u0e34\u0e19\u0e32\u0e17\u0e35\u0e40\u0e27\u0e25\u0e32\u0e2d\u0e34\u0e19\u0e42\u0e14\u0e08\u0e35\u0e19");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
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
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        java.util.TimeZone timeZone18 = dateFormat16.getTimeZone();
        java.util.TimeZone timeZone19 = dateFormat16.getTimeZone();
        stdDateFormat3.setTimeZone(timeZone19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean21 = stdDateFormat3.isLenient();
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
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
        java.text.DateFormat dateFormat21 = stdDateFormat3._formatRFC1123;
        java.util.Locale locale22 = stdDateFormat3._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = stdDateFormat3.isLenient();
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.NumberFormat numberFormat3 = stdDateFormat2.getNumberFormat();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
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
        java.text.DateFormat dateFormat20 = stdDateFormat16._formatISO8601_z;
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance(0);
        boolean boolean23 = dateFormat22.isLenient();
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        dateFormat22.setNumberFormat(numberFormat25);
        java.util.TimeZone timeZone27 = dateFormat22.getTimeZone();
        stdDateFormat16._timezone = timeZone27;
        java.text.DateFormat dateFormat29 = stdDateFormat16._formatISO8601;
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
        java.text.NumberFormat numberFormat49 = stdDateFormat48.getNumberFormat();
        java.text.DateFormat dateFormat51 = java.text.DateFormat.getDateInstance(0);
        boolean boolean52 = dateFormat51.isLenient();
        java.text.DateFormat dateFormat53 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat54 = dateFormat53.getNumberFormat();
        dateFormat51.setNumberFormat(numberFormat54);
        java.util.TimeZone timeZone56 = dateFormat51.getTimeZone();
        java.util.TimeZone timeZone57 = dateFormat51.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat58 = stdDateFormat48.withTimeZone(timeZone57);
        stdDateFormat16._formatRFC1123 = stdDateFormat58;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat16 and stdDateFormat58.", stdDateFormat16.equals(stdDateFormat58) == stdDateFormat58.equals(stdDateFormat16));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
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
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone21 = dateFormat20.getTimeZone();
        java.util.TimeZone timeZone22 = dateFormat20.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        dateFormat25.setNumberFormat(numberFormat27);
        dateFormat24.setNumberFormat(numberFormat27);
        stdDateFormat23.setNumberFormat(numberFormat27);
        boolean boolean32 = stdDateFormat23.looksLikeISO8601("");
        java.util.TimeZone timeZone33 = stdDateFormat23._timezone;
        java.lang.String str34 = stdDateFormat23.toString();
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone37 = dateFormat36.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = stdDateFormat23.withTimeZone(timeZone37);
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateInstance(0);
        boolean boolean41 = dateFormat40.isLenient();
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator46 = dateFormat43.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean47 = dateFormat40.equals((java.lang.Object) dateFormat43);
        java.text.NumberFormat numberFormat48 = dateFormat43.getNumberFormat();
        stdDateFormat23._formatISO8601_z = dateFormat43;
        java.text.DateFormat dateFormat50 = stdDateFormat23._formatRFC1123;
        java.text.DateFormat dateFormat51 = stdDateFormat23._formatPlain;
        java.util.TimeZone timeZone52 = stdDateFormat23._timezone;
        stdDateFormat18._timezone = timeZone52;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat18 and stdDateFormat23.", stdDateFormat18.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat18));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
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
        java.text.DateFormat dateFormat20 = stdDateFormat18._formatISO8601;
        java.lang.String str21 = stdDateFormat18.toString();
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
        java.lang.String str35 = stdDateFormat25.toString();
        java.text.DateFormat dateFormat36 = stdDateFormat25._formatISO8601_z;
        java.text.DateFormat dateFormat37 = stdDateFormat25._formatISO8601;
        java.text.DateFormat dateFormat38 = stdDateFormat25._formatISO8601_z;
        java.text.DateFormat dateFormat39 = stdDateFormat25._formatPlain;
        java.text.DateFormat dateFormat40 = stdDateFormat25._formatISO8601_z;
        java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.util.Calendar calendar42 = dateFormat41.getCalendar();
        java.util.Calendar calendar43 = dateFormat41.getCalendar();
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getDateInstance(0);
        boolean boolean46 = dateFormat45.isLenient();
        boolean boolean47 = dateFormat41.equals((java.lang.Object) dateFormat45);
        stdDateFormat25._formatISO8601 = dateFormat45;
        java.text.NumberFormat numberFormat49 = dateFormat45.getNumberFormat();
        java.text.DateFormat dateFormat51 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.util.Calendar calendar52 = dateFormat51.getCalendar();
        java.util.Calendar calendar53 = dateFormat51.getCalendar();
        java.util.Calendar calendar54 = dateFormat51.getCalendar();
        dateFormat45.setCalendar(calendar54);
        stdDateFormat18._formatISO8601 = dateFormat45;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat18 and stdDateFormat25.", stdDateFormat18.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat18));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
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
        java.text.DateFormat dateFormat73 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone74 = dateFormat73.getTimeZone();
        java.util.TimeZone timeZone75 = dateFormat73.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat76 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone75);
        java.text.DateFormat dateFormat77 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat78 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat79 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat80 = dateFormat79.getNumberFormat();
        dateFormat78.setNumberFormat(numberFormat80);
        dateFormat77.setNumberFormat(numberFormat80);
        stdDateFormat76.setNumberFormat(numberFormat80);
        boolean boolean85 = stdDateFormat76.looksLikeISO8601("");
        boolean boolean87 = stdDateFormat76.equals((java.lang.Object) 5);
        java.util.TimeZone timeZone88 = stdDateFormat76._timezone;
        java.util.TimeZone timeZone89 = stdDateFormat76._timezone;
        stdDateFormat3._formatISO8601 = stdDateFormat76;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat76.", stdDateFormat3.equals(stdDateFormat76) == stdDateFormat76.equals(stdDateFormat3));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
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
        java.text.DateFormat dateFormat34 = stdDateFormat3._formatISO8601;
        java.util.TimeZone timeZone35 = stdDateFormat3.getTimeZone();
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
        java.lang.String str49 = stdDateFormat39.toString();
        java.text.DateFormat dateFormat50 = stdDateFormat39._formatISO8601_z;
        java.text.DateFormat dateFormat51 = stdDateFormat39._formatPlain;
        java.text.DateFormat dateFormat52 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar53 = dateFormat52.getCalendar();
        java.util.TimeZone timeZone54 = dateFormat52.getTimeZone();
        boolean boolean55 = dateFormat52.isLenient();
        stdDateFormat39._formatPlain = dateFormat52;
        java.text.DateFormat dateFormat57 = java.text.DateFormat.getDateInstance();
        java.lang.String str59 = dateFormat57.format((java.lang.Object) 1L);
        dateFormat57.setLenient(true);
        java.text.DateFormat dateFormat63 = java.text.DateFormat.getDateInstance(0);
        boolean boolean64 = dateFormat63.isLenient();
        java.text.DateFormat dateFormat66 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat68 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator69 = dateFormat66.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean70 = dateFormat63.equals((java.lang.Object) dateFormat66);
        java.text.DateFormat dateFormat71 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat72 = dateFormat71.getNumberFormat();
        java.util.Calendar calendar73 = dateFormat71.getCalendar();
        dateFormat66.setCalendar(calendar73);
        dateFormat66.setLenient(true);
        boolean boolean77 = dateFormat57.equals((java.lang.Object) dateFormat66);
        stdDateFormat39._formatRFC1123 = dateFormat66;
        java.util.Locale locale79 = stdDateFormat39._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat80 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone35, locale79);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat39.", stdDateFormat3.equals(stdDateFormat39) == stdDateFormat39.equals(stdDateFormat3));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 1);
        dateFormat1.setLenient(true);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone5 = dateFormat4.getTimeZone();
        java.util.TimeZone timeZone6 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6);
        java.text.DateFormat dateFormat8 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat11 = dateFormat10.getNumberFormat();
        dateFormat9.setNumberFormat(numberFormat11);
        dateFormat8.setNumberFormat(numberFormat11);
        stdDateFormat7.setNumberFormat(numberFormat11);
        boolean boolean16 = stdDateFormat7.looksLikeISO8601("");
        java.lang.String str17 = stdDateFormat7.toString();
        java.text.DateFormat dateFormat18 = stdDateFormat7._formatISO8601_z;
        java.text.DateFormat dateFormat19 = stdDateFormat7._formatISO8601;
        java.text.DateFormat dateFormat20 = stdDateFormat7._formatISO8601_z;
        java.text.DateFormat dateFormat21 = stdDateFormat7._formatPlain;
        java.text.DateFormat dateFormat22 = stdDateFormat7._formatPlain;
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance();
        java.lang.String str25 = dateFormat23.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone26 = dateFormat23.getTimeZone();
        java.util.Calendar calendar27 = dateFormat23.getCalendar();
        boolean boolean28 = dateFormat23.isLenient();
        stdDateFormat7._formatISO8601 = dateFormat23;
        boolean boolean30 = dateFormat1.equals((java.lang.Object) stdDateFormat7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone31 = stdDateFormat7.getTimeZone();
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
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
        dateFormat0.setLenient(false);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone21 = dateFormat20.getTimeZone();
        java.util.TimeZone timeZone22 = dateFormat20.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat27 = dateFormat26.getNumberFormat();
        dateFormat25.setNumberFormat(numberFormat27);
        dateFormat24.setNumberFormat(numberFormat27);
        stdDateFormat23.setNumberFormat(numberFormat27);
        boolean boolean32 = stdDateFormat23.looksLikeISO8601("");
        java.util.Locale locale33 = stdDateFormat23._locale;
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateInstance(0);
        boolean boolean36 = dateFormat35.isLenient();
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat38 = dateFormat37.getNumberFormat();
        dateFormat35.setNumberFormat(numberFormat38);
        java.util.TimeZone timeZone40 = dateFormat35.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat41 = stdDateFormat23.withTimeZone(timeZone40);
        boolean boolean42 = dateFormat0.equals((java.lang.Object) timeZone40);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat9 and stdDateFormat23.", stdDateFormat9.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat9));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
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
        java.text.DateFormat dateFormat25 = stdDateFormat16._formatISO8601;
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance();
        java.lang.String str28 = dateFormat26.format((java.lang.Object) 1L);
        dateFormat26.setLenient(true);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance(0);
        boolean boolean33 = dateFormat32.isLenient();
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator38 = dateFormat35.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean39 = dateFormat32.equals((java.lang.Object) dateFormat35);
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat41 = dateFormat40.getNumberFormat();
        java.util.Calendar calendar42 = dateFormat40.getCalendar();
        dateFormat35.setCalendar(calendar42);
        dateFormat35.setLenient(true);
        boolean boolean46 = dateFormat26.equals((java.lang.Object) dateFormat35);
        java.util.TimeZone timeZone47 = dateFormat35.getTimeZone();
        java.text.DateFormat dateFormat48 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone49 = dateFormat48.getTimeZone();
        java.util.TimeZone timeZone50 = dateFormat48.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat51 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone50);
        java.text.DateFormat dateFormat52 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat53 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat54 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat55 = dateFormat54.getNumberFormat();
        dateFormat53.setNumberFormat(numberFormat55);
        dateFormat52.setNumberFormat(numberFormat55);
        stdDateFormat51.setNumberFormat(numberFormat55);
        boolean boolean60 = stdDateFormat51.looksLikeISO8601("");
        java.util.TimeZone timeZone61 = stdDateFormat51._timezone;
        java.lang.String str62 = stdDateFormat51.toString();
        boolean boolean64 = stdDateFormat51.looksLikeISO8601("hi!");
        java.util.Locale locale65 = stdDateFormat51._locale;
        java.text.DateFormat dateFormat66 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone47, locale65);
        stdDateFormat16._formatPlain = dateFormat66;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat16 and stdDateFormat51.", stdDateFormat16.equals(stdDateFormat51) == stdDateFormat51.equals(stdDateFormat16));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
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
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        java.util.TimeZone timeZone18 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        dateFormat20.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean28 = stdDateFormat19.looksLikeISO8601("");
        java.util.TimeZone timeZone29 = stdDateFormat19._timezone;
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone29);
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone29);
        stdDateFormat3._timezone = timeZone29;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat19.", stdDateFormat3.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat3));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
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
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator29 = dateFormat27.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone30 = dateFormat27.getTimeZone();
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone30);
        stdDateFormat3.setTimeZone(timeZone30);
        java.util.Locale locale33 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateInstance(3);
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat38 = dateFormat37.getNumberFormat();
        dateFormat36.setNumberFormat(numberFormat38);
        boolean boolean40 = dateFormat35.equals((java.lang.Object) numberFormat38);
        stdDateFormat3._formatRFC1123 = dateFormat35;
        boolean boolean42 = dateFormat35.isLenient();
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone44 = dateFormat43.getTimeZone();
        java.util.TimeZone timeZone45 = dateFormat43.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone45);
        java.text.DateFormat dateFormat47 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat48 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat49 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat50 = dateFormat49.getNumberFormat();
        dateFormat48.setNumberFormat(numberFormat50);
        dateFormat47.setNumberFormat(numberFormat50);
        stdDateFormat46.setNumberFormat(numberFormat50);
        boolean boolean55 = stdDateFormat46.looksLikeISO8601("");
        java.util.TimeZone timeZone56 = stdDateFormat46._timezone;
        java.lang.String str57 = stdDateFormat46.toString();
        java.text.DateFormat dateFormat59 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone60 = dateFormat59.getTimeZone();
        stdDateFormat46._timezone = timeZone60;
        java.text.DateFormat dateFormat62 = stdDateFormat46._formatRFC1123;
        java.text.DateFormat dateFormat63 = stdDateFormat46._formatRFC1123;
        java.util.Date date65 = stdDateFormat46.parse("10");
        java.lang.String str66 = dateFormat35.format(date65);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat46.", stdDateFormat3.equals(stdDateFormat46) == stdDateFormat46.equals(stdDateFormat3));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
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
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator29 = dateFormat27.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone30 = dateFormat27.getTimeZone();
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone30);
        stdDateFormat3.setTimeZone(timeZone30);
        java.text.DateFormat dateFormat33 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.util.Calendar calendar36 = dateFormat35.getCalendar();
        stdDateFormat3.setCalendar(calendar36);
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getTimeInstance();
        dateFormat38.setLenient(false);
        dateFormat38.setLenient(false);
        boolean boolean43 = dateFormat38.isLenient();
        dateFormat38.setLenient(true);
        dateFormat38.setLenient(false);
        java.text.NumberFormat numberFormat48 = dateFormat38.getNumberFormat();
        stdDateFormat3.setNumberFormat(numberFormat48);
        boolean boolean51 = stdDateFormat3.looksLikeISO8601("");
        java.text.DateFormat dateFormat53 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone54 = dateFormat53.getTimeZone();
        java.util.TimeZone timeZone55 = dateFormat53.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat56 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone55);
        java.text.DateFormat dateFormat57 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat58 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat59 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat60 = dateFormat59.getNumberFormat();
        dateFormat58.setNumberFormat(numberFormat60);
        dateFormat57.setNumberFormat(numberFormat60);
        stdDateFormat56.setNumberFormat(numberFormat60);
        boolean boolean65 = stdDateFormat56.looksLikeISO8601("");
        java.util.TimeZone timeZone66 = stdDateFormat56._timezone;
        java.lang.String str67 = stdDateFormat56.toString();
        java.text.DateFormat dateFormat69 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone70 = dateFormat69.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat71 = stdDateFormat56.withTimeZone(timeZone70);
        java.text.DateFormat dateFormat72 = stdDateFormat56._formatRFC1123;
        java.util.Locale locale73 = stdDateFormat56._locale;
        java.text.DateFormat dateFormat74 = java.text.DateFormat.getDateInstance((int) (byte) 1, locale73);
        stdDateFormat3._formatPlain = dateFormat74;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat56.", stdDateFormat3.equals(stdDateFormat56) == stdDateFormat56.equals(stdDateFormat3));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
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
        java.text.DateFormat dateFormat19 = stdDateFormat3._formatISO8601;
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
        stdDateFormat3.setTimeZone(timeZone41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj44 = stdDateFormat3.parseObject("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
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
        boolean boolean30 = stdDateFormat27.looksLikeISO8601("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513");
        java.text.DateFormat dateFormat31 = stdDateFormat27._formatISO8601_z;
        java.text.DateFormat dateFormat32 = stdDateFormat27._formatRFC1123;
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone34 = dateFormat33.getTimeZone();
        java.util.TimeZone timeZone35 = dateFormat33.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone35);
        java.text.DateFormat dateFormat37 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat40 = dateFormat39.getNumberFormat();
        dateFormat38.setNumberFormat(numberFormat40);
        dateFormat37.setNumberFormat(numberFormat40);
        stdDateFormat36.setNumberFormat(numberFormat40);
        boolean boolean45 = stdDateFormat36.looksLikeISO8601("");
        java.util.TimeZone timeZone46 = stdDateFormat36._timezone;
        java.lang.String str47 = stdDateFormat36.toString();
        java.text.DateFormat dateFormat49 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone50 = dateFormat49.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat51 = stdDateFormat36.withTimeZone(timeZone50);
        java.text.DateFormat dateFormat52 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat54 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar55 = dateFormat54.getCalendar();
        dateFormat52.setCalendar(calendar55);
        stdDateFormat36.setCalendar(calendar55);
        boolean boolean59 = stdDateFormat36.looksLikeISO8601("10");
        stdDateFormat36.setLenient(false);
        java.text.DateFormat dateFormat62 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone63 = dateFormat62.getTimeZone();
        java.text.DateFormat dateFormat64 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone63);
        java.text.DateFormat dateFormat65 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone63);
        java.util.Calendar calendar66 = dateFormat65.getCalendar();
        stdDateFormat36._formatISO8601_z = dateFormat65;
        java.util.Calendar calendar68 = stdDateFormat36.getCalendar();
        stdDateFormat27._formatISO8601 = stdDateFormat36;
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar22 and calendar55", (calendar22.compareTo(calendar55) == 0) == calendar22.equals(calendar55));
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = stdDateFormat3.isLenient();
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
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
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone17);
        stdDateFormat3._timezone = timeZone17;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat18.", stdDateFormat3.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat3));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
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
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance();
        boolean boolean18 = dateFormat16.equals((java.lang.Object) 1.0f);
        boolean boolean19 = dateFormat16.isLenient();
        java.util.TimeZone timeZone20 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = stdDateFormat8.withTimeZone(timeZone20);
        java.util.Locale locale22 = stdDateFormat21._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
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
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateInstance(0);
        boolean boolean39 = dateFormat38.isLenient();
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat41 = dateFormat40.getNumberFormat();
        dateFormat38.setNumberFormat(numberFormat41);
        java.util.TimeZone timeZone43 = dateFormat38.getTimeZone();
        stdDateFormat26.setTimeZone(timeZone43);
        java.util.TimeZone timeZone45 = stdDateFormat26._timezone;
        java.text.DateFormat dateFormat46 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone45);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat47 = stdDateFormat3.withTimeZone(timeZone45);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat47 and stdDateFormat26.", stdDateFormat47.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat47));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar3 = dateFormat2.getCalendar();
        dateFormat0.setCalendar(calendar3);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar7 = dateFormat6.getCalendar();
        java.util.TimeZone timeZone8 = dateFormat6.getTimeZone();
        boolean boolean9 = dateFormat0.equals((java.lang.Object) timeZone8);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone8);
        java.text.DateFormat dateFormat11 = stdDateFormat10._formatRFC1123;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat10 and stdDateFormat10", stdDateFormat10.equals(stdDateFormat10) ? stdDateFormat10.hashCode() == stdDateFormat10.hashCode() : true);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date14 = stdDateFormat4.parse("Thu, 01 Jan 2513 00:00:00 GMT");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
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
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.util.TimeZone timeZone24 = dateFormat22.getTimeZone();
        java.util.TimeZone timeZone25 = dateFormat22.getTimeZone();
        stdDateFormat3.setTimeZone(timeZone25);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone28 = dateFormat27.getTimeZone();
        stdDateFormat3._timezone = timeZone28;
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
        java.lang.String str45 = stdDateFormat33.toString();
        java.text.NumberFormat numberFormat46 = stdDateFormat33.getNumberFormat();
        java.text.DateFormat dateFormat47 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone48 = dateFormat47.getTimeZone();
        java.text.NumberFormat numberFormat49 = dateFormat47.getNumberFormat();
        stdDateFormat33._formatISO8601_z = dateFormat47;
        stdDateFormat3._formatRFC1123 = dateFormat47;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat33.", stdDateFormat3.equals(stdDateFormat33) == stdDateFormat33.equals(stdDateFormat3));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
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
        java.util.TimeZone timeZone30 = stdDateFormat3._timezone;
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
        boolean boolean45 = stdDateFormat34.equals((java.lang.Object) 5);
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator48 = dateFormat46.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone49 = dateFormat46.getTimeZone();
        java.util.Calendar calendar50 = dateFormat46.getCalendar();
        dateFormat46.setLenient(true);
        boolean boolean53 = stdDateFormat34.equals((java.lang.Object) true);
        java.text.DateFormat dateFormat54 = java.text.DateFormat.getDateInstance();
        java.lang.String str56 = dateFormat54.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone57 = dateFormat54.getTimeZone();
        java.text.DateFormat dateFormat58 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone57);
        java.text.DateFormat dateFormat59 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone57);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat60 = stdDateFormat34.withTimeZone(timeZone57);
        java.text.DateFormat dateFormat62 = java.text.DateFormat.getDateInstance(0);
        boolean boolean63 = dateFormat62.isLenient();
        java.text.DateFormat dateFormat65 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat67 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator68 = dateFormat65.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean69 = dateFormat62.equals((java.lang.Object) dateFormat65);
        java.util.TimeZone timeZone70 = dateFormat65.getTimeZone();
        stdDateFormat34.setTimeZone(timeZone70);
        java.util.TimeZone timeZone72 = stdDateFormat34._timezone;
        stdDateFormat3._timezone = timeZone72;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat34.", stdDateFormat3.equals(stdDateFormat34) == stdDateFormat34.equals(stdDateFormat3));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
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
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone20 = dateFormat19.getTimeZone();
        java.util.TimeZone timeZone21 = dateFormat19.getTimeZone();
        dateFormat19.setLenient(true);
        boolean boolean25 = dateFormat19.equals((java.lang.Object) 'a');
        stdDateFormat3._formatPlain = dateFormat19;
        java.util.TimeZone timeZone27 = dateFormat19.getTimeZone();
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
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateInstance();
        boolean boolean41 = dateFormat39.equals((java.lang.Object) 1.0f);
        boolean boolean42 = dateFormat39.isLenient();
        java.util.TimeZone timeZone43 = dateFormat39.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat44 = stdDateFormat31.withTimeZone(timeZone43);
        boolean boolean46 = stdDateFormat44.looksLikeISO8601("yyyy-MM-dd");
        java.lang.String str47 = stdDateFormat44.toString();
        java.text.DateFormat dateFormat48 = stdDateFormat44._formatPlain;
        java.text.NumberFormat numberFormat49 = stdDateFormat44.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat49);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat31.", stdDateFormat3.equals(stdDateFormat31) == stdDateFormat31.equals(stdDateFormat3));
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
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
        boolean boolean37 = stdDateFormat28.looksLikeISO8601("");
        java.lang.String str38 = stdDateFormat28.toString();
        java.text.DateFormat dateFormat39 = stdDateFormat28._formatISO8601_z;
        java.text.DateFormat dateFormat40 = stdDateFormat28._formatISO8601;
        java.text.DateFormat dateFormat41 = stdDateFormat28._formatISO8601_z;
        java.text.DateFormat dateFormat42 = stdDateFormat28._formatISO8601_z;
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator45 = dateFormat43.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone46 = dateFormat43.getTimeZone();
        java.text.DateFormat dateFormat47 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar48 = dateFormat47.getCalendar();
        dateFormat43.setCalendar(calendar48);
        dateFormat43.setLenient(true);
        stdDateFormat28._formatPlain = dateFormat43;
        java.text.DateFormat dateFormat53 = stdDateFormat28._formatRFC1123;
        java.text.DateFormat dateFormat54 = stdDateFormat28._formatPlain;
        boolean boolean55 = stdDateFormat3.equals((java.lang.Object) dateFormat54);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat28.", stdDateFormat3.equals(stdDateFormat28) == stdDateFormat28.equals(stdDateFormat3));
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
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
        java.text.DateFormat dateFormat30 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat31 = stdDateFormat3._formatPlain;
        java.lang.String str32 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, 0);
        java.util.TimeZone timeZone36 = dateFormat35.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = stdDateFormat3.withTimeZone(timeZone36);
        java.text.DateFormat dateFormat38 = stdDateFormat37._formatISO8601_z;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone39 = stdDateFormat37.getTimeZone();
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
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
        java.text.DateFormat dateFormat25 = stdDateFormat3._formatPlain;
        java.util.TimeZone timeZone26 = stdDateFormat3.getTimeZone();
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
        java.lang.String str40 = stdDateFormat30.toString();
        java.text.DateFormat dateFormat41 = stdDateFormat30._formatISO8601_z;
        java.text.DateFormat dateFormat42 = stdDateFormat30._formatISO8601;
        java.text.DateFormat dateFormat43 = stdDateFormat30._formatISO8601_z;
        java.text.DateFormat dateFormat44 = stdDateFormat30._formatPlain;
        java.text.DateFormat dateFormat45 = stdDateFormat30._formatISO8601_z;
        java.util.TimeZone timeZone46 = stdDateFormat30._timezone;
        java.util.TimeZone timeZone47 = stdDateFormat30._timezone;
        java.text.DateFormat dateFormat48 = stdDateFormat30._formatRFC1123;
        java.util.TimeZone timeZone49 = stdDateFormat30._timezone;
        java.text.NumberFormat numberFormat50 = stdDateFormat30.getNumberFormat();
        stdDateFormat3.setNumberFormat(numberFormat50);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat30.", stdDateFormat3.equals(stdDateFormat30) == stdDateFormat30.equals(stdDateFormat3));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
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
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatISO8601;
        java.util.TimeZone timeZone17 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat18 = stdDateFormat3._formatPlain;
        boolean boolean20 = stdDateFormat3.looksLikeISO8601("10");
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
        boolean boolean33 = stdDateFormat24.looksLikeISO8601("");
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance(0);
        boolean boolean37 = dateFormat36.isLenient();
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat39 = dateFormat38.getNumberFormat();
        dateFormat36.setNumberFormat(numberFormat39);
        dateFormat34.setNumberFormat(numberFormat39);
        boolean boolean42 = stdDateFormat24.equals((java.lang.Object) numberFormat39);
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone44 = dateFormat43.getTimeZone();
        java.text.DateFormat dateFormat45 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone44);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = stdDateFormat24.withTimeZone(timeZone44);
        java.text.DateFormat dateFormat47 = stdDateFormat46._formatRFC1123;
        stdDateFormat3._formatPlain = stdDateFormat46;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat46.", stdDateFormat3.equals(stdDateFormat46) == stdDateFormat46.equals(stdDateFormat3));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
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
        java.lang.String str30 = stdDateFormat3.toString();
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
        java.lang.String str44 = stdDateFormat34.toString();
        java.text.DateFormat dateFormat45 = stdDateFormat34._formatISO8601_z;
        java.text.DateFormat dateFormat46 = stdDateFormat34._formatISO8601;
        java.text.DateFormat dateFormat47 = stdDateFormat34._formatISO8601_z;
        java.text.DateFormat dateFormat48 = stdDateFormat34._formatPlain;
        java.text.DateFormat dateFormat49 = stdDateFormat34._formatISO8601_z;
        java.util.TimeZone timeZone50 = stdDateFormat34._timezone;
        java.util.TimeZone timeZone51 = stdDateFormat34._timezone;
        java.text.DateFormat dateFormat52 = stdDateFormat34._formatRFC1123;
        stdDateFormat3._formatISO8601 = stdDateFormat34;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat34.", stdDateFormat3.equals(stdDateFormat34) == stdDateFormat34.equals(stdDateFormat3));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, 0);
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
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
        java.util.TimeZone timeZone18 = stdDateFormat8._timezone;
        java.lang.String str19 = stdDateFormat8.toString();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = stdDateFormat8.withTimeZone(timeZone22);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar27 = dateFormat26.getCalendar();
        dateFormat24.setCalendar(calendar27);
        stdDateFormat8.setCalendar(calendar27);
        boolean boolean31 = stdDateFormat8.looksLikeISO8601("10");
        java.util.Locale locale32 = stdDateFormat8._locale;
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3, locale32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
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
        java.text.DateFormat dateFormat23 = stdDateFormat16._formatRFC1123;
        java.text.DateFormat dateFormat24 = stdDateFormat16._formatPlain;
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
        java.util.Locale locale41 = stdDateFormat31._locale;
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getTimeInstance(0, locale41);
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getDateInstance((int) (short) 0, locale41);
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getTimeInstance(1, locale41);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat45 = stdDateFormat16.withLocale(locale41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat45 and stdDateFormat31.", stdDateFormat45.equals(stdDateFormat31) == stdDateFormat31.equals(stdDateFormat45));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
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
        java.util.Locale locale22 = stdDateFormat3._locale;
        java.lang.String str23 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone25 = dateFormat24.getTimeZone();
        java.util.TimeZone timeZone26 = dateFormat24.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone26);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        dateFormat29.setNumberFormat(numberFormat31);
        dateFormat28.setNumberFormat(numberFormat31);
        stdDateFormat27.setNumberFormat(numberFormat31);
        boolean boolean36 = stdDateFormat27.looksLikeISO8601("");
        java.util.TimeZone timeZone37 = stdDateFormat27._timezone;
        java.lang.String str38 = stdDateFormat27.toString();
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone41 = dateFormat40.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat42 = stdDateFormat27.withTimeZone(timeZone41);
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar46 = dateFormat45.getCalendar();
        dateFormat43.setCalendar(calendar46);
        stdDateFormat27.setCalendar(calendar46);
        boolean boolean50 = stdDateFormat27.looksLikeISO8601("10");
        java.text.DateFormat dateFormat51 = stdDateFormat27._formatISO8601;
        java.text.DateFormat dateFormat52 = stdDateFormat27._formatISO8601;
        java.text.DateFormat dateFormat53 = stdDateFormat27._formatISO8601;
        java.lang.String str54 = stdDateFormat27.toString();
        stdDateFormat3._formatISO8601_z = stdDateFormat27;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat27.", stdDateFormat3.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat3));
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
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
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat21, stdDateFormat3, and dateFormat0.", !(stdDateFormat21.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat21.equals(dateFormat0));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
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
        java.util.TimeZone timeZone16 = stdDateFormat3._timezone;
        java.util.TimeZone timeZone17 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
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
        boolean boolean33 = stdDateFormat24.looksLikeISO8601("");
        java.util.Locale locale34 = stdDateFormat24._locale;
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateInstance((int) (short) 1, locale34);
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale34);
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance((int) (short) 1, locale34);
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone17, locale34);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16, locale34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat24.", stdDateFormat3.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat3));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
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
        java.lang.String str22 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat23 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat24 = stdDateFormat3._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat25, stdDateFormat3, and dateFormat0.", !(stdDateFormat25.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat25.equals(dateFormat0));
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
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
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat19 = dateFormat18.getNumberFormat();
        boolean boolean20 = dateFormat18.isLenient();
        stdDateFormat16._formatISO8601 = dateFormat18;
        java.util.Date date23 = stdDateFormat16.parse("10");
        java.util.TimeZone timeZone24 = stdDateFormat16._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = stdDateFormat16.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat25, stdDateFormat16, and dateFormat0.", !(stdDateFormat25.equals(stdDateFormat16) && stdDateFormat16.equals(dateFormat0)) || stdDateFormat25.equals(dateFormat0));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
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
        boolean boolean18 = stdDateFormat3.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.util.TimeZone timeZone19 = stdDateFormat3._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = stdDateFormat3.clone();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat14.", dateFormat0.equals(dateFormat14) == dateFormat14.equals(dateFormat0));
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj16 = stdDateFormat4.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
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
        java.text.DateFormat dateFormat23 = stdDateFormat16._formatRFC1123;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone25 = dateFormat24.getTimeZone();
        java.util.TimeZone timeZone26 = dateFormat24.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone26);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat31 = dateFormat30.getNumberFormat();
        dateFormat29.setNumberFormat(numberFormat31);
        dateFormat28.setNumberFormat(numberFormat31);
        stdDateFormat27.setNumberFormat(numberFormat31);
        boolean boolean36 = stdDateFormat27.looksLikeISO8601("");
        java.lang.String str37 = stdDateFormat27.toString();
        java.text.DateFormat dateFormat38 = stdDateFormat27._formatISO8601_z;
        java.text.DateFormat dateFormat39 = stdDateFormat27._formatPlain;
        java.util.TimeZone timeZone40 = stdDateFormat27._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat41 = stdDateFormat16.withTimeZone(timeZone40);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat41 and stdDateFormat27.", stdDateFormat41.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat41));
    }
}

