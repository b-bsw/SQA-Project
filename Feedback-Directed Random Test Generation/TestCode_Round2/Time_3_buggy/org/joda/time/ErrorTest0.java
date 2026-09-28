package org.joda.time;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.DateTime dateTime6 = mutableDateTime2.toDateTimeISO();
        org.joda.time.Instant instant7 = mutableDateTime2.toInstant();
        boolean boolean8 = instant7.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant7", (mutableDateTime2.compareTo(instant7) == 0) == mutableDateTime2.equals(instant7));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.DateTime dateTime6 = mutableDateTime2.toDateTimeISO();
        org.joda.time.Instant instant7 = mutableDateTime2.toInstant();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(0L, dateTimeZone9);
        mutableDateTime10.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology13 = mutableDateTime10.getChronology();
        org.joda.time.Chronology chronology14 = mutableDateTime10.getChronology();
        mutableDateTime2.setChronology(chronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant7", (mutableDateTime2.compareTo(instant7) == 0) == mutableDateTime2.equals(instant7));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.DateTime dateTime6 = mutableDateTime2.toDateTimeISO();
        org.joda.time.Instant instant7 = mutableDateTime2.toInstant();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(0L, dateTimeZone9);
        mutableDateTime10.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology13 = mutableDateTime10.getChronology();
        int int14 = mutableDateTime10.getSecondOfMinute();
        mutableDateTime10.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(0L, dateTimeZone18);
        mutableDateTime19.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar22 = mutableDateTime19.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime19.copy();
        mutableDateTime19.setDayOfYear((int) (byte) 10);
        boolean boolean26 = mutableDateTime10.isBefore((org.joda.time.ReadableInstant) mutableDateTime19);
        boolean boolean27 = mutableDateTime10.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime10.getZone();
        org.joda.time.DateTime dateTime29 = mutableDateTime2.toDateTime(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant7", (mutableDateTime2.compareTo(instant7) == 0) == mutableDateTime2.equals(instant7));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.set((int) (byte) 1);
        org.joda.time.Chronology chronology9 = mutableDateTime8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(0L, dateTimeZone11);
        java.util.Date date13 = mutableDateTime12.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        boolean boolean15 = mutableDateTime12.isSupported(dateTimeFieldType14);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(0L, dateTimeZone18);
        mutableDateTime19.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology22 = mutableDateTime19.getChronology();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) ' ', chronology23);
        org.joda.time.DateTime dateTime25 = mutableDateTime12.toDateTime(chronology23);
        org.joda.time.Instant instant26 = mutableDateTime12.toInstant();
        int int27 = mutableDateTime8.compareTo((org.joda.time.ReadableInstant) mutableDateTime12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant26", (mutableDateTime12.compareTo(instant26) == 0) == mutableDateTime12.equals(instant26));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.addWrapField((int) (byte) 0);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(0L, dateTimeZone13);
        mutableDateTime14.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology17 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology17);
        boolean boolean20 = mutableDateTime10.isEqual((org.joda.time.ReadableInstant) mutableDateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant11", (mutableDateTime10.compareTo(instant11) == 0) == mutableDateTime10.equals(instant11));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(chronology5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(0L, dateTimeZone8);
        mutableDateTime9.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology12 = mutableDateTime9.getChronology();
        org.joda.time.DateTime dateTime13 = mutableDateTime9.toDateTimeISO();
        org.joda.time.Instant instant14 = mutableDateTime9.toInstant();
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) instant14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant14", (mutableDateTime2.compareTo(instant14) == 0) == mutableDateTime2.equals(instant14));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.DateTime dateTime6 = mutableDateTime2.toDateTimeISO();
        org.joda.time.Instant instant7 = mutableDateTime2.toInstant();
        java.lang.Class<?> wildcardClass8 = instant7.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant7", (mutableDateTime2.compareTo(instant7) == 0) == mutableDateTime2.equals(instant7));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        java.util.Date date3 = mutableDateTime2.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = mutableDateTime2.isSupported(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(0L, dateTimeZone8);
        mutableDateTime9.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology12 = mutableDateTime9.getChronology();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) ' ', chronology13);
        org.joda.time.DateTime dateTime15 = mutableDateTime2.toDateTime(chronology13);
        org.joda.time.Instant instant16 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant16", (mutableDateTime2.compareTo(instant16) == 0) == mutableDateTime2.equals(instant16));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        int int7 = mutableDateTime6.getWeekyear();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.year();
        org.joda.time.Instant instant9 = mutableDateTime6.toInstant();
        org.joda.time.DateTime dateTime10 = mutableDateTime6.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant9", (mutableDateTime2.compareTo(instant9) == 0) == mutableDateTime2.equals(instant9));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        int int6 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(0L, dateTimeZone10);
        mutableDateTime11.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime11.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime11.copy();
        mutableDateTime11.setDayOfYear((int) (byte) 10);
        boolean boolean18 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime11);
        int int19 = mutableDateTime11.getSecondOfMinute();
        int int20 = mutableDateTime11.getMillisOfDay();
        org.joda.time.DateTime dateTime21 = mutableDateTime11.toDateTimeISO();
        org.joda.time.Instant instant22 = dateTime21.toInstant();
        int int23 = dateTime21.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant22", (mutableDateTime11.compareTo(instant22) == 0) == mutableDateTime11.equals(instant22));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        java.util.Date date3 = mutableDateTime2.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = mutableDateTime2.isSupported(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(0L, dateTimeZone8);
        mutableDateTime9.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology12 = mutableDateTime9.getChronology();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) ' ', chronology13);
        org.joda.time.DateTime dateTime15 = mutableDateTime2.toDateTime(chronology13);
        org.joda.time.Instant instant16 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant16", (mutableDateTime2.compareTo(instant16) == 0) == mutableDateTime2.equals(instant16));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        int int6 = mutableDateTime2.getSecondOfMinute();
        mutableDateTime2.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(0L, dateTimeZone10);
        mutableDateTime11.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime11.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime11.copy();
        mutableDateTime11.setDayOfYear((int) (byte) 10);
        boolean boolean18 = mutableDateTime2.isBefore((org.joda.time.ReadableInstant) mutableDateTime11);
        int int19 = mutableDateTime11.getSecondOfMinute();
        int int20 = mutableDateTime11.getMillisOfDay();
        org.joda.time.DateTime dateTime21 = mutableDateTime11.toDateTimeISO();
        org.joda.time.Instant instant22 = dateTime21.toInstant();
        java.util.Locale locale23 = null;
        java.util.Calendar calendar24 = dateTime21.toCalendar(locale23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant22", (mutableDateTime11.compareTo(instant22) == 0) == mutableDateTime11.equals(instant22));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.addWrapField((int) (byte) 0);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = instant11.toString(dateTimeFormatter12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant11", (mutableDateTime2.compareTo(instant11) == 0) == mutableDateTime2.equals(instant11));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        java.util.Date date3 = mutableDateTime2.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = mutableDateTime2.isSupported(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(0L, dateTimeZone8);
        mutableDateTime9.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology12 = mutableDateTime9.getChronology();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) ' ', chronology13);
        org.joda.time.DateTime dateTime15 = mutableDateTime2.toDateTime(chronology13);
        org.joda.time.Instant instant16 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime2.copy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant16", (mutableDateTime2.compareTo(instant16) == 0) == mutableDateTime2.equals(instant16));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.lang.Object obj5 = mutableDateTime2.clone();
        mutableDateTime2.setWeekyear(40);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.millisOfSecond();
        org.joda.time.Instant instant10 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant10", (mutableDateTime2.compareTo(instant10) == 0) == mutableDateTime2.equals(instant10));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        boolean boolean9 = mutableDateTime2.equals((java.lang.Object) '#');
        org.joda.time.DateTimeField dateTimeField10 = null;
        mutableDateTime2.setRounding(dateTimeField10, 25235000);
        int int13 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, dateTimeZone15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, dateTimeZone19);
        mutableDateTime20.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology23 = mutableDateTime20.getChronology();
        int int24 = mutableDateTime20.getSecondOfMinute();
        mutableDateTime16.setTime((org.joda.time.ReadableInstant) mutableDateTime20);
        mutableDateTime16.setSecondOfMinute((int) (short) 0);
        mutableDateTime16.addMonths(0);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(0L, dateTimeZone31);
        mutableDateTime32.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology35 = mutableDateTime32.getChronology();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime32.era();
        org.joda.time.MutableDateTime mutableDateTime38 = property36.set((int) (byte) 1);
        org.joda.time.Chronology chronology39 = mutableDateTime38.getChronology();
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime16.toMutableDateTime(chronology39);
        mutableDateTime2.setChronology(chronology39);
        mutableDateTime2.add((long) 2);
        org.joda.time.Instant instant44 = mutableDateTime2.toInstant();
        java.lang.Object obj45 = mutableDateTime2.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant44", (mutableDateTime2.compareTo(instant44) == 0) == mutableDateTime2.equals(instant44));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTime dateTime4 = mutableDateTime2.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.copy();
        java.util.Date date6 = mutableDateTime2.toDate();
        boolean boolean7 = mutableDateTime2.isAfterNow();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.hourOfDay();
        org.joda.time.Chronology chronology9 = property8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(0L, dateTimeZone11);
        java.util.Date date13 = mutableDateTime12.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        boolean boolean15 = mutableDateTime12.isSupported(dateTimeFieldType14);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(0L, dateTimeZone18);
        mutableDateTime19.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology22 = mutableDateTime19.getChronology();
        org.joda.time.Chronology chronology23 = mutableDateTime19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) ' ', chronology23);
        org.joda.time.DateTime dateTime25 = mutableDateTime12.toDateTime(chronology23);
        org.joda.time.Instant instant26 = mutableDateTime12.toInstant();
        boolean boolean27 = property8.equals((java.lang.Object) instant26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant26", (mutableDateTime2.compareTo(instant26) == 0) == mutableDateTime2.equals(instant26));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        long long8 = property7.getMillis();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(0L, dateTimeZone10);
        mutableDateTime11.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime11.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime11.copy();
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime11.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(0L, dateTimeZone18);
        mutableDateTime19.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology22 = mutableDateTime19.getChronology();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime19.era();
        mutableDateTime19.setDayOfYear((int) (short) 100);
        int int26 = mutableDateTime19.getYearOfEra();
        boolean boolean27 = mutableDateTime19.isBeforeNow();
        java.util.Locale locale28 = null;
        java.util.Calendar calendar29 = mutableDateTime19.toCalendar(locale28);
        mutableDateTime11.setTime((org.joda.time.ReadableInstant) mutableDateTime19);
        int int31 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime11.toMutableDateTimeISO();
        java.util.Locale locale33 = null;
        java.util.Calendar calendar34 = mutableDateTime32.toCalendar(locale33);
        mutableDateTime32.addDays(10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on gregorianCalendar5 and calendar34.", gregorianCalendar5.equals(calendar34) == calendar34.equals(gregorianCalendar5));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        long long8 = property7.getMillis();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(0L, dateTimeZone10);
        mutableDateTime11.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar14 = mutableDateTime11.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime15 = mutableDateTime11.copy();
        java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime11.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(0L, dateTimeZone18);
        mutableDateTime19.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology22 = mutableDateTime19.getChronology();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime19.era();
        mutableDateTime19.setDayOfYear((int) (short) 100);
        int int26 = mutableDateTime19.getYearOfEra();
        boolean boolean27 = mutableDateTime19.isBeforeNow();
        java.util.Locale locale28 = null;
        java.util.Calendar calendar29 = mutableDateTime19.toCalendar(locale28);
        mutableDateTime11.setTime((org.joda.time.ReadableInstant) mutableDateTime19);
        int int31 = property7.compareTo((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime11.toMutableDateTimeISO();
        java.util.Locale locale33 = null;
        java.util.Calendar calendar34 = mutableDateTime32.toCalendar(locale33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        mutableDateTime32.add(readablePeriod35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on gregorianCalendar5 and calendar34.", gregorianCalendar5.equals(calendar34) == calendar34.equals(gregorianCalendar5));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.DateTime dateTime6 = mutableDateTime2.toDateTimeISO();
        org.joda.time.Instant instant7 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant7", (mutableDateTime2.compareTo(instant7) == 0) == mutableDateTime2.equals(instant7));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        mutableDateTime2.setDayOfYear((int) (short) 100);
        int int9 = mutableDateTime2.getYearOfEra();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime2.era();
        org.joda.time.Instant instant11 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, dateTimeZone15);
        mutableDateTime16.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar19 = mutableDateTime16.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime16.copy();
        java.util.GregorianCalendar gregorianCalendar21 = mutableDateTime16.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(0L, dateTimeZone23);
        mutableDateTime24.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology27 = mutableDateTime24.getChronology();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime24.era();
        mutableDateTime24.setDayOfYear((int) (short) 100);
        int int31 = mutableDateTime24.getYearOfEra();
        boolean boolean32 = mutableDateTime24.isBeforeNow();
        java.util.Locale locale33 = null;
        java.util.Calendar calendar34 = mutableDateTime24.toCalendar(locale33);
        mutableDateTime16.setTime((org.joda.time.ReadableInstant) mutableDateTime24);
        int int36 = mutableDateTime16.getMinuteOfHour();
        int int37 = mutableDateTime16.getYearOfEra();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime16.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime39 = property38.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.parse("0");
        org.joda.time.DateTime dateTime42 = mutableDateTime41.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(0L, dateTimeZone44);
        mutableDateTime45.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology48 = mutableDateTime45.getChronology();
        org.joda.time.DateTime dateTime49 = mutableDateTime45.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime45.era();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(0L, dateTimeZone52);
        mutableDateTime53.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology56 = mutableDateTime53.getChronology();
        org.joda.time.Chronology chronology57 = mutableDateTime53.getChronology();
        org.joda.time.DateTime dateTime58 = mutableDateTime45.toDateTime(chronology57);
        int int59 = mutableDateTime45.getDayOfMonth();
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime45.era();
        org.joda.time.DateTimeField dateTimeField61 = property60.getField();
        int int62 = dateTime42.get(dateTimeField61);
        mutableDateTime39.setRounding(dateTimeField61);
        org.joda.time.MutableDateTime.Property property64 = new org.joda.time.MutableDateTime.Property(mutableDateTime13, dateTimeField61);
        boolean boolean65 = instant11.isAfter((org.joda.time.ReadableInstant) mutableDateTime13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant11", (mutableDateTime2.compareTo(instant11) == 0) == mutableDateTime2.equals(instant11));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.addWrapField((int) (byte) 0);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and instant11", (mutableDateTime10.compareTo(instant11) == 0) == mutableDateTime10.equals(instant11));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(0L, dateTimeZone5);
        mutableDateTime6.setSecondOfMinute((int) '#');
        boolean boolean9 = mutableDateTime2.equals((java.lang.Object) '#');
        org.joda.time.DateTimeField dateTimeField10 = null;
        mutableDateTime2.setRounding(dateTimeField10, 25235000);
        int int13 = mutableDateTime2.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(0L, dateTimeZone15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(0L, dateTimeZone19);
        mutableDateTime20.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology23 = mutableDateTime20.getChronology();
        int int24 = mutableDateTime20.getSecondOfMinute();
        mutableDateTime16.setTime((org.joda.time.ReadableInstant) mutableDateTime20);
        mutableDateTime16.setSecondOfMinute((int) (short) 0);
        mutableDateTime16.addMonths(0);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(0L, dateTimeZone31);
        mutableDateTime32.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology35 = mutableDateTime32.getChronology();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime32.era();
        org.joda.time.MutableDateTime mutableDateTime38 = property36.set((int) (byte) 1);
        org.joda.time.Chronology chronology39 = mutableDateTime38.getChronology();
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime16.toMutableDateTime(chronology39);
        mutableDateTime2.setChronology(chronology39);
        mutableDateTime2.add((long) 2);
        org.joda.time.Instant instant44 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime2.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant44", (mutableDateTime2.compareTo(instant44) == 0) == mutableDateTime2.equals(instant44));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        java.util.Date date3 = mutableDateTime2.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = mutableDateTime2.isSupported(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(0L, dateTimeZone8);
        mutableDateTime9.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology12 = mutableDateTime9.getChronology();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) ' ', chronology13);
        org.joda.time.DateTime dateTime15 = mutableDateTime2.toDateTime(chronology13);
        org.joda.time.Instant instant16 = mutableDateTime2.toInstant();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(0L, dateTimeZone18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.monthOfYear();
        java.util.Locale locale21 = null;
        java.lang.String str22 = property20.getAsText(locale21);
        java.lang.String str23 = property20.toString();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(0L, dateTimeZone25);
        java.util.Date date27 = mutableDateTime26.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        boolean boolean29 = mutableDateTime26.isSupported(dateTimeFieldType28);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(0L, dateTimeZone32);
        mutableDateTime33.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology36 = mutableDateTime33.getChronology();
        org.joda.time.Chronology chronology37 = mutableDateTime33.getChronology();
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) ' ', chronology37);
        org.joda.time.DateTime dateTime39 = mutableDateTime26.toDateTime(chronology37);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(chronology37);
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(chronology37);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(0L, dateTimeZone44);
        mutableDateTime45.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology48 = mutableDateTime45.getChronology();
        org.joda.time.Chronology chronology49 = mutableDateTime45.getChronology();
        boolean boolean50 = mutableDateTime45.isEqualNow();
        mutableDateTime41.setTime((org.joda.time.ReadableInstant) mutableDateTime45);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime45.dayOfWeek();
        int int53 = property20.compareTo((org.joda.time.ReadableInstant) mutableDateTime45);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime45.minuteOfDay();
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime45.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime57 = property55.addWrapField(7);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(0L, dateTimeZone59);
        mutableDateTime60.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology63 = mutableDateTime60.getChronology();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime60.era();
        mutableDateTime60.setDayOfYear((int) (short) 100);
        int int67 = mutableDateTime60.getYearOfEra();
        boolean boolean68 = mutableDateTime60.isBeforeNow();
        boolean boolean69 = mutableDateTime57.isEqual((org.joda.time.ReadableInstant) mutableDateTime60);
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime57.millisOfDay();
        int int71 = instant16.compareTo((org.joda.time.ReadableInstant) mutableDateTime57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant16", (mutableDateTime2.compareTo(instant16) == 0) == mutableDateTime2.equals(instant16));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime10 = property7.addWrapField((int) (byte) 0);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime mutableDateTime12 = instant11.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant11", (mutableDateTime2.compareTo(instant11) == 0) == mutableDateTime2.equals(instant11));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        java.util.GregorianCalendar gregorianCalendar7 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(0L, dateTimeZone9);
        mutableDateTime10.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology13 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime10.era();
        mutableDateTime10.setDayOfYear((int) (short) 100);
        int int17 = mutableDateTime10.getYearOfEra();
        boolean boolean18 = mutableDateTime10.isBeforeNow();
        java.util.Locale locale19 = null;
        java.util.Calendar calendar20 = mutableDateTime10.toCalendar(locale19);
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.add(20);
        org.joda.time.Instant instant25 = mutableDateTime24.toInstant();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(0L, dateTimeZone27);
        mutableDateTime28.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar31 = mutableDateTime28.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime28.copy();
        boolean boolean34 = mutableDateTime28.isBefore((long) '#');
        mutableDateTime28.setDate((long) 40);
        int int37 = mutableDateTime28.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(0L, dateTimeZone39);
        mutableDateTime40.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology43 = mutableDateTime40.getChronology();
        int int44 = mutableDateTime40.getSecondOfMinute();
        mutableDateTime40.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(0L, dateTimeZone48);
        mutableDateTime49.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar52 = mutableDateTime49.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime53 = mutableDateTime49.copy();
        mutableDateTime49.setDayOfYear((int) (byte) 10);
        boolean boolean56 = mutableDateTime40.isBefore((org.joda.time.ReadableInstant) mutableDateTime49);
        boolean boolean57 = mutableDateTime40.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone58 = mutableDateTime40.getZone();
        mutableDateTime28.setZoneRetainFields(dateTimeZone58);
        mutableDateTime24.setZoneRetainFields(dateTimeZone58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime24 and instant25", (mutableDateTime24.compareTo(instant25) == 0) == mutableDateTime24.equals(instant25));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.DateTime dateTime6 = mutableDateTime2.toDateTimeISO();
        org.joda.time.Instant instant7 = mutableDateTime2.toInstant();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(0L, dateTimeZone9);
        mutableDateTime10.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology13 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime10.year();
        int int15 = property14.getMaximumValueOverall();
        java.lang.String str16 = property14.getAsText();
        org.joda.time.DurationField durationField17 = property14.getLeapDurationField();
        org.joda.time.MutableDateTime mutableDateTime18 = property14.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.parse("0");
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(0L, dateTimeZone23);
        mutableDateTime24.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology27 = mutableDateTime24.getChronology();
        int int28 = mutableDateTime24.getSecondOfMinute();
        mutableDateTime24.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(0L, dateTimeZone32);
        mutableDateTime33.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar36 = mutableDateTime33.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime37 = mutableDateTime33.copy();
        mutableDateTime33.setDayOfYear((int) (byte) 10);
        boolean boolean40 = mutableDateTime24.isBefore((org.joda.time.ReadableInstant) mutableDateTime33);
        int int41 = mutableDateTime33.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(0L, dateTimeZone43);
        mutableDateTime44.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology47 = mutableDateTime44.getChronology();
        org.joda.time.Chronology chronology48 = mutableDateTime44.getChronology();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(0L, dateTimeZone50);
        mutableDateTime51.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar54 = mutableDateTime51.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime51.copy();
        java.util.GregorianCalendar gregorianCalendar56 = mutableDateTime51.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(0L, dateTimeZone58);
        mutableDateTime59.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology62 = mutableDateTime59.getChronology();
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime59.era();
        mutableDateTime59.setDayOfYear((int) (short) 100);
        int int66 = mutableDateTime59.getYearOfEra();
        boolean boolean67 = mutableDateTime59.isBeforeNow();
        java.util.Locale locale68 = null;
        java.util.Calendar calendar69 = mutableDateTime59.toCalendar(locale68);
        mutableDateTime51.setTime((org.joda.time.ReadableInstant) mutableDateTime59);
        org.joda.time.DateTimeZone dateTimeZone71 = mutableDateTime59.getZone();
        org.joda.time.MutableDateTime mutableDateTime72 = org.joda.time.MutableDateTime.now(dateTimeZone71);
        org.joda.time.DateTime dateTime73 = mutableDateTime44.toDateTime(dateTimeZone71);
        mutableDateTime33.setZone(dateTimeZone71);
        org.joda.time.DateTime dateTime75 = mutableDateTime21.toDateTime(dateTimeZone71);
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(10L, dateTimeZone71);
        mutableDateTime18.setZoneRetainFields(dateTimeZone71);
        org.joda.time.MutableDateTime mutableDateTime78 = org.joda.time.MutableDateTime.now(dateTimeZone71);
        org.joda.time.MutableDateTime mutableDateTime79 = instant7.toMutableDateTime(dateTimeZone71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant7", (mutableDateTime2.compareTo(instant7) == 0) == mutableDateTime2.equals(instant7));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime2.minuteOfHour();
        int int8 = mutableDateTime2.getCenturyOfEra();
        java.util.Locale locale9 = null;
        java.util.Calendar calendar10 = mutableDateTime2.toCalendar(locale9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime2.millisOfDay();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on gregorianCalendar5 and calendar10.", gregorianCalendar5.equals(calendar10) == calendar10.equals(gregorianCalendar5));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.DateTime dateTime5 = mutableDateTime2.toDateTime();
        org.joda.time.Instant instant6 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant6", (mutableDateTime2.compareTo(instant6) == 0) == mutableDateTime2.equals(instant6));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        java.util.Date date3 = mutableDateTime2.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = mutableDateTime2.isSupported(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(0L, dateTimeZone8);
        mutableDateTime9.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology12 = mutableDateTime9.getChronology();
        org.joda.time.Chronology chronology13 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) ' ', chronology13);
        org.joda.time.DateTime dateTime15 = mutableDateTime2.toDateTime(chronology13);
        org.joda.time.Instant instant16 = mutableDateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.parse("0");
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(0L, dateTimeZone20);
        mutableDateTime21.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology24 = mutableDateTime21.getChronology();
        int int25 = mutableDateTime21.getSecondOfMinute();
        mutableDateTime21.setMinuteOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(0L, dateTimeZone29);
        mutableDateTime30.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar33 = mutableDateTime30.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime30.copy();
        mutableDateTime30.setDayOfYear((int) (byte) 10);
        boolean boolean37 = mutableDateTime21.isBefore((org.joda.time.ReadableInstant) mutableDateTime30);
        int int38 = mutableDateTime30.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(0L, dateTimeZone40);
        mutableDateTime41.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology44 = mutableDateTime41.getChronology();
        org.joda.time.Chronology chronology45 = mutableDateTime41.getChronology();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(0L, dateTimeZone47);
        mutableDateTime48.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar51 = mutableDateTime48.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime48.copy();
        java.util.GregorianCalendar gregorianCalendar53 = mutableDateTime48.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(0L, dateTimeZone55);
        mutableDateTime56.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology59 = mutableDateTime56.getChronology();
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime56.era();
        mutableDateTime56.setDayOfYear((int) (short) 100);
        int int63 = mutableDateTime56.getYearOfEra();
        boolean boolean64 = mutableDateTime56.isBeforeNow();
        java.util.Locale locale65 = null;
        java.util.Calendar calendar66 = mutableDateTime56.toCalendar(locale65);
        mutableDateTime48.setTime((org.joda.time.ReadableInstant) mutableDateTime56);
        org.joda.time.DateTimeZone dateTimeZone68 = mutableDateTime56.getZone();
        org.joda.time.MutableDateTime mutableDateTime69 = org.joda.time.MutableDateTime.now(dateTimeZone68);
        org.joda.time.DateTime dateTime70 = mutableDateTime41.toDateTime(dateTimeZone68);
        mutableDateTime30.setZone(dateTimeZone68);
        org.joda.time.DateTime dateTime72 = mutableDateTime18.toDateTime(dateTimeZone68);
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime(dateTimeZone68);
        mutableDateTime2.setZone(dateTimeZone68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant16", (mutableDateTime2.compareTo(instant16) == 0) == mutableDateTime2.equals(instant16));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2070-01-02T07:00:35.000+07:00");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(0L, dateTimeZone3);
        mutableDateTime4.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology7 = mutableDateTime4.getChronology();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime4.era();
        mutableDateTime4.setDayOfYear((int) (short) 100);
        int int11 = mutableDateTime4.getDayOfWeek();
        org.joda.time.Chronology chronology12 = mutableDateTime4.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime1.toMutableDateTime(chronology12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime13", (mutableDateTime1.compareTo(mutableDateTime13) == 0) == mutableDateTime1.equals(mutableDateTime13));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology5 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.era();
        int int7 = mutableDateTime2.getMillisOfDay();
        mutableDateTime2.add((long) 19);
        int int10 = mutableDateTime2.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(0L, dateTimeZone12);
        mutableDateTime13.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology16 = mutableDateTime13.getChronology();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime13.era();
        org.joda.time.MutableDateTime mutableDateTime19 = property17.set((int) (byte) 1);
        boolean boolean20 = mutableDateTime2.isEqual((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.Instant instant21 = mutableDateTime19.toInstant();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(0L, dateTimeZone23);
        mutableDateTime24.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology27 = mutableDateTime24.getChronology();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime24.era();
        mutableDateTime24.setDayOfYear((int) (short) 100);
        int int31 = mutableDateTime24.getDayOfWeek();
        org.joda.time.DateTimeField dateTimeField32 = null;
        mutableDateTime24.setRounding(dateTimeField32);
        mutableDateTime24.addWeekyears((int) (byte) 1);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime24.dayOfWeek();
        mutableDateTime24.setWeekyear(25235);
        mutableDateTime24.setWeekOfWeekyear(3);
        int int41 = mutableDateTime24.getWeekyear();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime24.monthOfYear();
        boolean boolean43 = mutableDateTime19.isBefore((org.joda.time.ReadableInstant) mutableDateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and instant21", (mutableDateTime19.compareTo(instant21) == 0) == mutableDateTime19.equals(instant21));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        mutableDateTime2.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar5 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime2.copy();
        java.util.GregorianCalendar gregorianCalendar7 = mutableDateTime2.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(0L, dateTimeZone9);
        mutableDateTime10.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology13 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime10.era();
        mutableDateTime10.setDayOfYear((int) (short) 100);
        int int17 = mutableDateTime10.getYearOfEra();
        boolean boolean18 = mutableDateTime10.isBeforeNow();
        java.util.Locale locale19 = null;
        java.util.Calendar calendar20 = mutableDateTime10.toCalendar(locale19);
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime10);
        int int22 = mutableDateTime2.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime2.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime25 = property23.add(35000L);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(0L, dateTimeZone27);
        mutableDateTime28.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology31 = mutableDateTime28.getChronology();
        org.joda.time.DateTime dateTime32 = mutableDateTime28.toDateTimeISO();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.era();
        int int34 = mutableDateTime28.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = null;
        boolean boolean36 = mutableDateTime28.isSupported(dateTimeFieldType35);
        boolean boolean37 = mutableDateTime25.isAfter((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.DateTime dateTime38 = mutableDateTime28.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(0L, dateTimeZone41);
        mutableDateTime42.setSecondOfMinute((int) '#');
        java.util.GregorianCalendar gregorianCalendar45 = mutableDateTime42.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime42.copy();
        java.util.GregorianCalendar gregorianCalendar47 = mutableDateTime42.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(0L, dateTimeZone49);
        mutableDateTime50.setSecondOfMinute((int) '#');
        org.joda.time.Chronology chronology53 = mutableDateTime50.getChronology();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime50.era();
        mutableDateTime50.setDayOfYear((int) (short) 100);
        int int57 = mutableDateTime50.getYearOfEra();
        boolean boolean58 = mutableDateTime50.isBeforeNow();
        java.util.Locale locale59 = null;
        java.util.Calendar calendar60 = mutableDateTime50.toCalendar(locale59);
        mutableDateTime42.setTime((org.joda.time.ReadableInstant) mutableDateTime50);
        org.joda.time.DateTimeZone dateTimeZone62 = mutableDateTime50.getZone();
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime((long) 20, dateTimeZone62);
        org.joda.time.DateTime dateTime64 = dateTime38.toDateTime(dateTimeZone62);
        org.joda.time.Instant instant65 = dateTime64.toInstant();
        int int66 = dateTime64.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant65", (mutableDateTime6.compareTo(instant65) == 0) == mutableDateTime6.equals(instant65));
    }
}

