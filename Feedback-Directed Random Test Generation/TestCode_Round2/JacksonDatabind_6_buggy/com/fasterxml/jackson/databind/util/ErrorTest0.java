package com.fasterxml.jackson.databind.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
            System.out.format("%n%s%n", "ErrorTest0.test0001");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat0.setLenient(true);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = stdDateFormat0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = stdDateFormat0._formatISO8601_z;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = stdDateFormat0.equals((java.lang.Object) stdDateFormat1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean2 = stdDateFormat0.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        boolean boolean2 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator3 = dateFormat1.formatToCharacterIterator((java.lang.Object) 2);
        stdDateFormat0._formatISO8601_z = dateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.lang.String str2 = stdDateFormat0.format((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.lang.Class<?> wildcardClass1 = stdDateFormat0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.Locale locale1 = stdDateFormat0._locale;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = stdDateFormat0._formatPlain;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        stdDateFormat0._formatISO8601_z = dateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        stdDateFormat0._formatISO8601 = dateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = stdDateFormat0._formatISO8601_z;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = stdDateFormat0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = stdDateFormat0._formatPlain;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        stdDateFormat0.setTimeZone(timeZone2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.lang.String str1 = stdDateFormat0.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone1 = stdDateFormat0._timezone;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = stdDateFormat0.getTimeZone();
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = stdDateFormat0._formatRFC1123;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.Locale locale1 = stdDateFormat0._locale;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(0);
        stdDateFormat0._formatPlain = dateFormat2;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        stdDateFormat0.setCalendar(calendar2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.lang.String str2 = stdDateFormat1.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.DateFormat dateFormat2 = stdDateFormat1._formatRFC1123;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.DateFormat dateFormat2 = stdDateFormat1._formatISO8601_z;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.DateFormat dateFormat2 = stdDateFormat1._formatISO8601;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = stdDateFormat0.formatToCharacterIterator((java.lang.Object) 0.0d);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = stdDateFormat0._timezone;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        stdDateFormat0._timezone = timeZone1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        stdDateFormat0._timezone = timeZone2;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = stdDateFormat0._formatRFC1123;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = stdDateFormat0._formatISO8601;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance();
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone4 = dateFormat1.getTimeZone();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4);
        stdDateFormat0._timezone = timeZone4;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar3 = dateFormat2.getCalendar();
        stdDateFormat0.setCalendar(calendar3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance();
        java.lang.String str5 = dateFormat3.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone6 = dateFormat3.getTimeZone();
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone6);
        stdDateFormat2._formatRFC1123 = dateFormat7;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar4 = dateFormat3.getCalendar();
        dateFormat1.setCalendar(calendar4);
        dateFormat0.setCalendar(calendar4);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat1.", dateFormat0.equals(dateFormat1) == dateFormat1.equals(dateFormat0));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.util.TimeZone timeZone3 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3);
        stdDateFormat2.setTimeZone(timeZone3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.util.Date date2 = stdDateFormat0.parse("Thu, 01 Jan 1970 00:00:00 GMT");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.util.Locale locale2 = stdDateFormat1._locale;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.DateFormat dateFormat2 = stdDateFormat1._formatPlain;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        boolean boolean4 = stdDateFormat2.looksLikeISO8601("EEE, dd MMM yyyy HH:mm:ss zzz");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        boolean boolean4 = dateFormat0.equals((java.lang.Object) (short) -1);
        java.util.TimeZone timeZone5 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        boolean boolean7 = dateFormat0.equals((java.lang.Object) stdDateFormat6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat6 and stdDateFormat6", stdDateFormat6.equals(stdDateFormat6) ? stdDateFormat6.hashCode() == stdDateFormat6.hashCode() : true);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = stdDateFormat2.equals((java.lang.Object) stdDateFormat3);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        boolean boolean2 = stdDateFormat0.looksLikeISO8601("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator3 = dateFormat1.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone4 = dateFormat1.getTimeZone();
        stdDateFormat0.setTimeZone(timeZone4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        boolean boolean3 = stdDateFormat1.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone5 = dateFormat4.getTimeZone();
        java.util.Calendar calendar6 = dateFormat4.getCalendar();
        java.text.NumberFormat numberFormat7 = dateFormat4.getNumberFormat();
        dateFormat3.setNumberFormat(numberFormat7);
        stdDateFormat2._formatPlain = dateFormat3;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = stdDateFormat0._formatISO8601;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.lang.String str3 = stdDateFormat2.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(0);
        boolean boolean3 = dateFormat2.isLenient();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator8 = dateFormat5.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean9 = dateFormat2.equals((java.lang.Object) dateFormat5);
        dateFormat5.setLenient(true);
        stdDateFormat0._formatRFC1123 = dateFormat5;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        stdDateFormat0._formatISO8601 = stdDateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean2 = stdDateFormat0.looksLikeISO8601("yyyy-MM-dd");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.util.TimeZone timeZone2 = stdDateFormat1._timezone;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        boolean boolean4 = stdDateFormat2.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        stdDateFormat2._formatRFC1123 = dateFormat3;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.util.Calendar calendar3 = stdDateFormat2.getCalendar();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance();
        java.lang.String str4 = dateFormat2.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone5 = dateFormat2.getTimeZone();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5);
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5);
        stdDateFormat1._timezone = timeZone5;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = stdDateFormat2.isLenient();
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(0);
        boolean boolean3 = dateFormat2.isLenient();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator8 = dateFormat5.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean9 = dateFormat2.equals((java.lang.Object) dateFormat5);
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar11 = dateFormat10.getCalendar();
        dateFormat5.setCalendar(calendar11);
        stdDateFormat0._formatISO8601 = dateFormat5;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (short) 0);
        stdDateFormat0._formatPlain = dateFormat2;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar5 = dateFormat4.getCalendar();
        java.util.TimeZone timeZone6 = dateFormat4.getTimeZone();
        stdDateFormat2.setTimeZone(timeZone6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = stdDateFormat1.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateInstance();
        java.lang.String str7 = dateFormat5.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone8 = dateFormat5.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat4.withTimeZone(timeZone8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat9 and stdDateFormat9", stdDateFormat9.equals(stdDateFormat9) ? stdDateFormat9.hashCode() == stdDateFormat9.hashCode() : true);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.util.Locale locale5 = stdDateFormat4._locale;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = stdDateFormat4._formatRFC1123;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator4 = dateFormat2.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone5 = dateFormat2.getTimeZone();
        stdDateFormat1._timezone = timeZone5;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.util.TimeZone timeZone2 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        stdDateFormat1._formatPlain = dateFormat3;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        boolean boolean7 = dateFormat6.isLenient();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        dateFormat6.setNumberFormat(numberFormat9);
        java.util.TimeZone timeZone11 = dateFormat6.getTimeZone();
        stdDateFormat4._timezone = timeZone11;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.DateFormat dateFormat3 = stdDateFormat2._formatRFC1123;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        java.util.TimeZone timeZone4 = dateFormat2.getTimeZone();
        dateFormat2.setLenient(true);
        boolean boolean8 = dateFormat2.equals((java.lang.Object) 'a');
        java.util.Calendar calendar9 = dateFormat2.getCalendar();
        stdDateFormat1._formatISO8601 = dateFormat2;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        boolean boolean6 = stdDateFormat4.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone4);
        stdDateFormat2._formatISO8601_z = dateFormat5;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean2 = stdDateFormat0.looksLikeISO8601("Thu, 01 Jan 1970 00:00:00 GMT");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        boolean boolean3 = stdDateFormat1.looksLikeISO8601("hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.util.TimeZone timeZone5 = dateFormat3.getTimeZone();
        stdDateFormat2._timezone = timeZone5;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone7 = dateFormat6.getTimeZone();
        java.util.Calendar calendar8 = dateFormat6.getCalendar();
        java.text.NumberFormat numberFormat9 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.util.Calendar calendar12 = dateFormat11.getCalendar();
        dateFormat5.setCalendar(calendar12);
        stdDateFormat4._formatPlain = dateFormat5;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance();
        java.lang.String str3 = dateFormat1.format((java.lang.Object) 1L);
        stdDateFormat0._formatISO8601 = dateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj2 = dateFormat0.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar3 = dateFormat2.getCalendar();
        dateFormat0.setCalendar(calendar3);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar7 = dateFormat6.getCalendar();
        java.util.TimeZone timeZone8 = dateFormat6.getTimeZone();
        boolean boolean9 = dateFormat0.equals((java.lang.Object) timeZone8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone8);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator9 = dateFormat6.formatToCharacterIterator((java.lang.Object) 0);
        stdDateFormat4._formatISO8601_z = dateFormat6;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = stdDateFormat3._formatISO8601;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.util.TimeZone timeZone3 = stdDateFormat2._timezone;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.util.Date date6 = stdDateFormat4.parse("Thu, 01 Jan 1970 00:00:00 GMT");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = stdDateFormat4.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat3);
        dateFormat0.setNumberFormat(numberFormat3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = dateFormat0.isLenient();
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone4 = dateFormat3.getTimeZone();
        java.util.TimeZone timeZone5 = dateFormat3.getTimeZone();
        stdDateFormat2.setTimeZone(timeZone5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        java.util.TimeZone timeZone10 = dateFormat4.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone10);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dateFormat0.setLenient(true);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.lang.String str1 = stdDateFormat0.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(0);
        boolean boolean3 = dateFormat2.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat5 = dateFormat4.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat5);
        java.util.TimeZone timeZone7 = dateFormat2.getTimeZone();
        stdDateFormat0._formatPlain = dateFormat2;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance();
        java.lang.String str4 = dateFormat2.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone5 = dateFormat2.getTimeZone();
        boolean boolean6 = dateFormat2.isLenient();
        stdDateFormat1._formatPlain = dateFormat2;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat10 and stdDateFormat10", stdDateFormat10.equals(stdDateFormat10) ? stdDateFormat10.hashCode() == stdDateFormat10.hashCode() : true);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.util.Calendar calendar5 = stdDateFormat4.getCalendar();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateInstance(0);
        boolean boolean13 = dateFormat12.isLenient();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator18 = dateFormat15.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean19 = dateFormat12.equals((java.lang.Object) dateFormat15);
        java.util.TimeZone timeZone20 = dateFormat15.getTimeZone();
        stdDateFormat10.setTimeZone(timeZone20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat10 and stdDateFormat10", stdDateFormat10.equals(stdDateFormat10) ? stdDateFormat10.hashCode() == stdDateFormat10.hashCode() : true);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        stdDateFormat4._formatRFC1123 = dateFormat5;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        java.text.DateFormat dateFormat11 = stdDateFormat10._formatPlain;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat10 and stdDateFormat10", stdDateFormat10.equals(stdDateFormat10) ? stdDateFormat10.hashCode() == stdDateFormat10.hashCode() : true);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        boolean boolean4 = stdDateFormat2.looksLikeISO8601("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.TimeZone timeZone1 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        java.lang.String str5 = dateFormat2.format((java.lang.Object) (short) 1);
        stdDateFormat0._formatPlain = dateFormat2;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.util.TimeZone timeZone5 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat6 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone5);
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        java.util.Calendar calendar8 = dateFormat6.getCalendar();
        stdDateFormat4._formatISO8601 = dateFormat6;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat2.setNumberFormat(numberFormat4);
        dateFormat1.setNumberFormat(numberFormat4);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar10 = dateFormat9.getCalendar();
        dateFormat7.setCalendar(calendar10);
        dateFormat1.setCalendar(calendar10);
        stdDateFormat0._formatISO8601_z = dateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance(0);
        boolean boolean4 = dateFormat3.isLenient();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator9 = dateFormat6.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean10 = dateFormat3.equals((java.lang.Object) dateFormat6);
        java.util.TimeZone timeZone11 = dateFormat6.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone11);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = stdDateFormat1.withTimeZone(timeZone11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.util.Locale locale3 = stdDateFormat2._locale;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance(0);
        boolean boolean4 = dateFormat3.isLenient();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator9 = dateFormat6.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean10 = dateFormat3.equals((java.lang.Object) dateFormat6);
        java.util.TimeZone timeZone11 = dateFormat6.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = stdDateFormat1.withTimeZone(timeZone11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.lang.String str4 = stdDateFormat3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
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
        java.text.DateFormat dateFormat14 = stdDateFormat13._formatRFC1123;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat13 and stdDateFormat13", stdDateFormat13.equals(stdDateFormat13) ? stdDateFormat13.hashCode() == stdDateFormat13.hashCode() : true);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = stdDateFormat0.isLenient();
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.util.TimeZone timeZone5 = stdDateFormat4._timezone;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar6 = dateFormat5.getCalendar();
        java.util.TimeZone timeZone7 = dateFormat5.getTimeZone();
        stdDateFormat4._formatISO8601 = dateFormat5;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar3 = dateFormat2.getCalendar();
        dateFormat0.setCalendar(calendar3);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar7 = dateFormat6.getCalendar();
        java.util.TimeZone timeZone8 = dateFormat6.getTimeZone();
        boolean boolean9 = dateFormat0.equals((java.lang.Object) timeZone8);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(0);
        boolean boolean12 = dateFormat11.isLenient();
        java.text.NumberFormat numberFormat13 = dateFormat11.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat13);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        dateFormat15.setLenient(false);
        boolean boolean18 = dateFormat15.isLenient();
        boolean boolean19 = dateFormat15.isLenient();
        java.util.Calendar calendar20 = dateFormat15.getCalendar();
        dateFormat0.setCalendar(calendar20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar20", (calendar3.compareTo(calendar20) == 0) == calendar3.equals(calendar20));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance();
        boolean boolean3 = dateFormat1.equals((java.lang.Object) 1.0f);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar5 = dateFormat4.getCalendar();
        dateFormat1.setCalendar(calendar5);
        stdDateFormat0._formatRFC1123 = dateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
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
        java.lang.String str14 = stdDateFormat13.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat13 and stdDateFormat13", stdDateFormat13.equals(stdDateFormat13) ? stdDateFormat13.hashCode() == stdDateFormat13.hashCode() : true);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar3 = dateFormat2.getCalendar();
        java.util.TimeZone timeZone4 = dateFormat2.getTimeZone();
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone4);
        stdDateFormat0._timezone = timeZone4;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = stdDateFormat4._formatISO8601_z;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat4);
        java.util.TimeZone timeZone6 = dateFormat1.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat7 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone6);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone12);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        java.text.DateFormat dateFormat11 = stdDateFormat10._formatISO8601;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat10 and stdDateFormat10", stdDateFormat10.equals(stdDateFormat10) ? stdDateFormat10.hashCode() == stdDateFormat10.hashCode() : true);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        boolean boolean3 = dateFormat1.isLenient();
        stdDateFormat0._formatISO8601 = dateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat11, stdDateFormat3, and dateFormat0.", !(stdDateFormat11.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat11.equals(dateFormat0));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
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
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        java.util.TimeZone timeZone13 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone13);
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        dateFormat15.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        stdDateFormat3.setNumberFormat(numberFormat18);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat14.", stdDateFormat3.equals(stdDateFormat14) == stdDateFormat14.equals(stdDateFormat3));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = stdDateFormat10.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat10 and stdDateFormat10", stdDateFormat10.equals(stdDateFormat10) ? stdDateFormat10.hashCode() == stdDateFormat10.hashCode() : true);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.NumberFormat numberFormat2 = dateFormat0.getNumberFormat();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat12 = dateFormat11.getNumberFormat();
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar14 = dateFormat13.getCalendar();
        dateFormat11.setCalendar(calendar14);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar18 = dateFormat17.getCalendar();
        java.util.TimeZone timeZone19 = dateFormat17.getTimeZone();
        boolean boolean20 = dateFormat11.equals((java.lang.Object) timeZone19);
        stdDateFormat10._formatPlain = dateFormat11;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat10 and stdDateFormat10", stdDateFormat10.equals(stdDateFormat10) ? stdDateFormat10.hashCode() == stdDateFormat10.hashCode() : true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        stdDateFormat1._formatISO8601_z = dateFormat2;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
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
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator13 = dateFormat11.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone14 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = stdDateFormat3.withTimeZone(timeZone14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance();
        java.lang.String str6 = dateFormat4.format((java.lang.Object) 1L);
        stdDateFormat3._formatISO8601 = dateFormat4;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance();
        java.lang.String str6 = dateFormat4.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone7 = dateFormat4.getTimeZone();
        boolean boolean8 = dateFormat4.isLenient();
        stdDateFormat3._formatPlain = dateFormat4;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        dateFormat4.setLenient(false);
        boolean boolean8 = dateFormat4.equals((java.lang.Object) (short) 1);
        java.util.Calendar calendar9 = dateFormat4.getCalendar();
        stdDateFormat3._formatPlain = dateFormat4;
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar9", (calendar1.compareTo(calendar9) == 0) == calendar1.equals(calendar9));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = stdDateFormat0.format((java.lang.Object) (byte) 1);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date15 = stdDateFormat13.parse("EEE, dd MMM yyyy HH:mm:ss zzz");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date6 = stdDateFormat4.parse("EEE, dd MMM yyyy HH:mm:ss zzz");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = stdDateFormat3._formatRFC1123;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date6 = stdDateFormat4.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat13.setLenient(false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone5 = dateFormat4.getTimeZone();
        java.util.TimeZone timeZone6 = dateFormat4.getTimeZone();
        java.util.TimeZone timeZone7 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = stdDateFormat3.withTimeZone(timeZone7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat8 and stdDateFormat8", stdDateFormat8.equals(stdDateFormat8) ? stdDateFormat8.hashCode() == stdDateFormat8.hashCode() : true);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        boolean boolean2 = dateFormat0.equals((java.lang.Object) 1.0f);
        boolean boolean3 = dateFormat0.isLenient();
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone6 = dateFormat5.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = stdDateFormat3.withTimeZone(timeZone6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat7 and stdDateFormat7", stdDateFormat7.equals(stdDateFormat7) ? stdDateFormat7.hashCode() == stdDateFormat7.hashCode() : true);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone7 = dateFormat6.getTimeZone();
        java.util.Calendar calendar8 = dateFormat6.getCalendar();
        java.text.NumberFormat numberFormat9 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat9);
        boolean boolean11 = dateFormat5.isLenient();
        stdDateFormat4._formatISO8601 = dateFormat5;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.util.Calendar calendar4 = stdDateFormat3.getCalendar();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateInstance(0);
        boolean boolean6 = dateFormat5.isLenient();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator11 = dateFormat8.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean12 = dateFormat5.equals((java.lang.Object) dateFormat8);
        java.util.TimeZone timeZone13 = dateFormat8.getTimeZone();
        java.util.TimeZone timeZone14 = dateFormat8.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone14);
        stdDateFormat3._formatISO8601 = stdDateFormat15;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.Calendar calendar3 = dateFormat1.getCalendar();
        dateFormat1.setLenient(true);
        java.text.NumberFormat numberFormat6 = dateFormat1.getNumberFormat();
        stdDateFormat0._formatISO8601_z = dateFormat1;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        stdDateFormat4._formatPlain = dateFormat5;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.util.Date date2 = stdDateFormat0.parse("\u0e21\u0e04. 2513");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = stdDateFormat4._formatRFC1123;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = stdDateFormat3._formatPlain;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
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
        java.text.NumberFormat numberFormat14 = stdDateFormat13.getNumberFormat();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat13 and stdDateFormat13", stdDateFormat13.equals(stdDateFormat13) ? stdDateFormat13.hashCode() == stdDateFormat13.hashCode() : true);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        dateFormat0.setLenient(false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        boolean boolean12 = stdDateFormat10.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat10 and stdDateFormat10", stdDateFormat10.equals(stdDateFormat10) ? stdDateFormat10.hashCode() == stdDateFormat10.hashCode() : true);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        java.lang.String str11 = stdDateFormat10.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat10 and stdDateFormat10", stdDateFormat10.equals(stdDateFormat10) ? stdDateFormat10.hashCode() == stdDateFormat10.hashCode() : true);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        java.util.TimeZone timeZone10 = dateFormat4.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone10);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.DateFormat dateFormat3 = stdDateFormat2._formatISO8601_z;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.Calendar calendar2 = dateFormat0.getCalendar();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean4 = dateFormat0.equals((java.lang.Object) stdDateFormat3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        boolean boolean3 = dateFormat0.isLenient();
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone4);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj2 = dateFormat0.parseObject("EEE, dd MMM yyyy HH:mm:ss zzz");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar16 = dateFormat15.getCalendar();
        java.util.TimeZone timeZone17 = dateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat13.withTimeZone(timeZone17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat18 and stdDateFormat18", stdDateFormat18.equals(stdDateFormat18) ? stdDateFormat18.hashCode() == stdDateFormat18.hashCode() : true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(2);
        stdDateFormat0._formatISO8601 = dateFormat2;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone11 = stdDateFormat10.getTimeZone();
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance();
        stdDateFormat3._formatPlain = dateFormat4;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator13 = dateFormat11.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone14 = dateFormat11.getTimeZone();
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat10.withTimeZone(timeZone14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat16 and stdDateFormat16", stdDateFormat16.equals(stdDateFormat16) ? stdDateFormat16.hashCode() == stdDateFormat16.hashCode() : true);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        java.util.TimeZone timeZone10 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = stdDateFormat11.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat11 and stdDateFormat11", stdDateFormat11.equals(stdDateFormat11) ? stdDateFormat11.hashCode() == stdDateFormat11.hashCode() : true);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.util.TimeZone timeZone4 = stdDateFormat3._timezone;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone6 = dateFormat5.getTimeZone();
        java.util.Calendar calendar7 = dateFormat5.getCalendar();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone9 = dateFormat8.getTimeZone();
        java.util.TimeZone timeZone10 = dateFormat8.getTimeZone();
        dateFormat8.setLenient(true);
        boolean boolean14 = dateFormat8.equals((java.lang.Object) 'a');
        java.util.Calendar calendar15 = dateFormat8.getCalendar();
        dateFormat5.setCalendar(calendar15);
        java.util.TimeZone timeZone17 = dateFormat5.getTimeZone();
        stdDateFormat4._timezone = timeZone17;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
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
        java.util.Locale locale21 = stdDateFormat20._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2, locale21);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
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
        java.util.Locale locale18 = stdDateFormat17._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale18);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
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
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateInstance(0);
        boolean boolean13 = dateFormat12.isLenient();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator18 = dateFormat15.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean19 = dateFormat12.equals((java.lang.Object) dateFormat15);
        java.util.TimeZone timeZone20 = dateFormat15.getTimeZone();
        java.util.TimeZone timeZone21 = dateFormat15.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        stdDateFormat3._timezone = timeZone21;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat22.", stdDateFormat3.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat3));
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator6 = dateFormat4.formatToCharacterIterator((java.lang.Object) 2);
        java.text.NumberFormat numberFormat7 = dateFormat4.getNumberFormat();
        stdDateFormat3._formatISO8601_z = dateFormat4;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
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
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        java.util.TimeZone timeZone13 = dateFormat11.getTimeZone();
        java.util.TimeZone timeZone14 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone14);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.withTimeZone(timeZone14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat16 and stdDateFormat15.", stdDateFormat16.equals(stdDateFormat15) == stdDateFormat15.equals(stdDateFormat16));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone6 = dateFormat5.getTimeZone();
        java.util.TimeZone timeZone7 = dateFormat5.getTimeZone();
        java.util.TimeZone timeZone8 = dateFormat5.getTimeZone();
        stdDateFormat4._timezone = timeZone8;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        boolean boolean4 = stdDateFormat2.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: en_US)");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateInstance(0);
        boolean boolean6 = dateFormat5.isLenient();
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat8 = dateFormat7.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat8);
        java.util.TimeZone timeZone10 = dateFormat5.getTimeZone();
        java.util.TimeZone timeZone11 = dateFormat5.getTimeZone();
        boolean boolean12 = dateFormat5.isLenient();
        stdDateFormat3._formatISO8601_z = dateFormat5;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(0);
        boolean boolean3 = dateFormat2.isLenient();
        java.text.NumberFormat numberFormat4 = dateFormat2.getNumberFormat();
        stdDateFormat0._formatPlain = dateFormat2;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
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
        java.util.Locale locale17 = stdDateFormat7._locale;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3, locale17);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone8 = dateFormat7.getTimeZone();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone10 = dateFormat9.getTimeZone();
        java.util.TimeZone timeZone11 = dateFormat9.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone11);
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        dateFormat14.setNumberFormat(numberFormat16);
        dateFormat13.setNumberFormat(numberFormat16);
        stdDateFormat12.setNumberFormat(numberFormat16);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance();
        boolean boolean22 = dateFormat20.equals((java.lang.Object) 1.0f);
        boolean boolean23 = dateFormat20.isLenient();
        java.util.TimeZone timeZone24 = dateFormat20.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = stdDateFormat12.withTimeZone(timeZone24);
        java.util.Locale locale26 = stdDateFormat25._locale;
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone8, locale26);
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getTimeInstance(0, locale26);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale26);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat29, stdDateFormat12, and dateFormat0.", !(stdDateFormat29.equals(stdDateFormat12) && stdDateFormat12.equals(dateFormat0)) || stdDateFormat29.equals(dateFormat0));
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        java.util.TimeZone timeZone10 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10);
        java.util.Locale locale12 = stdDateFormat11._locale;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat11 and stdDateFormat11", stdDateFormat11.equals(stdDateFormat11) ? stdDateFormat11.hashCode() == stdDateFormat11.hashCode() : true);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
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
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateInstance();
        boolean boolean30 = dateFormat28.equals((java.lang.Object) 1.0f);
        boolean boolean31 = dateFormat28.isLenient();
        java.util.TimeZone timeZone32 = dateFormat28.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = stdDateFormat20.withTimeZone(timeZone32);
        java.util.Locale locale34 = stdDateFormat33._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat16.withLocale(locale34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat35 and stdDateFormat20.", stdDateFormat35.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat35));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
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
        java.util.Locale locale21 = stdDateFormat20._locale;
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2, locale21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
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
        boolean boolean15 = stdDateFormat13.looksLikeISO8601("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat13 and stdDateFormat13", stdDateFormat13.equals(stdDateFormat13) ? stdDateFormat13.hashCode() == stdDateFormat13.hashCode() : true);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone20);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        boolean boolean5 = stdDateFormat3.looksLikeISO8601("10");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        java.util.TimeZone timeZone10 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10);
        java.text.DateFormat dateFormat12 = stdDateFormat11._formatISO8601_z;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat11 and stdDateFormat11", stdDateFormat11.equals(stdDateFormat11) ? stdDateFormat11.hashCode() == stdDateFormat11.hashCode() : true);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
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
        java.util.Locale locale21 = stdDateFormat20._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = stdDateFormat3.withLocale(locale21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat22 and stdDateFormat22", stdDateFormat22.equals(stdDateFormat22) ? stdDateFormat22.hashCode() == stdDateFormat22.hashCode() : true);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone4 = stdDateFormat3.getTimeZone();
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar5 = dateFormat4.getCalendar();
        java.util.TimeZone timeZone6 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6);
        stdDateFormat2._formatISO8601 = stdDateFormat7;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
        stdDateFormat3._formatPlain = dateFormat4;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
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
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance(0, locale25);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone6 = dateFormat5.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6);
        stdDateFormat3.setTimeZone(timeZone6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat3, and dateFormat0.", !(stdDateFormat17.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat17.equals(dateFormat0));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        boolean boolean16 = dateFormat15.isLenient();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator21 = dateFormat18.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean22 = dateFormat15.equals((java.lang.Object) dateFormat18);
        java.util.TimeZone timeZone23 = dateFormat18.getTimeZone();
        java.util.TimeZone timeZone24 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        stdDateFormat3.setTimeZone(timeZone24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat25.", stdDateFormat3.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat3));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
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
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance(0);
        boolean boolean18 = dateFormat17.isLenient();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator23 = dateFormat20.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean24 = dateFormat17.equals((java.lang.Object) dateFormat20);
        java.util.TimeZone timeZone25 = dateFormat20.getTimeZone();
        java.util.TimeZone timeZone26 = dateFormat20.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone26);
        stdDateFormat3._timezone = timeZone26;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat27.", stdDateFormat3.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat3));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        java.util.TimeZone timeZone10 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10);
        java.util.TimeZone timeZone12 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone12);
        stdDateFormat11._timezone = timeZone12;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat11 and stdDateFormat11", stdDateFormat11.equals(stdDateFormat11) ? stdDateFormat11.hashCode() == stdDateFormat11.hashCode() : true);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat5.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone8 = dateFormat5.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone8);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = stdDateFormat4.withTimeZone(timeZone8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat10 and stdDateFormat10", stdDateFormat10.equals(stdDateFormat10) ? stdDateFormat10.hashCode() == stdDateFormat10.hashCode() : true);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        java.util.TimeZone timeZone10 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10);
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        stdDateFormat11._formatISO8601_z = dateFormat13;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat11 and stdDateFormat11", stdDateFormat11.equals(stdDateFormat11) ? stdDateFormat11.hashCode() == stdDateFormat11.hashCode() : true);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        java.util.TimeZone timeZone10 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat11 and stdDateFormat11", stdDateFormat11.equals(stdDateFormat11) ? stdDateFormat11.hashCode() == stdDateFormat11.hashCode() : true);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        boolean boolean5 = stdDateFormat3.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.util.Calendar calendar4 = stdDateFormat3.getCalendar();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar5 = dateFormat4.getCalendar();
        java.util.TimeZone timeZone6 = dateFormat4.getTimeZone();
        stdDateFormat3.setTimeZone(timeZone6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean2 = stdDateFormat0.looksLikeISO8601("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"Asia/Bangkok\",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null])(locale: null)");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
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
        stdDateFormat3._timezone = timeZone29;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat19.", stdDateFormat3.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat3));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = stdDateFormat4._formatPlain;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
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
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance(2, locale22);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat15, stdDateFormat3, and dateFormat0.", !(stdDateFormat15.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat15.equals(dateFormat0));
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance(0);
        boolean boolean4 = dateFormat3.isLenient();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator9 = dateFormat6.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean10 = dateFormat3.equals((java.lang.Object) dateFormat6);
        java.util.TimeZone timeZone11 = dateFormat6.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone11);
        stdDateFormat1._formatPlain = stdDateFormat12;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        java.util.TimeZone timeZone10 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone12 = stdDateFormat11.getTimeZone();
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
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
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone21 = dateFormat20.getTimeZone();
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
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance();
        boolean boolean35 = dateFormat33.equals((java.lang.Object) 1.0f);
        boolean boolean36 = dateFormat33.isLenient();
        java.util.TimeZone timeZone37 = dateFormat33.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = stdDateFormat25.withTimeZone(timeZone37);
        java.util.Locale locale39 = stdDateFormat38._locale;
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21, locale39);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat41 = stdDateFormat18.withLocale(locale39);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat41 and stdDateFormat25.", stdDateFormat41.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat41));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        java.util.TimeZone timeZone4 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = stdDateFormat0.withTimeZone(timeZone4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
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
        java.util.Locale locale21 = stdDateFormat20._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = stdDateFormat3.withLocale(locale21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat22 and stdDateFormat22", stdDateFormat22.equals(stdDateFormat22) ? stdDateFormat22.hashCode() == stdDateFormat22.hashCode() : true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
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
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator16 = dateFormat14.formatToCharacterIterator((java.lang.Object) 2);
        java.text.NumberFormat numberFormat17 = dateFormat14.getNumberFormat();
        java.text.AttributedCharacterIterator attributedCharacterIterator19 = dateFormat14.formatToCharacterIterator((java.lang.Object) 0L);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone21 = dateFormat20.getTimeZone();
        java.util.Calendar calendar22 = dateFormat20.getCalendar();
        java.text.NumberFormat numberFormat23 = dateFormat20.getNumberFormat();
        dateFormat20.setLenient(true);
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
        dateFormat20.setNumberFormat(numberFormat33);
        boolean boolean38 = dateFormat14.equals((java.lang.Object) numberFormat33);
        stdDateFormat3._formatPlain = dateFormat14;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat29.", stdDateFormat3.equals(stdDateFormat29) == stdDateFormat29.equals(stdDateFormat3));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat15, stdDateFormat3, and dateFormat0.", !(stdDateFormat15.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat15.equals(dateFormat0));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.NumberFormat numberFormat5 = stdDateFormat4.getNumberFormat();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        dateFormat5.setLenient(false);
        dateFormat5.setLenient(false);
        boolean boolean10 = dateFormat5.isLenient();
        dateFormat5.setLenient(true);
        dateFormat5.setLenient(false);
        stdDateFormat4._formatPlain = dateFormat5;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        java.util.TimeZone timeZone10 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10);
        java.text.NumberFormat numberFormat12 = stdDateFormat11.getNumberFormat();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat11 and stdDateFormat11", stdDateFormat11.equals(stdDateFormat11) ? stdDateFormat11.hashCode() == stdDateFormat11.hashCode() : true);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        boolean boolean6 = stdDateFormat4.looksLikeISO8601("\u0e21\u0e04. 2513");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone14 = dateFormat13.getTimeZone();
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
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance();
        boolean boolean28 = dateFormat26.equals((java.lang.Object) 1.0f);
        boolean boolean29 = dateFormat26.isLenient();
        java.util.TimeZone timeZone30 = dateFormat26.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = stdDateFormat18.withTimeZone(timeZone30);
        java.util.Locale locale32 = stdDateFormat31._locale;
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone14, locale32);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getTimeInstance(0, locale32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat35 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone9, locale32);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat25, stdDateFormat3, and dateFormat0.", !(stdDateFormat25.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat25.equals(dateFormat0));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        java.util.TimeZone timeZone10 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10);
        java.text.DateFormat dateFormat12 = stdDateFormat11._formatISO8601;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat11 and stdDateFormat11", stdDateFormat11.equals(stdDateFormat11) ? stdDateFormat11.hashCode() == stdDateFormat11.hashCode() : true);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
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
        boolean boolean16 = stdDateFormat7.looksLikeISO8601("");
        java.util.Locale locale17 = stdDateFormat7._locale;
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateInstance(0);
        boolean boolean20 = dateFormat19.isLenient();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat22 = dateFormat21.getNumberFormat();
        dateFormat19.setNumberFormat(numberFormat22);
        java.util.TimeZone timeZone24 = dateFormat19.getTimeZone();
        stdDateFormat7.setTimeZone(timeZone24);
        stdDateFormat3.setTimeZone(timeZone24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
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
        java.text.DateFormat dateFormat31 = stdDateFormat19._formatISO8601_z;
        boolean boolean33 = stdDateFormat19.looksLikeISO8601("yyyy-MM-dd");
        java.util.TimeZone timeZone34 = stdDateFormat19._timezone;
        stdDateFormat3._formatPlain = stdDateFormat19;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat19.", stdDateFormat3.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat3));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3, locale25);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(0);
        boolean boolean3 = dateFormat2.isLenient();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator8 = dateFormat5.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean9 = dateFormat2.equals((java.lang.Object) dateFormat5);
        stdDateFormat0._formatPlain = dateFormat2;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        java.util.TimeZone timeZone10 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10);
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateInstance(0);
        boolean boolean14 = dateFormat13.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator19 = dateFormat16.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean20 = dateFormat13.equals((java.lang.Object) dateFormat16);
        java.util.TimeZone timeZone21 = dateFormat16.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = stdDateFormat11.withTimeZone(timeZone21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat22 and stdDateFormat22", stdDateFormat22.equals(stdDateFormat22) ? stdDateFormat22.hashCode() == stdDateFormat22.hashCode() : true);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
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
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateInstance((int) (short) 1, locale33);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat3.withLocale(locale33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat35 and stdDateFormat23.", stdDateFormat35.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat35));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
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
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone19 = dateFormat18.getTimeZone();
        java.util.TimeZone timeZone20 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20);
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        dateFormat23.setNumberFormat(numberFormat25);
        dateFormat22.setNumberFormat(numberFormat25);
        stdDateFormat21.setNumberFormat(numberFormat25);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance();
        boolean boolean31 = dateFormat29.equals((java.lang.Object) 1.0f);
        boolean boolean32 = dateFormat29.isLenient();
        java.util.TimeZone timeZone33 = dateFormat29.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat21.withTimeZone(timeZone33);
        java.util.Locale locale35 = stdDateFormat34._locale;
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance(2, locale35);
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale35);
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone15, locale35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat21.", stdDateFormat3.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat3));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
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
        java.util.Locale locale21 = stdDateFormat20._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2, locale21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        java.text.NumberFormat numberFormat1 = stdDateFormat0.getNumberFormat();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = stdDateFormat10.withTimeZone(timeZone12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat13 and stdDateFormat13", stdDateFormat13.equals(stdDateFormat13) ? stdDateFormat13.hashCode() == stdDateFormat13.hashCode() : true);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
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
        boolean boolean18 = stdDateFormat3.looksLikeISO8601("");
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.util.Calendar calendar20 = dateFormat19.getCalendar();
        stdDateFormat3._formatISO8601_z = dateFormat19;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat19.", dateFormat0.equals(dateFormat19) == dateFormat19.equals(dateFormat0));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
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
        stdDateFormat3.setTimeZone(timeZone29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat19.", stdDateFormat3.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat3));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
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
        boolean boolean30 = stdDateFormat19.equals((java.lang.Object) 5);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator33 = dateFormat31.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone34 = dateFormat31.getTimeZone();
        java.util.Calendar calendar35 = dateFormat31.getCalendar();
        dateFormat31.setLenient(true);
        boolean boolean38 = stdDateFormat19.equals((java.lang.Object) true);
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar40 = dateFormat39.getCalendar();
        java.util.Calendar calendar41 = dateFormat39.getCalendar();
        stdDateFormat19._formatISO8601_z = dateFormat39;
        stdDateFormat3._formatRFC1123 = stdDateFormat19;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat19.", stdDateFormat3.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat3));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date12 = stdDateFormat10.parse("Thu, 01 Jan 1970 00:00:00 GMT");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
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
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance((int) (short) 1, locale36);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = stdDateFormat3.withLocale(locale36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat38 and stdDateFormat26.", stdDateFormat38.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat38));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1);
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1, locale18);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.util.TimeZone timeZone4 = stdDateFormat3._timezone;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date12 = stdDateFormat10.parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
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
        java.util.TimeZone timeZone21 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        stdDateFormat3._formatISO8601_z = stdDateFormat22;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat22.", stdDateFormat3.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat3));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        java.text.DateFormat dateFormat11 = stdDateFormat10._formatRFC1123;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat10 and stdDateFormat10", stdDateFormat10.equals(stdDateFormat10) ? stdDateFormat10.hashCode() == stdDateFormat10.hashCode() : true);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        boolean boolean4 = stdDateFormat2.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = stdDateFormat4._formatISO8601;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
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
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        boolean boolean16 = dateFormat14.isLenient();
        stdDateFormat13._formatISO8601 = dateFormat14;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat13 and stdDateFormat13", stdDateFormat13.equals(stdDateFormat13) ? stdDateFormat13.hashCode() == stdDateFormat13.hashCode() : true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
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
        boolean boolean17 = stdDateFormat8.looksLikeISO8601("");
        java.util.TimeZone timeZone18 = stdDateFormat8._timezone;
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601_Z;
        stdDateFormat8._formatRFC1123 = dateFormat19;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar22 = dateFormat21.getCalendar();
        java.util.TimeZone timeZone23 = dateFormat21.getTimeZone();
        boolean boolean24 = dateFormat21.isLenient();
        java.util.TimeZone timeZone25 = dateFormat21.getTimeZone();
        stdDateFormat8._timezone = timeZone25;
        stdDateFormat4._timezone = timeZone25;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone17);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
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
        stdDateFormat4._formatPlain = stdDateFormat17;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat4 and stdDateFormat17.", stdDateFormat4.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat4));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
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
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance(0);
        boolean boolean19 = dateFormat18.isLenient();
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator24 = dateFormat21.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean25 = dateFormat18.equals((java.lang.Object) dateFormat21);
        java.util.TimeZone timeZone26 = dateFormat21.getTimeZone();
        java.util.TimeZone timeZone27 = dateFormat21.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone27);
        stdDateFormat3.setTimeZone(timeZone27);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat28.", stdDateFormat3.equals(stdDateFormat28) == stdDateFormat28.equals(stdDateFormat3));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
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
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance((int) (short) 1, locale36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone20, locale36);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
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
        java.util.Locale locale30 = stdDateFormat20._locale;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getTimeInstance(0, locale30);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = stdDateFormat3.withLocale(locale30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat32 and stdDateFormat20.", stdDateFormat32.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat32));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date16 = stdDateFormat3.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
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
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getTimeInstance(0, locale34);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = stdDateFormat18.withLocale(locale34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat36 and stdDateFormat24.", stdDateFormat36.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat36));
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = stdDateFormat3._formatISO8601_z;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = stdDateFormat3.isLenient();
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
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
        java.util.Locale locale30 = stdDateFormat20._locale;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance((int) (short) 1, locale30);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale30);
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale30);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13, locale30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat20.", stdDateFormat3.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat3));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
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
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar39 = dateFormat38.getCalendar();
        java.util.TimeZone timeZone40 = dateFormat38.getTimeZone();
        boolean boolean41 = dateFormat38.isLenient();
        java.util.TimeZone timeZone42 = dateFormat38.getTimeZone();
        stdDateFormat25._timezone = timeZone42;
        stdDateFormat3._timezone = timeZone42;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat25.", stdDateFormat3.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat3));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat3, and dateFormat0.", !(stdDateFormat16.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18);
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat23 = dateFormat22.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat23);
        dateFormat20.setNumberFormat(numberFormat23);
        stdDateFormat19.setNumberFormat(numberFormat23);
        boolean boolean28 = stdDateFormat19.looksLikeISO8601("");
        java.util.Locale locale29 = stdDateFormat19._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15, locale29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat19.", stdDateFormat3.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat3));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
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
        java.util.TimeZone timeZone34 = dateFormat31.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone34);
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone38 = dateFormat37.getTimeZone();
        java.util.Calendar calendar39 = dateFormat37.getCalendar();
        java.text.NumberFormat numberFormat40 = dateFormat37.getNumberFormat();
        dateFormat36.setNumberFormat(numberFormat40);
        stdDateFormat35.setNumberFormat(numberFormat40);
        java.text.DateFormat dateFormat43 = stdDateFormat35._formatPlain;
        java.util.Locale locale44 = stdDateFormat35._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat45 = stdDateFormat3.withLocale(locale44);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat45 and stdDateFormat35.", stdDateFormat45.equals(stdDateFormat35) == stdDateFormat35.equals(stdDateFormat45));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (short) 0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
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
        java.text.DateFormat dateFormat41 = stdDateFormat25._formatPlain;
        java.util.Locale locale42 = stdDateFormat25._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat43 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20, locale42);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat25.", stdDateFormat3.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat3));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone6 = dateFormat5.getTimeZone();
        stdDateFormat4.setTimeZone(timeZone6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
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
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean24 = stdDateFormat3.isLenient();
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
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
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getTimeInstance(3);
        java.util.Calendar calendar47 = dateFormat46.getCalendar();
        java.util.TimeZone timeZone48 = dateFormat46.getTimeZone();
        stdDateFormat26._timezone = timeZone48;
        stdDateFormat3._formatISO8601_z = stdDateFormat26;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat26.", stdDateFormat3.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat3));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat30, stdDateFormat3, and dateFormat0.", !(stdDateFormat30.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat30.equals(dateFormat0));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat16.setLenient(false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        boolean boolean3 = dateFormat0.isLenient();
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
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
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance(2, locale25);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale25);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5, locale25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone5);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
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
        java.util.Locale locale28 = stdDateFormat18._locale;
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance(0, locale28);
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13, locale28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat18.", stdDateFormat3.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat3));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
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
        java.util.TimeZone timeZone29 = dateFormat28.getTimeZone();
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
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateInstance();
        boolean boolean43 = dateFormat41.equals((java.lang.Object) 1.0f);
        boolean boolean44 = dateFormat41.isLenient();
        java.util.TimeZone timeZone45 = dateFormat41.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = stdDateFormat33.withTimeZone(timeZone45);
        java.util.Locale locale47 = stdDateFormat46._locale;
        java.text.DateFormat dateFormat48 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone29, locale47);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat49 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone25, locale47);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat33.", stdDateFormat3.equals(stdDateFormat33) == stdDateFormat33.equals(stdDateFormat3));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone5 = stdDateFormat4.getTimeZone();
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
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
        boolean boolean18 = stdDateFormat3.looksLikeISO8601("");
        java.util.Date date20 = stdDateFormat3.parse("10");
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
        stdDateFormat24.setLenient(false);
        java.text.DateFormat dateFormat50 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone51 = dateFormat50.getTimeZone();
        java.text.DateFormat dateFormat52 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone51);
        java.text.DateFormat dateFormat53 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone51);
        java.util.Calendar calendar54 = dateFormat53.getCalendar();
        stdDateFormat24._formatISO8601_z = dateFormat53;
        stdDateFormat3._formatRFC1123 = stdDateFormat24;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat24.", stdDateFormat3.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat3));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
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
        java.util.Locale locale17 = stdDateFormat7._locale;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance((int) (short) 1, locale17);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale17);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat21 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0, locale17);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator17 = dateFormat15.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone18 = dateFormat15.getTimeZone();
        java.util.Calendar calendar19 = dateFormat15.getCalendar();
        dateFormat15.setLenient(true);
        boolean boolean22 = stdDateFormat3.equals((java.lang.Object) true);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar24 = dateFormat23.getCalendar();
        java.util.Calendar calendar25 = dateFormat23.getCalendar();
        stdDateFormat3._formatISO8601_z = dateFormat23;
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone29 = dateFormat28.getTimeZone();
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
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateInstance();
        boolean boolean43 = dateFormat41.equals((java.lang.Object) 1.0f);
        boolean boolean44 = dateFormat41.isLenient();
        java.util.TimeZone timeZone45 = dateFormat41.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = stdDateFormat33.withTimeZone(timeZone45);
        java.util.Locale locale47 = stdDateFormat46._locale;
        java.text.DateFormat dateFormat48 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone29, locale47);
        stdDateFormat3.setTimeZone(timeZone29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat33.", stdDateFormat3.equals(stdDateFormat33) == stdDateFormat33.equals(stdDateFormat3));
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = stdDateFormat4.isLenient();
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
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
        boolean boolean18 = stdDateFormat3.looksLikeISO8601("");
        java.util.Date date20 = stdDateFormat3.parse("10");
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23);
        stdDateFormat3._formatISO8601_z = stdDateFormat24;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat24.", stdDateFormat3.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat3));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat20 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3, locale18);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
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
        boolean boolean35 = stdDateFormat24.equals((java.lang.Object) 5);
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator38 = dateFormat36.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone39 = dateFormat36.getTimeZone();
        java.util.Calendar calendar40 = dateFormat36.getCalendar();
        dateFormat36.setLenient(true);
        boolean boolean43 = stdDateFormat24.equals((java.lang.Object) true);
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getDateInstance();
        java.lang.String str46 = dateFormat44.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone47 = dateFormat44.getTimeZone();
        java.text.DateFormat dateFormat48 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone47);
        java.text.DateFormat dateFormat49 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone47);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat50 = stdDateFormat24.withTimeZone(timeZone47);
        stdDateFormat3._timezone = timeZone47;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat24.", stdDateFormat3.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat3));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
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
        java.text.DateFormat dateFormat14 = stdDateFormat13._formatISO8601_z;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat13 and stdDateFormat13", stdDateFormat13.equals(stdDateFormat13) ? stdDateFormat13.hashCode() == stdDateFormat13.hashCode() : true);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
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
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat3, and dateFormat0.", !(stdDateFormat16.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
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
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone25 = dateFormat24.getTimeZone();
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone25);
        stdDateFormat3.setTimeZone(timeZone25);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat28 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone25);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat28, stdDateFormat3, and dateFormat0.", !(stdDateFormat28.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat28.equals(dateFormat0));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        boolean boolean3 = dateFormat0.isLenient();
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
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
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance(2, locale25);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale25);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5, locale25);
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
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateInstance();
        boolean boolean44 = dateFormat42.equals((java.lang.Object) 1.0f);
        boolean boolean45 = dateFormat42.isLenient();
        java.util.TimeZone timeZone46 = dateFormat42.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat47 = stdDateFormat34.withTimeZone(timeZone46);
        java.util.Locale locale48 = stdDateFormat47._locale;
        java.text.DateFormat dateFormat49 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, 0, locale48);
        java.text.DateFormat dateFormat50 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5, locale48);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat11 and stdDateFormat34.", stdDateFormat11.equals(stdDateFormat34) == stdDateFormat34.equals(stdDateFormat11));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
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
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone25 = dateFormat24.getTimeZone();
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone25);
        stdDateFormat3.setTimeZone(timeZone25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone28 = stdDateFormat3.getTimeZone();
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
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
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone25 = dateFormat24.getTimeZone();
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone25);
        stdDateFormat3.setTimeZone(timeZone25);
        java.text.DateFormat dateFormat28 = stdDateFormat3._formatPlain;
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
        java.lang.String str42 = stdDateFormat32.toString();
        java.text.DateFormat dateFormat43 = stdDateFormat32._formatISO8601_z;
        java.text.DateFormat dateFormat44 = stdDateFormat32._formatPlain;
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat46 = dateFormat45.getNumberFormat();
        java.text.DateFormat dateFormat47 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar48 = dateFormat47.getCalendar();
        dateFormat45.setCalendar(calendar48);
        java.text.DateFormat dateFormat51 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar52 = dateFormat51.getCalendar();
        java.util.TimeZone timeZone53 = dateFormat51.getTimeZone();
        boolean boolean54 = dateFormat45.equals((java.lang.Object) timeZone53);
        stdDateFormat32.setTimeZone(timeZone53);
        stdDateFormat3._formatISO8601 = stdDateFormat32;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat32.", stdDateFormat3.equals(stdDateFormat32) == stdDateFormat32.equals(stdDateFormat3));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
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
        java.util.TimeZone timeZone16 = stdDateFormat6._timezone;
        java.lang.String str17 = stdDateFormat6.toString();
        java.text.DateFormat dateFormat18 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat19 = stdDateFormat6._formatRFC1123;
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone21 = dateFormat20.getTimeZone();
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21);
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = stdDateFormat6.withTimeZone(timeZone21);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = stdDateFormat2.withTimeZone(timeZone21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat25 and stdDateFormat25", stdDateFormat25.equals(stdDateFormat25) ? stdDateFormat25.hashCode() == stdDateFormat25.hashCode() : true);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.lang.String str2 = dateFormat0.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat3.setLenient(true);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
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
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateInstance();
        java.lang.String str21 = dateFormat19.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone22 = dateFormat19.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone22);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = stdDateFormat3.withTimeZone(timeZone22);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat24 and stdDateFormat23.", stdDateFormat24.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat24));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean43 = stdDateFormat3.isLenient();
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_RFC1123;
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        boolean boolean3 = dateFormat0.equals((java.lang.Object) 10.0d);
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator6 = dateFormat4.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone7 = dateFormat4.getTimeZone();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar9 = dateFormat8.getCalendar();
        dateFormat4.setCalendar(calendar9);
        dateFormat0.setCalendar(calendar9);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone23);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj15 = stdDateFormat3.parseObject("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
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
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.lang.Object obj23 = dateFormat21.parseObject("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513");
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
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar41 = dateFormat40.getCalendar();
        java.util.TimeZone timeZone42 = dateFormat40.getTimeZone();
        boolean boolean43 = dateFormat40.isLenient();
        stdDateFormat27._formatPlain = dateFormat40;
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getDateInstance();
        java.lang.String str47 = dateFormat45.format((java.lang.Object) 1L);
        dateFormat45.setLenient(true);
        java.text.DateFormat dateFormat51 = java.text.DateFormat.getDateInstance(0);
        boolean boolean52 = dateFormat51.isLenient();
        java.text.DateFormat dateFormat54 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat56 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator57 = dateFormat54.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean58 = dateFormat51.equals((java.lang.Object) dateFormat54);
        java.text.DateFormat dateFormat59 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat60 = dateFormat59.getNumberFormat();
        java.util.Calendar calendar61 = dateFormat59.getCalendar();
        dateFormat54.setCalendar(calendar61);
        dateFormat54.setLenient(true);
        boolean boolean65 = dateFormat45.equals((java.lang.Object) dateFormat54);
        stdDateFormat27._formatRFC1123 = dateFormat54;
        java.text.NumberFormat numberFormat67 = dateFormat54.getNumberFormat();
        dateFormat21.setNumberFormat(numberFormat67);
        dateFormat0.setNumberFormat(numberFormat67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar41", (calendar2.compareTo(calendar41) == 0) == calendar2.equals(calendar41));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
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
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone25 = dateFormat24.getTimeZone();
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone25);
        stdDateFormat3.setTimeZone(timeZone25);
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
        boolean boolean52 = stdDateFormat3.equals((java.lang.Object) boolean51);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat31.", stdDateFormat3.equals(stdDateFormat31) == stdDateFormat31.equals(stdDateFormat3));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
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
        java.util.TimeZone timeZone19 = dateFormat18.getTimeZone();
        java.util.TimeZone timeZone20 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20);
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        dateFormat23.setNumberFormat(numberFormat25);
        dateFormat22.setNumberFormat(numberFormat25);
        stdDateFormat21.setNumberFormat(numberFormat25);
        boolean boolean30 = stdDateFormat21.looksLikeISO8601("");
        java.util.TimeZone timeZone31 = stdDateFormat21._timezone;
        java.lang.String str32 = stdDateFormat21.toString();
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone35 = dateFormat34.getTimeZone();
        stdDateFormat21._timezone = timeZone35;
        java.text.DateFormat dateFormat37 = stdDateFormat21._formatRFC1123;
        stdDateFormat16._formatPlain = stdDateFormat21;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat16 and stdDateFormat21.", stdDateFormat16.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat16));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
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
        boolean boolean28 = stdDateFormat17.equals((java.lang.Object) 5);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator31 = dateFormat29.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone32 = dateFormat29.getTimeZone();
        java.util.Calendar calendar33 = dateFormat29.getCalendar();
        dateFormat29.setLenient(true);
        boolean boolean36 = stdDateFormat17.equals((java.lang.Object) true);
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance();
        java.lang.String str39 = dateFormat37.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone40 = dateFormat37.getTimeZone();
        java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone40);
        java.text.DateFormat dateFormat42 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone40);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat43 = stdDateFormat17.withTimeZone(timeZone40);
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getDateInstance(0);
        boolean boolean46 = dateFormat45.isLenient();
        java.text.DateFormat dateFormat48 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat50 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator51 = dateFormat48.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean52 = dateFormat45.equals((java.lang.Object) dateFormat48);
        java.util.TimeZone timeZone53 = dateFormat48.getTimeZone();
        stdDateFormat17.setTimeZone(timeZone53);
        stdDateFormat4.setTimeZone(timeZone53);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat4 and stdDateFormat17.", stdDateFormat4.equals(stdDateFormat17) == stdDateFormat17.equals(stdDateFormat4));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        boolean boolean3 = dateFormat0.isLenient();
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
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
        java.util.Locale locale21 = stdDateFormat11._locale;
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance((int) (short) 1, locale21);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale21);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5, locale21);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat24, stdDateFormat11, and dateFormat0.", !(stdDateFormat24.equals(stdDateFormat11) && stdDateFormat11.equals(dateFormat0)) || stdDateFormat24.equals(dateFormat0));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
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
        java.util.Locale locale20 = stdDateFormat10._locale;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance((int) (short) 1, locale20);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale20);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale20);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance((int) (short) 1, locale20);
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2, locale20);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat26, stdDateFormat10, and dateFormat1.", !(stdDateFormat26.equals(stdDateFormat10) && stdDateFormat10.equals(dateFormat1)) || stdDateFormat26.equals(dateFormat1));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
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
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance();
        boolean boolean35 = dateFormat33.equals((java.lang.Object) 1.0f);
        boolean boolean36 = dateFormat33.isLenient();
        java.util.TimeZone timeZone37 = dateFormat33.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = stdDateFormat25.withTimeZone(timeZone37);
        java.util.Locale locale39 = stdDateFormat38._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat40 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone18, locale39);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat25.", stdDateFormat3.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat3));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.util.Locale locale4 = stdDateFormat3._locale;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat20 = stdDateFormat18.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat20, stdDateFormat18, and dateFormat0.", !(stdDateFormat20.equals(stdDateFormat18) && stdDateFormat18.equals(dateFormat0)) || stdDateFormat20.equals(dateFormat0));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar4 = dateFormat3.getCalendar();
        java.util.TimeZone timeZone5 = dateFormat3.getTimeZone();
        boolean boolean6 = dateFormat3.isLenient();
        java.util.TimeZone timeZone7 = dateFormat3.getTimeZone();
        java.util.TimeZone timeZone8 = dateFormat3.getTimeZone();
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        java.util.TimeZone timeZone13 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone13);
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        dateFormat15.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance();
        boolean boolean24 = dateFormat22.equals((java.lang.Object) 1.0f);
        boolean boolean25 = dateFormat22.isLenient();
        java.util.TimeZone timeZone26 = dateFormat22.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = stdDateFormat14.withTimeZone(timeZone26);
        java.util.Locale locale28 = stdDateFormat27._locale;
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance(2, locale28);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale28);
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone8, locale28);
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone1, locale28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat2 and stdDateFormat2", stdDateFormat2.equals(stdDateFormat2) ? stdDateFormat2.hashCode() == stdDateFormat2.hashCode() : true);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone25);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat27, stdDateFormat3, and dateFormat0.", !(stdDateFormat27.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat27.equals(dateFormat0));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat4);
        java.util.TimeZone timeZone6 = dateFormat1.getTimeZone();
        java.util.TimeZone timeZone7 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone7);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat9 = stdDateFormat8.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat8 and stdDateFormat8", stdDateFormat8.equals(stdDateFormat8) ? stdDateFormat8.hashCode() == stdDateFormat8.hashCode() : true);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(3);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
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
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone21 = dateFormat20.getTimeZone();
        java.util.TimeZone timeZone22 = dateFormat20.getTimeZone();
        dateFormat20.setLenient(true);
        stdDateFormat8._formatRFC1123 = dateFormat20;
        java.util.Locale locale26 = stdDateFormat8._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
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
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat17 = dateFormat16.getNumberFormat();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar19 = dateFormat18.getCalendar();
        dateFormat16.setCalendar(calendar19);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar23 = dateFormat22.getCalendar();
        java.util.TimeZone timeZone24 = dateFormat22.getTimeZone();
        boolean boolean25 = dateFormat16.equals((java.lang.Object) timeZone24);
        stdDateFormat3.setTimeZone(timeZone24);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat27, stdDateFormat3, and dateFormat0.", !(stdDateFormat27.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat27.equals(dateFormat0));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
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
        boolean boolean14 = stdDateFormat3.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = stdDateFormat3.isLenient();
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
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
        java.util.Locale locale38 = stdDateFormat37._locale;
        boolean boolean40 = stdDateFormat37.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.util.Locale locale41 = stdDateFormat37._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat42 = stdDateFormat16.withLocale(locale41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat42 and stdDateFormat24.", stdDateFormat42.equals(stdDateFormat24) == stdDateFormat24.equals(stdDateFormat42));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
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
        java.util.TimeZone timeZone21 = dateFormat16.getTimeZone();
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
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateInstance();
        boolean boolean37 = dateFormat35.equals((java.lang.Object) 1.0f);
        boolean boolean38 = dateFormat35.isLenient();
        java.util.TimeZone timeZone39 = dateFormat35.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat40 = stdDateFormat27.withTimeZone(timeZone39);
        java.util.Locale locale41 = stdDateFormat40._locale;
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateInstance(2, locale41);
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale41);
        java.text.DateFormat dateFormat44 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone21, locale41);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat45 = stdDateFormat3.withLocale(locale41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat45 and stdDateFormat27.", stdDateFormat45.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat45));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
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
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance((int) (short) 1, locale36);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20, locale36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat26.", stdDateFormat3.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat3));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat3.setLenient(true);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(3);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        boolean boolean6 = stdDateFormat4.looksLikeISO8601("\u0e21\u0e04. 2513 07:00:00");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
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
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance(0);
        boolean boolean19 = dateFormat18.isLenient();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat21 = dateFormat20.getNumberFormat();
        dateFormat18.setNumberFormat(numberFormat21);
        java.util.TimeZone timeZone23 = dateFormat18.getTimeZone();
        java.util.TimeZone timeZone24 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        stdDateFormat3.setTimeZone(timeZone24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat25.", stdDateFormat3.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat3));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
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
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar23 = dateFormat22.getCalendar();
        java.util.TimeZone timeZone24 = dateFormat22.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = stdDateFormat3.withTimeZone(timeZone24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat26 and stdDateFormat25.", stdDateFormat26.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat26));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
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
        java.util.Locale locale32 = stdDateFormat22._locale;
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance((int) (short) 1, locale32);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale32);
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale32);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15, locale32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat22.", stdDateFormat3.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat3));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        boolean boolean3 = dateFormat0.isLenient();
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
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
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance(2, locale25);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale25);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone5, locale25);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat29, stdDateFormat11, and dateFormat0.", !(stdDateFormat29.equals(stdDateFormat11) && stdDateFormat11.equals(dateFormat0)) || stdDateFormat29.equals(dateFormat0));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.instance;
        stdDateFormat0.setLenient(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone16 = dateFormat15.getTimeZone();
        java.util.TimeZone timeZone17 = dateFormat15.getTimeZone();
        dateFormat15.setLenient(true);
        stdDateFormat3._formatRFC1123 = dateFormat15;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat3.setLenient(true);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = stdDateFormat25.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat27, stdDateFormat25, and dateFormat0.", !(stdDateFormat27.equals(stdDateFormat25) && stdDateFormat25.equals(dateFormat0)) || stdDateFormat27.equals(dateFormat0));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
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
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        java.util.TimeZone timeZone13 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone13);
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        dateFormat15.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        boolean boolean23 = stdDateFormat14.looksLikeISO8601("");
        java.util.TimeZone timeZone24 = stdDateFormat14._timezone;
        java.lang.String str25 = stdDateFormat14.toString();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone28 = dateFormat27.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = stdDateFormat14.withTimeZone(timeZone28);
        stdDateFormat3._formatISO8601_z = stdDateFormat29;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat29.", stdDateFormat3.equals(stdDateFormat29) == stdDateFormat29.equals(stdDateFormat3));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
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
        boolean boolean16 = stdDateFormat7.looksLikeISO8601("");
        java.util.TimeZone timeZone17 = stdDateFormat7._timezone;
        java.lang.String str18 = stdDateFormat7.toString();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone21 = dateFormat20.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = stdDateFormat7.withTimeZone(timeZone21);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar26 = dateFormat25.getCalendar();
        dateFormat23.setCalendar(calendar26);
        stdDateFormat7.setCalendar(calendar26);
        boolean boolean30 = stdDateFormat7.looksLikeISO8601("10");
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator33 = dateFormat31.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone34 = dateFormat31.getTimeZone();
        java.text.DateFormat dateFormat35 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone34);
        stdDateFormat7.setTimeZone(timeZone34);
        java.util.Locale locale37 = stdDateFormat7._locale;
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2, locale37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
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
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance((int) (short) 1, locale35);
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale35);
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateInstance((int) (short) 1, locale35);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone17, locale35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat25.", stdDateFormat3.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat3));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
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
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone19 = dateFormat18.getTimeZone();
        java.util.TimeZone timeZone20 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20);
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        dateFormat23.setNumberFormat(numberFormat25);
        dateFormat22.setNumberFormat(numberFormat25);
        stdDateFormat21.setNumberFormat(numberFormat25);
        boolean boolean30 = stdDateFormat21.looksLikeISO8601("");
        java.lang.String str31 = stdDateFormat21.toString();
        java.text.DateFormat dateFormat32 = stdDateFormat21._formatISO8601_z;
        java.text.DateFormat dateFormat33 = stdDateFormat21._formatPlain;
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar35 = dateFormat34.getCalendar();
        java.util.TimeZone timeZone36 = dateFormat34.getTimeZone();
        boolean boolean37 = dateFormat34.isLenient();
        stdDateFormat21._formatPlain = dateFormat34;
        java.util.TimeZone timeZone39 = stdDateFormat21._timezone;
        stdDateFormat3._timezone = timeZone39;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat21.", stdDateFormat3.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat3));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
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
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance((int) (byte) 0);
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
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance();
        boolean boolean39 = dateFormat37.equals((java.lang.Object) 1.0f);
        boolean boolean40 = dateFormat37.isLenient();
        java.util.TimeZone timeZone41 = dateFormat37.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat42 = stdDateFormat29.withTimeZone(timeZone41);
        java.util.Locale locale43 = stdDateFormat42._locale;
        java.text.DateFormat dateFormat44 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone25, locale43);
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getDateInstance(0, locale43);
        java.text.DateFormat dateFormat46 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone20, locale43);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat29.", stdDateFormat3.equals(stdDateFormat29) == stdDateFormat29.equals(stdDateFormat3));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
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
        java.util.Locale locale20 = stdDateFormat10._locale;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance((int) (short) 1, locale20);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale20);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance((int) (short) 1, locale20);
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2, locale20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator17 = dateFormat15.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone18 = dateFormat15.getTimeZone();
        java.util.Calendar calendar19 = dateFormat15.getCalendar();
        dateFormat15.setLenient(true);
        boolean boolean22 = stdDateFormat3.equals((java.lang.Object) true);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance();
        java.lang.String str25 = dateFormat23.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone26 = dateFormat23.getTimeZone();
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = stdDateFormat3.withTimeZone(timeZone26);
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
        java.text.DateFormat dateFormat45 = stdDateFormat33._formatISO8601_z;
        java.text.DateFormat dateFormat46 = stdDateFormat33._formatRFC1123;
        java.text.DateFormat dateFormat47 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone48 = dateFormat47.getTimeZone();
        java.text.DateFormat dateFormat49 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone48);
        java.text.DateFormat dateFormat50 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone48);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat51 = stdDateFormat33.withTimeZone(timeZone48);
        java.text.DateFormat dateFormat52 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone48);
        stdDateFormat29._formatISO8601 = dateFormat52;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat29 and stdDateFormat33.", stdDateFormat29.equals(stdDateFormat33) == stdDateFormat33.equals(stdDateFormat29));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar6 = dateFormat5.getCalendar();
        java.util.TimeZone timeZone7 = dateFormat5.getTimeZone();
        boolean boolean8 = dateFormat5.isLenient();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone10 = dateFormat9.getTimeZone();
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone10);
        java.text.DateFormat dateFormat12 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone10);
        boolean boolean13 = dateFormat5.equals((java.lang.Object) timeZone10);
        stdDateFormat3._formatISO8601_z = dateFormat5;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat33, stdDateFormat3, and dateFormat0.", !(stdDateFormat33.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat33.equals(dateFormat0));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance(3);
        java.util.Calendar calendar7 = dateFormat6.getCalendar();
        java.util.TimeZone timeZone8 = dateFormat6.getTimeZone();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone10 = dateFormat9.getTimeZone();
        java.util.TimeZone timeZone11 = dateFormat9.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone11);
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        dateFormat14.setNumberFormat(numberFormat16);
        dateFormat13.setNumberFormat(numberFormat16);
        stdDateFormat12.setNumberFormat(numberFormat16);
        boolean boolean21 = stdDateFormat12.looksLikeISO8601("");
        java.util.TimeZone timeZone22 = stdDateFormat12._timezone;
        java.lang.String str23 = stdDateFormat12.toString();
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone26 = dateFormat25.getTimeZone();
        stdDateFormat12._timezone = timeZone26;
        java.text.DateFormat dateFormat28 = stdDateFormat12._formatPlain;
        java.util.Locale locale29 = stdDateFormat12._locale;
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone8, locale29);
        stdDateFormat4.setTimeZone(timeZone8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
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
        java.text.DateFormat dateFormat30 = stdDateFormat19._formatISO8601;
        java.util.TimeZone timeZone31 = stdDateFormat19._timezone;
        java.util.Calendar calendar32 = stdDateFormat19.getCalendar();
        stdDateFormat3._formatISO8601_z = stdDateFormat19;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat19.", stdDateFormat3.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat3));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone21 = stdDateFormat3.getTimeZone();
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(3);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar7 = dateFormat6.getCalendar();
        java.util.TimeZone timeZone8 = dateFormat6.getTimeZone();
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone8);
        stdDateFormat4._timezone = timeZone8;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
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
        java.text.DateFormat dateFormat27 = stdDateFormat3._formatRFC1123;
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone29 = dateFormat28.getTimeZone();
        java.util.TimeZone timeZone30 = dateFormat28.getTimeZone();
        java.util.TimeZone timeZone31 = dateFormat28.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone31);
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone35 = dateFormat34.getTimeZone();
        java.util.Calendar calendar36 = dateFormat34.getCalendar();
        java.text.NumberFormat numberFormat37 = dateFormat34.getNumberFormat();
        dateFormat33.setNumberFormat(numberFormat37);
        stdDateFormat32.setNumberFormat(numberFormat37);
        stdDateFormat3.setNumberFormat(numberFormat37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat32.", stdDateFormat3.equals(stdDateFormat32) == stdDateFormat32.equals(stdDateFormat3));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
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
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance(0);
        boolean boolean18 = dateFormat17.isLenient();
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator23 = dateFormat20.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean24 = dateFormat17.equals((java.lang.Object) dateFormat20);
        java.util.TimeZone timeZone25 = dateFormat20.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone25);
        stdDateFormat3._formatISO8601_z = stdDateFormat26;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat26.", stdDateFormat3.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat3));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(3);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
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
        java.text.DateFormat dateFormat39 = stdDateFormat25._formatISO8601_z;
        java.lang.String str40 = stdDateFormat25.toString();
        java.util.Locale locale41 = stdDateFormat25._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat42 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20, locale41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat25.", stdDateFormat3.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat3));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
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
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone29 = dateFormat28.getTimeZone();
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
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateInstance();
        boolean boolean43 = dateFormat41.equals((java.lang.Object) 1.0f);
        boolean boolean44 = dateFormat41.isLenient();
        java.util.TimeZone timeZone45 = dateFormat41.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = stdDateFormat33.withTimeZone(timeZone45);
        java.util.Locale locale47 = stdDateFormat46._locale;
        java.text.DateFormat dateFormat48 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone29, locale47);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat49 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone26, locale47);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat33.", stdDateFormat3.equals(stdDateFormat33) == stdDateFormat33.equals(stdDateFormat3));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = stdDateFormat16.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat21, stdDateFormat16, and dateFormat0.", !(stdDateFormat21.equals(stdDateFormat16) && stdDateFormat16.equals(dateFormat0)) || stdDateFormat21.equals(dateFormat0));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
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
        java.text.DateFormat dateFormat19 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat20 = stdDateFormat6._formatISO8601_z;
        java.lang.String str21 = stdDateFormat6.toString();
        java.util.Locale locale22 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1, locale22);
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
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateInstance((int) (short) 1, locale41);
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale41);
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale41);
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getDateInstance((int) (short) 1, locale41);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat31.", stdDateFormat6.equals(stdDateFormat31) == stdDateFormat31.equals(stdDateFormat6));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator17 = dateFormat15.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone18 = dateFormat15.getTimeZone();
        java.util.Calendar calendar19 = dateFormat15.getCalendar();
        dateFormat15.setLenient(true);
        boolean boolean22 = stdDateFormat3.equals((java.lang.Object) true);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance();
        java.lang.String str25 = dateFormat23.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone26 = dateFormat23.getTimeZone();
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = stdDateFormat3.withTimeZone(timeZone26);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance(0);
        boolean boolean32 = dateFormat31.isLenient();
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator37 = dateFormat34.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean38 = dateFormat31.equals((java.lang.Object) dateFormat34);
        java.util.TimeZone timeZone39 = dateFormat34.getTimeZone();
        stdDateFormat3.setTimeZone(timeZone39);
        java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone39);
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
        java.util.TimeZone timeZone55 = stdDateFormat45._timezone;
        java.lang.String str56 = stdDateFormat45.toString();
        java.text.DateFormat dateFormat57 = stdDateFormat45._formatISO8601_z;
        boolean boolean59 = stdDateFormat45.looksLikeISO8601("yyyy-MM-dd");
        java.util.TimeZone timeZone60 = stdDateFormat45._timezone;
        java.lang.String str61 = stdDateFormat45.toString();
        boolean boolean62 = dateFormat41.equals((java.lang.Object) str61);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat45.", stdDateFormat3.equals(stdDateFormat45) == stdDateFormat45.equals(stdDateFormat3));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
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
        java.util.Locale locale35 = stdDateFormat25._locale;
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2, locale35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat25.", stdDateFormat6.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat6));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat3.setLenient(false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(2, 2);
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
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
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance(2, locale22);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat24 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale22);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat24, stdDateFormat8, and dateFormat2.", !(stdDateFormat24.equals(stdDateFormat8) && stdDateFormat8.equals(dateFormat2)) || stdDateFormat24.equals(dateFormat2));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone25);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat27, stdDateFormat3, and dateFormat0.", !(stdDateFormat27.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat27.equals(dateFormat0));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
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
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator31 = dateFormat29.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone32 = dateFormat29.getTimeZone();
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone32);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone32);
        stdDateFormat3._timezone = timeZone32;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone38 = dateFormat37.getTimeZone();
        java.util.TimeZone timeZone39 = dateFormat37.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat40 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone39);
        java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat44 = dateFormat43.getNumberFormat();
        dateFormat42.setNumberFormat(numberFormat44);
        dateFormat41.setNumberFormat(numberFormat44);
        stdDateFormat40.setNumberFormat(numberFormat44);
        boolean boolean49 = stdDateFormat40.looksLikeISO8601("");
        java.util.Locale locale50 = stdDateFormat40._locale;
        java.text.DateFormat dateFormat51 = java.text.DateFormat.getDateInstance((int) (short) 1, locale50);
        java.text.DateFormat dateFormat52 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone32, locale50);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat40.", stdDateFormat3.equals(stdDateFormat40) == stdDateFormat40.equals(stdDateFormat3));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator17 = dateFormat15.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone18 = dateFormat15.getTimeZone();
        java.util.Calendar calendar19 = dateFormat15.getCalendar();
        dateFormat15.setLenient(true);
        boolean boolean22 = stdDateFormat3.equals((java.lang.Object) true);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar24 = dateFormat23.getCalendar();
        java.util.Calendar calendar25 = dateFormat23.getCalendar();
        stdDateFormat3._formatISO8601_z = dateFormat23;
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
        boolean boolean41 = stdDateFormat30.equals((java.lang.Object) 5);
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator44 = dateFormat42.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone45 = dateFormat42.getTimeZone();
        java.util.Calendar calendar46 = dateFormat42.getCalendar();
        dateFormat42.setLenient(true);
        boolean boolean49 = stdDateFormat30.equals((java.lang.Object) true);
        java.text.DateFormat dateFormat50 = java.text.DateFormat.getDateInstance();
        java.lang.String str52 = dateFormat50.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone53 = dateFormat50.getTimeZone();
        java.text.DateFormat dateFormat54 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone53);
        java.text.DateFormat dateFormat55 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone53);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat56 = stdDateFormat30.withTimeZone(timeZone53);
        java.text.DateFormat dateFormat58 = java.text.DateFormat.getDateInstance(0);
        boolean boolean59 = dateFormat58.isLenient();
        java.text.DateFormat dateFormat61 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat63 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator64 = dateFormat61.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean65 = dateFormat58.equals((java.lang.Object) dateFormat61);
        java.util.TimeZone timeZone66 = dateFormat61.getTimeZone();
        stdDateFormat30.setTimeZone(timeZone66);
        java.text.DateFormat dateFormat68 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone66);
        stdDateFormat3.setTimeZone(timeZone66);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat30.", stdDateFormat3.equals(stdDateFormat30) == stdDateFormat30.equals(stdDateFormat3));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
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
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone19 = dateFormat18.getTimeZone();
        java.util.TimeZone timeZone20 = dateFormat18.getTimeZone();
        java.util.TimeZone timeZone21 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone25 = dateFormat24.getTimeZone();
        java.util.Calendar calendar26 = dateFormat24.getCalendar();
        java.text.NumberFormat numberFormat27 = dateFormat24.getNumberFormat();
        dateFormat23.setNumberFormat(numberFormat27);
        stdDateFormat22.setNumberFormat(numberFormat27);
        java.text.DateFormat dateFormat30 = stdDateFormat22._formatPlain;
        java.util.Locale locale31 = stdDateFormat22._locale;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar33 = dateFormat32.getCalendar();
        java.util.TimeZone timeZone34 = dateFormat32.getTimeZone();
        boolean boolean35 = dateFormat32.isLenient();
        dateFormat32.setLenient(true);
        stdDateFormat22._formatPlain = dateFormat32;
        stdDateFormat3._formatISO8601 = stdDateFormat22;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat22.", stdDateFormat3.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat3));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        java.text.DateFormat dateFormat11 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat10 and stdDateFormat10", stdDateFormat10.equals(stdDateFormat10) ? stdDateFormat10.hashCode() == stdDateFormat10.hashCode() : true);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
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
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat29 = dateFormat28.getNumberFormat();
        java.util.Calendar calendar30 = dateFormat28.getCalendar();
        dateFormat28.setLenient(false);
        stdDateFormat3._formatPlain = dateFormat28;
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar22 and calendar30", (calendar22.compareTo(calendar30) == 0) == calendar22.equals(calendar30));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
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
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator31 = dateFormat29.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone32 = dateFormat29.getTimeZone();
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone32);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone32);
        stdDateFormat3._timezone = timeZone32;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone38 = dateFormat37.getTimeZone();
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
        java.util.Locale locale56 = stdDateFormat55._locale;
        java.text.DateFormat dateFormat57 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone38, locale56);
        stdDateFormat3._timezone = timeZone38;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat42.", stdDateFormat3.equals(stdDateFormat42) == stdDateFormat42.equals(stdDateFormat3));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
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
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone30 = dateFormat29.getTimeZone();
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
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateInstance();
        boolean boolean44 = dateFormat42.equals((java.lang.Object) 1.0f);
        boolean boolean45 = dateFormat42.isLenient();
        java.util.TimeZone timeZone46 = dateFormat42.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat47 = stdDateFormat34.withTimeZone(timeZone46);
        java.util.Locale locale48 = stdDateFormat47._locale;
        java.text.DateFormat dateFormat49 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone30, locale48);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat50 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone27, locale48);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat34.", stdDateFormat3.equals(stdDateFormat34) == stdDateFormat34.equals(stdDateFormat3));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone8 = dateFormat7.getTimeZone();
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone8);
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
        java.lang.String str23 = stdDateFormat13.toString();
        java.text.DateFormat dateFormat24 = stdDateFormat13._formatISO8601_z;
        java.text.DateFormat dateFormat25 = stdDateFormat13._formatISO8601;
        java.text.DateFormat dateFormat26 = stdDateFormat13._formatISO8601_z;
        java.text.DateFormat dateFormat27 = stdDateFormat13._formatISO8601_z;
        java.lang.String str28 = stdDateFormat13.toString();
        java.util.Locale locale29 = stdDateFormat13._locale;
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone8, locale29);
        stdDateFormat6.setTimeZone(timeZone8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat6 and stdDateFormat6", stdDateFormat6.equals(stdDateFormat6) ? stdDateFormat6.hashCode() == stdDateFormat6.hashCode() : true);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        java.util.TimeZone timeZone10 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = stdDateFormat11.isLenient();
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar8 = dateFormat7.getCalendar();
        java.util.TimeZone timeZone9 = dateFormat7.getTimeZone();
        boolean boolean10 = dateFormat7.isLenient();
        java.util.TimeZone timeZone11 = dateFormat7.getTimeZone();
        java.util.TimeZone timeZone12 = dateFormat7.getTimeZone();
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
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance();
        boolean boolean28 = dateFormat26.equals((java.lang.Object) 1.0f);
        boolean boolean29 = dateFormat26.isLenient();
        java.util.TimeZone timeZone30 = dateFormat26.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = stdDateFormat18.withTimeZone(timeZone30);
        java.util.Locale locale32 = stdDateFormat31._locale;
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance(2, locale32);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale32);
        java.text.DateFormat dateFormat35 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone12, locale32);
        java.text.DateFormat dateFormat36 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3, locale32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat6 and stdDateFormat6", stdDateFormat6.equals(stdDateFormat6) ? stdDateFormat6.hashCode() == stdDateFormat6.hashCode() : true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
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
        java.text.NumberFormat numberFormat25 = dateFormat13.getNumberFormat();
        dateFormat13.setLenient(false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar20", (calendar1.compareTo(calendar20) == 0) == calendar1.equals(calendar20));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
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
        boolean boolean23 = stdDateFormat21.looksLikeISO8601("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date25 = stdDateFormat21.parse("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat3, and dateFormat0.", !(stdDateFormat16.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
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
        java.util.TimeZone timeZone21 = stdDateFormat3._timezone;
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
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar39 = dateFormat38.getCalendar();
        stdDateFormat25._formatISO8601_z = dateFormat38;
        stdDateFormat3._formatISO8601_z = stdDateFormat25;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat25.", stdDateFormat3.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat3));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
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
        stdDateFormat4.setLenient(false);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone31 = dateFormat30.getTimeZone();
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone31);
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone31);
        java.util.Calendar calendar34 = dateFormat33.getCalendar();
        stdDateFormat4._formatISO8601_z = dateFormat33;
        java.util.Calendar calendar36 = stdDateFormat4.getCalendar();
        stdDateFormat0._formatISO8601 = stdDateFormat4;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator13 = dateFormat11.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone14 = dateFormat11.getTimeZone();
        java.util.Calendar calendar15 = dateFormat11.getCalendar();
        java.util.Calendar calendar16 = dateFormat11.getCalendar();
        stdDateFormat10._formatPlain = dateFormat11;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat10 and stdDateFormat10", stdDateFormat10.equals(stdDateFormat10) ? stdDateFormat10.hashCode() == stdDateFormat10.hashCode() : true);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
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
        java.util.Locale locale21 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance(0);
        boolean boolean24 = dateFormat23.isLenient();
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat26 = dateFormat25.getNumberFormat();
        dateFormat23.setNumberFormat(numberFormat26);
        java.util.TimeZone timeZone28 = dateFormat23.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone28);
        stdDateFormat3._timezone = timeZone28;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat29.", stdDateFormat3.equals(stdDateFormat29) == stdDateFormat29.equals(stdDateFormat3));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
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
        java.text.DateFormat dateFormat33 = stdDateFormat20._formatRFC1123;
        java.text.DateFormat dateFormat34 = stdDateFormat20._formatPlain;
        java.text.DateFormat dateFormat35 = stdDateFormat20._formatPlain;
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateTimeInstance(0, 0);
        stdDateFormat20._formatISO8601 = dateFormat38;
        stdDateFormat3._formatPlain = stdDateFormat20;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat20.", stdDateFormat3.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat3));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
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
        java.lang.String str29 = stdDateFormat19.toString();
        java.text.DateFormat dateFormat30 = stdDateFormat19._formatISO8601_z;
        java.text.DateFormat dateFormat31 = stdDateFormat19._formatPlain;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar33 = dateFormat32.getCalendar();
        java.util.TimeZone timeZone34 = dateFormat32.getTimeZone();
        boolean boolean35 = dateFormat32.isLenient();
        stdDateFormat19._formatPlain = dateFormat32;
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance();
        java.lang.String str39 = dateFormat37.format((java.lang.Object) 1L);
        dateFormat37.setLenient(true);
        stdDateFormat19._formatRFC1123 = dateFormat37;
        java.util.TimeZone timeZone43 = stdDateFormat19._timezone;
        stdDateFormat3.setTimeZone(timeZone43);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat19.", stdDateFormat3.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat3));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
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
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.lang.Object obj24 = dateFormat22.parseObject("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513");
        java.util.Calendar calendar25 = dateFormat22.getCalendar();
        stdDateFormat3._formatISO8601_z = dateFormat22;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Date date28 = stdDateFormat3.parse("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
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
        java.text.DateFormat dateFormat18 = stdDateFormat16._formatPlain;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = stdDateFormat16.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat19, stdDateFormat16, and dateFormat0.", !(stdDateFormat19.equals(stdDateFormat16) && stdDateFormat16.equals(dateFormat0)) || stdDateFormat19.equals(dateFormat0));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone23);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat26, stdDateFormat3, and dateFormat0.", !(stdDateFormat26.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat26.equals(dateFormat0));
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3);
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
        java.lang.String str19 = stdDateFormat9.toString();
        java.text.DateFormat dateFormat20 = stdDateFormat9._formatISO8601_z;
        java.text.DateFormat dateFormat21 = stdDateFormat9._formatISO8601;
        java.text.DateFormat dateFormat22 = stdDateFormat9._formatISO8601_z;
        java.text.DateFormat dateFormat23 = stdDateFormat9._formatISO8601_z;
        java.lang.String str24 = stdDateFormat9.toString();
        java.util.Locale locale25 = stdDateFormat9._locale;
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3, locale25);
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
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateInstance();
        boolean boolean42 = dateFormat40.equals((java.lang.Object) 1.0f);
        boolean boolean43 = dateFormat40.isLenient();
        java.util.TimeZone timeZone44 = dateFormat40.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat45 = stdDateFormat32.withTimeZone(timeZone44);
        java.util.Locale locale46 = stdDateFormat45._locale;
        java.text.DateFormat dateFormat47 = java.text.DateFormat.getDateInstance(2, locale46);
        java.text.DateFormat dateFormat48 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale46);
        java.text.DateFormat dateFormat49 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3, locale46);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat9 and stdDateFormat32.", stdDateFormat9.equals(stdDateFormat32) == stdDateFormat32.equals(stdDateFormat9));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
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
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateInstance(0);
        boolean boolean16 = dateFormat15.isLenient();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator21 = dateFormat18.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean22 = dateFormat15.equals((java.lang.Object) dateFormat18);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar24 = dateFormat23.getCalendar();
        dateFormat18.setCalendar(calendar24);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator28 = dateFormat26.formatToCharacterIterator((java.lang.Object) 2);
        java.text.NumberFormat numberFormat29 = dateFormat26.getNumberFormat();
        java.text.AttributedCharacterIterator attributedCharacterIterator31 = dateFormat26.formatToCharacterIterator((java.lang.Object) 0L);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone33 = dateFormat32.getTimeZone();
        java.util.Calendar calendar34 = dateFormat32.getCalendar();
        java.text.NumberFormat numberFormat35 = dateFormat32.getNumberFormat();
        dateFormat32.setLenient(true);
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone39 = dateFormat38.getTimeZone();
        java.util.TimeZone timeZone40 = dateFormat38.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat41 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone40);
        java.text.DateFormat dateFormat42 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat45 = dateFormat44.getNumberFormat();
        dateFormat43.setNumberFormat(numberFormat45);
        dateFormat42.setNumberFormat(numberFormat45);
        stdDateFormat41.setNumberFormat(numberFormat45);
        dateFormat32.setNumberFormat(numberFormat45);
        boolean boolean50 = dateFormat26.equals((java.lang.Object) numberFormat45);
        dateFormat18.setNumberFormat(numberFormat45);
        dateFormat13.setNumberFormat(numberFormat45);
        stdDateFormat4.setNumberFormat(numberFormat45);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat4 and stdDateFormat41.", stdDateFormat4.equals(stdDateFormat41) == stdDateFormat41.equals(stdDateFormat4));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
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
        java.util.Locale locale30 = stdDateFormat20._locale;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance((int) (short) 1, locale30);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance(0, locale30);
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getTimeInstance(1, locale30);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone13, locale30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
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
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_PLAIN;
        stdDateFormat3._formatRFC1123 = dateFormat27;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        boolean boolean7 = dateFormat6.isLenient();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator12 = dateFormat9.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean13 = dateFormat6.equals((java.lang.Object) dateFormat9);
        java.util.TimeZone timeZone14 = dateFormat9.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat15 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone14);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = stdDateFormat4.withTimeZone(timeZone14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat16 and stdDateFormat16", stdDateFormat16.equals(stdDateFormat16) ? stdDateFormat16.hashCode() == stdDateFormat16.hashCode() : true);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone5 = dateFormat4.getTimeZone();
        boolean boolean6 = dateFormat4.isLenient();
        boolean boolean7 = dateFormat4.isLenient();
        java.text.NumberFormat numberFormat8 = dateFormat4.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat8);
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
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance();
        boolean boolean23 = dateFormat21.equals((java.lang.Object) 1.0f);
        boolean boolean24 = dateFormat21.isLenient();
        java.util.TimeZone timeZone25 = dateFormat21.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = stdDateFormat13.withTimeZone(timeZone25);
        boolean boolean28 = stdDateFormat13.looksLikeISO8601("");
        java.util.Date date30 = stdDateFormat13.parse("10");
        java.lang.String str31 = dateFormat0.format(date30);
        boolean boolean32 = dateFormat0.isLenient();
        java.lang.Object obj34 = dateFormat0.parseObject("\u0e21\u0e04. 2513 07:00:00");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat14.", dateFormat0.equals(dateFormat14) == dateFormat14.equals(dateFormat0));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
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
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale18);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale18);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance(2, locale18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone0, locale18);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
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
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar13 = dateFormat12.getCalendar();
        java.util.TimeZone timeZone14 = dateFormat12.getTimeZone();
        boolean boolean15 = dateFormat12.isLenient();
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        java.text.DateFormat dateFormat18 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone17);
        java.text.DateFormat dateFormat19 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone17);
        boolean boolean20 = dateFormat12.equals((java.lang.Object) timeZone17);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = stdDateFormat3.withTimeZone(timeZone17);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar23 = dateFormat22.getCalendar();
        java.util.TimeZone timeZone24 = dateFormat22.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat25 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone24);
        stdDateFormat21._formatPlain = stdDateFormat25;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = stdDateFormat3.clone();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        boolean boolean3 = dateFormat0.isLenient();
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone4);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
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
        java.text.DateFormat dateFormat35 = stdDateFormat3._formatISO8601_z;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        java.util.TimeZone timeZone10 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat11 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone10);
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
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance();
        boolean boolean26 = dateFormat24.equals((java.lang.Object) 1.0f);
        boolean boolean27 = dateFormat24.isLenient();
        java.util.TimeZone timeZone28 = dateFormat24.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = stdDateFormat16.withTimeZone(timeZone28);
        java.util.Locale locale30 = stdDateFormat29._locale;
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance(2, locale30);
        java.text.DateFormat dateFormat32 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone10, locale30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat1 and dateFormat17.", dateFormat1.equals(dateFormat17) == dateFormat17.equals(dateFormat1));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
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
        java.text.DateFormat dateFormat20 = stdDateFormat3._formatISO8601;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat2 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateInstance(0);
        boolean boolean6 = dateFormat5.isLenient();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator11 = dateFormat8.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean12 = dateFormat5.equals((java.lang.Object) dateFormat8);
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar14 = dateFormat13.getCalendar();
        dateFormat8.setCalendar(calendar14);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator18 = dateFormat16.formatToCharacterIterator((java.lang.Object) 2);
        java.text.NumberFormat numberFormat19 = dateFormat16.getNumberFormat();
        java.text.AttributedCharacterIterator attributedCharacterIterator21 = dateFormat16.formatToCharacterIterator((java.lang.Object) 0L);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone23 = dateFormat22.getTimeZone();
        java.util.Calendar calendar24 = dateFormat22.getCalendar();
        java.text.NumberFormat numberFormat25 = dateFormat22.getNumberFormat();
        dateFormat22.setLenient(true);
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
        dateFormat22.setNumberFormat(numberFormat35);
        boolean boolean40 = dateFormat16.equals((java.lang.Object) numberFormat35);
        dateFormat8.setNumberFormat(numberFormat35);
        dateFormat3.setNumberFormat(numberFormat35);
        stdDateFormat2.setNumberFormat(numberFormat35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat32.", dateFormat0.equals(dateFormat32) == dateFormat32.equals(dateFormat0));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator17 = dateFormat15.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone18 = dateFormat15.getTimeZone();
        java.util.Calendar calendar19 = dateFormat15.getCalendar();
        dateFormat15.setLenient(true);
        boolean boolean22 = stdDateFormat3.equals((java.lang.Object) true);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar24 = dateFormat23.getCalendar();
        java.util.Calendar calendar25 = dateFormat23.getCalendar();
        stdDateFormat3._formatISO8601_z = dateFormat23;
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance();
        java.lang.String str29 = dateFormat27.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone30 = dateFormat27.getTimeZone();
        java.util.Calendar calendar31 = dateFormat27.getCalendar();
        java.lang.Class<?> wildcardClass32 = dateFormat27.getClass();
        boolean boolean33 = stdDateFormat3.equals((java.lang.Object) dateFormat27);
        java.util.TimeZone timeZone34 = stdDateFormat3._timezone;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
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
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone20);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
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
        java.text.DateFormat dateFormat22 = stdDateFormat3._formatPlain;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
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
        java.util.Locale locale29 = stdDateFormat19._locale;
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getTimeInstance(0, locale29);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = stdDateFormat3.withLocale(locale29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        java.text.DateFormat dateFormat0 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat3 = dateFormat2.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat3);
        dateFormat0.setNumberFormat(numberFormat3);
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
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateInstance();
        boolean boolean19 = dateFormat17.equals((java.lang.Object) 1.0f);
        boolean boolean20 = dateFormat17.isLenient();
        java.util.TimeZone timeZone21 = dateFormat17.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = stdDateFormat9.withTimeZone(timeZone21);
        java.util.Locale locale23 = stdDateFormat22._locale;
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        boolean boolean26 = dateFormat24.isLenient();
        stdDateFormat22._formatISO8601 = dateFormat24;
        java.util.Date date29 = stdDateFormat22.parse("10");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = dateFormat0.format(date29);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        dateFormat0.setLenient(true);
        java.util.Calendar calendar7 = dateFormat0.getCalendar();
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
        java.lang.String str22 = stdDateFormat11.toString();
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone25 = dateFormat24.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = stdDateFormat11.withTimeZone(timeZone25);
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateInstance(0);
        boolean boolean29 = dateFormat28.isLenient();
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator34 = dateFormat31.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean35 = dateFormat28.equals((java.lang.Object) dateFormat31);
        java.text.NumberFormat numberFormat36 = dateFormat31.getNumberFormat();
        stdDateFormat11._formatISO8601_z = dateFormat31;
        java.text.NumberFormat numberFormat38 = dateFormat31.getNumberFormat();
        java.text.NumberFormat numberFormat39 = dateFormat31.getNumberFormat();
        dateFormat0.setNumberFormat(numberFormat39);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat12.", dateFormat0.equals(dateFormat12) == dateFormat12.equals(dateFormat0));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
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
        boolean boolean18 = stdDateFormat3.looksLikeISO8601("");
        java.util.Date date20 = stdDateFormat3.parse("10");
        java.text.DateFormat dateFormat21 = stdDateFormat3._formatISO8601_z;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
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
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.lang.Object obj24 = dateFormat22.parseObject("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513");
        java.util.Calendar calendar25 = dateFormat22.getCalendar();
        stdDateFormat3._formatISO8601_z = dateFormat22;
        java.text.DateFormat dateFormat27 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat28 = stdDateFormat3._formatRFC1123;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
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
        java.util.Locale locale42 = stdDateFormat32._locale;
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getDateInstance((int) (short) 1, locale42);
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale42);
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getDateInstance((int) (short) 1, locale42);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = stdDateFormat3.withLocale(locale42);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
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
        boolean boolean14 = stdDateFormat3.looksLikeISO8601("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
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
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone35 = dateFormat34.getTimeZone();
        java.util.TimeZone timeZone36 = dateFormat34.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone36);
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat41 = dateFormat40.getNumberFormat();
        dateFormat39.setNumberFormat(numberFormat41);
        dateFormat38.setNumberFormat(numberFormat41);
        stdDateFormat37.setNumberFormat(numberFormat41);
        boolean boolean46 = stdDateFormat37.looksLikeISO8601("");
        java.util.Locale locale47 = stdDateFormat37._locale;
        java.text.DateFormat dateFormat49 = java.text.DateFormat.getDateInstance(0);
        boolean boolean50 = dateFormat49.isLenient();
        java.text.DateFormat dateFormat51 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat52 = dateFormat51.getNumberFormat();
        dateFormat49.setNumberFormat(numberFormat52);
        java.util.TimeZone timeZone54 = dateFormat49.getTimeZone();
        stdDateFormat37.setTimeZone(timeZone54);
        java.text.DateFormat dateFormat57 = java.text.DateFormat.getTimeInstance(3);
        java.util.Calendar calendar58 = dateFormat57.getCalendar();
        java.util.TimeZone timeZone59 = dateFormat57.getTimeZone();
        stdDateFormat37._timezone = timeZone59;
        java.text.DateFormat dateFormat62 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.lang.Object obj64 = dateFormat62.parseObject("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513");
        java.util.Calendar calendar65 = dateFormat62.getCalendar();
        stdDateFormat37.setCalendar(calendar65);
        stdDateFormat3._formatISO8601 = stdDateFormat37;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
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
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance(3, locale16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat3 and dateFormat7.", dateFormat3.equals(dateFormat7) == dateFormat7.equals(dateFormat3));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
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
        java.lang.Class<?> wildcardClass31 = dateFormat23.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
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
        java.text.DateFormat dateFormat23 = stdDateFormat3._formatPlain;
        java.util.Calendar calendar24 = stdDateFormat3.getCalendar();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat4 = dateFormat3.getNumberFormat();
        dateFormat1.setNumberFormat(numberFormat4);
        java.util.TimeZone timeZone6 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat7 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat8 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat7 and stdDateFormat7", stdDateFormat7.equals(stdDateFormat7) ? stdDateFormat7.hashCode() == stdDateFormat7.hashCode() : true);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
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
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar24 = dateFormat23.getCalendar();
        java.util.TimeZone timeZone25 = dateFormat23.getTimeZone();
        boolean boolean26 = dateFormat23.isLenient();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone28 = dateFormat27.getTimeZone();
        java.text.DateFormat dateFormat29 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone28);
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone28);
        boolean boolean31 = dateFormat23.equals((java.lang.Object) timeZone28);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat32 = stdDateFormat3.withTimeZone(timeZone28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
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
        java.text.DateFormat dateFormat21 = stdDateFormat3._formatPlain;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
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
        boolean boolean37 = stdDateFormat35.looksLikeISO8601("Thu, 01 Jan 1970 00:00:00 GMT");
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateInstance(0);
        boolean boolean40 = dateFormat39.isLenient();
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator45 = dateFormat42.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean46 = dateFormat39.equals((java.lang.Object) dateFormat42);
        java.util.TimeZone timeZone47 = dateFormat42.getTimeZone();
        java.util.TimeZone timeZone48 = dateFormat42.getTimeZone();
        java.util.TimeZone timeZone49 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat50 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone49);
        java.text.DateFormat dateFormat52 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar53 = dateFormat52.getCalendar();
        dateFormat50.setCalendar(calendar53);
        dateFormat50.setLenient(false);
        java.text.DateFormat dateFormat58 = java.text.DateFormat.getDateInstance(0);
        boolean boolean59 = dateFormat58.isLenient();
        java.text.DateFormat dateFormat60 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat61 = dateFormat60.getNumberFormat();
        dateFormat58.setNumberFormat(numberFormat61);
        dateFormat50.setNumberFormat(numberFormat61);
        dateFormat42.setNumberFormat(numberFormat61);
        stdDateFormat35._formatRFC1123 = dateFormat42;
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar53", (calendar1.compareTo(calendar53) == 0) == calendar1.equals(calendar53));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator17 = dateFormat15.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone18 = dateFormat15.getTimeZone();
        java.util.Calendar calendar19 = dateFormat15.getCalendar();
        dateFormat15.setLenient(true);
        boolean boolean22 = stdDateFormat3.equals((java.lang.Object) true);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar24 = dateFormat23.getCalendar();
        java.util.Calendar calendar25 = dateFormat23.getCalendar();
        stdDateFormat3._formatISO8601_z = dateFormat23;
        java.util.Calendar calendar27 = stdDateFormat3.getCalendar();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
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
        java.text.DateFormat dateFormat22 = stdDateFormat3._formatRFC1123;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat31 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone30);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
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
        java.util.Locale locale38 = stdDateFormat28._locale;
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateInstance((int) (short) 1, locale38);
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale38);
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale38);
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getTimeInstance(2, locale38);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat43 = stdDateFormat16.withLocale(locale38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
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
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat16 = stdDateFormat3._formatPlain;
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar19 = dateFormat18.getCalendar();
        dateFormat17.setCalendar(calendar19);
        java.util.TimeZone timeZone21 = dateFormat17.getTimeZone();
        stdDateFormat3.setTimeZone(timeZone21);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
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
        java.text.DateFormat dateFormat27 = stdDateFormat3._formatRFC1123;
        java.lang.String str28 = stdDateFormat3.toString();
        java.text.DateFormat dateFormat29 = stdDateFormat3._formatISO8601;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        boolean boolean3 = dateFormat0.isLenient();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        dateFormat5.setNumberFormat(numberFormat7);
        dateFormat4.setNumberFormat(numberFormat7);
        dateFormat0.setNumberFormat(numberFormat7);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, 0);
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
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
        java.text.DateFormat dateFormat20 = java.text.DateFormat.getDateInstance((int) (short) 1, locale19);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance(0, locale19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3, locale19);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
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
        java.lang.Class<?> wildcardClass20 = stdDateFormat3.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
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
        java.lang.String str46 = stdDateFormat36.toString();
        java.text.DateFormat dateFormat47 = stdDateFormat36._formatISO8601_z;
        java.text.DateFormat dateFormat48 = stdDateFormat36._formatPlain;
        java.text.DateFormat dateFormat49 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar50 = dateFormat49.getCalendar();
        java.util.TimeZone timeZone51 = dateFormat49.getTimeZone();
        boolean boolean52 = dateFormat49.isLenient();
        stdDateFormat36._formatPlain = dateFormat49;
        java.text.DateFormat dateFormat54 = java.text.DateFormat.getDateInstance();
        java.lang.String str56 = dateFormat54.format((java.lang.Object) 1L);
        dateFormat54.setLenient(true);
        stdDateFormat36._formatRFC1123 = dateFormat54;
        java.util.TimeZone timeZone60 = stdDateFormat36._timezone;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat61 = stdDateFormat3.withTimeZone(timeZone60);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
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
        java.lang.Class<?> wildcardClass22 = stdDateFormat3.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
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
        java.util.Locale locale17 = stdDateFormat3._locale;
        java.text.DateFormat dateFormat18 = stdDateFormat3._formatRFC1123;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
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
        java.text.DateFormat dateFormat22 = stdDateFormat3._formatISO8601;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
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
        boolean boolean21 = stdDateFormat3.looksLikeISO8601("hi!");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
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
        java.text.DateFormat dateFormat37 = stdDateFormat25._formatPlain;
        java.text.DateFormat dateFormat38 = stdDateFormat25._formatISO8601;
        boolean boolean40 = stdDateFormat25.looksLikeISO8601("10");
        stdDateFormat3._formatPlain = stdDateFormat25;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator17 = dateFormat15.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone18 = dateFormat15.getTimeZone();
        java.util.Calendar calendar19 = dateFormat15.getCalendar();
        dateFormat15.setLenient(true);
        boolean boolean22 = stdDateFormat3.equals((java.lang.Object) true);
        boolean boolean24 = stdDateFormat3.looksLikeISO8601("hi!");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
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
        java.util.TimeZone timeZone21 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone21);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
        java.text.DateFormat dateFormat3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
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
        java.util.TimeZone timeZone17 = stdDateFormat7._timezone;
        java.lang.String str18 = stdDateFormat7.toString();
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone20 = dateFormat19.getTimeZone();
        java.util.TimeZone timeZone21 = dateFormat19.getTimeZone();
        dateFormat19.setLenient(true);
        stdDateFormat7._formatRFC1123 = dateFormat19;
        java.util.Locale locale25 = stdDateFormat7._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale25);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat8.", dateFormat0.equals(dateFormat8) == dateFormat8.equals(dateFormat0));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
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
        java.text.NumberFormat numberFormat11 = stdDateFormat3.getNumberFormat();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
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
        java.text.DateFormat dateFormat24 = stdDateFormat16._formatRFC1123;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
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
        java.text.DateFormat dateFormat24 = stdDateFormat3._formatISO8601;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
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
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateInstance();
        boolean boolean36 = dateFormat34.equals((java.lang.Object) 1.0f);
        boolean boolean37 = dateFormat34.isLenient();
        java.util.TimeZone timeZone38 = dateFormat34.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = stdDateFormat26.withTimeZone(timeZone38);
        java.util.Locale locale40 = stdDateFormat39._locale;
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateInstance(2, locale40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.text.DateFormat dateFormat42 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone20, locale40);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
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
        java.util.Locale locale19 = stdDateFormat18._locale;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
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
        java.lang.String str14 = stdDateFormat3.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on dateFormat0 and dateFormat4.", dateFormat0.equals(dateFormat4) == dateFormat4.equals(dateFormat0));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat3 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        java.text.DateFormat dateFormat4 = stdDateFormat3._formatISO8601_z;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat3 and stdDateFormat3", stdDateFormat3.equals(stdDateFormat3) ? stdDateFormat3.hashCode() == stdDateFormat3.hashCode() : true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
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
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone41 = dateFormat40.getTimeZone();
        stdDateFormat27._timezone = timeZone41;
        java.text.DateFormat dateFormat43 = stdDateFormat27._formatPlain;
        java.lang.String str44 = stdDateFormat27.toString();
        stdDateFormat3._formatISO8601_z = stdDateFormat27;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat27.", stdDateFormat3.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat3));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
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
        stdDateFormat25._formatPlain = stdDateFormat30;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat25 and stdDateFormat30.", stdDateFormat25.equals(stdDateFormat30) == stdDateFormat30.equals(stdDateFormat25));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator17 = dateFormat15.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone18 = dateFormat15.getTimeZone();
        java.util.Calendar calendar19 = dateFormat15.getCalendar();
        dateFormat15.setLenient(true);
        boolean boolean22 = stdDateFormat3.equals((java.lang.Object) true);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance();
        java.lang.String str25 = dateFormat23.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone26 = dateFormat23.getTimeZone();
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = stdDateFormat3.withTimeZone(timeZone26);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance(0);
        boolean boolean32 = dateFormat31.isLenient();
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator37 = dateFormat34.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean38 = dateFormat31.equals((java.lang.Object) dateFormat34);
        java.util.TimeZone timeZone39 = dateFormat34.getTimeZone();
        stdDateFormat3.setTimeZone(timeZone39);
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
        java.text.DateFormat dateFormat61 = java.text.DateFormat.getDateInstance(0);
        boolean boolean62 = dateFormat61.isLenient();
        java.text.DateFormat dateFormat64 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat66 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator67 = dateFormat64.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean68 = dateFormat61.equals((java.lang.Object) dateFormat64);
        java.text.NumberFormat numberFormat69 = dateFormat64.getNumberFormat();
        stdDateFormat44._formatISO8601_z = dateFormat64;
        boolean boolean72 = stdDateFormat44.looksLikeISO8601("hi!");
        java.util.Locale locale73 = stdDateFormat44._locale;
        java.text.DateFormat dateFormat74 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone39, locale73);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat44.", stdDateFormat3.equals(stdDateFormat44) == stdDateFormat44.equals(stdDateFormat3));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
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
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator31 = dateFormat29.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone32 = dateFormat29.getTimeZone();
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone32);
        java.text.DateFormat dateFormat34 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone32);
        stdDateFormat3._timezone = timeZone32;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat36 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat36, stdDateFormat3, and dateFormat0.", !(stdDateFormat36.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat36.equals(dateFormat0));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
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
        java.text.DateFormat dateFormat27 = stdDateFormat3._formatRFC1123;
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
        java.util.Locale locale42 = stdDateFormat32._locale;
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getDateInstance((int) (short) 1, locale42);
        boolean boolean44 = dateFormat27.equals((java.lang.Object) (short) 1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat32.", stdDateFormat3.equals(stdDateFormat32) == stdDateFormat32.equals(stdDateFormat3));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
        boolean boolean2 = stdDateFormat0.looksLikeISO8601("07:00:00");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
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
        java.text.DateFormat dateFormat33 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone30);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone35 = dateFormat34.getTimeZone();
        java.util.TimeZone timeZone36 = dateFormat34.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone36);
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat41 = dateFormat40.getNumberFormat();
        dateFormat39.setNumberFormat(numberFormat41);
        dateFormat38.setNumberFormat(numberFormat41);
        stdDateFormat37.setNumberFormat(numberFormat41);
        boolean boolean46 = stdDateFormat37.looksLikeISO8601("");
        java.util.TimeZone timeZone47 = stdDateFormat37._timezone;
        java.lang.String str48 = stdDateFormat37.toString();
        java.text.DateFormat dateFormat50 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone51 = dateFormat50.getTimeZone();
        stdDateFormat37._timezone = timeZone51;
        java.text.DateFormat dateFormat53 = stdDateFormat37._formatRFC1123;
        java.text.DateFormat dateFormat54 = stdDateFormat37._formatPlain;
        boolean boolean55 = dateFormat33.equals((java.lang.Object) stdDateFormat37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat37.", stdDateFormat3.equals(stdDateFormat37) == stdDateFormat37.equals(stdDateFormat3));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat33, stdDateFormat3, and dateFormat0.", !(stdDateFormat33.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat33.equals(dateFormat0));
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
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
        java.text.DateFormat dateFormat39 = stdDateFormat27._formatISO8601_z;
        java.text.DateFormat dateFormat40 = stdDateFormat27._formatRFC1123;
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone42 = dateFormat41.getTimeZone();
        java.text.DateFormat dateFormat43 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone42);
        java.text.DateFormat dateFormat44 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone42);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat45 = stdDateFormat27.withTimeZone(timeZone42);
        java.text.DateFormat dateFormat46 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone42);
        java.util.TimeZone timeZone47 = dateFormat46.getTimeZone();
        boolean boolean48 = stdDateFormat16.equals((java.lang.Object) timeZone47);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat16 and stdDateFormat27.", stdDateFormat16.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat16));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
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
        java.util.Locale locale45 = stdDateFormat44._locale;
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getDateInstance(2, locale45);
        java.text.DateFormat dateFormat47 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale45);
        stdDateFormat3._formatISO8601_z = dateFormat47;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat31.", stdDateFormat3.equals(stdDateFormat31) == stdDateFormat31.equals(stdDateFormat3));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        boolean boolean2 = dateFormat1.isLenient();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = dateFormat4.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean8 = dateFormat1.equals((java.lang.Object) dateFormat4);
        java.util.TimeZone timeZone9 = dateFormat4.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat10 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone9);
        boolean boolean12 = stdDateFormat10.looksLikeISO8601("07:00:00");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat10 and stdDateFormat10", stdDateFormat10.equals(stdDateFormat10) ? stdDateFormat10.hashCode() == stdDateFormat10.hashCode() : true);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator17 = dateFormat15.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone18 = dateFormat15.getTimeZone();
        java.util.Calendar calendar19 = dateFormat15.getCalendar();
        dateFormat15.setLenient(true);
        boolean boolean22 = stdDateFormat3.equals((java.lang.Object) true);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance();
        java.lang.String str25 = dateFormat23.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone26 = dateFormat23.getTimeZone();
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = stdDateFormat3.withTimeZone(timeZone26);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance(0);
        boolean boolean32 = dateFormat31.isLenient();
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator37 = dateFormat34.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean38 = dateFormat31.equals((java.lang.Object) dateFormat34);
        java.util.TimeZone timeZone39 = dateFormat34.getTimeZone();
        stdDateFormat3.setTimeZone(timeZone39);
        java.text.DateFormat dateFormat41 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone39);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat42 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone39);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat42, stdDateFormat3, and dateFormat0.", !(stdDateFormat42.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat42.equals(dateFormat0));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
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
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone34 = dateFormat33.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat35 = stdDateFormat20.withTimeZone(timeZone34);
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getDateInstance(0);
        boolean boolean38 = dateFormat37.isLenient();
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator43 = dateFormat40.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean44 = dateFormat37.equals((java.lang.Object) dateFormat40);
        java.text.NumberFormat numberFormat45 = dateFormat40.getNumberFormat();
        stdDateFormat20._formatISO8601_z = dateFormat40;
        java.text.NumberFormat numberFormat47 = dateFormat40.getNumberFormat();
        java.util.TimeZone timeZone48 = dateFormat40.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat49 = stdDateFormat3.withTimeZone(timeZone48);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat49 and stdDateFormat20.", stdDateFormat49.equals(stdDateFormat20) == stdDateFormat20.equals(stdDateFormat49));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
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
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getTimeInstance(3);
        java.util.Calendar calendar20 = dateFormat19.getCalendar();
        java.util.TimeZone timeZone21 = dateFormat19.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat23 = stdDateFormat3.withTimeZone(timeZone21);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat23 and stdDateFormat22.", stdDateFormat23.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat23));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(3);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat4 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
        java.text.DateFormat dateFormat5 = stdDateFormat4._formatRFC1123;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat4 and stdDateFormat4", stdDateFormat4.equals(stdDateFormat4) ? stdDateFormat4.hashCode() == stdDateFormat4.hashCode() : true);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator17 = dateFormat15.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone18 = dateFormat15.getTimeZone();
        java.util.Calendar calendar19 = dateFormat15.getCalendar();
        dateFormat15.setLenient(true);
        boolean boolean22 = stdDateFormat3.equals((java.lang.Object) true);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance();
        java.lang.String str25 = dateFormat23.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone26 = dateFormat23.getTimeZone();
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = stdDateFormat3.withTimeZone(timeZone26);
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone33 = dateFormat32.getTimeZone();
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone35 = dateFormat34.getTimeZone();
        java.util.TimeZone timeZone36 = dateFormat34.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone36);
        java.text.DateFormat dateFormat38 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat41 = dateFormat40.getNumberFormat();
        dateFormat39.setNumberFormat(numberFormat41);
        dateFormat38.setNumberFormat(numberFormat41);
        stdDateFormat37.setNumberFormat(numberFormat41);
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getDateInstance();
        boolean boolean47 = dateFormat45.equals((java.lang.Object) 1.0f);
        boolean boolean48 = dateFormat45.isLenient();
        java.util.TimeZone timeZone49 = dateFormat45.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat50 = stdDateFormat37.withTimeZone(timeZone49);
        java.util.Locale locale51 = stdDateFormat50._locale;
        java.text.DateFormat dateFormat52 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone33, locale51);
        java.text.DateFormat dateFormat53 = java.text.DateFormat.getDateInstance(0, locale51);
        java.text.DateFormat dateFormat54 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone26, locale51);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat37.", stdDateFormat3.equals(stdDateFormat37) == stdDateFormat37.equals(stdDateFormat3));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
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
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone40 = dateFormat39.getTimeZone();
        stdDateFormat26._timezone = timeZone40;
        java.text.DateFormat dateFormat42 = stdDateFormat26._formatRFC1123;
        java.text.DateFormat dateFormat43 = stdDateFormat26._formatRFC1123;
        java.text.DateFormat dateFormat44 = stdDateFormat26._formatISO8601_z;
        boolean boolean46 = stdDateFormat26.looksLikeISO8601("hi!");
        java.text.DateFormat dateFormat47 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone48 = dateFormat47.getTimeZone();
        java.text.DateFormat dateFormat49 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone48);
        stdDateFormat26.setTimeZone(timeZone48);
        stdDateFormat3._timezone = timeZone48;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat26.", stdDateFormat3.equals(stdDateFormat26) == stdDateFormat26.equals(stdDateFormat3));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
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
        boolean boolean39 = stdDateFormat30.looksLikeISO8601("");
        java.util.Locale locale40 = stdDateFormat30._locale;
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateInstance(0);
        boolean boolean43 = dateFormat42.isLenient();
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat45 = dateFormat44.getNumberFormat();
        dateFormat42.setNumberFormat(numberFormat45);
        java.util.TimeZone timeZone47 = dateFormat42.getTimeZone();
        stdDateFormat30.setTimeZone(timeZone47);
        java.util.TimeZone timeZone49 = stdDateFormat30._timezone;
        java.text.DateFormat dateFormat50 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone49);
        stdDateFormat3._formatISO8601 = dateFormat50;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat30.", stdDateFormat3.equals(stdDateFormat30) == stdDateFormat30.equals(stdDateFormat3));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar3 = dateFormat2.getCalendar();
        dateFormat0.setCalendar(calendar3);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar7 = dateFormat6.getCalendar();
        java.util.TimeZone timeZone8 = dateFormat6.getTimeZone();
        boolean boolean9 = dateFormat0.equals((java.lang.Object) timeZone8);
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone8);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        java.util.TimeZone timeZone13 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone13);
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        dateFormat15.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        boolean boolean23 = stdDateFormat14.looksLikeISO8601("");
        java.util.TimeZone timeZone24 = stdDateFormat14._timezone;
        java.lang.String str25 = stdDateFormat14.toString();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone28 = dateFormat27.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = stdDateFormat14.withTimeZone(timeZone28);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar33 = dateFormat32.getCalendar();
        dateFormat30.setCalendar(calendar33);
        stdDateFormat14.setCalendar(calendar33);
        boolean boolean37 = stdDateFormat14.looksLikeISO8601("10");
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator40 = dateFormat38.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone41 = dateFormat38.getTimeZone();
        java.text.DateFormat dateFormat42 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone41);
        stdDateFormat14.setTimeZone(timeZone41);
        java.util.Locale locale44 = stdDateFormat14._locale;
        java.text.DateFormat dateFormat45 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone8, locale44);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat46 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone8);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat46, stdDateFormat14, and dateFormat0.", !(stdDateFormat46.equals(stdDateFormat14) && stdDateFormat14.equals(dateFormat0)) || stdDateFormat46.equals(dateFormat0));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
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
        java.util.Locale locale20 = stdDateFormat10._locale;
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance((int) (short) 1, locale20);
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale20);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale20);
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateInstance((int) (short) 1, locale20);
        java.text.DateFormat dateFormat25 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone2, locale20);
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone2);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone2);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat27, stdDateFormat10, and dateFormat1.", !(stdDateFormat27.equals(stdDateFormat10) && stdDateFormat10.equals(dateFormat1)) || stdDateFormat27.equals(dateFormat1));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
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
        java.text.DateFormat dateFormat14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone13);
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
        java.util.TimeZone timeZone28 = stdDateFormat18._timezone;
        java.lang.String str29 = stdDateFormat18.toString();
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone32 = dateFormat31.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat33 = stdDateFormat18.withTimeZone(timeZone32);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar37 = dateFormat36.getCalendar();
        dateFormat34.setCalendar(calendar37);
        stdDateFormat18.setCalendar(calendar37);
        boolean boolean41 = stdDateFormat18.looksLikeISO8601("10");
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator44 = dateFormat42.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone45 = dateFormat42.getTimeZone();
        java.text.DateFormat dateFormat46 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone45);
        stdDateFormat18.setTimeZone(timeZone45);
        java.util.Locale locale48 = stdDateFormat18._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat49 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone13, locale48);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat18.", stdDateFormat3.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat3));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
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
        java.util.TimeZone timeZone39 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat40 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone39);
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar43 = dateFormat42.getCalendar();
        dateFormat40.setCalendar(calendar43);
        dateFormat40.setLenient(false);
        boolean boolean47 = dateFormat40.isLenient();
        stdDateFormat4._formatPlain = dateFormat40;
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar43", (calendar1.compareTo(calendar43) == 0) == calendar1.equals(calendar43));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(2, 2);
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateInstance();
        java.lang.String str7 = dateFormat5.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone8 = dateFormat5.getTimeZone();
        java.text.DateFormat dateFormat9 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone8);
        java.text.DateFormat dateFormat10 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone8);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        java.util.TimeZone timeZone13 = dateFormat11.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat14 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone13);
        java.text.DateFormat dateFormat15 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat18 = dateFormat17.getNumberFormat();
        dateFormat16.setNumberFormat(numberFormat18);
        dateFormat15.setNumberFormat(numberFormat18);
        stdDateFormat14.setNumberFormat(numberFormat18);
        boolean boolean23 = stdDateFormat14.looksLikeISO8601("");
        java.util.TimeZone timeZone24 = stdDateFormat14._timezone;
        java.lang.String str25 = stdDateFormat14.toString();
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone28 = dateFormat27.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = stdDateFormat14.withTimeZone(timeZone28);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar33 = dateFormat32.getCalendar();
        dateFormat30.setCalendar(calendar33);
        stdDateFormat14.setCalendar(calendar33);
        java.util.Locale locale36 = stdDateFormat14._locale;
        java.text.DateFormat dateFormat37 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone8, locale36);
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateInstance(0, locale36);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat39 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale36);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat39, stdDateFormat14, and dateFormat2.", !(stdDateFormat39.equals(stdDateFormat14) && stdDateFormat14.equals(dateFormat2)) || stdDateFormat39.equals(dateFormat2));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
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
        java.text.DateFormat dateFormat34 = stdDateFormat23._formatISO8601;
        java.util.TimeZone timeZone35 = stdDateFormat23._timezone;
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone37 = dateFormat36.getTimeZone();
        java.util.TimeZone timeZone38 = dateFormat36.getTimeZone();
        java.util.TimeZone timeZone39 = dateFormat36.getTimeZone();
        stdDateFormat23.setTimeZone(timeZone39);
        java.text.NumberFormat numberFormat41 = stdDateFormat23.getNumberFormat();
        stdDateFormat3._formatPlain = stdDateFormat23;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat23.", stdDateFormat3.equals(stdDateFormat23) == stdDateFormat23.equals(stdDateFormat3));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1);
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
        java.text.DateFormat dateFormat19 = stdDateFormat6._formatISO8601_z;
        java.text.DateFormat dateFormat20 = stdDateFormat6._formatISO8601_z;
        java.lang.String str21 = stdDateFormat6.toString();
        java.util.Locale locale22 = stdDateFormat6._locale;
        java.text.DateFormat dateFormat23 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone1, locale22);
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
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateInstance((int) (short) 1, locale40);
        java.text.DateFormat dateFormat42 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale40);
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getDateInstance((int) (short) 1, locale40);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat44 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone1, locale40);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat6 and stdDateFormat30.", stdDateFormat6.equals(stdDateFormat30) == stdDateFormat30.equals(stdDateFormat6));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.NumberFormat numberFormat2 = dateFormat1.getNumberFormat();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
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
        java.util.Locale locale20 = stdDateFormat7._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale20);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat21, stdDateFormat7, and timeZone3.", !(stdDateFormat21.equals(stdDateFormat7) && stdDateFormat7.equals(timeZone3)) || stdDateFormat21.equals(timeZone3));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
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
        java.util.Calendar calendar28 = dateFormat27.getCalendar();
        java.util.TimeZone timeZone29 = dateFormat27.getTimeZone();
        boolean boolean30 = dateFormat27.isLenient();
        java.util.TimeZone timeZone31 = dateFormat27.getTimeZone();
        java.util.TimeZone timeZone32 = dateFormat27.getTimeZone();
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone36 = dateFormat35.getTimeZone();
        java.util.TimeZone timeZone37 = dateFormat35.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone37);
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat42 = dateFormat41.getNumberFormat();
        dateFormat40.setNumberFormat(numberFormat42);
        dateFormat39.setNumberFormat(numberFormat42);
        stdDateFormat38.setNumberFormat(numberFormat42);
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getDateInstance();
        boolean boolean48 = dateFormat46.equals((java.lang.Object) 1.0f);
        boolean boolean49 = dateFormat46.isLenient();
        java.util.TimeZone timeZone50 = dateFormat46.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat51 = stdDateFormat38.withTimeZone(timeZone50);
        java.util.Locale locale52 = stdDateFormat51._locale;
        java.text.DateFormat dateFormat53 = java.text.DateFormat.getDateInstance(2, locale52);
        java.text.DateFormat dateFormat54 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale52);
        java.text.DateFormat dateFormat55 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone32, locale52);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat56 = stdDateFormat3.withLocale(locale52);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat56 and stdDateFormat38.", stdDateFormat56.equals(stdDateFormat38) == stdDateFormat38.equals(stdDateFormat56));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        dateFormat0.setCalendar(calendar2);
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat5 and stdDateFormat5", stdDateFormat5.equals(stdDateFormat5) ? stdDateFormat5.hashCode() == stdDateFormat5.hashCode() : true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat13 = stdDateFormat4.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat13, stdDateFormat4, and dateFormat0.", !(stdDateFormat13.equals(stdDateFormat4) && stdDateFormat4.equals(dateFormat0)) || stdDateFormat13.equals(dateFormat0));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
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
        boolean boolean25 = dateFormat0.isLenient();
        java.util.TimeZone timeZone26 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat27 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone26);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat27, stdDateFormat15, and dateFormat0.", !(stdDateFormat27.equals(stdDateFormat15) && stdDateFormat15.equals(dateFormat0)) || stdDateFormat27.equals(dateFormat0));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
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
        boolean boolean13 = stdDateFormat3.isLenient();
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat16 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone15);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat16, stdDateFormat3, and dateFormat0.", !(stdDateFormat16.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat16.equals(dateFormat0));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat19 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat19, stdDateFormat3, and dateFormat0.", !(stdDateFormat19.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat19.equals(dateFormat0));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat17 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone16);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat17, stdDateFormat3, and dateFormat0.", !(stdDateFormat17.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat17.equals(dateFormat0));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar1 = dateFormat0.getCalendar();
        java.util.TimeZone timeZone2 = dateFormat0.getTimeZone();
        boolean boolean3 = dateFormat0.isLenient();
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        java.util.TimeZone timeZone5 = dateFormat0.getTimeZone();
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
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance(0);
        boolean boolean27 = dateFormat26.isLenient();
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator32 = dateFormat29.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean33 = dateFormat26.equals((java.lang.Object) dateFormat29);
        java.text.NumberFormat numberFormat34 = dateFormat29.getNumberFormat();
        stdDateFormat9._formatISO8601_z = dateFormat29;
        java.util.Locale locale36 = stdDateFormat9._locale;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone5, locale36);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat37, stdDateFormat9, and dateFormat0.", !(stdDateFormat37.equals(stdDateFormat9) && stdDateFormat9.equals(dateFormat0)) || stdDateFormat37.equals(dateFormat0));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat1 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone0);
        boolean boolean3 = stdDateFormat1.looksLikeISO8601("\u0e21\u0e04. 2513 07:00:00");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat1 and stdDateFormat1", stdDateFormat1.equals(stdDateFormat1) ? stdDateFormat1.hashCode() == stdDateFormat1.hashCode() : true);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
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
        java.text.DateFormat dateFormat35 = stdDateFormat22._formatISO8601;
        boolean boolean37 = stdDateFormat22.looksLikeISO8601("10");
        stdDateFormat3._formatRFC1123 = stdDateFormat22;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat22.", stdDateFormat3.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat3));
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
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
        java.text.DateFormat dateFormat15 = stdDateFormat3._formatISO8601;
        java.text.DateFormat dateFormat18 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone19 = dateFormat18.getTimeZone();
        java.util.TimeZone timeZone20 = dateFormat18.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat21 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone20);
        java.text.DateFormat dateFormat22 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat25 = dateFormat24.getNumberFormat();
        dateFormat23.setNumberFormat(numberFormat25);
        dateFormat22.setNumberFormat(numberFormat25);
        stdDateFormat21.setNumberFormat(numberFormat25);
        boolean boolean30 = stdDateFormat21.looksLikeISO8601("");
        java.util.Locale locale31 = stdDateFormat21._locale;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateInstance((int) (short) 1, locale31);
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale31);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat3.withLocale(locale31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat34 and stdDateFormat21.", stdDateFormat34.equals(stdDateFormat21) == stdDateFormat21.equals(stdDateFormat34));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
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
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar15 = dateFormat14.getCalendar();
        java.util.TimeZone timeZone16 = dateFormat14.getTimeZone();
        boolean boolean17 = dateFormat14.isLenient();
        dateFormat14.setLenient(true);
        stdDateFormat4._formatPlain = dateFormat14;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat4.setLenient(false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
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
        java.util.TimeZone timeZone38 = stdDateFormat4._timezone;
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
        java.util.TimeZone timeZone52 = stdDateFormat42._timezone;
        java.lang.String str53 = stdDateFormat42.toString();
        java.text.DateFormat dateFormat55 = java.text.DateFormat.getDateInstance(0);
        java.util.TimeZone timeZone56 = dateFormat55.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat57 = stdDateFormat42.withTimeZone(timeZone56);
        java.text.DateFormat dateFormat58 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat60 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar61 = dateFormat60.getCalendar();
        dateFormat58.setCalendar(calendar61);
        stdDateFormat42.setCalendar(calendar61);
        boolean boolean65 = stdDateFormat42.looksLikeISO8601("10");
        stdDateFormat42.setLenient(false);
        java.text.DateFormat dateFormat68 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator70 = dateFormat68.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone71 = dateFormat68.getTimeZone();
        java.text.DateFormat dateFormat72 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone71);
        java.text.DateFormat dateFormat73 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone71);
        stdDateFormat42._timezone = timeZone71;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat75 = stdDateFormat4.withTimeZone(timeZone71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar61", (calendar1.compareTo(calendar61) == 0) == calendar1.equals(calendar61));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
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
        java.util.TimeZone timeZone26 = stdDateFormat4.getTimeZone();
        java.util.TimeZone timeZone27 = stdDateFormat4._timezone;
        stdDateFormat0._timezone = timeZone27;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat0 and stdDateFormat0", stdDateFormat0.equals(stdDateFormat0) ? stdDateFormat0.hashCode() == stdDateFormat0.hashCode() : true);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
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
        java.util.TimeZone timeZone21 = stdDateFormat3._timezone;
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance();
        java.lang.String str25 = dateFormat23.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone26 = dateFormat23.getTimeZone();
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
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
        java.util.Locale locale54 = stdDateFormat32._locale;
        java.text.DateFormat dateFormat55 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone26, locale54);
        java.text.DateFormat dateFormat56 = java.text.DateFormat.getDateInstance(0, locale54);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat57 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone21, locale54);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat32.", stdDateFormat3.equals(stdDateFormat32) == stdDateFormat32.equals(stdDateFormat3));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
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
        java.util.Locale locale42 = stdDateFormat32._locale;
        java.text.DateFormat dateFormat44 = java.text.DateFormat.getDateInstance(0);
        boolean boolean45 = dateFormat44.isLenient();
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat47 = dateFormat46.getNumberFormat();
        dateFormat44.setNumberFormat(numberFormat47);
        java.util.TimeZone timeZone49 = dateFormat44.getTimeZone();
        stdDateFormat32.setTimeZone(timeZone49);
        java.text.DateFormat dateFormat52 = java.text.DateFormat.getTimeInstance(3);
        java.util.Calendar calendar53 = dateFormat52.getCalendar();
        java.util.TimeZone timeZone54 = dateFormat52.getTimeZone();
        stdDateFormat32._timezone = timeZone54;
        stdDateFormat3._timezone = timeZone54;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat32.", stdDateFormat3.equals(stdDateFormat32) == stdDateFormat32.equals(stdDateFormat3));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
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
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance((int) (short) 1, locale35);
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale35);
        java.text.DateFormat dateFormat38 = java.text.DateFormat.getDateInstance((int) (short) 1, locale35);
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone18, locale35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat25.", stdDateFormat3.equals(stdDateFormat25) == stdDateFormat25.equals(stdDateFormat3));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        dateFormat0.setCalendar(calendar2);
        java.util.TimeZone timeZone4 = dateFormat0.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat5 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone6 = stdDateFormat5.getTimeZone();
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator17 = dateFormat15.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone18 = dateFormat15.getTimeZone();
        java.util.Calendar calendar19 = dateFormat15.getCalendar();
        dateFormat15.setLenient(true);
        boolean boolean22 = stdDateFormat3.equals((java.lang.Object) true);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance();
        java.lang.String str25 = dateFormat23.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone26 = dateFormat23.getTimeZone();
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = stdDateFormat3.withTimeZone(timeZone26);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance(0);
        boolean boolean32 = dateFormat31.isLenient();
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator37 = dateFormat34.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean38 = dateFormat31.equals((java.lang.Object) dateFormat34);
        java.util.TimeZone timeZone39 = dateFormat34.getTimeZone();
        stdDateFormat3.setTimeZone(timeZone39);
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
        java.text.DateFormat dateFormat61 = java.text.DateFormat.getDateInstance(0);
        boolean boolean62 = dateFormat61.isLenient();
        java.text.DateFormat dateFormat64 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat66 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator67 = dateFormat64.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean68 = dateFormat61.equals((java.lang.Object) dateFormat64);
        java.text.NumberFormat numberFormat69 = dateFormat64.getNumberFormat();
        stdDateFormat44._formatISO8601_z = dateFormat64;
        java.text.NumberFormat numberFormat71 = dateFormat64.getNumberFormat();
        java.util.TimeZone timeZone72 = dateFormat64.getTimeZone();
        boolean boolean73 = stdDateFormat3.equals((java.lang.Object) timeZone72);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat44.", stdDateFormat3.equals(stdDateFormat44) == stdDateFormat44.equals(stdDateFormat3));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
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
        java.util.TimeZone timeZone28 = stdDateFormat18._timezone;
        java.lang.String str29 = stdDateFormat18.toString();
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone32 = dateFormat31.getTimeZone();
        stdDateFormat18._timezone = timeZone32;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat34 = stdDateFormat3.withTimeZone(timeZone32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat34 and stdDateFormat18.", stdDateFormat34.equals(stdDateFormat18) == stdDateFormat18.equals(stdDateFormat34));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
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
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance();
        stdDateFormat4._formatISO8601_z = dateFormat12;
        boolean boolean15 = stdDateFormat4.looksLikeISO8601("hi!");
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
        java.text.DateFormat dateFormat30 = stdDateFormat19._formatISO8601;
        java.util.TimeZone timeZone31 = stdDateFormat19._timezone;
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone33 = dateFormat32.getTimeZone();
        java.util.TimeZone timeZone34 = dateFormat32.getTimeZone();
        java.util.TimeZone timeZone35 = dateFormat32.getTimeZone();
        stdDateFormat19.setTimeZone(timeZone35);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat37 = stdDateFormat4.withTimeZone(timeZone35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat37 and stdDateFormat19.", stdDateFormat37.equals(stdDateFormat19) == stdDateFormat19.equals(stdDateFormat37));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3);
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getTimeInstance(3);
        java.util.Calendar calendar7 = dateFormat6.getCalendar();
        java.util.TimeZone timeZone8 = dateFormat6.getTimeZone();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone10 = dateFormat9.getTimeZone();
        java.util.TimeZone timeZone11 = dateFormat9.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat12 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone11);
        java.text.DateFormat dateFormat13 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        dateFormat14.setNumberFormat(numberFormat16);
        dateFormat13.setNumberFormat(numberFormat16);
        stdDateFormat12.setNumberFormat(numberFormat16);
        boolean boolean21 = stdDateFormat12.looksLikeISO8601("");
        java.util.TimeZone timeZone22 = stdDateFormat12._timezone;
        java.lang.String str23 = stdDateFormat12.toString();
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone26 = dateFormat25.getTimeZone();
        stdDateFormat12._timezone = timeZone26;
        java.text.DateFormat dateFormat28 = stdDateFormat12._formatPlain;
        java.util.Locale locale29 = stdDateFormat12._locale;
        java.text.DateFormat dateFormat30 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone8, locale29);
        java.text.DateFormat dateFormat31 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3, locale29);
        java.text.DateFormat dateFormat35 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone36 = dateFormat35.getTimeZone();
        java.util.TimeZone timeZone37 = dateFormat35.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat38 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone37);
        java.text.DateFormat dateFormat39 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat42 = dateFormat41.getNumberFormat();
        dateFormat40.setNumberFormat(numberFormat42);
        dateFormat39.setNumberFormat(numberFormat42);
        stdDateFormat38.setNumberFormat(numberFormat42);
        java.text.DateFormat dateFormat46 = java.text.DateFormat.getDateInstance();
        boolean boolean48 = dateFormat46.equals((java.lang.Object) 1.0f);
        boolean boolean49 = dateFormat46.isLenient();
        java.util.TimeZone timeZone50 = dateFormat46.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat51 = stdDateFormat38.withTimeZone(timeZone50);
        java.util.Locale locale52 = stdDateFormat51._locale;
        java.text.DateFormat dateFormat53 = java.text.DateFormat.getDateTimeInstance((int) (short) 0, 0, locale52);
        java.text.DateFormat dateFormat54 = java.text.DateFormat.getTimeInstance(0, locale52);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat55 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale52);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat12 and stdDateFormat38.", stdDateFormat12.equals(stdDateFormat38) == stdDateFormat38.equals(stdDateFormat12));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
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
        boolean boolean23 = stdDateFormat3.equals((java.lang.Object) 4);
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
        java.text.DateFormat dateFormat39 = stdDateFormat27._formatISO8601_z;
        java.text.DateFormat dateFormat40 = stdDateFormat27._formatRFC1123;
        java.text.DateFormat dateFormat41 = stdDateFormat27._formatPlain;
        java.text.DateFormat dateFormat42 = stdDateFormat27._formatPlain;
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone44 = dateFormat43.getTimeZone();
        java.util.TimeZone timeZone45 = dateFormat43.getTimeZone();
        dateFormat43.setLenient(true);
        boolean boolean49 = dateFormat43.equals((java.lang.Object) 'a');
        stdDateFormat27._formatPlain = dateFormat43;
        stdDateFormat3._formatISO8601_z = dateFormat43;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat27.", stdDateFormat3.equals(stdDateFormat27) == stdDateFormat27.equals(stdDateFormat3));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
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
        java.text.DateFormat dateFormat33 = stdDateFormat22._formatISO8601_z;
        boolean boolean35 = stdDateFormat22.looksLikeISO8601("Thu, 01 Jan 2513 07:00:00 ICT");
        stdDateFormat3._formatISO8601 = stdDateFormat22;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat3 and stdDateFormat22.", stdDateFormat3.equals(stdDateFormat22) == stdDateFormat22.equals(stdDateFormat3));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator2 = dateFormat0.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone3 = dateFormat0.getTimeZone();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone3);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone9 = dateFormat8.getTimeZone();
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
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateInstance();
        boolean boolean23 = dateFormat21.equals((java.lang.Object) 1.0f);
        boolean boolean24 = dateFormat21.isLenient();
        java.util.TimeZone timeZone25 = dateFormat21.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat26 = stdDateFormat13.withTimeZone(timeZone25);
        java.util.Locale locale27 = stdDateFormat26._locale;
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone9, locale27);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getTimeInstance(0, locale27);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat30 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3, locale27);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat30, stdDateFormat13, and dateFormat0.", !(stdDateFormat30.equals(stdDateFormat13) && stdDateFormat13.equals(dateFormat0)) || stdDateFormat30.equals(dateFormat0));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
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
        java.text.DateFormat dateFormat24 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateInstance(0);
        boolean boolean27 = dateFormat26.isLenient();
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator32 = dateFormat29.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean33 = dateFormat26.equals((java.lang.Object) dateFormat29);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateTimeInstance();
        java.util.Calendar calendar35 = dateFormat34.getCalendar();
        dateFormat29.setCalendar(calendar35);
        java.text.DateFormat dateFormat37 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator39 = dateFormat37.formatToCharacterIterator((java.lang.Object) 2);
        java.text.NumberFormat numberFormat40 = dateFormat37.getNumberFormat();
        java.text.AttributedCharacterIterator attributedCharacterIterator42 = dateFormat37.formatToCharacterIterator((java.lang.Object) 0L);
        java.text.DateFormat dateFormat43 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone44 = dateFormat43.getTimeZone();
        java.util.Calendar calendar45 = dateFormat43.getCalendar();
        java.text.NumberFormat numberFormat46 = dateFormat43.getNumberFormat();
        dateFormat43.setLenient(true);
        java.text.DateFormat dateFormat49 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone50 = dateFormat49.getTimeZone();
        java.util.TimeZone timeZone51 = dateFormat49.getTimeZone();
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat52 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone51);
        java.text.DateFormat dateFormat53 = com.fasterxml.jackson.databind.util.StdDateFormat.DATE_FORMAT_ISO8601;
        java.text.DateFormat dateFormat54 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat55 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat56 = dateFormat55.getNumberFormat();
        dateFormat54.setNumberFormat(numberFormat56);
        dateFormat53.setNumberFormat(numberFormat56);
        stdDateFormat52.setNumberFormat(numberFormat56);
        dateFormat43.setNumberFormat(numberFormat56);
        boolean boolean61 = dateFormat37.equals((java.lang.Object) numberFormat56);
        dateFormat29.setNumberFormat(numberFormat56);
        dateFormat24.setNumberFormat(numberFormat56);
        stdDateFormat16._formatISO8601 = dateFormat24;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on stdDateFormat16 and stdDateFormat52.", stdDateFormat16.equals(stdDateFormat52) == stdDateFormat52.equals(stdDateFormat16));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar2 = dateFormat1.getCalendar();
        java.util.TimeZone timeZone3 = dateFormat1.getTimeZone();
        java.text.DateFormat dateFormat4 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3);
        java.text.DateFormat dateFormat5 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone3);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat6 = new com.fasterxml.jackson.databind.util.StdDateFormat(timeZone3);
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
        java.util.Locale locale21 = stdDateFormat11._locale;
        java.text.DateFormat dateFormat22 = java.text.DateFormat.getTimeInstance(0, locale21);
        stdDateFormat6._formatPlain = dateFormat22;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on stdDateFormat6 and stdDateFormat6", stdDateFormat6.equals(stdDateFormat6) ? stdDateFormat6.hashCode() == stdDateFormat6.hashCode() : true);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
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
        java.text.DateFormat dateFormat17 = stdDateFormat3._formatRFC1123;
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat18 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat18, stdDateFormat3, and dateFormat0.", !(stdDateFormat18.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat18.equals(dateFormat0));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat3.setLenient(true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
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
        java.text.DateFormat dateFormat24 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone25 = dateFormat24.getTimeZone();
        java.text.DateFormat dateFormat26 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone25);
        stdDateFormat3.setTimeZone(timeZone25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat3.setLenient(true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        java.util.TimeZone timeZone0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
        java.text.DateFormat dateFormat1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(timeZone0);
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateInstance(0);
        java.util.Calendar calendar4 = dateFormat3.getCalendar();
        dateFormat1.setCalendar(calendar4);
        dateFormat1.setLenient(false);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateInstance(0);
        boolean boolean10 = dateFormat9.isLenient();
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat12 = dateFormat11.getNumberFormat();
        dateFormat9.setNumberFormat(numberFormat12);
        dateFormat1.setNumberFormat(numberFormat12);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getInstance();
        java.text.NumberFormat numberFormat16 = dateFormat15.getNumberFormat();
        java.util.Calendar calendar17 = dateFormat15.getCalendar();
        dateFormat1.setCalendar(calendar17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar17", (calendar4.compareTo(calendar17) == 0) == calendar4.equals(calendar17));
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
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
        boolean boolean23 = stdDateFormat21.looksLikeISO8601("\u0e27\u0e31\u0e19\u0e1e\u0e24\u0e2b\u0e31\u0e2a\u0e1a\u0e14\u0e35\u0e17\u0e35\u0e48\u0e21\u0e01\u0e23\u0e32\u0e04\u0e21\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a 2513");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        stdDateFormat21.setLenient(true);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
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
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getTimeInstance();
        java.text.AttributedCharacterIterator attributedCharacterIterator17 = dateFormat15.formatToCharacterIterator((java.lang.Object) 2);
        java.util.TimeZone timeZone18 = dateFormat15.getTimeZone();
        java.util.Calendar calendar19 = dateFormat15.getCalendar();
        dateFormat15.setLenient(true);
        boolean boolean22 = stdDateFormat3.equals((java.lang.Object) true);
        java.text.DateFormat dateFormat23 = java.text.DateFormat.getDateInstance();
        java.lang.String str25 = dateFormat23.format((java.lang.Object) 1L);
        java.util.TimeZone timeZone26 = dateFormat23.getTimeZone();
        java.text.DateFormat dateFormat27 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        java.text.DateFormat dateFormat28 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(timeZone26);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat29 = stdDateFormat3.withTimeZone(timeZone26);
        java.text.DateFormat dateFormat31 = java.text.DateFormat.getDateInstance(0);
        boolean boolean32 = dateFormat31.isLenient();
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateInstance(0);
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateInstance(0);
        java.text.AttributedCharacterIterator attributedCharacterIterator37 = dateFormat34.formatToCharacterIterator((java.lang.Object) 0);
        boolean boolean38 = dateFormat31.equals((java.lang.Object) dateFormat34);
        java.util.TimeZone timeZone39 = dateFormat34.getTimeZone();
        stdDateFormat3.setTimeZone(timeZone39);
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat41 = stdDateFormat3.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat41, stdDateFormat3, and dateFormat0.", !(stdDateFormat41.equals(stdDateFormat3) && stdDateFormat3.equals(dateFormat0)) || stdDateFormat41.equals(dateFormat0));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
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
        com.fasterxml.jackson.databind.util.StdDateFormat stdDateFormat22 = stdDateFormat16.clone();
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on stdDateFormat22, stdDateFormat16, and dateFormat0.", !(stdDateFormat22.equals(stdDateFormat16) && stdDateFormat16.equals(dateFormat0)) || stdDateFormat22.equals(dateFormat0));
    }
}

